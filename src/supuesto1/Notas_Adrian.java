
package supuesto1;

import java.lang.ref.SoftReference;
import recursos.excepciones.ExcepcionRangoNotas;
import recursos.utilidades.Utilidades;

/**
 * SUPUESTO 1: IF ELSE Y EXCEPCIONES
 * Realizar una clase llamada Notas_Nombre (Nombre es vuestro nombre), que 
 * llevar� un m�todo main(), en elque se implementar� un algoritmo que realizar� 
 * lo siguiente utilizando if anidados (if else):
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
        float nota ;
        boolean valido = false ;
        
        // Entradas y salidas de datos
        
        System.out.println("Bienvenido/a al calificador.\n"); // Mensaje de bienvenida.
        
        nombre = Utilidades.leerString("Introduce tu nombre, por favor: ") ; // Pide el nombre.
        nota = Utilidades.leerDecimal("\nIntroduce tu nota: ") ; // Pide la nota.
        
        try 
        {
            valido = Notas_Adrian.compruebaRangoNota(nota) ; // Comprueba que la nota introducida est� entre 0 y 10...
        }
        catch (ExcepcionRangoNotas e){
            
            System.out.println(e.getMessage()); // ...de no ser as� salta la excepci�n.
        }
        catch (Exception e) {
            
            System.out.println("\nLa nota introducida no es v�lida. Debe estar comprendida entre 0 y 10.\n") ;
        }
        
        if (valido == true) // Si la nota es v�lida...
        {
            Notas_Adrian calificacion = new Notas_Adrian(nombre, nota) ; // ...crear� el objeto...
            
            System.out.println(calificacion.toString()); // ...y mostrar� los datos por pantalla.
            
            System.out.println("\nEl programa ha finalizado.\n"); // Mensaje de despedida.
        }
        else // Si no es v�lida finalizar� el programa sin aportar ning�n dato. No se vuelve a pedir la nota.
        {
            System.out.println("\nEl programa ha finalizado.\n"); // Mensaje de despedida.
        }
    }
    
    
}
