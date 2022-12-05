
package supuesto2;

import java.lang.ref.SoftReference;
import javax.swing.JOptionPane;
import recursos.excepciones.ExcepcionDecisionUsuario;
import recursos.excepciones.ExcepcionRangoNotas;
import recursos.utilidades.Utilidades;

/**
 * SUPUESTO 2: ESTRUCTURAS REPETITIVAS
 * Modifica el ejercicio anterior, para que utilizando la o las estructuras 
 * repetitivas que veas oportunas, se sigan pidiendo notas sin que acabe el 
 * programa, hasta que el usuario decida que no quiere. Es decir, después de 
 * mostrar el mensaje diciendo la calificación que ha obtenido, se pedirá si 
 * desea continuar.
 * 
 * @author Adrián Arjona
 * @version 1.0 Diciembre 2022
 */
public class Notas_Adrian{
   
    /* Francisco Adrián Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    // DECLARACIÓN DE VARIABLES
    
    private float nota ;
    private String nombre ;
    
    public enum Notas {Suspenso, Aprobado, Bien, Notable, Sobresaliente, Matrícula} ;
    
    // CONSTRUCTORES
    
    /**
     * Constructor por defecto de la clase Notas_Adrian.
     */
    public Notas_Adrian(){ // Constructor por defecto
     
        nota = 0 ;
        nombre = "" ;
    }
    
    /**
     * Constructor con parámetros de la clase Notas_Adrian.
     * 
     * @param nombre String. Nombre del alumno/a.
     * @param nota float. Nota del alumno/a.
     */
    public Notas_Adrian(String nombre, float nota){ // Constructor con nombre y nota
     
        this.nota = nota ;
        this.nombre = nombre ;
    }
    
    // MÉTODOS
    
        // GETTERS & SETTERS
    
            // NOTA
    
        /**
         * Método que muestra la nota.
         * 
         * @return float nota. Devuelve la nota del alumno/a.
         */
         public float getNota() {
            return nota;
        }

        /**
         * Método que modifica la nota.
         * 
         * @param nota float. La nota del alumno/a.
         */
        public void setNota(float nota) {
            this.nota = nota;
        }

            // NOMBRE
    
        /**
         * Método que muestra el nombre.
         * 
         * @return String nombre. Devuelve el nombre del alumno/a.
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Método que modifica el nombre.
         * 
         * @param nombre String. El nombre del alumno/a.
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
    /**
     * Método que comprueba si la nota introducida es válida.
     * 
     * @param nota float. Nota del alumno/a.
     * @return boolean valido. Devuelve si es válido (true) o no (false).
     * @throws ExcepcionRangoNotas. La nota debe estar comprendida entre 0 y 10 (ambos inclusive).
     */
    public static boolean compruebaRangoNota(float nota) throws ExcepcionRangoNotas{
        
        boolean valido = false ;
        
        if (nota >= 0 & nota <= 10) // Si la nota es mayor o igual que cero y menor o igual que 10...
        {
            valido = true ; // ...es válido.
        }
        else // Si no se cumple condición...
        {
            throw new ExcepcionRangoNotas("La nota debe estar comprendida entre 0 y 10.") ; // ...saltará la excepción.
        }
        
        return valido ;
    }
    
