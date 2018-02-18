package calculadora;

import org.junit.Test;

import junit.framework.TestCase;
import calculadora.ReversePolishNotation;

public class pruebasRPN extends TestCase {	
	/**
	 * @author Edgar
	 */
	ReversePolishNotation rpn = new ReversePolishNotation(" P 4 5 + + ");
	@Test
	public void test() {
		assertEquals(9.0, rpn.resultado());
	}

}
