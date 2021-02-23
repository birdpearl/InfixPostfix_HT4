/***
 * Diego Perdomo 
 * Clase con el objetivo de regresar las expresiones infix de un documento de texto en su formato postfix
 * 
 * actualizada el 22/02/2021
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class Evaluador 
{
    public Evaluador()
    {

    }   
    
    
    /** 
     * Método que abre el archivo y regresa en un arreglo de strings el valor de cada línea en el archivo
     * @return String[]
     */
    public String[] OpenFile(String s)
    {
        try 
        {
            //String location = System.getProperty("user.dir");
            File archivo = new File(s);
            BufferedReader infix = new BufferedReader(new FileReader(archivo));
            String[] lineas = infix.lines().toArray(String[]::new);
            infix.close();
            return lineas;
            
        } 
        catch (Exception e) 
        {
            return null;
        }
    }

    
    /** 
     * Método que recibe un arreglo de expresiones infix que devuelve luego un arreglo de expresiones 
     * postfix que son el equivalente de las originales.
     * @param s
     * @return String
     */
    public String[] Convertir(String[] s)
    {
        Character[] signs = {'+','-','*','/'};
        ArrayList<Character> sg = new ArrayList<>(Arrays.asList(signs));        
        ArrayList<String> Postfix = new ArrayList<>();
        String operacion = ""; 
        
        for(String qwerty: s)
        {
            operacion = "";
            if(validateParenthesis(qwerty))
            {
                Stack<Character> pila = new Stack<>();
                for(int i = 0; i < qwerty.length(); i++)
                {
                    char temp = qwerty.charAt(i);
                    if(Character.isDigit(temp))
                    {
                        operacion += String.valueOf(temp);
                    }
                    else if(temp == '(')
                    {
                        pila.push(temp);
                    }
                    else if(temp == ')')
                    {
                        while(!pila.empty() && pila.peek() != '(')
                        {
                            operacion += pila.pop();
                        }
                        pila.pop();
                    }
                    else if(sg.contains(temp))
                    {
                        while(!pila.empty() && jerarquia(temp) <= jerarquia(pila.peek()))
                        {
                            operacion += pila.pop();
                        }
                        pila.push(temp);
                    }
                    
                }
                while(!pila.empty())
                {
                    operacion += pila.pop();
                }

                Postfix.add(operacion);
            } 
        }
        String[] expresiones = new String[Postfix.size()];
        for(int i = 0; i < Postfix.size(); i++)
        {
            expresiones[i] = Postfix.get(i);
        }
        return expresiones;
    }


    
    /** 
     * Función que devuelve el valor de un signo de operación que representa un valor asignado según
     * la jerarquía de importancia de la operación
     * @param c
     * @return int
     */
    private static int jerarquia(char c)
    {
        switch(c)
        {
            case '+': 
            case '-': 
                return 1; 
            case '*': 
            case '/': 
                return 2; 
            case '^': 
                return 3; 
        } 
        return -1; 
    }



    
    /** 
     * Función de tipo boolean que devuelve el valor verdadero o falso según la cantidad de paréntesis 
     * de apertura y cierre coincidan.
     * @param s
     * @return boolean
     */
    private static boolean validateParenthesis(String s)
    {
        int acu = 0;
        for(int i = 0; i < s.length(); i++ )
        {
            if(s.charAt(i) == '(')
            {
                acu++;
            }
            else if(s.charAt(i) == ')')
            {
                acu--;
            }
        }

        if(acu == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}