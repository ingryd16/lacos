package br.senai.sp.jandira;

import java.util.Scanner;

public class Laços {

	public static void main(String[] args) {
		
		//calculo fibonacci
		int valor = 5;
		int fibonacci = valor * (valor - 1);

	 
		
		while (valor > 2) {
			valor--;
			fibonacci = fibonacci * (valor - 1);
			//System.out.println(fibonacci);
		}
			System.out.println(fibonacci);
			Scanner leitor = new Scanner(System.in);
			String resposta = "s";
			
			while (resposta.equalsIgnoreCase("s")) {
				System.out.println("legal. mais uma volta");
				System.out.println("mais uma volta? (s/n)?");
				resposta = leitor.next();
			}
				System.out.println("a brincadeira acabou");
}
}
