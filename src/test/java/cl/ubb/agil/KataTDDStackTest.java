package cl.ubb.agil;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataTDDStackTest {

	@Test
	public void isEmpty() {
		KataTDDStack Stack = new KataTDDStack();
		assertTrue(Stack.isEmpty());
	}

}
