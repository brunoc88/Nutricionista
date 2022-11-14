/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Paciente {
    private int idPaciente;
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private long telefono;
    private double altura;
    private double pesoActual;
    private LocalDate fechaNacimiento;
    private char genero;
    private ArrayList<Paciente>lista = new ArrayList();;

    public Paciente() {   
    }

    public Paciente(int dni, String apellido, String nombre, String domicilio, long telefono, double altura, double pesoActual, LocalDate fechaNacimiento, char genero) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public Paciente(int idPaciente, int dni, String apellido, String nombre, String domicilio, long telefono, double altura, double pesoActual, LocalDate fechaNacimiento, char genero) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public ArrayList<Paciente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Paciente> lista) {
        this.lista = lista;
    }
    

    public void cargarPaciente(Paciente paciente){
        try {
            lista.add(paciente);
            System.out.println("Paciente agregado con exito!");
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
    
    public void borrarPaciente(int dni){
        boolean flag = false;
        for (Paciente aux : lista) {
            if (aux.getDni()==dni) {
                lista.remove(aux);
                flag = true;
                break;
            }
        }
        if (flag) {
            JOptionPane.showMessageDialog(null,"Paciente borrado");
        }else{
            JOptionPane.showMessageDialog(null,"Error");
        }
    };
    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", altura=" + altura + ", pesoActual=" + pesoActual + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    
    
}
