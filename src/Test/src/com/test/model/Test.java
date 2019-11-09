package com.test.model;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testBrute() {
		Empleado myempleado = new Empleado();
		double RealValue = myempleado.brute("sales", 100);
		double ExpectedValue = 105;
		assertEquals(ExpectedValue,RealValue);
	}
	
	@org.junit.jupiter.api.Test
	void testBrute2() {
		Empleado myempleado = new Empleado();
	}

}
