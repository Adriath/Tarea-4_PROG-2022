
package supuesto1;

import recursos.utilidades.Utilidades;

/**
 * SUPUESTO 1: IF ELSE Y EXCEPCIONES
 * Realizar una clase llamada Notas_Nombre (Nombre es vuestro nombre), que 
 * llevar� un m�todo main(), en elque se implementar� un algoritmo que realizar� 
 * lo siguiente utilizando if anidados (if else):
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class Notas_Adrian{
   
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    // DECLARACI�N DE VARIABLES
    
    static float nota ;
    static String nombre ;
    
    public enum Notas {Suspenso, Aprobado, Bien, Notable, Sobresaliente, Matr�cula} ;
    
    public static void main(String[] args) {
        
        System.out.println("Bievenido/a al calificador.\n");
        
        int numero = Utilidades.leerEntero("Introduce un entero: ") ;
        System.out.println("El n�mero es: " + numero);
    }
}
