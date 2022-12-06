/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto3;

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

            private static String frasePesimista2 = "\nTodo lo que empieza bien, termina mal\n" ;

            private static String frasePesimista3 = "\nSi algo malo puede pasar, pasará.\n" ;

        // CHISTES

            private static String chiste1 = "\nJaimito en clase:\n "
                    + "\t-\"Hoy vamos a dar los poemas. A ver, Juanito, hazme un pareado\".\n "
                    + "\t-\"Fui a recoger almejas y me llegaba el agua por las orejas\".\n"
                    + "\t-\"Muy bien, Juanito. Ahora tú, Jaimito\".\n"
                    + "\t-\"Fui a recoger mejillones y me llegaba el agua por las rodillas\".\n"
                    + "\t-\"Jaimito, eso no rima\".\n"
                    + "\t-\"Pues espérate a que suba la marea\"." ;

            private static String chiste2 = "\n- Oye, ?Cuál es tu plato favorito?\n"
                    + "- Pues el hondo, porque cabe más comida." ;

            private static String chiste3 = "\n- Te gusta el rock progresivo?\n"
                + "- Cada vez más." ;      

        // REFRANES

            private static String refran1 = "\nMás vale pájaro en mano que ciento volando.\n" ;

            private static String refran2 = "\nA caballo regalado no le mires el diente.\n" ;

            private static String refran3 = "\nMás vale prevenir que curar\n" ;
        
    
    // ------------- MÉTODOS ---------------

    public static void mostrarMenu(){
        
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("-------------------------------------\n");
        
        System.out.println("1. Mostrar frase motivacional.");
        System.out.println("2. MOstrar frase pesimista.");
        System.out.println("3. Contar un chiste.");
        System.out.println("4. Decir un refrán.");
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
