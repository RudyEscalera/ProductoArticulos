import static org.junit.Assert.*;

import org.junit.Test;


public class TestProducto {
	Producto nuevo=new Producto(2,5);
	@Test
	public void test() {
		assertEquals(10,nuevo.resultado());
	}
}
