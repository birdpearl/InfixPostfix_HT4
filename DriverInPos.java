/**
 * 
 */

/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* Autores: Diego Perdomo y Ana Ramirez
* Fecha de creacion: 18/02/2021
* Ultima edicion: 23/02/2021
********************************************************/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;

public class DriverInPos {
    public static void main(String[] args){
        
        //Se declaran instancias y declaran variables
    	ListDoubleLinkedList<String> d =new ListDoubleLinkedList<String>();
    	ListLinkedList<String> l =new ListLinkedList<String>();
        StackList<String> sl = new StackList<>();
		CalcuFisica c=new CalcuFisica();
        vista v=new vista();
        Scanner scan = new Scanner(System.in);
        Evaluador e = new Evaluador();
        
        //se crea el arreglo postfix que tendr� los elementos del txt
        String[] postfix;
        boolean bandc=true;
        int opcion=0;
        
        //aqui deber�as poner al usuario a que ingrese el path del archivo y registrarlo y todo se guarda en el vector postfix
        //le puse 10 solo por ejemplo

        /*boolean flag = false;
        while(flag == false)
        {
            v.ingresarPath();
            String path = scan.nextLine();
            flag = v.fileCreated(e, path);
        }*/


        postfix=e.Convertir(e.OpenFile("C:\\Users\\DIEGO\\Documents\\UVG 2021\\semestre 1\\algoritmos\\hoja de trabajo 4\\datos.txt"));

        for(int i = 0; i < postfix.length; i++)
        {
            for(int j = 0; j < postfix[i].length(); j++)
            {
                sl.push(String.valueOf(postfix[i].charAt(postfix[i].length() - (j + 1))));
            }
            System.out.println(c.operarArrayList(sl));
        }

        System.out.println("");

        for(int i = 0; i < postfix.length; i++)
        {
            StackVector<String> sv = new StackVector<>(postfix[i].length());
            for(int j = 0; j < postfix[i].length(); j++)
            {
                sv.push(String.valueOf(postfix[i].charAt(postfix[i].length() - (j + 1))));
            }
            System.out.println(c.operarVector(sv));
        }



        /*while (opcion != 5 && bandc==true) {//loop que genera el men� para el usuario
            try{
                v.bienve();
                opcion = scan.nextInt(); //se copia la respuesta del ususario en una variable

            }catch(Exception e){
                //System.out.println("Por favor ingrese un numero validop");
                bandc=false;
            }
        
            for(int i=0; i<postfix.length;i++) { //for para meterle los valores a las respectivas listas que iran dentro e cada operar
            	d.insert(postfix[i]);
            	l.insert(postfix[i]);
      
            }
            
            if (opcion == 1 ){//se llama a stack vector
                
                //v.respuesta("Stack Vector", c.operarVector(postfix));

            } else if (opcion == 2){//se llama a Stack Arraylist
            	 //v.respuesta("Stack Arraylist", c.operarArrayList(postfix));

            } else if (opcion == 3){//se llama a Linked List
            	 v.respuesta("Linked List", c.operarLinkedList(l));

            }else if (opcion == 4){//se llama a Double Linked list
            	 v.respuesta("Double Linked list", c.operarDoubleList(d));

            } else if (opcion == 5){
                v.opSalir();//se cierra el programa
            }
            else{
                v.noValid();//el programa se cierra si se ingres� una letra
            }
        }*/

    }
}