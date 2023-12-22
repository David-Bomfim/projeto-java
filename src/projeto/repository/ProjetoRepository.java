package projeto.repository;

import projeto.model.Projeto;

public interface ProjetoRepository {

	
	//C.R.U.D
	public void procurarPorNumero(int codigo);
	public void listarTodas();
	public void cadastrar(Projeto produto);
	public void atualizar(Projeto produto);
	public void deletar(int codigo);
	
	
	
}
