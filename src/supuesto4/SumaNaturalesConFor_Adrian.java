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
 *  Solicite al usuario un n�mero entero (al que llamar� n).
 *  Con ese n�mero solicitado se calcular� la suma de los n primeros n�meros naturales.
 *  Se realizar� con un bucle FOR.
 *  En cada iteraci�n del bucle se debe ir mostrando la suma parcial.
 *  Es decir, si n es 6, se mostrar�:
 *  1 3 6 10 15 21 (uno al lado del otro, como se ve en el ejemplo)
 * El programa tiene que tener mensaje de bievenida, despedida y preguntar� si 
 * se desea salir o continuar como en ejercicios anteriores.
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class SumaNaturalesConFor_Adrian {
    
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    
    // -------------- M�TODOS -------------------------
    
        
    /**
     * M�todo que, a trav�s de un bucle for, suma una serie de n�meros y los va mostrando en serie.
     * Partiendo de 1, va sumando el n�mero consecutivo y va mostrando la suma.
     
     * @param n int. Cantidad de n�meros que apareceran por consola.
     * @return String cadenaNumeros. Devuelve una cadena de n�meros formados a partir de la operaci�n.
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
    // ---------------- M�TODO MAIN ---------------------
    // --------------------------------------------------
    
    public static void main(String[] args) {

        // Declaraci�n de variables
        
        int n = 0 ;
        String decision ;
        boolean validador = false ;
        
        // Mensaje de bienvenida

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Bienvenido/a al creador de series sumando n�meros naturales consecutivos");
        System.out.println("-------------------------------------------------------------------------\n");
        
        
        do // Se ejecutar� hasta que el/la usuario/a elija salir.
        {
            n = Utilidades.leerEntero("\n?Cu�ntos n�meros quieres que aparezcan en la serie?") ; // Se pide la cantidad de n�meros que van a aparecer en la serie.
            sumaNaturalesConFor(n) ; // Se ejecuta el m�todo que hace la operaci�n y que muestra por pantalla.
                        
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
