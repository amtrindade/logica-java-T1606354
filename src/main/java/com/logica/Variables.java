package com.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Variables {

	public static void main(String[] args) {
		
		// Variaveis do tipo String
		
		String name = "Antonio";
		String fullName = "Trindade";
		
		System.out.println("O nome completo da pessoa é: " + name + " " + fullName );
		
		// Variáveis do tipo Integer
		Integer number01 = 5;
		Integer number02 = 11;
		
		Integer soma = number01 + number02;
		
		System.out.println("A soma dos valores é: "+ soma);
		
		// Variáveis do tipo Double
		Double value01 = 48.36;
		Double value02 = 5.23;
		
		Double total = value01 * value02;
		
		System.out.println("O total é: R$ " + String.format("%.2f", total));
		
		// Variáveis do tipo Boolean
		// && = AND
		// || = OR
		
		Boolean casado = false;
		Integer idade = 40;
		
		if ((casado == true) && (idade >= 18)) {
			System.out.println("O cara é casado maior de idade");
		}
		else if ((casado == true) && (idade < 18)) {
			System.out.println("O cara é casado menor de idade");
		}
		else {
			System.out.println("O cara não é casado!");
		}
		
		// Variáveis do tipo Date
		Date dataAtual = new Date();
		System.out.println("A data de hoje é: " + dataAtual );
		
		// Conversões de variáveis
		Integer year = Integer.parseInt("2026");
		Double salary = Double.parseDouble("11500.00");
		
		System.out.println("O ano é: " + year);
		System.out.println("O salário é: R$ " + String.format("%.2f", salary));
		
		// looping com valor inicial e final
		for (int i = 1; i < 11; i++) {
			System.out.println("O valor da variável i é " + i);			
		}
		
		// looping com while
		int i = 1;
		while (i <= 10) {
			System.out.println("O valor do i no While é "+ i);
			i++;
		}
		
		// looping com lista/coleção
		List<String> produtos = new ArrayList<String>();
		
		produtos.add("iPhome Promax 17");
		produtos.add("Samsung Galaxy S22");
		produtos.add("Xiaomi");
		produtos.add("Motorola");
		
		for (String produto : produtos) {
			System.out.println("O nome do produto é " + produto);
		}
		
		System.out.println("O tamanho da lista é: " + produtos.size());
		System.out.println("O produto 2 da lista é " + produtos.get(1));
		
	}

}
