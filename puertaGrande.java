/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalwilman;

/**
 *
 * @author Wilman Rivera
 */
public class puertaGrande {
    public String nombre;
 
 public String delvolverNombre(){
     return nombre;  
    }
     public String ponerNombre(String Nombre){
          return Nombre;
     }
     public String deciralgo(int n){
         String txt = "El numero es: " + Integer.toString(n);
                 return txt;
     }
     public String deciralgo(String mensaje){
                 return mensaje;
     }
     
}
