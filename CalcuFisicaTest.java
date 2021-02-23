package algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcuFisicaTest {

	@Test
	void DoubleLinkedTest() {
		ListDoubleLinkedList<String> t =new ListDoubleLinkedList<String>();
		CalcuFisica c=new CalcuFisica();
		t.insert("3");
		t.insert("4");
		t.insert("+");
		t.insert("5");
		t.insert("*");
		//String r=t.removeAtEnd();
		int w=c.operarDoubleList(t);
		assertEquals(35, w);
	}
	
	@Test
	void LinkedTest() {
		ListLinkedList<String> t =new ListLinkedList<String>();
		CalcuFisica c=new CalcuFisica();
		t.insert("3");
		t.insert("4");
		t.insert("+");
		t.insert("5");
		t.insert("*");
		//String r=t.removeAtEnd();
		int w=c.operarLinkedList(t);
		assertEquals(35, w);
	}
	
	

}
