package orientacaoObjeto;

public abstract class Funcionario {
	private long cadastro;
	private String nome;
	private String ocupacao;
	private double salario;

	public Funcionario(long cadastro, String nome, String ocupacao, double salario){
		this.cadastro = cadastro;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.salario = salario;
	} /*parametros de instanciamento pelo método construtor*/
	
	
	
	//parametro de visualização do atributo cadastro 
	public long getCadastro() {
		return this.cadastro;
	}
	//parametro de modificação do atributo cadastro 
	public void setCadastro(Long cadastro) {
		this.cadastro = cadastro;
	}
	
	
	
	//parametro de visualização do atributo ocupação
	public String getOcupacao() {
		return ocupacao;
	}
	
	//parametro de modificação do atributo ocupação 
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	
	
	//parametro de visualização do atributo nome
	public String getNome() {
		return nome;
	}
	//parametro de modificação do atributo nome 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	//parametro de visualização do atributo salario
	public double getSalario() {
		return salario;
	}
	//parametro de modificação do atributo salario
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}


/*O código acíma é uma classe "Funcionário". 
 *Possui alguns atributos e métodos de set e 
 *get para que seus instanciamentos possam ser
 *apresentados na classe "TesteFuncionário", 
 *por possuir atributos privados, somente através
 *de métodos que possibilitam retornar o resultado, 
 *é que o conteúdo pode ser visualizado.*/

/*PS : Após ser transformada em uma classe abatrata, 
 *a classe Funcionario não pode ser mais instanciada  */
