/**
 * 
 */

import java.util.Vector;

/**
 * @author moises / Diego Perdomo
 * La clase venía con muchos errores de redacción y el funcionamiento era nulo
 * Se tuvo que rediseñar el funcionamiento interno de las funciones siguientes:  
 *  push, pop, peek, count y isEmpty
 * Actualizado el 23/02/2021
 */
public class StackVector<E> extends Stack<E> {

	protected Vector<E> core;
	protected int tail;
	
	public StackVector(int size) 
	{
		core = new Vector<>(size);
		tail = 0;
	}
	
	@Override
	public boolean push(E element) {
		if (this.count() <= core.capacity())//se debe usar capacity, no length, pues el vector sigue vacío
		{
			core.insertElementAt(element, tail);
			tail++;//el tail se debe aumentar después del proceso de adición
			return true;
		} else {
			return false;
		}
	}

	@Override
	public E peek() {
		return core.get(tail-1);
	}

	@Override
	public E pop() {
		if (this.isEmpty()) {
			return null;
		} else {
			E temp = core.get(tail-1);
			tail--;
			return temp;
		}
	}

	@Override
	public int count() {
		return (tail);
	}

	@Override
	public boolean isEmpty() {
		return (tail == 0);
	}

}
