
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Paciente {
    private int idPaciente;
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private long telefono;
    private boolean estado;

    public Paciente() {   
    }

    public Paciente(int dni, String apellido, String nombre, String domicilio, long telefono, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Paciente(int idPaciente, int dni, String apellido, String nombre, String domicilio, long telefono, boolean estado) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.idPaciente;
        hash = 11 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return  apellido +" "+ nombre ;
    }
   

   
    
      
}