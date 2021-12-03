package br.com.notas.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotas {
	
	//Criando estrutura para armazenamento os dados
	private List<Nota> notas = new ArrayList<Nota>();
	
	// Gravando no Banco de dados
	public void adicionar(Nota n) {
		notas.add(n);
	}
	
	//Consultando no Banco de Dados
	public List<Nota> listarNotas(){
		return notas;
	}
}
