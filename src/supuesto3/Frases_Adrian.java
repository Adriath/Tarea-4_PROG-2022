/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto3;

import java.time.format.DecimalStyle;
import recursos.excepciones.ExcepcionDecisionUsuario;
import recursos.utilidades.Utilidades;

/**
 * Realiza un programa llamado Frases_Nombre, que muestre un men� de opciones 
 * que permitan hacer lo siguiente:
 *  1. Mostrar frase motivacional.
 *  2. Mostrar frase pesimista.
 *  3. Contar un chiste.
 *  4. Decir un refr�n.
 *  5. Salir.
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class Frases_Adrian {
    
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    // --------- DECLARACI�N DE VARIABLES --------------
    
        // FRASES MOTIVACIONALES
    
            private static String fraseMotivacional1 = "\nLa inform�tica no es solo una "
                    + "herramienta, es una forma de pensar y una oportunidad para "
                    + "aplicar la l�gica y la creatividad en la resoluci�n de "
                    + "problemas.\n" ;

            private static String fraseMotivacional2 = "\nLa inform�tica es el futuro, as� "
                    + "que abraza la tecnolog�a y convi�rtete en un maestro de la "
                    + "inform�tica para alcanzar tus sue�os y lograr el �xito.\n" ;

            private static String fraseMotivacional3 = "\nEl �xito no es una meta, es un "
                    + "viaje en el que debes mantenerte en movimiento y perseverar "
                    + "en tus metas y sue�os.\n" ;

            
        // FRASES PESIMISTAS

            private static String frasePesimista1 = "\nNunca lograr� lo que quiero en la vida.\n" ;

            private static String frasePesimista2 = "\nTodo lo que empieza bien, termina mal.\n" ;

            private static String frasePesimista3 = "\nSi algo malo puede pasar, pasar�.\n" ;

            
        // CHISTES

            private static String chiste1 = "\n\tJaimito en clase:\n\n "
                    + "\t- Hoy vamos a dar los poemas. A ver, Juanito, hazme un pareado.\n "
                    + "\t- Fui a recoger almejas y me llegaba el agua por las orejas.\n"
                    + "\t- Muy bien, Juanito. Ahora t�, Jaimito.\n"
                    + "\t- Fui a recoger mejillones y me llegaba el agua por las rodillas.\n"
                    + "\t- Jaimito, eso no rima.\n"
                    + "\t- Pues esp�rate a que suba la marea.\n." ;

            private static String chiste2 = "\n- Oye, ?Cu�l es tu plato favorito?\n"
                    + "- Pues el hondo, porque cabe m�s comida.\n" ;

            private static String chiste3 = "\n- ?Te gusta el rock progresivo?\n"
                + "- Cada vez m�s." ;      

            
        // REFRANES

            private static String refran1 = "\nM�s vale p�jaro en mano que ciento volando.\n" ;

            private static String refran2 = "\nA caballo regalado no le mires el diente.\n" ;

            private static String refran3 = "\nM�s vale prevenir que curar.\n" ;
        
    
            
    // ------------- M�TODOS ---------------
            

    /**
     * M�todo que muestra el men�.
     */
    public static void mostrarMenu(){
        
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("-------------------------------------\n");
        
        System.out.println("1. Mostrar frase motivacional");
        System.out.println("2. Mostrar frase pesimista");
        System.out.println("3. Contar un chiste");
        System.out.println("4. Decir un refr�n");
        System.out.println("5. Salir");
    }
    
    /**
     * M�todo que calcula un n�mero aleatorio entre 1 y 3.
     * 
     * @return int numero. Devuelve 1, 2 � 3.
     */
    public static int numeroAleatorio(){
        
        int numero = 0 ;
        boolean validador = false ;
        
        numero = (int)(Math.random()*3+1) ;
        
        return numero ;
    }
    
    /**
     * M�todo que elige entre una de las tres frases motivacionales aleatoriamente.
     * 
     * @return String frase. Devuelve una de las tres frases motivacionales.
     */
    public static String generarFraseMotivacional(){
        
        int numero = numeroAleatorio() ;
        String frase = "";
        
        switch (numero)
        {
            case 1:
                frase = fraseMotivacional1 ;
                break;
                
            case 2:
                frase = fraseMotivacional2 ;
                break;
                
            case 3:
                frase = fraseMotivacional3 ;
                break;
        }
        
        return frase ;
    }
    
    /**
     * M�todo que elige entre una de las tres frases pesimistas aleatoriamente.
     * 
     * @return String frase. Devuelve una de las tres frases pesimistas.
     */
    public static String generarFrasePesimista(){
        
        int numero = numeroAleatorio() ;
        String frase = "";
        
        switch (numero)
        {
            case 1:
                frase = frasePesimista1 ;
                break;
                
            case 2:
                frase = frasePesimista2 ;
                break;
                
            case 3:
                frase = frasePesimista3 ;
                break;
        }
        
        return frase ;
    }
    
    /**
     * M�todo que elige entre uno de las tres chiste aleatoriamente.
     * 
     * @return String chiste. Devuelve uno de las tres chistes.
     */
    public static String generarChiste(){
        
        int numero = numeroAleatorio() ;
        String chiste = "";
        
        switch (numero)
        {
            case 1:
                chiste = chiste1 ;
                break;
                
            case 2:
                chiste = chiste2 ;
                break;
                
            case 3:
                chiste = chiste3 ;
                break;
        }
        
        return chiste ;
    }
    
    /**
     * M�todo que elige entre uno de las tres refranes aleatoriamente.
     * 
     * @return String refran. Devuelve uno de las tres refranes.
     */
    public static String generarRefran(){
        
        int numero = numeroAleatorio() ;
        String refran = "";
        
        switch (numero)
        {
            case 1:
                refran = refran1 ;
                break;
                
            case 2:
                refran = refran2 ;
                break;
                
            case 3:
                refran = refran3 ;
                break;
        }
        
        return refran ;
    }
    
    // ----------------------------------------------
    // --------------  M�TODO MAIN ------------------
    // ----------------------------------------------
    
    public static void main(String[] args) {
        
        // Declaraci�n de variables
        
        int opcion = 0 ;
        String decision = "" ;
        boolean validador = false ;
        
        // Mensaje de bienvenida
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Bienvenido/a al generador de frases, chistes y refranes");
        System.out.println("--------------------------------------------------------");
        
        do 
        {
        
            do 
            {
                mostrarMenu();

                opcion = Utilidades.leerEntero("\nIntroduce una opci�n: ") ;

                switch (opcion)
                {
                    case 1:
                        System.out.println(generarFraseMotivacional());
                        break;

                    case 2:
                        System.out.println(generarFrasePesimista());
                        break;

                    case 3:
                        System.out.println(generarChiste());
                        break;

                    case 4:
                        System.out.println(generarRefran());
                        break;

                    case 5:
                        validador = true ;
                        break;

                    default:
                        System.out.println("\nLa opci�n tiene que estar comprendida entre 1 y 5.\n");
                        break;
                }

            } while (!validador);
            
            validador = false ;
                
            do // Ejecuta hasta que la decisi�n del usuario/a sea v�lida.
            {                
                decision = Utilidades.leerString("\nConfirma si quieres salir: (s/n)\n") ; // Pregunta al usuario/a si quiere continuar.
            
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
        
        System.out.println("\n-- HAS SALIDO DEL PROGRAMA -- \n\t?Hasta pronto!\n");
        
    }
}
