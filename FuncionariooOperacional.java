package orientacaoObjeto;

public class FuncionariooOperacional extends Funcionario{
	private String setor;
	public FuncionariooOperacional(long cadastro, String nome, String ocupacao, double salario, String setor) {
		super(cadastro, nome, ocupacao, salario); this.setor = setor;
	}
	public String getSetor() {
		return this.setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
}