    /**
     * Método que traduce la nota introducida por su equivalente (aprobado, suspendo, etc.).
     * 
     * @param n float. Nota del alumno/a.
     * @return String nota. Devuelve la nota traducida a su equivalencia en cadena de caracteres.
     */
    public String equivalenciaNota(float n){
        
        String nota = "";
        
        if (n < 5) // Si la nota es menor a 5...
        {
            nota = Notas.Suspenso.name() ; // ...suspenso.
        }
        else if (n >= 5 && n < 6 ) // Si la nota es mayor o igual a 5 y menor que 6...
        {
            nota = Notas.Aprobado.name() ; // ...aprobado.
        }
        else if (n >= 6 && n < 7 ) // Si la nota es mayor o igual a 6 y menor que 7...
        {
            nota = Notas.Bien.name() ; // ...bien.
        }
        else if (n >= 7 && n < 9 ) // Si la nota es mayor o igual a 7 y menor que 9...
        {
            nota = Notas.Notable.name() ; // ...notable
        }
        else if (n >= 9 && n < 10 ) // Si la nota es mayor o igual a 9 y menor que 10...
        {
            nota = Notas.Sobresaliente.name() ; // ...sobresaliente.
        }
        else if (n == 10 ) // Si la nota es igual a 10...
        {
            nota = Notas.Matrícula.name() ; // ...matrícula.
        }
        
        return nota ;
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
     * Método que extraerá la decisión del usuario, previamente validada,
     * @param decision
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
     * Método toString de la clase Notas_Adrian.
     * 
     * @return String. Llama al alumno/a por su nombre y le dice la nota traducida a cadena de caracteres.
     */
    @Override
    public String toString(){
        
        return "\t" + nombre + ", tu nota es: " + "\n\t" + " ---- " + equivalenciaNota(nota) + " ---- " ;
    }
    
    // -----------------------------------------
    // -------------- MÉTODO MAIN --------------
    // -----------------------------------------
    
    public static void main(String[] args) {
        
        // Declaración de variables
        
        String nombre ;
        float nota = 0 ;
        
        String decision = "" ;
        
        boolean valido = false ; // Se utiliza para saber si la nota es válida (entre 0 y 10).
        boolean validador = false ; // Se utiliza para salir del bucle.
        
        // Entradas y salidas de datos
        
        System.out.println("Bienvenido/a al calificador.\n"); // Mensaje de bienvenida.
        
        do // Ejecutará hasta que el/la usuario/a quiera finalizar el programa.
        {            
            nombre = Utilidades.leerString("Introduce tu nombre, por favor: ") ; // Pide el nombre.

            do // Ejecutará hasta la nota introducida sea correcta.
            {                
                try 
                {
                    nota = Utilidades.leerDecimal("\nIntroduce tu nota: ") ; // Pide la nota.
                    
                    valido = Notas_Adrian.compruebaRangoNota(nota) ; // Comprueba que la nota introducida esté entre 0 y 10...
                    validador = true ;
                }
                catch (ExcepcionRangoNotas e){

                    System.out.println(e.getMessage()); // ...de no ser así salta la excepción.
                }
                catch (Exception e) {

                    System.out.println("\nLa nota introducida no es válida. Debe estar comprendida entre 0 y 10.\n") ;
                }
                
            } while (!validador);
            
            
            validador = false ; // Reiniciamos el validador para continuar usándolo en el bucle.
            

            if (valido == true) // Si la nota es válida...
            {
                Notas_Adrian calificacion = new Notas_Adrian(nombre, nota) ; // ...creará el objeto...

                System.out.println(calificacion.toString()); // ...y mostrará los datos por pantalla.

                do // Ejecuta hasta que la decisión del usuario/a sea válida.
                {                    
                    decision = Utilidades.leerString("\nIndica si vas a querer introducir otra nota: (s/n)\n") ; // Pregunta al usuario/a si quiere continuar.
                    
                    try // Comprueba si es correcta la decisión...
                    {
                        validador = compruebaDecisionUsuario(decision) ;
                        
                    } 
                    catch (ExcepcionDecisionUsuario e){ //...y si no lo es salta la excepción.
                        
                        System.out.println(e.getMessage()); 
                    }
                    catch (Exception e) {
                        
                        System.out.println("Tienes que decir sí \"s/S\" o no \"n/N\".") ;
                    }
                    
                } while (!validador);
                
            }
            
            validador = distingueEntreSiYNo(decision) ; // Dependiendo de la decisión que se haya tomado (sí o no) se seguirá o no la ejecución.            
            
        }  while (!validador);
            
            System.out.println("\nEl programa ha finalizado.\n") ;
        
        }
    }
