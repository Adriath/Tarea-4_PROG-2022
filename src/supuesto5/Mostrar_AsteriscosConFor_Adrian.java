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
 * al usuario un n�mero entero (al que llamar� n).
 * Con ese n�mero solicitado se mostrar�n tantas l�neas como valga n.
 * En cada l�nea, se mostrar�n tantos asteriscos como l�nea por la que vaya, es 
 * decir 1 en la l�naa 1, 2 en la 2, etc.
 * 
 * @author Adri�n Arjona
 * @version 1.0. Diciembre 2022
 */
public class Mostrar_AsteriscosConFor_Adrian {
    
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
      // -------------- M�TODOS -------------------------
    
        
    /**
     * M�todo que, a trav�s de dos bucles for anidados, a�ade asteriscos y da 
     * saltos de l�nea para crear la forma deseada.
     * 
     * @param n int. Cantidad de filas y columnas que ocupar� el asterisco.
     * @return String cadenaAsteriscos. Devuelve una cadena de asteriscos creando una forma.
     */
    public static String muestraAsteriscosConFor(int n){

        String cadenaAsteriscos = "" ;

        for (int i = 1; i < (n+1); i++) // Ejecuta los saltos de l�nea.
        {
            for (int j = 1; j < (i+1); j++) // A�ade asteriscos.
            {
                System.out.print(cadenaAsteriscos.concat("*"));
            }
            
            System.out.println("") ;
        }

        return cadenaAsteriscos ;
    }

    
    // --------------------------------------------------
    // ---------------- M�TODO MAIN ---------------------
    // --------------------------------------------------
    
    public static void main(String[] args) {

        // Declaraci�n de variables
        
        int n = 0 ;
        String decision ;
        boolean validador = false ;
        
        // Mensaje de bienvenida

        System.out.println("----------------------------------------------------");
        System.out.println("Bienvenido/a al creador de series de con asteriscos");
        System.out.println("----------------------------------------------------\n");
        
        
        do // Se ejecutar� hasta que el/la usuario/a elija salir.
        {
            n = Utilidades.leerEntero("\n?Cu�ntas l�neas de asteriscos quieres?") ; // Se pide la cantidad de asteriscos que van a aparecer.
            
            System.out.println(""); // Un peque�o salto de l�na para separar la estructura del dato (int n).
            
            muestraAsteriscosConFor(n) ; // Se ejecuta el m�todo que hace la operaci�n y que muestra por pantalla.
                        
            
            // Comienza la secuencia para preguntar si contin�a la ejecuci�n.

            
            do // Ejecuta hasta que la decisi�n del usuario/a sea v�lida.
            {                
                decision = Utilidades.leerString("\n\n?Quieres salir del programa? (s/n)\n") ; // Pregunta al usuario/a si quiere continuar.
            
                try 
                {
                    validador = Utilidades.compruebaDecisionUsuario(decision) ; // Comprueba si la decisi�n es v�lida...
                } 
                catch (ExcepcionDecisionUsuario e) {
                    
                    System.out.println(e.getMessage()); // ...y si no lo es capturar� la excepci�n.
                }
                
            } while (!validador); // Sale del bucle si la respuesta es v�lida.
            
            validador = Utilidades.distingueEntreSiYNo(decision) ; // Dependiendo de la decisi�n que se haya tomado (s� o no) se seguir� o no la ejecuci�n.
            
        } while (validador); // Saldr� si se ha elegido s� (s/S).
        
        System.out.println("\n-- HAS SALIDO DEL PROGRAMA -- \n\t?Hasta pronto!\n"); // Mensaje de despedida
    }
}
