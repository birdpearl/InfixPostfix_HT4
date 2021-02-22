/**
 * 
 */
package algoritmos;

import java.util.ArrayList;

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
   


    /*
     * @param x
     * @return int
     
    @Override
    public int operar(pila x) {
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> n = new ArrayList<>(Arrays.asList(nums));
        pila y = new pila();
        int s = x.size();
        while (!x.empty())
        {
            if(n.contains(x.peek().toString()))
            {
                int num = Integer.parseInt(x.pop().toString());
                y.push(num);
            }
            else
            {
                int a = Integer.parseInt(y.pop().toString());
                int b = Integer.parseInt(y.pop().toString());
                if ((x.peek().toString()).equals("+"))
                {
                    int c = suma(b, a);
                    y.push(c);
                    x.pop();
                }
                else if ((x.peek().toString()).equals("-"))
                {
                    int c = resta(b, a);
                    y.push(c);
                    x.pop();
                }
                else if ((x.peek().toString()).equals("*"))
                {
                    int c = multiplicacion(b, a);
                    y.push(c);
                    x.pop();
                }
                else if ((x.peek().toString()).equals("/"))
                {
                    int c = division(b, a);
                    y.push(c);
                    x.pop();
                }
            }
        }
        return Integer.parseInt(y.peek().toString());
    }*/


	@Override
	public int operarDoubleList(ListDoubleLinkedList<String> t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int operarLinkedList(ListLinkedList<String> t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int operarArrayList(ArrayList<String> t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int operarVector(String[] t) {
		// TODO Auto-generated method stub
		return 0;
	}
}
