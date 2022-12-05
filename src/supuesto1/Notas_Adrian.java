
package supuesto1;

import java.lang.ref.SoftReference;
import recursos.excepciones.ExcepcionRangoNotas;
import recursos.utilidades.Utilidades;

/**
 * SUPUESTO 1: IF ELSE Y EXCEPCIONES
 * Realizar una clase llamada Notas_Nombre (Nombre es vuestro nombre), que 
 * llevará un método main(), en elque se implementará un algoritmo que realizará 
 * lo siguiente utilizando if anidados (if else):
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
    
    public Notas_Adrian(){ // Constructor por defecto
     
        nota = 0 ;
        nombre = "" ;
    }
    
    public Notas_Adrian(String nombre, float nota){ // Constructor con nombre y nota
     
        this.nota = nota ;
        this.nombre = nombre ;
    }
    
    // MÉTODOS
    
        // GETTERS & SETTERS
    
            // NOTA
    
        public float getNota() {
            return nota;
        }

        public void setNota(float nota) {
            this.nota = nota;
        }

            // NOMBRE
    
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
    public void compruebaRangoNota(float nota) throws ExcepcionRangoNotas{
        
        if (nota >= 0 & nota <= 10) // Si la nota es mayor o igual que cero y menor o igual que 10...
        {
            this.nota = nota ; // ...es válido y se guardará.
        }
        else // Si no se cumple condición...
        {
            throw new ExcepcionRangoNotas("La nota debe estar comprendida entre 0 y 10.") ; // ...saltará la excepción.
        }
    }
    
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
    
    @Override
    public String toString(){
        
        return nombre + ", tu nota es: " + "\n\t" + equivalenciaNota(nota) ;
    }
    
    public static void main(String[] args) {
        
        // Declaración de variables
        
        String nombre ;
        float nota ;
        boolean validador = false ;
        
        // Entradas y salidas de datos
        
        System.out.println("Bienvenido/a al calificador.\n");
        
        nombre = Utilidades.leerString("Introduce tu nombre, por favor: ") ;
        nota = Utilidades.leerDecimal("Ahora introduce tu nota: ") ;
        
        
    }
    
    
}
