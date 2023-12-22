package projeto.model;

public class Software extends Projeto {

	private String pais;

	public Software(int codigo, int tipo, String nomeproduto, float preco, String vendedor, String pais) {
		super(codigo, tipo, nomeproduto, preco, vendedor);
		this.pais = pais;

	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("O País de Ativação da Chave deste software é: " + this.pais);

	}

}
