package com.logica;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc01 = new Calculadora();
		
		Double total = calc01.soma(80.5, 5.4);
		
		System.out.println("O total da soma é "+ total );
		
		total = calc01.soma(58.9, 0.1);
		System.out.println(total);
		
		Calculadora calc02 = new Calculadora();
		System.out.println(calc02.soma(100.3, 90.0));

	}

}
