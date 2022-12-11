/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Comida;
import Modelo.Dieta;
import Modelo.ItemComidas;
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
public class ItemComidasData {
     private Connection con;

    public ItemComidasData() {
        this.con=data.Conexion.getConexion();
    }
    
    
    
  public void GuardarComidaDieta(Dieta d, Comida c){
      
        String sql="INSERT INTO itemcomidas (idDieta,idComida) VALUES (?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, d.getIdDieta());
            ps.setInt(2, c.getIdComida());
            
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                int clave=rs.getInt(1);
                d.setIdDieta(clave);
                JOptionPane.showMessageDialog(null, "Comida agregada exitosamente"); 
            }
            ps.close();
            
        }catch (SQLException ex) {
            
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "La Comida de la dieta ya se encuentra en la base de datos - verifique");
                    } else {
                    JOptionPane.showMessageDialog(null, "ItemsData Sentencia SQL erronea-GuardarComidaDieta");
                }
        }
       
    }
  public void eliminarComidaDieta(int idItemComidas){
      String sql="DELETE FROM itemcomidas WHERE idItemComidas =?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idItemComidas);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino la comida de la dieta correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo borrar la comida de la dieta");
        }
}
    public ArrayList<Comida> obtenerComidaPorDieta( int idDieta){
     ArrayList<Comida> listaComida= new ArrayList();
      String sql="SELECT * FROM itemcomidas, comida WHERE itemcomidas.idComida= comida.idComida and itemcomidas.idDieta=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idDieta);
            ResultSet rs=ps.executeQuery();
            
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
            JOptionPane.showMessageDialog(null, "ITEMSData Sentencia SQL erronea-ObtenerComidaporDieta");
        }
    return listaComida;
    
    }
    
//    public ArrayList<ItemComidas> obtener(){
//        ArrayList<ItemComidas> lista= new ArrayList();
//        ItemComidas it = new ItemComidas();
//        DietaData die = new DietaData();
//        ComidaData co = new ComidaData();
//   
//        String sql = "SELECT * FROM itemcomidas WHERE estado =1";
//        
//        try {
//            PreparedStatement ps=con.prepareStatement(sql);
//            ResultSet rs=ps.executeQuery();
//            
//            while(rs.next())
//            {
//                it.setIdItemComidas(rs.getInt("idItemComidas"));
//                it.setIdDieta(die.buscarDietaPorId(rs.getInt("idDieta")));
//                it.setIdComida(co.obtenerComidaPorId(rs.getInt("idComida")));
//                it.setEstado(rs.getBoolean("estado"));
//                lista.add(it);
//            }
//             ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"error");
//        }
//        return lista;
//    }
    
  
   public int caloriasTotal(int idDieta ){
      String sql="SELECT SUM(co.calorias)as CaloriasTotal FROM itemcomidas as ic "
              + "INNER JOIN comida as co on ic.idComida=co.idComida INNER JOIN dieta as dt on ic.idDieta=dt.idDieta WHERE dt.idDieta=?;";
      int CaloriasTotal=0;
      try {
       
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idDieta);
            
             ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
            CaloriasTotal=rs.getInt("CaloriasTotal");
            
            
            }else {
                 JOptionPane.showMessageDialog(null, "No se encontre las calorias total");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ItemscomidasData Sentencia SQL erronea-obtenerCaloriasTotal");
        }
        return CaloriasTotal;
         
}
   
    
    

  
  
  
  
  
  }

