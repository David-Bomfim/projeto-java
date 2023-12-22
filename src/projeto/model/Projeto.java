package projeto.model;

public class Projeto {

	private int codigo;
	private int tipo;
	private float preco;
	private String nomeproduto;
	private String vendedor;

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Projeto(int codigo, int tipo, String nomeproduto, float preco, String vendedor) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.nomeproduto = nomeproduto;
		this.preco = preco;
		this.vendedor = vendedor;

	}

	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreço() {
		return preco;
	}

	public void setPreço(float preço) {
		this.preco = preço;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public void visualizar() {

		String tipo = "";
		switch (this.tipo) {
		case 1:
			tipo = "Hardware";
			break;

		case 2:
			tipo = "Software";
			break;

		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("Produto: " + this.nomeproduto);
		System.out.println("Código do Produto: " + this.codigo);
		System.out.println("Tipo do produto: " + tipo);
		System.out.println("Vendedor: " + this.vendedor);
		System.out.println("Preço: " + this.preco);

	}
}
