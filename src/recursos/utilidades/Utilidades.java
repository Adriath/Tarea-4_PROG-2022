/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos.utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;
import recursos.excepciones.ExcepcionDecisionUsuario;

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
    
    /**
     * M�todo que valida la respuesta del usuario respecto a si continuar la 
     * ejecuci�n.
     * 
     * @param msj String. Mensaje introducido por el usuario.
     * @return boolean valido. Devuelve si es v�lida la respuesta (true) o no (false).
     */
    public static boolean compruebaDecisionUsuario(String msj)throws ExcepcionDecisionUsuario{
        String si = "s" ;
        String no = "n" ;
        boolean valido = false ;
        
        if (msj.equalsIgnoreCase(si) ^ msj.equalsIgnoreCase(no)) // Si el mensaje introducido es igual a "s" o "n" ser� v�lido...
        {
           valido = true ;
        }
        else // ...de lo contrario no y saltar� la excepci�n.
        {
            throw new ExcepcionDecisionUsuario("Tienes que decir s� \"s/S\" o no \"n/N\".") ;
        }
        
        return valido ;
    }
    
    
    
    /**
     * M�todo que extraer� la decisi�n del usuario, previamente validada con el m�todo compruebaDecisionUsuario().
     * 
     * @param decision
     * @see compruebaDecisionUsuario()
     * @return 
     */
    public static boolean distingueEntreSiYNo(String decision){
        
        boolean respuesta = false ;
        
        if (decision.equalsIgnoreCase("s")) // Si la decisi�n del usuario/a es "s/S"...
        {
            respuesta = false ; // ...respuesta ser� false.
        }
        else if (decision.equalsIgnoreCase("n")) // Si la decisi�n del usuario/a es "n/N"...
        {
            respuesta = true ; // ...la respuesta ser� true.
        }
        
        return respuesta ;
    }
    
    
}

