package orientacaoObjeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		FuncionariooOperacional f1 = new FuncionariooOperacional(1112, "João", "Auxiliar administrativo", 2000.0, "vendas"/* método construtor*/);
		
		/*f1.cadastro = (long) 1112;
		f1.nome = "João";
		f1.ocupacao = "Auxiliar administrativo";
		f1.salario = 2000.0; sem o private*/
		
		/*f1.setCadastro((long) 1112);
		f1.setNome("João");
		f1.setOcupacao("Auxiliar administrativo");
		f1.setSalario(2000.0);método com private*/
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCadastro());
		System.out.println(f1.getSetor());
		System.out.println(f1.getSalario());
		System.out.println(f1.getOcupacao());
		}

}
