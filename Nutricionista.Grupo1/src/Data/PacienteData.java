/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Paciente;
import data.Conexion;
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
public class PacienteData {
    private Connection con;

    public PacienteData() {
        this.con=Conexion.getConexion();
    }
    
    public void guardarPaciente(Paciente paciente){
        String sql = "INSERT INTO paciente( dni, apellido, nombre, domicilio, telefono, estado) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2,paciente.getApellido());
            ps.setString(3,paciente.getNombre());
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
    
    
}
