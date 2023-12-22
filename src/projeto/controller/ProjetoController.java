package projeto.controller;

import java.util.ArrayList;

import projeto.model.Projeto;
import projeto.repository.ProjetoRepository;

public class ProjetoController implements ProjetoRepository {

	private ArrayList<Projeto> listaProdutos = new ArrayList<Projeto>();
	int numero = 0;
	private Projeto produto;
	
	@Override
	public void procurarPorNumero(int codigo) {

	}

	@Override
	public void listarTodas() {
		for (var produto: listaProdutos);
		produto.visualizar();
		}
		
	

	@Override
	public void cadastrar(Projeto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto: " + produto.getNomeproduto() + "foi cadastrado com Sucesso!");
		
		
	}

	@Override
	public void atualizar(Projeto produto) {

		
	}

	@Override
	public void deletar(int codigo) {
		
		
		}

public int gerarCodigo(){
	return ++ numero;
	
} 

}
