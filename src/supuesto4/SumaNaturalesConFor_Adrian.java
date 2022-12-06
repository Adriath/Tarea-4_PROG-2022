/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto4;

import recursos.excepciones.ExcepcionDecisionUsuario;
import recursos.utilidades.Utilidades;

/**
 * SUPUESTO 4: USO DE FOR.
 * 
 * Realiza un programa llamado SumaNaturalesConFor_Nombre que:
 *  Solicite al usuario un número entero (al que llamaré n).
 *  Con ese número solicitado se calculará la suma de los n primeros números naturales.
 *  Se realizará con un bucle FOR.
 *  En cada iteración del bucle se debe ir mostrando la suma parcial.
 *  Es decir, si n es 6, se mostrará:
 *  1 3 6 10 15 21 (uno al lado del otro, como se ve en el ejemplo)
 * El programa tiene que tener mensaje de bievenida, despedida y preguntará si 
 * se desea salir o continuar como en ejercicios anteriores.
 * 
 * @author Adrián Arjona
 * @version 1.0 Diciembre 2022
 */
public class SumaNaturalesConFor_Adrian {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    
    // -------------- MÉTODOS -------------------------
    
        
    /**
     * Método que, a través de un bucle for, suma una serie de números y los va mostrando en serie.
     * Partiendo de 1, va sumando el número consecutivo y va mostrando la suma.
     
     * @param n int. Cantidad de números que apareceran por consola.
     * @return String cadenaNumeros. Devuelve una cadena de números formados a partir de la operación.
     */
    public static String sumaNaturalesConFor(int n){

        int suma = 0;
        String cadenaNumeros = "" ;

        for (int i = 1; i < (n+1); i++)
        {
            System.out.print(cadenaNumeros.valueOf(suma += i) + " ");
        }

        return cadenaNumeros ;
    }

    
    // --------------------------------------------------
    // ---------------- MÉTODO MAIN ---------------------
    // --------------------------------------------------
    
    public static void main(String[] args) {

        // Declaración de variables
        
        int n = 0 ;
        String decision ;
        boolean validador = false ;
        
        // Mensaje de bienvenida

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Bienvenido/a al creador de series sumando números naturales consecutivos");
        System.out.println("-------------------------------------------------------------------------\n");
        
        
        do // Se ejecutará hasta que el/la usuario/a elija salir.
        {
            n = Utilidades.leerEntero("\n?Cuántos números quieres que aparezcan en la serie?") ; // Se pide la cantidad de números que van a aparecer en la serie.
            sumaNaturalesConFor(n) ; // Se ejecuta el método que hace la operación y que muestra por pantalla.
                        
            // Comienza la secuencia para preguntar si continúa la ejecución.

            
            do // Ejecuta hasta que la decisión del usuario/a sea válida.
            {                
                decision = Utilidades.leerString("\n\n?Quieres salir del programa? (s/n)\n") ; // Pregunta al usuario/a si quiere continuar.
            
                try 
                {
                    validador = Utilidades.compruebaDecisionUsuario(decision) ; // Comprueba si la decisión es válida...
                } 
                catch (ExcepcionDecisionUsuario e) {
                    
                    System.out.println(e.getMessage()); // ...y si no lo es capturará la excepción.
                }
                
            } while (!validador); // Sale del bucle si la respuesta es válida.
            
            validador = Utilidades.distingueEntreSiYNo(decision) ; // Dependiendo de la decisión que se haya tomado (sí o no) se seguirá o no la ejecución.
            
        } while (validador); // Saldrá si se ha elegido sí (s/S).
        
        System.out.println("\n-- HAS SALIDO DEL PROGRAMA -- \n\t?Hasta pronto!\n"); // Mensaje de despedida
    }
}
