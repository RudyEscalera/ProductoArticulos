import static org.junit.Assert.*;

import org.junit.Test;


public class TestArticulo {

	Articulo nuevo= new Articulo(2,3);	@Test
	public void test() {
		assertEquals(5,nuevo.resultado());
	}

}
