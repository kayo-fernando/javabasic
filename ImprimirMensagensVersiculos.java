package curso_java_kayo.basico;
/*
 * Classe que imprime versículos bíblicos 
 * 
 * versão1.0
 * 
 * autor: Kayo Fernando
 * 
 * */
public class ImprimirMensagensVersiculos {

	public static void main(String[] args) {
		
		String ver1 ="PRIMEIRO VESÍCULO\n"+"Porque Deus tanto amou o mundo\n"
				+ "que deu o seu Filho Unigênito, para\nque todo o que nele"
				+ " crer não pereça,\nmas tenha a vida eterna."
				+ "- João 3:16\n"; 
		
		String ver2 = "SEGUNDO VESÍCULO\n"+"Busquem, pois, em primeiro lugar o Reino"
				+ " de Deus\ne a sua justiça, e todas essas coisas lhes serão\nacrescentadas.\n"
				+ "- Mateus 6:33\n";
		
		String ver3 = "TERCEIRO VESÍCULO\n"+"Respondeu Jesus: \"Eu sou o caminho, a verdade e a vida.\n"
				+ "Ninguém vem ao Pai, a não ser por mim.\r\n"
				+ "- João 14:6\n";
		
		String ver4 = "QUARTO VESÍCULO\n"+"\"Eu disse essas coisas para que em mim vocês tenham paz.\n"
				+ " Neste mundo vocês terão aflições; contudo, tenham ânimo! Eu venci o mundo\".\r\n"
				+ "- João 16:33\n\n\n";
		
		System.out.printf("%s\n%s\n%s\n%s",ver1,ver2,ver3,ver4 + "\n\nDeus abençoe a todos!");
	}

}
