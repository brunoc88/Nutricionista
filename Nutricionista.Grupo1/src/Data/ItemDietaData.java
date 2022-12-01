/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;

/**
 *
 * @author Bruno
 */
public class ItemDietaData {
     private Connection con;

    public ItemDietaData() {
        this.con=data.Conexion.getConexion();
    }
    
    
    
  public void GuardarComidaDieta(Dieta d, Comida c){
      
  }
}
