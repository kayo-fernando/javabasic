package curso_java_kayo.basico;

import java.util.Scanner;

public class EntradaESaida {

	public static void main(String[] args) {
		// Criaçao de variáveis
		
		String nome;
		int idade;
		double altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		
		idade = leitor.nextInt();
		
		System.out.println("Digite sua altura: ");
		
		altura = leitor.nextDouble();
		
		System.out.println("Seu nome: "+nome);
		System.out.println("Sua idade: "+idade);
		System.out.println("Sua altura: "+altura);
		
	}

}