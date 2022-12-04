/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos.utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase dedicada a la creaci�n de m�todos como ayuda para los supuestos.
 * Ejemplo: un m�todo para leer por pantalla una cadena de caracteres.
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class Utilidades {
    
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    // M�TODOS
    
    /**
     * M�todo que pide al usuario una cadena de caracteres pudiendo personalizar 
     * el mensaje de petici�n.
     * 
     * @param msg String. Mensaje con el que se pide la cadena al usuario.
     * @return String mensaje. Devuelve la cadena introducida por el usuario.
     */
    public static String leerString(String msg){
    
        Scanner entrada = new Scanner(System.in) ;
        
        System.out.println(msg);
        String mensaje = entrada.nextLine() ;
        
        return mensaje ;
    }
    
    /**
     * M�todo que pide al usuario un n�mero entero pudiendo personalizar el 
     * mensaje de petici�n.
     * 
     * @param msg String. Mensaje con el que se pide el n�mero al usuario.
     * @return int entero. Devuelve el n�mero introducido por el usuario.
     */
    public static int leerEntero(String msg){
        
        int entero = 0;
        boolean validador = false ;
        Scanner entrada = new Scanner(System.in) ;
        
        do {
            System.out.println(msg);
            String mensaje = entrada.nextLine() ;
            try 
            {
                entero = Integer.parseInt(mensaje) ;
                validador = true ;
            }
            catch (InputMismatchException e) {
                
                System.out.println("No has introducido un n�mero entero.");
            }
            catch (Exception e) {
                
                System.out.println("No has introducido un n�mero entero.");
            }
        } while (!validador);

     
        return entero ;
    }
    
     /**
     * M�todo que pide al usuario un n�mero real pudiendo personalizar el 
     * mensaje de petici�n.
     * 
     * @param msg String. Mensaje con el que se pide el n�mero al usuario.
     * @return int entero. Devuelve el n�mero introducido por el usuario.
     */
    public static float leerDecimal(String msg){
        
        float real = 0;
        boolean validador = false ;
        Scanner entrada = new Scanner(System.in) ;
        
        do {
            System.out.println(msg);
            String mensaje = entrada.nextLine() ;
            try 
            {
                real = Float.parseFloat(mensaje) ;
                validador = true ;
            }
            catch (InputMismatchException e) {
                
                System.out.println("No has introducido un n�mero real.");
            }
            catch (Exception e) {
                
                System.out.println("No has introducido un n�mero real.");
            }
        } while (!validador);

     
        return real ;
    }
    
}

