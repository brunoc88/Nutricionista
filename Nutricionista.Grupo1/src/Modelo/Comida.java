/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author Bruno
 */
public class Comida {
    private int idComida;
    private String nombre;
    private String detalle;
    private int calorias;
    public Comida() {
    }

    public Comida(String nombre, String detalle, int calorias) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.calorias = calorias;
    }

    public Comida(int idComida, String nombre, String detalle, int calorias) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.calorias = calorias;
    }

    
    @Override
    public String toString() {
        return "Comida{" + "idComida=" + idComida + ", nombre=" + nombre + ", detalle=" + detalle + ", calorias=" + calorias + '}';
    }
    
    
}
