
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
    
    public Notas_Adrian(){ // Constructor por defecto
     
        nota = 0 ;
        nombre = "" ;
    }
    
    public Notas_Adrian(String nombre, float nota){ // Constructor con nombre y nota
     
        this.nota = nota ;
        this.nombre = nombre ;
    }
    
    // M�TODOS
    
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
    
    @Override
    public String toString(){
        
        return nombre + ", tu nota es: " + "\n\t" + equivalenciaNota(nota) ;
    }
    
    public static void main(String[] args) {
        
        // Declaraci�n de variables
        
        String nombre ;
        float nota ;
        boolean valido = false ;
        
        // Entradas y salidas de datos
        
        System.out.println("Bienvenido/a al calificador.\n"); // Mensaje de bievenida.
        
        nombre = Utilidades.leerString("Introduce tu nombre, por favor: ") ; // Pide el nombre.
        nota = Utilidades.leerDecimal("Ahora introduce tu nota: ") ; // Pide la nota.
        
        try 
        {
            valido = Notas_Adrian.compruebaRangoNota(nota) ; // Comprueba que la nota introducida est� entre 0 y 10...
        }
        catch (ExcepcionRangoNotas e){
            System.out.println(e.getMessage()); // ...de no ser as� salta la excepci�n.
        }
        catch (Exception e) {
            System.out.println("La nota introducida no es v�lida.") ;
        }
        
        if (valido == true) // Si la nota es v�lida...
        {
            Notas_Adrian calificacion = new Notas_Adrian(nombre, nota) ; // ...crear� el objeto...
            
            System.out.println(calificacion.toString()); // ...y mostrar� los datos por pantalla.
            
            System.out.println("El programa ha finalizado."); // Mensaje de despedida.
        }
        else
        {
            System.out.println("El programa ha finalizado."); // Mensaje de despedida.
        }
    }
    
    
}
