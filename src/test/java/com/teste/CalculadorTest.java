package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadorTest {

	@Test
	public void testSomar() {
		Calculador calc = new Calculador();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);
	}

}
