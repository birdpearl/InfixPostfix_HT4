/**
 * 
 */

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

//import java.util.*;

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
        System.out.println("Gracias por utilizar este programa.�Hasta pronto!");
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
        System.out.println("Por favor ingrese un numero valido.\n");
    }

    /**
     * Metodo fileCreated
     * @param n/a
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     **/
    public boolean fileCreated(Evaluador e, String s)
    {
        if(e.OpenFile(s) != null)
        {
            System.out.println("Su archivo ha sido leido con exito");
            return true;
        }
        else
        {
            System.out.println("La dirección que ha ingresado no ha regresado un archivo legible, lo sentimos.");
            return false;
        }
    }

    /**
     * Metodo respuesta
     * @param 
     * @author Diego Perdomo y Ana Ramirez
     * @return n/a
     **/
    public void respuesta(String tipo, int resp, String postfix){
        System.out.println("A través de "+tipo+" se obtuvo "+String.valueOf(resp)+" como respuesta de la expresión " +postfix);
    }

    /**
     * @author Diego Perdomo y Ana Ramírez
     * @return n/a
     */
    public void ingresarPath()
    {
        System.out.println("\nIngrese el path del archivo que busca abrir.");
    }
}