/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Modelo.Paciente;
import Modelo.Dieta;
import Data.PacienteData;
import Modelo.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class DietaData {
    private Connection con;
    Dieta die;
    PacienteData pa;
     
     
     public DietaData() {
     this.con=data.Conexion.getConexion();
}


public void GuardarDieta(Dieta die){
    String sql="INSERT INTO dieta (idPaciente, inicio, fin, pesoBuscado, limiteCalorico, pesoInicial) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, die.getIdPaciente().getIdPaciente());
            ps.setDate(2, java.sql.Date.valueOf(die.getInicio()));
            ps.setDate(3, java.sql.Date.valueOf(die.getFin()));
            ps.setDouble(4,die.getPesoBuscado());
            ps.setInt(5,die.getLimiteCalorico());
            ps.setDouble(6, die.getPesoInicial());
            ps.executeUpdate();
          
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                int clave= rs.getInt(1);
                die.setIdDieta(clave);
                JOptionPane.showMessageDialog(null, "dieta agregada exitosamente"); 
            }
            ps.close();
            
        }catch (SQLException ex) {
            
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "La dieta ya se encuentra en la base de datos - verifique");
                    } else {
                    JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-AltaDieta");
                }
        }
       
    }
public void eliminarDieta(int idDieta){
      String sql="DELETE FROM dieta WHERE idDieta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idDieta);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino la dieta correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo borrar la dieta");
        }
}

 
   public void actualizaDieta(Dieta dieta){
        String sql="UPDATE dieta SET  idPaciente = ?, inicio = ?, fin = ?, pesoBuscado = ?, limiteCalorico = ?, pesoInicial = ? WHERE idDieta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, dieta.getIdPaciente().getIdPaciente());
            ps.setDate(2,java.sql.Date.valueOf(dieta.getInicio()));
            ps.setDate(3,java.sql.Date.valueOf(dieta.getFin()));
            ps.setDouble(4, dieta.getPesoBuscado());
            ps.setInt(5,dieta.getLimiteCalorico());
            ps.setDouble(6, dieta.getPesoInicial());
            ps.setInt(7, dieta.getIdDieta());
           
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos de la dieta actualizados");
            
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
   
       public Dieta buscarDietaPorId(int idDieta) {
        die =new Dieta();
        pa=new PacienteData();
        String sql= "SELECT * FROM dieta WHERE idDieta = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                die.setIdDieta(idDieta);
                die.setIdPaciente(pa.obtenerPacientePorId(rs.getInt("idPaciente")));
                die.setInicio(rs.getDate("inicio").toLocalDate());
                die.setFin(rs.getDate("fin").toLocalDate());
                die.setPesoBuscado(rs.getDouble("pesoBuscado"));
                die.setLimiteCalorico(rs.getInt("limiteCalorico"));
                die.setPesoInicial(rs.getDouble("pesoInicial"));
            }else {
                 JOptionPane.showMessageDialog(null, "No se encontre la dieta");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-obtenerDietaPorId");
        }
        return die;
         
}
}



