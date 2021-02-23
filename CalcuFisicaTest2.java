import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalcuFisicaTest2 {

	@Test
	void Vectortest() {
		CalcuFisica c =new CalcuFisica();
		StackVector<String> a= new StackVector<String>(5);
		a.push("*");
		a.push("5");
		a.push("+");
		a.push("3");
		a.push("4");
		assertEquals(35,c.operarVector(a));
	}
	
	@Test
	void Arraytest() {
		CalcuFisica c =new CalcuFisica();
		StackList<String> a= new StackList<String>();
		a.push("*");
		a.push("5");
		a.push("+");
		a.push("3");
		a.push("4");
		assertEquals(35,c.operarArrayList(a));
	}

}
