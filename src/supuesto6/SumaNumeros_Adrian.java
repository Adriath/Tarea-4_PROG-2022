/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto6;

import recursos.utilidades.Utilidades;

/**
 * SUPUESTO 6
 * 
 * Hay que realizar un programa llamado SumaNumeros_Nombre, en el que dada una 
 * secuencia de n�meros le�dos por teclado, que acabe con -1, el programa tras 
 * leer dichos n�meros muestre la suma de todos ellos (a excepci�n del n�mero -1, 
 * el cual es escrito solo para finalizar el programa). Puedes utilizar la 
 * instrucci�n iterativa que veas m�s oportuna para realizar el ejercicio.
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class SumaNumeros_Adrian {
    
    
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
   
    
    public static void main(String[] args) {
        
        int numero = 0;
        int resultado = 0;
        
                
        while (numero != -1)
        {
            numero = Utilidades.leerEntero("Introduce un n�mero: (-1 para terminar)") ;
            resultado += numero ;
        }
        
        System.out.println("El resultado es: " + (resultado + 1));
        System.out.println("HAS SALIDO DEL PROGRAMA");
    }
}
