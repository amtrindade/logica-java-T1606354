package com.logica;

public class Calculadora {
	
	
	public Double soma(Double valor1, Double valor2) {
		return valor1 + valor2;
	}
	
	public Double subtracao(Double valor1, Double valor2) {
		Double total = 0.0;
		
		if (valor1 > valor2) {
			total = valor1 - valor2;
		}
		else if (valor2 > valor1) {
			total = valor2 - valor1;
		}
		else 
			total = 0.0;
		
		return total;
	}
	
	public Integer fatorial(Integer number) {
		
		if (number < 0 ) {
			return null;
		}
		
		Integer fat = 1;
		
		for(int i = 1; i <= number; i++) {
			fat = fat * i;
		}
		
		return fat; 
	}
}
