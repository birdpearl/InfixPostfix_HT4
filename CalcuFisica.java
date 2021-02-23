/**
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author anard
 *
 */
public class CalcuFisica implements Calcu {
    public CalcuFisica()
    {

    }


    /** 
     * @param x
     * @param y
     * @return int
     */
    @Override
    public int suma(int x, int y) {
        int z = x + y;
        return z;
    }


    /** 
     * @param x
     * @param y
     * @return int
     */
    @Override
    public int resta(int x, int y) {
        int z = x - y;
        return z;
    }


    /** 
     * @param x
     * @param y
     * @return int
     */
    @Override
    public int multiplicacion(int x, int y) {
        int z = x * y;
        return z;
    }


    /** 
     * @param x
     * @param y
     * @return int
     */
    @Override
    public int division(int x, int y) {
        int z = x / y;
        return z;
    }
   


	
    /** 
     * operar con listas doblemente encadenadas
     * @param x
     * @return int
     */
    @Override
	public int operarDoubleList(ListDoubleLinkedList<String> x) {
		String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> n = new ArrayList<>(Arrays.asList(nums));
        ListDoubleLinkedList<String> y = new ListDoubleLinkedList<String>();
        //int s = x.count();
        while(!x.isEmpty())
        {
            if(n.contains(x.getStart()))
            {
                int num = Integer.valueOf(x.removeAtStart());
                y.insert(String.valueOf(num));
            }
            else
            {
                int a = Integer.valueOf(y.removeAtEnd());
                int b = Integer.valueOf(y.removeAtEnd());
                if (x.getStart().equals("+"))
                {
                    int c = suma(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
                else if ((x.getStart()).equals("-"))
                {
                    int c = resta(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
                else if ((x.getStart()).equals("*"))
                {
                    int c = multiplicacion(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
                else if ((x.getStart()).equals("/"))
                {
                    int c = division(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
            }
        }
        return Integer.valueOf(y.getStart());
	}


	
    /** 
     * operar con listas encadenadas
     * @param x
     * @return int
     */
    @Override
	public int operarLinkedList(ListLinkedList<String> x) {
		String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> n = new ArrayList<>(Arrays.asList(nums));
        ListDoubleLinkedList<String> y = new ListDoubleLinkedList<String>();
        //int s = x.count();
        while(!x.isEmpty())
        {
            if(n.contains(x.getStart()))
            {
                int num = Integer.valueOf(x.removeAtStart());
                y.insert(String.valueOf(num));
            }
            else
            {
                int a = Integer.valueOf(y.removeAtEnd());
                int b = Integer.valueOf(y.removeAtEnd());
                if (x.getStart().equals("+"))
                {
                    int c = suma(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
                else if ((x.getStart()).equals("-"))
                {
                    int c = resta(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
                else if ((x.getStart()).equals("*"))
                {
                    int c = multiplicacion(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
                else if ((x.getStart()).equals("/"))
                {
                    int c = division(b, a);
                    y.insert(String.valueOf(c));
                    x.removeAtStart();
                }
            }
        }
        return Integer.valueOf(y.getStart());
	}


    
    /** 
     * operar con un stack que usa listas
     * @param t
     * @return int
     */
    @Override
    public int operarArrayList(StackList<String> t) 
    {
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> n = new ArrayList<>(Arrays.asList(nums));
        StackList<String> y = new StackList<>();
        while(!t.isEmpty())
        {
            if(n.contains(t.peek()))
            {
                y.push(t.pop());
            }
            else
            {
                int a = Integer.parseInt(y.pop());
                int b = Integer.parseInt(y.pop());
                if ((t.peek()).equals("+"))
                {
                    int c = suma(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
                else if ((t.peek().toString()).equals("-"))
                {
                    int c = resta(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
                else if ((t.peek().toString()).equals("*"))
                {
                    int c = multiplicacion(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
                else if ((t.peek().toString()).equals("/"))
                {
                    int c = division(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
            }
        }
        return Integer.parseInt(y.peek().toString());
    }

    
    /** 
     * operar con un stack que usa vectores
     * @param t
     * @return int
     */
    @Override
    public int operarVector(StackVector<String> t) {
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> n = new ArrayList<>(Arrays.asList(nums));
        StackVector<String> y = new StackVector<>(t.count());
        while(!t.isEmpty())
        {
            if(n.contains(t.peek()))
            {
                y.push(t.pop());
            }
            else
            {
                int a = Integer.parseInt(y.pop());
                int b = Integer.parseInt(y.pop());
                if ((t.peek()).equals("+"))
                {
                    int c = suma(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
                else if ((t.peek().toString()).equals("-"))
                {
                    int c = resta(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
                else if ((t.peek().toString()).equals("*"))
                {
                    int c = multiplicacion(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
                else if ((t.peek().toString()).equals("/"))
                {
                    int c = division(b, a);
                    y.push(String.valueOf(c));
                    t.pop();
                }
            }
        }
        return Integer.parseInt(y.peek().toString());
    }

}
