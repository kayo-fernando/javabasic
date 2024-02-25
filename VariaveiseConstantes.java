package curso_java_kayo.basico;

import java.util.Scanner;

public class VariaveiseConstantes {

	public static void main(String[] args) {
		      
		        final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
				
				String nome;
				
				int idade; 
				
				double peso;
		        
		        double altura;
				
				int cod;
				
				boolean doadorQrgaos; 
				
		        Scanner leitor = new Scanner(System.in);
				
				System.out.println("Digite seu nome: ");
				
				nome = leitor.nextLine();
				
				System.out.println("Digite sua idade: ");
				
				idade = leitor.nextInt();

		        System.out.println("Digite seu peso: ");
				
				peso = leitor.nextDouble();
				
				System.out.println("Digite sua altura: ");
				
				altura = leitor.nextDouble();
				
		        System.out.println("Digite seu sexo: ");
				
				cod = leitor.nextInt();

		        System.out.println("Digite se você é doador de orgãos: ");
				
				doadorQrgaos = leitor.nextBoolean();

				//IMPRIMIR VALORES

				System.out.println("NOME:"+nome);
				System.out.println("IDADE:"+idade);
				System.out.println("PESO:"+peso);
				System.out.println("ALTURA:"+altura);
				System.out.println("COD:"+cod);
				System.out.println("DOADOR DE ORGÃOS:"+doadorQrgaos);
				System.out.println("GRAVIDADE NA TERRA É:"+ACELERACAO_GRAVIDADE_TERRA);
				
		    }


	}


