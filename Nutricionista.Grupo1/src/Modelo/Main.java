/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Paciente paciente = null;
        String option = "";
        do {
            System.out.println("");
            System.out.println("Menu Paciente:");
            System.out.println("1.Cargar Paciente");
            System.out.println("2.Actualizar Paciente");
            System.out.println("3.Buscar Paciente");
            System.out.println("4.Borrar Paciente");
            System.out.println("5.Salir");
            System.out.println("");
            System.out.println("Elija una opcion:");
            int seleccion = leer.nextInt();
            switch (seleccion) {
                case 1:
                    paciente  = new Paciente(33964636, "Cerutti", "Bruno", "Lainez 484", 26575561, 1.80, 85, LocalDate.of(1988, Month.AUGUST,17), 'h');
                    paciente.cargarPaciente(paciente);
                    break;
                case 4:
                    System.out.println("Ingrese el dni del paciente que desea borrar");
                    int dni  = leer.nextInt();
                    paciente.borrarPaciente(dni);
                    break;
                case 5:
                    System.out.println("Realmente desea salir(s/n)?");
                    option = leer.next();
            }
        } while (!option.equalsIgnoreCase("s"));
        
        
        //Comida comida = new Comida("arroz con pollo", "una filete de pollo a la plancha con arroz blanco hervido", 500);
        
        
    }
    
}
