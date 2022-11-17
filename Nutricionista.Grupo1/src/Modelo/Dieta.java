/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Dieta {
    private int idDieta;
    private Paciente idPaciente;
    private LocalDate Inicio;
    private LocalDate fin;
    private double pesoBuscado;
    private int limiteCalorico;
    private double pesoInicial;
    private boolean estado;

    public Dieta() {
    }

    public Dieta(Paciente idPaciente, LocalDate Inicio, LocalDate fin, double pesoBuscado, int limiteCalorico, double pesoInicial, boolean estado) {
        this.idPaciente = idPaciente;
        this.Inicio = Inicio;
        this.fin = fin;
        this.pesoBuscado = pesoBuscado;
        this.limiteCalorico = limiteCalorico;
        this.pesoInicial = pesoInicial;
        this.estado = estado;
    }

    public Dieta(int idDieta, Paciente idPaciente, LocalDate Inicio, LocalDate fin, double pesoBuscado, int limiteCalorico, double pesoInicial, boolean estado) {
        this.idDieta = idDieta;
        this.idPaciente = idPaciente;
        this.Inicio = Inicio;
        this.fin = fin;
        this.pesoBuscado = pesoBuscado;
        this.limiteCalorico = limiteCalorico;
        this.pesoInicial = pesoInicial;
        this.estado = estado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDate getInicio() {
        return Inicio;
    }

    public void setInicio(LocalDate Inicio) {
        this.Inicio = Inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public double getPesoBuscado() {
        return pesoBuscado;
    }

    public void setPesoBuscado(double pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
    }

    public int getLimiteCalorico() {
        return limiteCalorico;
    }

    public void setLimiteCalorico(int limiteCalorico) {
        this.limiteCalorico = limiteCalorico;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta + ", idPaciente=" + idPaciente + ", Inicio=" + Inicio + ", fin=" + fin + '}';
    }

    
    
   
}
