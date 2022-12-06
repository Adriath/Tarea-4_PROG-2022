/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto3;

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

            private static String frasePesimista2 = "\nTodo lo que empieza bien, termina mal\n" ;

            private static String frasePesimista3 = "\nSi algo malo puede pasar, pasar�.\n" ;

        // CHISTES

            private static String chiste1 = "\nJaimito en clase:\n "
                    + "\t-\"Hoy vamos a dar los poemas. A ver, Juanito, hazme un pareado\".\n "
                    + "\t-\"Fui a recoger almejas y me llegaba el agua por las orejas\".\n"
                    + "\t-\"Muy bien, Juanito. Ahora t�, Jaimito\".\n"
                    + "\t-\"Fui a recoger mejillones y me llegaba el agua por las rodillas\".\n"
                    + "\t-\"Jaimito, eso no rima\".\n"
                    + "\t-\"Pues esp�rate a que suba la marea\"." ;

            private static String chiste2 = "\n- Oye, ?Cu�l es tu plato favorito?\n"
                    + "- Pues el hondo, porque cabe m�s comida." ;

            private static String chiste3 = "\n- Te gusta el rock progresivo?\n"
                + "- Cada vez m�s." ;      

        // REFRANES

            private static String refran1 = "\nM�s vale p�jaro en mano que ciento volando.\n" ;

            private static String refran2 = "\nA caballo regalado no le mires el diente.\n" ;

            private static String refran3 = "\nM�s vale prevenir que curar\n" ;
        
    
    // ------------- M�TODOS ---------------

    public static void mostrarMenu(){
        
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("-------------------------------------\n");
        
        System.out.println("1. Mostrar frase motivacional.");
        System.out.println("2. MOstrar frase pesimista.");
        System.out.println("3. Contar un chiste.");
        System.out.println("4. Decir un refr�n.");
        System.out.println("5. Salir.");
    }
    
    public static int numeroAleatorio(){
        
        int numero = 0 ;
        boolean validador = false ;
        
        numero = (int)(Math.random()*3+1) ;
        
        return numero ;
    }
    
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
                
            case 3:
                frase = fraseMotivacional3 ;
        }
        
        return frase ;
    }
    
    public static void main(String[] args) {
        System.out.println(numeroAleatorio());
    }
        
}
