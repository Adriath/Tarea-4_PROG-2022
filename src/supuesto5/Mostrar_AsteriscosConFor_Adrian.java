/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto5;

import recursos.excepciones.ExcepcionDecisionUsuario;
import recursos.utilidades.Utilidades;

/**
 * SUPUESTO 5: USO DE FOR
 * 
 * Realiza un programa llamado Mostrar_AsteriscosConFor_Nombre que solicite 
 * al usuario un número entero (al que llamaré n).
 * Con ese número solicitado se mostrarán tantas líneas como valga n.
 * En cada línea, se mostrarán tantos asteriscos como línea por la que vaya, es 
 * decir 1 en la línaa 1, 2 en la 2, etc.
 * 
 * @author Adrián Arjona
 * @version 1.0. Diciembre 2022
 */
public class Mostrar_AsteriscosConFor_Adrian {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
      // -------------- MÉTODOS -------------------------
    
        
    /**
     * Método que, a través de dos bucles for anidados, añade asteriscos y da 
     * saltos de línea para crear la forma deseada.
     * 
     * @param n int. Cantidad de filas y columnas que ocupará el asterisco.
     * @return String cadenaAsteriscos. Devuelve una cadena de asteriscos creando una forma.
     */
    public static String muestraAsteriscosConFor(int n){

        String cadenaAsteriscos = "" ;

        for (int i = 1; i < (n+1); i++) // Ejecuta los saltos de línea.
        {
            for (int j = 1; j < (i+1); j++) // Añade asteriscos.
            {
                System.out.print(cadenaAsteriscos.concat("*"));
            }
            
            System.out.println("") ;
        }

        return cadenaAsteriscos ;
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

        System.out.println("----------------------------------------------------");
        System.out.println("Bienvenido/a al creador de series de con asteriscos");
        System.out.println("----------------------------------------------------\n");
        
        
        do // Se ejecutará hasta que el/la usuario/a elija salir.
        {
            n = Utilidades.leerEntero("\n?Cuántas líneas de asteriscos quieres?") ; // Se pide la cantidad de asteriscos que van a aparecer.
            
            System.out.println(""); // Un pequeño salto de lína para separar la estructura del dato (int n).
            
            muestraAsteriscosConFor(n) ; // Se ejecuta el método que hace la operación y que muestra por pantalla.
                        
            
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
