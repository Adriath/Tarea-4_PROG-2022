/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto3;

import java.time.format.DecimalStyle;
import recursos.excepciones.ExcepcionDecisionUsuario;
import recursos.utilidades.Utilidades;

/**
 * Realiza un programa llamado Frases_Nombre, que muestre un menú de opciones 
 * que permitan hacer lo siguiente:
 *  1. Mostrar frase motivacional.
 *  2. Mostrar frase pesimista.
 *  3. Contar un chiste.
 *  4. Decir un refrán.
 *  5. Salir.
 * 
 * @author Adrián Arjona
 * @version 1.0 Diciembre 2022
 */
public class Frases_Adrian {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    // --------- DECLARACIÓN DE VARIABLES --------------
    
        // FRASES MOTIVACIONALES
    
            private static String fraseMotivacional1 = "\nLa informática no es solo una "
                    + "herramienta, es una forma de pensar y una oportunidad para "
                    + "aplicar la lógica y la creatividad en la resolución de "
                    + "problemas.\n" ;

            private static String fraseMotivacional2 = "\nLa informática es el futuro, así "
                    + "que abraza la tecnología y conviértete en un maestro de la "
                    + "informática para alcanzar tus sueños y lograr el éxito.\n" ;

            private static String fraseMotivacional3 = "\nEl éxito no es una meta, es un "
                    + "viaje en el que debes mantenerte en movimiento y perseverar "
                    + "en tus metas y sueños.\n" ;

            
        // FRASES PESIMISTAS

            private static String frasePesimista1 = "\nNunca lograré lo que quiero en la vida.\n" ;

            private static String frasePesimista2 = "\nTodo lo que empieza bien, termina mal.\n" ;

            private static String frasePesimista3 = "\nSi algo malo puede pasar, pasará.\n" ;

            
        // CHISTES

            private static String chiste1 = "\n\tJaimito en clase:\n\n "
                    + "\t- Hoy vamos a dar los poemas. A ver, Juanito, hazme un pareado.\n "
                    + "\t- Fui a recoger almejas y me llegaba el agua por las orejas.\n"
                    + "\t- Muy bien, Juanito. Ahora tú, Jaimito.\n"
                    + "\t- Fui a recoger mejillones y me llegaba el agua por las rodillas.\n"
                    + "\t- Jaimito, eso no rima.\n"
                    + "\t- Pues espérate a que suba la marea.\n." ;

            private static String chiste2 = "\n- Oye, ?Cuál es tu plato favorito?\n"
                    + "- Pues el hondo, porque cabe más comida.\n" ;

            private static String chiste3 = "\n- ?Te gusta el rock progresivo?\n"
                + "- Cada vez más." ;      

            
        // REFRANES

            private static String refran1 = "\nMás vale pájaro en mano que ciento volando.\n" ;

            private static String refran2 = "\nA caballo regalado no le mires el diente.\n" ;

            private static String refran3 = "\nMás vale prevenir que curar.\n" ;
        
    
            
    // ------------- MÉTODOS ---------------
            

    /**
     * Método que muestra el menú.
     */
    public static void mostrarMenu(){
        
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("-------------------------------------\n");
        
        System.out.println("1. Mostrar frase motivacional");
        System.out.println("2. Mostrar frase pesimista");
        System.out.println("3. Contar un chiste");
        System.out.println("4. Decir un refrán");
        System.out.println("5. Salir");
    }
    
    /**
     * Método que calcula un número aleatorio entre 1 y 3.
     * 
     * @return int numero. Devuelve 1, 2 ó 3.
     */
    public static int numeroAleatorio(){
        
        int numero = 0 ;
        boolean validador = false ;
        
        numero = (int)(Math.random()*3+1) ;
        
        return numero ;
    }
    
    /**
     * Método que elige entre una de las tres frases motivacionales aleatoriamente.
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
     * Método que elige entre una de las tres frases pesimistas aleatoriamente.
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
     * Método que elige entre uno de las tres chiste aleatoriamente.
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
     * Método que elige entre uno de las tres refranes aleatoriamente.
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
    // --------------  MÉTODO MAIN ------------------
    // ----------------------------------------------
    
    public static void main(String[] args) {
        
        // Declaración de variables
        
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

                opcion = Utilidades.leerEntero("\nIntroduce una opción: ") ;

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
                        System.out.println("\nLa opción tiene que estar comprendida entre 1 y 5.\n");
                        break;
                }

            } while (!validador);
            
            validador = false ;
                
            do // Ejecuta hasta que la decisión del usuario/a sea válida.
            {                
                decision = Utilidades.leerString("\nConfirma si quieres salir: (s/n)\n") ; // Pregunta al usuario/a si quiere continuar.
            
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
        
        System.out.println("\n-- HAS SALIDO DEL PROGRAMA -- \n\t?Hasta pronto!\n");
        
    }
}
