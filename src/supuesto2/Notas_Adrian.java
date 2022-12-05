
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
 * programa, hasta que el usuario decida que no quiere. Es decir, despu�s de 
 * mostrar el mensaje diciendo la calificaci�n que ha obtenido, se pedir� si 
 * desea continuar.
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class Notas_Adrian{
   
    /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    // DECLARACI�N DE VARIABLES
    
    private float nota ;
    private String nombre ;
    
    public enum Notas {Suspenso, Aprobado, Bien, Notable, Sobresaliente, Matr�cula} ;
    
    // CONSTRUCTORES
    
    /**
     * Constructor por defecto de la clase Notas_Adrian.
     */
    public Notas_Adrian(){ // Constructor por defecto
     
        nota = 0 ;
        nombre = "" ;
    }
    
    /**
     * Constructor con par�metros de la clase Notas_Adrian.
     * 
     * @param nombre String. Nombre del alumno/a.
     * @param nota float. Nota del alumno/a.
     */
    public Notas_Adrian(String nombre, float nota){ // Constructor con nombre y nota
     
        this.nota = nota ;
        this.nombre = nombre ;
    }
    
    // M�TODOS
    
        // GETTERS & SETTERS
    
            // NOTA
    
        /**
         * M�todo que muestra la nota.
         * 
         * @return float nota. Devuelve la nota del alumno/a.
         */
         public float getNota() {
            return nota;
        }

        /**
         * M�todo que modifica la nota.
         * 
         * @param nota float. La nota del alumno/a.
         */
        public void setNota(float nota) {
            this.nota = nota;
        }

            // NOMBRE
    
        /**
         * M�todo que muestra el nombre.
         * 
         * @return String nombre. Devuelve el nombre del alumno/a.
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * M�todo que modifica el nombre.
         * 
         * @param nombre String. El nombre del alumno/a.
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
    /**
     * M�todo que comprueba si la nota introducida es v�lida.
     * 
     * @param nota float. Nota del alumno/a.
     * @return boolean valido. Devuelve si es v�lido (true) o no (false).
     * @throws ExcepcionRangoNotas. La nota debe estar comprendida entre 0 y 10 (ambos inclusive).
     */
    public static boolean compruebaRangoNota(float nota) throws ExcepcionRangoNotas{
        
        boolean valido = false ;
        
        if (nota >= 0 & nota <= 10) // Si la nota es mayor o igual que cero y menor o igual que 10...
        {
            valido = true ; // ...es v�lido.
        }
        else // Si no se cumple condici�n...
        {
            throw new ExcepcionRangoNotas("La nota debe estar comprendida entre 0 y 10.") ; // ...saltar� la excepci�n.
        }
        
        return valido ;
    }
    
    /**
     * M�todo que traduce la nota introducida por su equivalente (aprobado, suspendo, etc.).
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
            nota = Notas.Matr�cula.name() ; // ...matr�cula.
        }
        
        return nota ;
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
     * M�todo que extraer� la decisi�n del usuario, previamente validada,
     * @param decision
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
    
    /**
     * M�todo toString de la clase Notas_Adrian.
     * 
     * @return String. Llama al alumno/a por su nombre y le dice la nota traducida a cadena de caracteres.
     */
    @Override
    public String toString(){
        
        return "\t" + nombre + ", tu nota es: " + "\n\t" + " ---- " + equivalenciaNota(nota) + " ---- " ;
    }
    
    // -----------------------------------------
    // -------------- M�TODO MAIN --------------
    // -----------------------------------------
    
    public static void main(String[] args) {
        
        // Declaraci�n de variables
        
        String nombre ;
        float nota = 0 ;
        
        String decision = "" ;
        
        boolean valido = false ; // Se utiliza para saber si la nota es v�lida (entre 0 y 10).
        boolean validador = false ; // Se utiliza para salir del bucle.
        
        // Entradas y salidas de datos
        
        System.out.println("Bienvenido/a al calificador.\n"); // Mensaje de bienvenida.
        
        do // Ejecutar� hasta que el/la usuario/a quiera finalizar el programa.
        {            
            nombre = Utilidades.leerString("Introduce tu nombre, por favor: ") ; // Pide el nombre.

            do // Ejecutar� hasta la nota introducida sea correcta.
            {                
                try 
                {
                    nota = Utilidades.leerDecimal("\nIntroduce tu nota: ") ; // Pide la nota.
                    
                    valido = Notas_Adrian.compruebaRangoNota(nota) ; // Comprueba que la nota introducida est� entre 0 y 10...
                    validador = true ;
                }
                catch (ExcepcionRangoNotas e){

                    System.out.println(e.getMessage()); // ...de no ser as� salta la excepci�n.
                }
                catch (Exception e) {

                    System.out.println("\nLa nota introducida no es v�lida. Debe estar comprendida entre 0 y 10.\n") ;
                }
                
            } while (!validador);
            
            
            validador = false ; // Reiniciamos el validador para continuar us�ndolo en el bucle.
            

            if (valido == true) // Si la nota es v�lida...
            {
                Notas_Adrian calificacion = new Notas_Adrian(nombre, nota) ; // ...crear� el objeto...

                System.out.println(calificacion.toString()); // ...y mostrar� los datos por pantalla.

                do // Ejecuta hasta que la decisi�n del usuario/a sea v�lida.
                {                    
                    decision = Utilidades.leerString("\nIndica si vas a querer introducir otra nota: (s/n)\n") ; // Pregunta al usuario/a si quiere continuar.
                    
                    try // Comprueba si es correcta la decisi�n...
                    {
                        validador = compruebaDecisionUsuario(decision) ;
                        
                    } 
                    catch (ExcepcionDecisionUsuario e){ //...y si no lo es salta la excepci�n.
                        
                        System.out.println(e.getMessage()); 
                    }
                    catch (Exception e) {
                        
                        System.out.println("Tienes que decir s� \"s/S\" o no \"n/N\".") ;
                    }
                    
                } while (!validador);
                
            }
            
            validador = distingueEntreSiYNo(decision) ; // Dependiendo de la decisi�n que se haya tomado (s� o no) se seguir� o no la ejecuci�n.            
            
        }  while (!validador);
            
            System.out.println("\nEl programa ha finalizado.\n") ;
        
        }
    }
