/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos.utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;
import recursos.excepciones.ExcepcionDecisionUsuario;

/**
 * Clase dedicada a la creación de métodos como ayuda para los supuestos.
 * Ejemplo: un método para leer por pantalla una cadena de caracteres.
 * 
 * @author Adrián Arjona
 * @version 1.0 Diciembre 2022
 */
public class Utilidades {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    // MÉTODOS
    
    /**
     * Método que pide al usuario una cadena de caracteres pudiendo personalizar 
     * el mensaje de petición.
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
     * Método que pide al usuario un número entero pudiendo personalizar el 
     * mensaje de petición.
     * 
     * @param msg String. Mensaje con el que se pide el número al usuario.
     * @return int entero. Devuelve el número introducido por el usuario.
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
                
                System.out.println("No has introducido un número entero.");
            }
            catch (Exception e) {
                
                System.out.println("No has introducido un número entero.");
            }
        } while (!validador);

     
        return entero ;
    }
    
     /**
     * Método que pide al usuario un número real pudiendo personalizar el 
     * mensaje de petición.
     * 
     * @param msg String. Mensaje con el que se pide el número al usuario.
     * @return int entero. Devuelve el número introducido por el usuario.
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
                
                System.out.println("No has introducido un número real.");
            }
            catch (Exception e) {
                
                System.out.println("No has introducido un número real.");
            }
        } while (!validador);

     
        return real ;
    }
    
    /**
     * Método que valida la respuesta del usuario respecto a si continuar la 
     * ejecución.
     * 
     * @param msj String. Mensaje introducido por el usuario.
     * @return boolean valido. Devuelve si es válida la respuesta (true) o no (false).
     */
    public static boolean compruebaDecisionUsuario(String msj)throws ExcepcionDecisionUsuario{
        String si = "s" ;
        String no = "n" ;
        boolean valido = false ;
        
        if (msj.equalsIgnoreCase(si) ^ msj.equalsIgnoreCase(no)) // Si el mensaje introducido es igual a "s" o "n" será válido...
        {
           valido = true ;
        }
        else // ...de lo contrario no y saltará la excepción.
        {
            throw new ExcepcionDecisionUsuario("Tienes que decir sí \"s/S\" o no \"n/N\".") ;
        }
        
        return valido ;
    }
    
    
    
    /**
     * Método que extraerá la decisión del usuario, previamente validada con el método compruebaDecisionUsuario().
     * 
     * @param decision
     * @see compruebaDecisionUsuario()
     * @return 
     */
    public static boolean distingueEntreSiYNo(String decision){
        
        boolean respuesta = false ;
        
        if (decision.equalsIgnoreCase("s")) // Si la decisión del usuario/a es "s/S"...
        {
            respuesta = false ; // ...respuesta será false.
        }
        else if (decision.equalsIgnoreCase("n")) // Si la decisión del usuario/a es "n/N"...
        {
            respuesta = true ; // ...la respuesta será true.
        }
        
        return respuesta ;
    }
    
      /**
     * Método que unifica los métodos compruebaDecisionUsuario() y distingueEntreSiYNo().
     * Preguntará al usuario/a si quieres salir. Si la respuesta es válida la almacenará y evaluará.
     * 
     * @return boolean validador. Devuelve la decision del usuario/a según seá sí o no.
     * @see compruebaDecisionUsuario()
     * @see distingueEntreSiYNo()
     */
    public static boolean secuenciaSalida(){
        
        String decision ;
        boolean validador = false ;
        
        do // Ejecuta hasta que la decisión del usuario/a sea válida.
            {                
                decision = Utilidades.leerString("\n?Quieres salir del programa? (s/n)\n") ; // Pregunta al usuario/a si quiere continuar.
            
                try 
                {
                    validador = Utilidades.compruebaDecisionUsuario(decision) ; // Comprueba si la decisión es válida...
                } 
                catch (ExcepcionDecisionUsuario e) {
                    
                    System.out.println(e.getMessage()); // ...y si no lo es capturará la excepción.
                }
                
            } while (!validador); // Sale del bucle si la respuesta es válida.
            
        validador = Utilidades.distingueEntreSiYNo(decision) ; // Dependiendo de la decisión que se haya tomado (sí o no) se seguirá o no la ejecución.
        
        return validador ;
    }
    
}

