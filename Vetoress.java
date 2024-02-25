package curso_java_kayo.basico;

import java.util.ArrayList;

/*
 * Classe que explica a maipulação de Vetores(Arrays)
 * 
 * versão1.0
 * 
 * autor: Kayo Fernando
 * 
 * */
public class Vetoress {


	public static void main(String[] args) {
		int num[] = new int[5]; 
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		System.out.println(num[4]);
		
		char cos[] = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(cos[4]);
		
		ArrayList<Integer> pares = new ArrayList<>();
		
		pares.add(2);
		pares.add(4);
		pares.add(6);
		pares.add(8);
		pares.add(10);
		pares.add(12);
		System.out.println(pares.get(5));
	}

}
