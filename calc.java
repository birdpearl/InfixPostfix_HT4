import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class calc implements calculadora
{
    public calc()
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
     * @param a
     * @return String
     */
    @Override
    public String decode(String a){
        try
        {
            File archivo = new File(a);
            BufferedReader texto =  new BufferedReader(new FileReader(archivo));
            String qwerty = "";
            String line = "";
            String answer = "";
            while((line = texto.readLine()) != null)
            {
                pila st = new pila();
                qwerty = line;
                for (int i = 0; i < qwerty.length() ; i++)
                {
                    if(!Character.isWhitespace(qwerty.charAt(qwerty.length() - (1+i))))
                    {
                        st.push(qwerty.charAt(qwerty.length() - (1+i)));
                    }
                }
                answer += (" La respuesta de la operación " + qwerty + " es: " +  String.valueOf(operar(st)) + "\n");
            }
            texto.close();
            return answer;
        }catch(Exception FileNotFoundException)
        {
            return "Unsuccesful path acces";
        }
            
    }

    
    /** 
     * @param x
     * @return int
     */
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
    }
}
