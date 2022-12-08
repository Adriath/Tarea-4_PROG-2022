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
 * secuencia de números leídos por teclado, que acabe con -1, el programa tras 
 * leer dichos números muestre la suma de todos ellos (a excepción del número -1, 
 * el cual es escrito solo para finalizar el programa). Puedes utilizar la 
 * instrucción iterativa que veas más oportuna para realizar el ejercicio.
 * 
 * @author Adrián Arjona
 * @version 1.0 Diciembre 2022
 */
public class SumaNumeros_Adrian {
    
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
   
    
    public static void main(String[] args) {
        
        // DECLARACIÓN DE VARIABLES
        
        int numero ;
        int resultado ;
        
        boolean validador ;
        
        
        // Mensaje de bienvenida

            System.out.println("--------------------------------------------------------------");
            System.out.println("Bienvenido/a al programa. Sumamos los números que introduzcas");
            System.out.println("--------------------------------------------------------------\n");
            
            
        // OPERACIONES
            
        do 
        {   
            numero = 0 ; // Reinicia el valor para que pueda repetir el bucle.
            resultado = 0 ; // También reinicio el resultado por el mismo motivo.
            
            while (numero != -1) // Saldrá cuando se introduzca un -1.
            {
                numero = Utilidades.leerEntero("\nIntroduce un número: (-1 para terminar)") ; // Pide el número.
                
                resultado += numero ; // Almacena en resultado los números que se van introduciendo.
            }

            System.out.println("\nEl resultado es: " + (resultado + 1)); // Muestra por pantalla el resultado.

            validador = Utilidades.secuenciaSalida() ; // Pide al usuario/a si quieres continuar la ejecución.
            
        } while (validador); // Sale dependiendo de la decisión del usuario/a.
        
        System.out.println("\n-- HAS SALIDO DEL PROGRAMA -- \n\t?Hasta pronto!\n"); // Mensaje de despedida.
    }
}