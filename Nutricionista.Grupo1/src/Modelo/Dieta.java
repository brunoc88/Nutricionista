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
    private Comida idComida;
    private LocalDate Inicio;
    private LocalDate fin;
    private double pesoBuscado;
    private int limiteCalorico;
    private double pesoInicial;
    private ArrayList<Comida> comidas;
    
    
    
}
