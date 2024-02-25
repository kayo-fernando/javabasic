package curso_java_kayo.basico;

public class Funcoes {

	public static void main(String[] args) {

		int result = soma(10, 60);

		System.out.println(result);
		
		quadrado(7);
		
		String texto = mensagem();
		
		System.out.println(mensagem());
		
		olaMundo();
		
		int nota = 8;
		
		String resultado = nota>=8?"Você foi aprovado":"Você foi reprovado";
		
	}
	static int soma(int a, int b){
		return a + b;
		}
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	static String mensagem() {
	return "mensagem do sistema";	
	}
	static void olaMundo() { 
		System.out.println("ola mundo");
	}
}
