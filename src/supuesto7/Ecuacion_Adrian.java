/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supuesto7;

import recursos.excepciones.ExcepcionDiscriminanteNegativo;

/**
 * SUPUESTO 7:
 * 
 * En este supuesto vamos a dise�ar una clase Ecuacion, de la que luego desde 
 * el main crearemos un objeto de dicha clase y realizaremos las operaciones.
 * Es necesario que leas todo este supuesto por completo antes de ponerte a 
 * implementar, porque se relacionan unos apartados con otros, y adem�s se 
 * explican conceptos importantes.
 * 
 * @author Adri�n Arjona
 * @version 1.0 Diciembre 2022
 */
public class Ecuacion_Adrian {
    
     /* Francisco Adri�n Arjona Bravo
        UNIDAD 4: uso de estructuras de control.
    */
    
    
    // ------------- DECLARACI�N DE VARIABLES ----------------
    
    private int a ;
    private int b ;
    private int c ;

    
    
    // -------------- CONSTRUCTORES -----------------------
    
    
    /**
     * Constructor por defecto de la clase Ecuacion_Adrian.
     */
    public Ecuacion_Adrian() { // Constructor por defecto
        
        a = 0 ;
        b = 0 ;
        c = 0 ;
    }
    
    /**
     * Constructor con par�metros de la clase Ecuacion_Adrian.
     * 
     * @param a int. Uno de los valores de la ecuaci�n.
     * @param b int. Uno de los valores de la ecuaci�n.
     * @param c int. Uno de los valores de la ecuaci�n.
     */
    public Ecuacion_Adrian(int a, int b, int c) { // Constructor con par�metros
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    // -------------- M�TODOS ----------------
    
        // GETTERS & SETTERS

            // Variable A
    
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

            // Variable B

        public int getB() {
        return b;
        }

        public void setB(int b) {
            this.b = b;
        }

            // Variable C

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }
    
        
        // M�TODOS PERSONALIZADOS
        
        
        /**
         * M�todo que calcula el discriminante de la ecuaci�n.
         * 
         * @return tipo int. Devuelve el discriminante.
         */
        public int comprobarDiscriminante(){
            
            int resultado ;
            
            resultado = (int)Math.pow(this.b, 2) - 4 * this.a * this.c ;
            
            return resultado ;
        }
        
        
        /**
         * M�todo que calcula el resultado la de ecuaci�n de segundo grado 
         * cuando se suma el discriminante.
         * 
         * @return tipo double. Devuelve uno de los resultados de la ecuaci�n.
         * @throws ExcepcionDiscriminanteNegativo. Excepci�n para controlar si el discriminante es negativo.
         */
        public double calcularX1() throws ExcepcionDiscriminanteNegativo{
            
            double resultado ;
            
            double discriminante = comprobarDiscriminante() ;
            
            if (discriminante >= 0)
            {
                resultado = (-(this.b) + Math.sqrt(discriminante)) / (2 * this.a) ;
            }
            else
            {
                throw new ExcepcionDiscriminanteNegativo("\nEL DISCRIMINANTE ES NEGATIVO: NO HAY SOLUCIONES.\n") ;
            }
            
            return resultado ;
        }
        
        /**
         * M�todo que calcula el resultado la de ecuaci�n de segundo grado 
         * cuando se resta el discriminante.
         * 
         * @return tipo double. Devuelve uno de los resultados de la ecuaci�n.
         * @throws ExcepcionDiscriminanteNegativo. Excepci�n para controlar si el discriminante es negativo.
         */
        public double calcularX2() throws ExcepcionDiscriminanteNegativo{
            
            double resultado ;
            
            double discriminante = comprobarDiscriminante() ;
            
            if (discriminante >= 0)
            {
                resultado = (-(this.b) - Math.sqrt(discriminante)) / (2 * this.a) ;
            }
            else
            {
                throw new ExcepcionDiscriminanteNegativo("\nEL DISCRIMINANTE ES NEGATIVO: NO HAY SOLUCIONES.\n") ;
            }
            
            return resultado ;
        }
   
        
}
