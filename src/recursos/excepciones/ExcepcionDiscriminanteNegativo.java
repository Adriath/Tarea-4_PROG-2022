/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos.excepciones;

/**
 * Excepci�n del supuesto 7. Controla que el discriminante no sea negativo para 
 * que la operaci�n sea v�lida.
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class ExcepcionDiscriminanteNegativo extends Exception{
    
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    public ExcepcionDiscriminanteNegativo(String msj){
        
        super (msj) ;
    }
}
