/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class ComidaData {
     private Connection con;
     
     
     public ComidaData() {
     this.con=data.Conexion.getConexion();
    }
 
 
 public void guardarComida(Comida comida){
        String sql="INSERT INTO comida (nombre,detalle,calorias,estado) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCalorias());
            ps.setBoolean(4,comida.isEstado());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida agregada exitosamente"); 
            }
            ps.close();
            
        }catch (SQLException ex) {
            
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "La comida ya se encuentra en la base de datos - verifique");
                    } else {
                    JOptionPane.showMessageDialog(null, "ComidaData Sentencia SQL erronea-AgregarComida");
                }
        }
       
    }
 
 
  public ArrayList<Comida> obtenerComida(){
     ArrayList<Comida> listaComida= new ArrayList();
     
      String sql="SELECT * FROM comida WHERE estado = 1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();//select
            
            while(rs.next()){
            
                Comida c=new Comida();
                
                c.setIdComida(rs.getInt("idComida"));
                c.setNombre(rs.getString("Nombre"));
                c.setNombre(rs.getString("detalle"));
                c.setCalorias(rs.getInt("calorias"));
                c.setEstado(rs.getBoolean("estado"));
                
                listaComida.add(c);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ComidaData Sentencia SQL erronea-ObtenerComida");
        }
    return listaComida;
    }
 
  public Comida obtenerComidaPorId(int idComida) {
        String sql= "SELECT * FROM comida WHERE estado = 1 AND idComida = ?";
        
        Comida com = new Comida();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                com.setIdComida(idComida);
                com.setNombre(rs.getString("Nombre"));
                com.setDetalle(rs.getString("detalle"));
                com.setCalorias(rs.getInt("calorias"));
                com.setEstado(rs.getBoolean("estado"));
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener comida");
        }
        
        return com;
         
    }
  
  public void borrarComida (int idComida){
        String sql="UPDATE comida SET estado=0 WHERE idComida=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idComida);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino la comida correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo borrar la comida");
        }
    }
    
   public void actualizaComida(Comida comida){
        String sql="UPDATE comida SET  nombre = ?, detalle = ?, calorias = ?, estado = ? WHERE idComida=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCalorias());
            ps.setBoolean(4, comida.isEstado());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos de la comida actualizados");
            
            ps.close();
            
        } catch (SQLException ex) {
            
             if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "La comida ya se encuentra actualizada con esos datos - verifique");
            } else {
                if (ex.getErrorCode() == 1452) {
                    JOptionPane.showMessageDialog(null, "La comida no inexiste - verifique");

                } else {
                    JOptionPane.showMessageDialog(null, "ComidaData Sentencia SQL erronea-actualizarComida"+ex.getMessage());
                }
            }

        }
    }
}