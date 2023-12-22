package projeto.model;

public class Hardware extends Projeto {

	private String estado;

	public Hardware(int codigo, int tipo, String nomeproduto, float preco, String vendedor, String estado) {
		super(codigo, tipo, nomeproduto, preco, vendedor);
		this.estado = estado;

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Estado do produto: " + this.estado);

	}

}
