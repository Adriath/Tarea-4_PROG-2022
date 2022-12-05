/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos.excepciones;

/**
 * Excepción personalizada que sirve para controlar si la decisión introducida 
 * por el/la usuario/a es válida.
 * 
 * @author Adrián Arjona
 * @version 1.0 Diciembre 2022
 */
public class ExcepcionDecisionUsuario extends Exception {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    public ExcepcionDecisionUsuario(String msg){
        
        super(msg) ;
    }
}
