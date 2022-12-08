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
        
        // DECLARACI�N DE VARIABLES
        
        int numero ;
        int resultado ;
        
        boolean validador ;
        
        
        // Mensaje de bienvenida

            System.out.println("--------------------------------------------------------------");
            System.out.println("Bienvenido/a al programa. Sumamos los n�meros que introduzcas");
            System.out.println("--------------------------------------------------------------\n");
            
            
        // OPERACIONES
            
        do 
        {   
            numero = 0 ; // Reinicia el valor para que pueda repetir el bucle.
            resultado = 0 ; // Tambi�n reinicio el resultado por el mismo motivo.
            
            while (numero != -1) // Saldr� cuando se introduzca un -1.
            {
                numero = Utilidades.leerEntero("\nIntroduce un n�mero: (-1 para terminar)") ; // Pide el n�mero.
                
                resultado += numero ; // Almacena en resultado los n�meros que se van introduciendo.
            }

            System.out.println("\nEl resultado es: " + (resultado + 1)); // Muestra por pantalla el resultado.

            validador = Utilidades.secuenciaSalida() ; // Pide al usuario/a si quieres continuar la ejecuci�n.
            
        } while (validador); // Sale dependiendo de la decisi�n del usuario/a.
        
        System.out.println("\n-- HAS SALIDO DEL PROGRAMA -- \n\t?Hasta pronto!\n"); // Mensaje de despedida.
    }
}