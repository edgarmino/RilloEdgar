package calculadora;

import org.junit.Test;

import junit.framework.TestCase;
import calculadora.RPN;

public class pruebasRPN extends TestCase {	
	/**
	 * @author Edgar
	 */
	RPN rpn = new RPN(" P 4 5 + + ");
	@Test
	public void test() {
		assertEquals(9.0, rpn.resultado());
	}

}
