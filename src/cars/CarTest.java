package cars;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	
	private Car coche1, coche2;

	@Before
	public void inicializacion() {
		coche1 = new Car("Citroen", "C2", 3, 67, "gris");
		coche2 = new Car("Renault", "Scenic", 5, 130, "gris perla");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMarca() {
		assertEquals("La marca es igual", "Citroen", coche1.getMarca());
	}

	@Test
	public void testSetMarca() {
		coche1.setMarca("Peugeot");
		assertEquals("La marca es igual", "Peugeot", coche1.getMarca());
	}

	@Test
	public void testGetModelo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetModelo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumPuertas() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNumPuertas() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCv() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCv() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetColor() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetColor() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
