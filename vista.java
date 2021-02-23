/**
 * 
 */
package algoritmos;

/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Alejandro Gomez y Ana Ramirez
* Fecha de creacion: 09/02/2021
* Ultima edicion: 09/02/2021
********************************************************/

//import java.util.ArrayList;

import java.util.*;

public class vista{
    
    //Se declara metodo constructor
    public vista(){

    }
    
    /**
     * Metodo bienve
     * @param n/a
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     **/
    public void bienve(){
        System.out.println("\nBienvenido al programa de ");
        System.out.println("1. StackVector");
        System.out.println("2. StackArraylist");
        System.out.println("3. LinkedList");
        System.out.println("4. DoubleLinkedList");
        System.out.println("5. Salir\n");
        System.out.println("Ingrese su opcion:  ");
    }
        

    
    /**
     * Metodo OpSalir
     * @param n/a
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     **/
    public void opSalir(){
        System.out.println("Gracias por utilizar este programa.¡Hasta pronto!");
    }
   
    
    /*
     * Metodo ElementosLista
     * @param n/a
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     *
   public void ElementosLista(int variablexd){
       System.out.println("La cantidad de numeros que genero es: " +variablexd);
   }*/
    /**
     * Metodo noValid
     * @param n/a
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     **/
    public void noValid(){
        System.out.println("Por favor ingrese un numero valido, si usted ingresa una letra EL PROGRAMA SE CIERRA");
    }

    /**
     * Metodo fileCreated
     * @param n/a
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     **/
    public void fileCreated(){
        System.out.println("Su archivo ha sido creado y leido con exito");
    }

    /**
     * Metodo respuesta
     * @param 
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     **/
    public void respuesta(String tipo, int resp){
        System.out.println("A través de "+tipo+" se obtuvo "+String.valueOf(resp)+" como respuesta.");
    }
}