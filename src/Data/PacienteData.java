/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Dieta;
import Modelo.Paciente;
import data.Conexion;
import java.sql.Connection;
import java.sql.Date;
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
public class PacienteData {

    private Connection con;

    public PacienteData() {
        this.con = Conexion.getConexion();
    }

    public void guardarPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente( dni, apellido, nombre, domicilio, telefono, estado) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getDomicilio());
            ps.setLong(5, paciente.getTelefono());
            ps.setBoolean(6, paciente.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente agregado Exitosamente!");
            }
            ps.close();
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El paciente ya se encuentra en la base de datos - verifique");
            } else {
                JOptionPane.showMessageDialog(null, "PacienteData: Sentencia SQL erronea-guardarPaciente");
            }
        }
    }

    public ArrayList<Paciente> obtenerPaciente() {
        ArrayList<Paciente> listaTemp = new ArrayList();

        String sql = "SELECT * FROM `paciente` WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Paciente p = new Paciente();

                p.setIdPaciente(rs.getInt("idPaciente"));
                p.setDni(rs.getInt("dni"));
                p.setApellido(rs.getString("apellido"));
                p.setNombre(rs.getString("nombre"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getLong("telefono"));
                p.setEstado(rs.getBoolean("estado"));

                listaTemp.add(p);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PacienteData Sentencia SQL erronea-ObtenerPacientes");
        }
        return listaTemp;
    }

    public ArrayList<Paciente> obtenerTodosLosPaciente() {
        ArrayList<Paciente> listaTemp = new ArrayList();

        String sql = "SELECT * FROM `paciente` ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Paciente p = new Paciente();

                p.setIdPaciente(rs.getInt("idPaciente"));
                p.setDni(rs.getInt("dni"));
                p.setApellido(rs.getString("apellido"));
                p.setNombre(rs.getString("nombre"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getLong("telefono"));
                p.setEstado(rs.getBoolean("estado"));

                listaTemp.add(p);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PacienteData Sentencia SQL erronea-ObtenerPacientes");
        }
        return listaTemp;
    }

    public Paciente obtenerPacientePorId(int idPaciente) {
        //String sql= "SELECT * FROM paciente WHERE estado = 1 AND idPaciente = ?";
        String sql = "SELECT * FROM paciente WHERE idPaciente = ?";

        Paciente pa = new Paciente();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pa.setIdPaciente(idPaciente);
                pa.setDni(rs.getInt("dni"));
                pa.setApellido(rs.getString("apellido"));
                pa.setNombre(rs.getString("nombre"));
                pa.setDomicilio(rs.getString("domicilio"));
                pa.setTelefono(rs.getLong("telefono"));
                pa.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PacienteData Sentencia SQL erronea-obtenerPacientePorId");
        }
        return pa;

    }

    public Paciente obtenerPacientePorDni(int dni) {
        //String sql= "SELECT * FROM paciente WHERE estado = 1 AND dni = ?";
        String sql = "SELECT * FROM paciente WHERE dni = ?";

        Paciente pa = new Paciente();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                pa.setIdPaciente(rs.getInt("idPaciente"));
                pa.setDni(rs.getInt("dni"));
                pa.setApellido(rs.getString("apellido"));
                pa.setNombre(rs.getString("nombre"));
                pa.setDomicilio(rs.getString("domicilio"));
                pa.setTelefono(rs.getLong("telefono"));
                pa.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PacienteData Sentencia SQL erronea-obtenerPacientePordni");
        }
        return pa;
    }

    public void borrarPaciente(int idPaciente) {
        String sql = "UPDATE paciente SET estado=false WHERE idPaciente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ps.executeUpdate();//

            JOptionPane.showMessageDialog(null, "Se elimino el paciente correctamente");

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PacienteData Sentencia SQL erronea-borrarPaciente" + ex.getMessage());
        }
    }

    public void actualizaPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET  dni = ?, apellido = ?, nombre = ?, domicilio = ?,telefono = ?, estado = ? WHERE idPaciente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getDomicilio());
            ps.setLong(5, paciente.getTelefono());
            ps.setBoolean(6, paciente.isEstado());
            ps.setInt(7, paciente.getIdPaciente());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos del paciente actualizados");

            ps.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El paciente ya se encuentra actualizado con esos datos - verifique");
            } else {
                if (ex.getErrorCode() == 1452) {
                    JOptionPane.showMessageDialog(null, "El paciente no inexiste - verifique");

                } else {
                    JOptionPane.showMessageDialog(null, "PacienteData Sentencia SQL erronea-actualizarPaciente" + ex.getMessage());
                }
            }

        }
    }

    public int optenerXId(int valor) {
        Paciente pa = new Paciente();
        int x = 0;
        String sql = "SELECT idPaciente FROM paciente WHERE idPaciente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, valor);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pa.setIdPaciente(valor);
                x = pa.getIdPaciente();
            }

            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al obtener id");
        }
        return x;
    }

    public Paciente obtenerPacientePorIdActivos(int idPaciente) {
        String sql = "SELECT * FROM paciente WHERE estado = 1 AND idPaciente = ?";

        Paciente pa = new Paciente();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                pa.setIdPaciente(idPaciente);
                pa.setDni(rs.getInt("dni"));
                pa.setApellido(rs.getString("apellido"));
                pa.setNombre(rs.getString("nombre"));
                pa.setDomicilio(rs.getString("domicilio"));
                pa.setTelefono(rs.getLong("telefono"));
                pa.setEstado(rs.getBoolean("estado"));

            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PacienteData Sentencia SQL erronea-obtenerPacientePorId");
        }
        return pa;

    }
}
