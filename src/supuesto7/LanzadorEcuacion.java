/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto7;

import recursos.excepciones.ExcepcionDiscriminanteNegativo;
import recursos.utilidades.Utilidades;

/**
 * Clase que va a contener el método main para la ejecución del supuesto 7.
 * 
 * @author Adrián Arjona
 * @version 1.0 Diciembre 2022
 */
public class LanzadorEcuacion {
    
    public static void main(String[] args) {
        
        // DECLARAICÓN DE VARIABLES
        
        int a ;
        int b ;
        int c ;
        
        boolean validador ;

        // Mensaje de bienvenida

        System.out.println("---------------------------------------------------------");
        System.out.println("Bienvenido/a al calculador de ecuaciones de segundo grado");
        System.out.println("---------------------------------------------------------\n");
        
        
        // OPERACIONES, ENTRADAS Y SALIDAS DE DATOS
        
        do // --> Se ejecutará todo el programa dentro de esta instrucción hasta que el/la usuario/a quiera salir.
        {
            // Pedimos los valores de las variables al usuario/a
            
            a = Utilidades.leerEntero("\nIntroduce el valor de A:") ;
            b = Utilidades.leerEntero("\nIntroduce el valor de B:") ;
            c = Utilidades.leerEntero("\nIntroduce el valor de C:") ;
            
            // Creamos el objeto
            
            Ecuacion_Adrian ecuacion = new Ecuacion_Adrian(a, b, c) ;
            
            // Llamamos a los métodos y capturamos la excepciones
            
            try 
            {
                System.out.println("\nLa primera solución de la ecuación de segundo grado a = " + a + ", b = " + b + ", c = " + c + " es: " + ecuacion.calcularX1() + "\n");
                System.out.println("\nLa segunda solución de la ecuación de segundo grado a = " + a + ", b = " + b + ", c = " + c + " es: " + ecuacion.calcularX2() + "\n");
            } 
            catch (ExcepcionDiscriminanteNegativo e) 
            {
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                
                System.out.println("Algo inesperado ocurrió.");
            }
            
            validador = Utilidades.secuenciaSalida() ;
            
        } while (validador); // Sale cuando se elige sí.
        
        // Mensaje de despedida
        
        System.out.println("\n-- HAS SALIDO DEL PROGRAMA -- \n\t?Hasta pronto!\n");
            
    }
    
}
