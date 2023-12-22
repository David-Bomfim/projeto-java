package projeto.controller;

import java.util.ArrayList;

import projeto.model.Projeto;
import projeto.repository.ProjetoRepository;

public class ProjetoController implements ProjetoRepository {

	private ArrayList<Projeto> listaProdutos = new ArrayList<Projeto>();
	int numero = 0;
	private Projeto projeto;
	
	
	
	
	@Override
	public void procurarPorNumero(int codigo) {

	}

	@Override
	public void listarTodas() {
		for (var produto: listaProdutos) {
			projeto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Projeto produto) {
		
		
	}

	@Override
	public void atualizar(Projeto produto) {

		
	}

	@Override
	public void deletar(int codigo) {
	
		
	}

}
