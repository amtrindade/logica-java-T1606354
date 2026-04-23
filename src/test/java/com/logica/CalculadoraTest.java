package com.logica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testSomaDoisNumeros() {
		
		Calculadora calculadora = new Calculadora();
		
		Double total = calculadora.soma(45.2, 23.1);
		
		assertEquals(68.3, total, 0.1);		
	}
	
	@Test
	public void testSomaValoresNegativos() {
		Calculadora calculadora = new Calculadora();
		Double total = calculadora.soma(-1.1, -5.1);
		assertEquals(-6.2, total, 0.1);	
	}
	
	@Test
	public void testSomaUmValorZerado() {
		Calculadora calculadora = new Calculadora();
		Double total = calculadora.soma(1.1, 0.0);
		assertEquals(1.1, total, 0.1);	
	}
	
	@Test
	public void testSubtracaoValo1Maior() {
		Calculadora calculadora = new Calculadora();
		Double resultado = calculadora.subtracao(65.0, 16.0);
		assertEquals(49.0, resultado, 0.1);
	}
	
	@Test
	public void testSubtracaoValor1Menor() {
		Calculadora calculadora = new Calculadora();
		Double resultado = calculadora.subtracao(4.5, 6.5);
		assertEquals(2.0, resultado, 0.1);
	}
	
	@Test
	public void testSubtracaoValoresIguais() {
		Calculadora calculadora = new Calculadora();
		Double resultado = calculadora.subtracao(11.0, 11.0);
		assertEquals(0.0, resultado, 0.1);
	}

}
