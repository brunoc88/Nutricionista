/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Data.PacienteData;
import data.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Main {

    
    public static void main(String[] args) {
        Connection con=Conexion.getConexion();
        PacienteData p1 = new PacienteData();
        Paciente paciente = new Paciente(33112221, "Gonzales", "Julian", "soyloconcha",15444546, true);
        p1.guardarPaciente(paciente);
    }
}