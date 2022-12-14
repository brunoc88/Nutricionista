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
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
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
        this.con = data.Conexion.getConexion();
    }

    public void GuardarDieta(Dieta die) {
        String sql = "INSERT INTO dieta (idPaciente, inicio, fin, pesoBuscado, limiteCalorico, pesoInicial, estado) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, die.getIdPaciente().getIdPaciente());
            ps.setDate(2, java.sql.Date.valueOf(die.getInicio()));
            ps.setDate(3, java.sql.Date.valueOf(die.getFin()));
            ps.setDouble(4, die.getPesoBuscado());
            ps.setInt(5, die.getLimiteCalorico());
            ps.setDouble(6, die.getPesoInicial());
            ps.setBoolean(7, die.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int clave = rs.getInt(1);
                die.setIdDieta(clave);
                JOptionPane.showMessageDialog(null, "dieta agregada exitosamente");
            }
            ps.close();

        } catch (SQLException ex) {

            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "La dieta ya se encuentra en la base de datos - verifique");
            } else {
                JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-GuardarDieta" + ex);
            }
        }

    }

    public void eliminarDieta(int idDieta) {
        String sql = "UPDATE dieta SET estado = false WHERE idDieta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ps.executeUpdate();//

            JOptionPane.showMessageDialog(null, "Se elimino la dieta correctamente");

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo borrar la dieta" + ex);
        }
    }

    public void actualizaDieta(Dieta dieta) {
        String sql = "UPDATE dieta SET  idPaciente = ?, inicio = ?, fin = ?, pesoBuscado = ?, limiteCalorico = ?, pesoInicial = ? WHERE idDieta=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, dieta.getIdPaciente().getIdPaciente());
            ps.setDate(2, java.sql.Date.valueOf(dieta.getInicio()));
            ps.setDate(3, java.sql.Date.valueOf(dieta.getFin()));
            ps.setDouble(4, dieta.getPesoBuscado());
            ps.setInt(5, dieta.getLimiteCalorico());
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
                    JOptionPane.showMessageDialog(null, "ComidaData Sentencia SQL erronea-actualizarComida" + ex.getMessage());
                }
            }

        }
    }

    public Dieta buscarDietaPorId(int idDieta) {
        die = new Dieta();
        pa = new PacienteData();
        String sql = "SELECT * FROM dieta WHERE idDieta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                die.setIdDieta(idDieta);
                die.setIdPaciente(pa.obtenerPacientePorId(rs.getInt("idPaciente")));
                die.setInicio(rs.getDate("inicio").toLocalDate());
                die.setFin(rs.getDate("fin").toLocalDate());
                die.setPesoBuscado(rs.getDouble("pesoBuscado"));
                die.setLimiteCalorico(rs.getInt("limiteCalorico"));
                die.setPesoInicial(rs.getDouble("pesoInicial"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontre la dieta");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-obtenerDietaPorId");
        }
        return die;

    }

    public Dieta buscarDietaPorDni(int dni) {
        die = new Dieta();
        pa = new PacienteData();
        String sql = "SELECT * FROM dieta WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                die.setIdDieta(dni);
                die.setIdPaciente(pa.obtenerPacientePorDni(rs.getInt("dni")));
                die.setInicio(rs.getDate("inicio").toLocalDate());
                die.setFin(rs.getDate("fin").toLocalDate());
                die.setPesoBuscado(rs.getDouble("pesoBuscado"));
                die.setLimiteCalorico(rs.getInt("limiteCalorico"));
                die.setPesoInicial(rs.getDouble("pesoInicial"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontre la dieta");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-obtenerDietaPordni");
        }
        return die;

    }

    public ArrayList<Dieta> pacientesBajar(int peso) {
        ArrayList<Dieta> listaDieta = new ArrayList();
        String sql = "SELECT * FROM dieta WHERE (dieta.pesoInicial-dieta.pesoBuscado)>=?";

        try {

            Paciente pas, pas2;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, peso);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //hacer un if para el estado

                PacienteData pd = new PacienteData();
                pas = pd.obtenerPacientePorIdActivos(rs.getInt(2));
                
                    Dieta dt = new Dieta();
                    dt.setPesoBuscado(rs.getDouble("dieta.pesoBuscado"));
                    dt.setPesoInicial(rs.getDouble(7));
                    dt.setIdPaciente(pas);
                    listaDieta.add(dt);
                

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-ObtenerPacientequeBajar10");
        }
        return listaDieta;
    }
