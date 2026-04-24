package com.logica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	Calculadora calculadora;

	@BeforeEach
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testSomaDoisNumeros() {				
		Double total = calculadora.soma(45.2, 23.1);
		assertEquals(68.3, total, 0.1);		
	}
	
	@Test
	public void testSomaValoresNegativos() {
		Double total = calculadora.soma(-1.1, -5.1);
		assertEquals(-6.2, total, 0.1);	
	}
	
	@Test
	public void testSomaUmValorZerado() {
		Double total = calculadora.soma(1.1, 0.0);
		assertEquals(1.1, total, 0.1);	
	}
	
	@Test
	public void testSubtracaoValo1Maior() {
		Double resultado = calculadora.subtracao(65.0, 16.0);
		assertEquals(49.0, resultado, 0.1);
	}
	
	@Test
	public void testSubtracaoValor1Menor() {
		Double resultado = calculadora.subtracao(4.5, 6.5);
		assertEquals(2.0, resultado, 0.1);
	}
	
	@Test
	public void testSubtracaoValoresIguais() {
		Double resultado = calculadora.subtracao(11.0, 11.0);
		assertEquals(0.0, resultado, 0.1);
	}
	
	@Test
	public void testFatorialCinco() {
		Integer resultado = calculadora.fatorial(5);
		assertEquals(120, resultado);
	}
	
	@Test
	public void testFatorialUm() {
		Integer resultado = calculadora.fatorial(1);
		assertEquals(1, resultado);
	}
	
	@Test
	public void testFatorialZero() {
		Integer resultado = calculadora.fatorial(0);
		assertEquals(1, resultado);
	}
	
	@Test
	public void testFatorialNegativo() {
		Integer resultado = calculadora.fatorial(-2);
		assertEquals(null, resultado);
	}
	

}
