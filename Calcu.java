/**
 * 
 */


/**
 * @author anard
 *
 */
public interface Calcu {
	public int suma(int x, int y);
    public int resta(int x, int y);
    public int multiplicacion(int x, int y);
    public int division(int x, int y);

    public int operarDoubleList(ListDoubleLinkedList<String> t);//Recibe lista doblemente encadenada, y lo opera para devolver un entero que es igual al valor total de la operaci�n
    public int operarLinkedList(ListLinkedList<String> t);//Recibe lista  encadenada, y lo opera para devolver un entero que es igual al valor total de la operaci�n
    public int operarArrayList(StackList<String> t);//Recibe un arraylist, y lo opera para devolver un entero que es igual al valor total de la operaci�n
    public int operarVector(StackVector<String> t);//Recibe un vector, y lo opera para devolver un entero que es igual al valor total de la operaci�n   	
    
    //public String decode(String a);//funci�n que se encarga de leer el archivo y decodificar cada l�nea para realizar las operaciones de cada una
}