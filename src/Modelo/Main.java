/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Data.ComidaData;
import Data.DietaData;
import Data.ItemComidasData;
import Data.PacienteData;
import data.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
 //----------------PRUEBA CONEXION----------------//
        Connection con=Conexion.getConexion();
        
 //----------------PRUEBA PACIENTE DATA---------------/
 
        //PacienteData p1 = new PacienteData();
        
        //GUARDAR PACIENTE
        //Paciente paciente = new Paciente(33112221, "Gonzales", "Julian", "soyloconcha",15444546, true);
        //p1.guardarPaciente(paciente);
        
        //OBTENER PACIENTES
        //ArrayList<Paciente> listaTemp=p1.obtenerPaciente();
        //System.out.println(listaTemp);
        
         //OBTENER PACIENTE POR dni
        //Paciente pa=p1.obtenerPacientePorDni(39797012);
        //System.out.println(pa);
       
        
        
        //OBTENER PACIENTE POR ID
       ///Paciente pa=p1.obtenerPacientePorId(5);
       // System.out.println(pa);
        
         //BORRAR LOGICAMENTE PACIENTE
         //  p1.borrarPaciente(1);
         
        //ACTUALIZAR PACIENTE con el metodo obtener PACIENTE POR ID.
         //pa.setNombre("Ana luz");
         //p1.actualizaPaciente(pa);
        
//-----------------------PRUEBA COMIDA DATA------------------/


         // ComidaData comp= new ComidaData();
         
         //AGREGAR COMIDA A LA BASE DE DATOS
         //Comida com = new Comida("Arroz con pollo", "cebolla arroz y pollo",800,true);
         //comp.guardarComida(com);
         
         
         //MOSTRAR COMIDAS
         //ArrayList<Comida> listaComida= comp.obtenerComida();
         //System.out.println(listaComida);
    
         
         //MOSTRAR COMIDAS POR ID
         //Comida comi= comp.obtenerComidaPorId(1);
         //System.out.println(comi);
         
         
         //ACTUALIZAR COMIDA
         //comi.setNombre("Arroz con pollo de campo");
         //comp.actualizaComida(comi);
         
         //BORRAR COMIDA
         //comp.borrarComida(1);
        
        // ArrayList<Comida> listaComida= comp.buscaComida("ar");
        // System.out.println(listaComida);
    
    
//------------------------PRUEBA DIETA DATA------------------------//
    
   // DietaData dieta= new DietaData();
    //AGREGAR COMIDA A LA BASE DE DATOS
    //Dieta die = new Dieta(1, LocalDate.MAX, LocalDate.MIN, 53, 3000,55, true);
    //dieta.guardarDieta(die);
    
    
      //------------------------PRUEBA ITEM COMIDA ------------------------//
    
    //ItemComidasData ite = new ItemComidasData();
    //DietaData dit =new DietaData();
    //ComidaData com =new ComidaData();
    
    
   //  ItemComidas icom =new ItemComidas();
    
      //  System.out.println(dit.optenerDieta());
    
    //ite.GuardarComidaDieta(dit.buscarDietaPorId(2),com.obtenerComidaId(5));
    //ite.borradoLogComidaDieta(4);
    //ite.eliminarComidaDieta(4);
       // System.out.println(ite.obtenerComidaPorDieta(2));
        //System.out.println(ite.caloriasTotal(2));
   //no puedo intanciar las clases
            
        //System.out.println(com.obtenerComidaPorDieta(3));
        
        
    
    
    //---------------------------
    
    
    
    
    
    
    
    
    
    
    
    }
}