// cambie el metodo por otro Daniel
//    public ArrayList<Paciente> pacientesBajar(int peso) {
//        ArrayList<Paciente> listaPaciente = new ArrayList();
//
//        String sql = "SELECT paciente.idPaciente,paciente.apellido, paciente.nombre, paciente.dni,dieta.idDieta,dieta.inicio,dieta.fin,"
//                + "dieta.pesoBuscado,dieta.pesoInicial FROM paciente,"
//                + " dieta WHERE paciente.idpaciente=dieta.idpaciente and (dieta.pesoInicial-dieta.pesoBuscado)>=?;";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, peso);
//            ResultSet rs = ps.executeQuery();//select
//
//            while (rs.next()) {
//
//                Paciente pa = new Paciente();
//                pa.setNombre(rs.getString("nombre"));
//                pa.setApellido(rs.getString("apellido"));
//                pa.setDni(rs.getInt("dni"));
//           
//                listaPaciente.add(pa);
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-ObtenerPacientequeBajar10");
//        }
//        return listaPaciente;
//    }

    public ArrayList<Dieta> buscarDietaPorFecha(int dni, LocalDate inicio, LocalDate fin) {

        ArrayList<Dieta> dietas = new ArrayList();
        //  die = new Dieta();
        pa = new PacienteData();
        Paciente pac = new Paciente();

        String sql = "SELECT * FROM dieta as dt INNER JOIN paciente as pa on pa.idPaciente=dt.idPaciente WHERE pa.dni= ? AND inicio >= ? and fin <= ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setDate(2, Date.valueOf(inicio));
            ps.setDate(3, Date.valueOf(fin));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Dieta diet = new Dieta();

                diet.setIdDieta(rs.getInt("idDieta"));
                diet.setIdPaciente(pa.obtenerPacientePorId(rs.getInt("idPaciente")));
                diet.setInicio(rs.getDate("inicio").toLocalDate());
                diet.setFin(rs.getDate("fin").toLocalDate());
                diet.setPesoBuscado(rs.getDouble("pesoBuscado"));
                diet.setLimiteCalorico(rs.getInt("limiteCalorico"));
                diet.setPesoInicial(rs.getDouble("pesoInicial"));
                diet.setEstado(rs.getBoolean("estado"));

                // die.setIdPaciente(pa);
                dietas.add(diet);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-obtenerDietaPordni" + ex);
        }
        return dietas;

    }

    public ArrayList<Dieta> optenerDieta() {
        ArrayList<Dieta> dietas = new ArrayList();

        String sql = "SELECT * FROM dieta WHERE estado =1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Dieta diet = new Dieta();
                diet.setIdDieta(rs.getInt("idDieta"));
                PacienteData pa = new PacienteData();
                Paciente paciente = new Paciente();
                //solucion para obtener el idpaciente en dieta y aparesca en la tabla
                int x = pa.optenerXId(rs.getInt("idPaciente"));
                paciente.setIdPaciente(x);
                diet.setIdPaciente(paciente);
                diet.setInicio(rs.getDate("inicio").toLocalDate());
                diet.setFin(rs.getDate("fin").toLocalDate());
                diet.setPesoBuscado(rs.getDouble("pesoBuscado"));
                diet.setLimiteCalorico(rs.getInt("limiteCalorico"));
                diet.setPesoInicial(rs.getDouble("pesoInicial"));
                diet.setEstado(rs.getBoolean("estado"));
                dietas.add(diet);
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
        return dietas;
    }

//    public Dieta buscarDietaPorFecha(int dni, LocalDate inicio, LocalDate fin  ) {
//        die = new Dieta();
//        pa = new PacienteData();
//        Paciente pac= new Paciente();
//        
//        String sql = "SELECT pa.dni,pa.apellido, pa.nombre, dt.inicio, dt.fin FROM dieta as dt INNER JOIN paciente as pa on pa.idPaciente=dt.idPaciente"
//                + " WHERE pa.dni=? and (inicio BETWEEN ? And ? Or fin BETWEEN ? and ? );";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, dni);
//            ps.setDate(2, Date.valueOf(inicio));
//            ps.setDate(3, Date.valueOf(inicio));
//            ps.setDate(4, Date.valueOf(fin));
//            ps.setDate(5, Date.valueOf(fin));
//            
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                
//                die.setIdDieta(dni);
//                die.setIdPaciente(pa.obtenerPacientePorDni(rs.getInt("dni")));
//                
//                die.setIdPaciente(pa);
//                die.setInicio(rs.getDate("inicio").toLocalDate());
//                die.setFin(rs.getDate("fin").toLocalDate());
//               
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontre la dieta");
//
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "DietaData Sentencia SQL erronea-obtenerDietaPordni");
//        }
//        return die;
//
//    }
    public int optenerXId(int valor) {
        Dieta dieta = new Dieta();
        int x = 0;
        String sql = "SELECT idDieta FROM dieta WHERE idDieta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, valor);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dieta.setIdDieta(valor);
                x = dieta.getIdDieta();
            }

            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al obtener id");
        }
        return x;
    }

    public ArrayList<Dieta> obtenerDietaPorPaciente(Paciente pac) {
        ArrayList<Dieta> dietas = new ArrayList();
        pa = new PacienteData();
        Dieta diet = new Dieta();
        String sql = "select * from dieta where idPaciente = ? order by inicio Desc";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pac.getIdPaciente());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                diet = new Dieta();

                diet.setIdDieta(rs.getInt("idDieta"));
                diet.setIdPaciente(pa.obtenerPacientePorId(rs.getInt("idPaciente")));
                diet.setInicio(rs.getDate("inicio").toLocalDate());
                diet.setFin(rs.getDate("fin").toLocalDate());
                diet.setPesoBuscado(rs.getDouble("pesoBuscado"));
                diet.setLimiteCalorico(rs.getInt("limiteCalorico"));
                diet.setPesoInicial(rs.getDouble("pesoInicial"));
                diet.setEstado(rs.getBoolean("estado"));
                dietas.add(diet);
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
        return dietas;
    }
        public ArrayList<Dieta>obtenerDietaActivas(){
         ArrayList<Dieta> die = new ArrayList();
         
         Dieta diet = new Dieta();
        String sql = "SELECT * FROM dieta, paciente WHERE dieta.idPaciente=paciente.idPaciente and dieta.fin>=CURRENT_DATE ORDER BY inicio DESC;";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                diet = new Dieta();
                
                diet.setIdDieta(rs.getInt("idDieta"));
                diet.setIdPaciente(pa.obtenerPacientePorId(rs.getInt("idPaciente")));
                diet.setInicio(rs.getDate("inicio").toLocalDate());
                diet.setFin(rs.getDate("fin").toLocalDate());
                diet.setPesoBuscado(rs.getDouble("pesoBuscado"));
                diet.setLimiteCalorico(rs.getInt("limiteCalorico"));
                diet.setPesoInicial(rs.getDouble("pesoInicial"));                
         
                die.add(diet);
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error"+e);
        }
        return die;
    }   
}
