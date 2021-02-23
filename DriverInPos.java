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
import java.util.Scanner;

public class DriverInPos {
    public static void main(String[] args)
    {
        
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
        

        boolean flag = false;
        String path = "";
        while(flag == false)
        {
            v.ingresarPath();
            path = scan.nextLine();
            //path = "C:\\Users\\DIEGO\\Documents\\UVG 2021\\semestre 1\\algoritmos\\hoja de trabajo 4\\datos.txt";
            flag = v.fileCreated(e, path);
        }
        
        postfix=e.Convertir(e.OpenFile(path));

        int expresion = 0;
        String temp = "";
        while (opcion != 5 && bandc==true) //loop que genera el men� para el usuario
        {                
            if(expresion < postfix.length)
            {
                int op2 = 0;
                boolean bandera = true;
                while(bandera)
                {
                    v.bienve();
                    String op = scan.nextLine();
                    if(option(op, 0, 5))
                    {
                        op2 = Integer.parseInt(op);
                        bandera = false;
                    }
                    else
                    {
                        v.noValid();
                    }
                }
                opcion = op2;
                temp = postfix[expresion];
                
                if (opcion == 1 )
                {
                    StackVector<String> sv = new StackVector<>(temp.length());
                    for(int j = 0; j < temp.length(); j++)
                    {
                        sv.push(String.valueOf(temp.charAt(temp.length() - (j + 1))));
                    }
                    v.respuesta("Stack Vector", c.operarVector(sv), temp);
                
                } else if (opcion == 2)
                {
                    //se llama a Stack Arraylist
                    for(int j = 0; j < temp.length(); j++)
                    {
                        sl.push(String.valueOf(temp.charAt(temp.length() - (j + 1))));
                    }
                	v.respuesta("Stack Arraylist", c.operarArrayList(sl), temp);
                
                } else if (opcion == 3)
                {//se llama a Linked List
                    for(int j = 0; j < temp.length(); j++)
                    {
                        l.insert(String.valueOf(temp.charAt(j)));
                    }
                	v.respuesta("Linked List", c.operarLinkedList(l), temp);
                
                }else if (opcion == 4)
                {//se llama a Double Linked list
                    for(int j = 0; j < temp.length(); j++)
                    {
                        d.insert(String.valueOf(temp.charAt(j)));
                    }
                	v.respuesta("Double Linked list", c.operarDoubleList(d), temp);
                
                } 
                else if (opcion == 5)
                {
                    expresion = postfix.length;
                    v.opSalir();//se cierra el programa
                }
                expresion++;
            }
            else
            {
                bandc=false;
            }

        }
        scan.close();
    }



    
    /** 
     * Método para checar si un string es numérico
     * @param s
     * @return boolean
     */
    public static boolean check(String s)//
    {
        boolean numeric = true;
        try 
        {
            int n = Integer.parseInt(s);
        } 
        catch (NumberFormatException e) 
        {
            numeric = false;
        }

        if(numeric)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    
    /** 
     * método para checar si un entero se encuentra en un rango
     * @param min
     * @param max
     * @param x
     * @return boolean
     */
    public static boolean rango(int min, int max, int x)//
    {
        if (x > min && x <= max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    /** 
     * Método que une los dos métodos anteriores para checar que el ingreso del usuario esté en un rango estipulado numérico
     * @param e
     * @param i
     * @param j
     * @return boolean
     */
    public static boolean option(String e, int i, int j)
    {
        if (check(e))
        {
            int n = Integer.parseInt(e);
            if(rango(i, j, n))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false; 
        }
    }
}