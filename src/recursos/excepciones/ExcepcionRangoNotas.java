/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos.excepciones;

/**
 * Excepcion personalizada que sirve para controlar que la nota del usuario 
 * est� entre los valores 0 y 10 (ambos inclusive).
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class ExcepcionRangoNotas extends Exception {
    
     /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    public ExcepcionRangoNotas(String msg){
        
        super(msg) ;
    }
}
