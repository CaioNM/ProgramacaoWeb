package br.com.notas.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotas {

	private List<Nota> notas = new ArrayList<Nota>();
	
	public void adicionar(Nota n) {
		notas.add(n);
		// Gravar no Banco de dados
	}
	
	public List<Nota> listarNotas(){
		//Consultar no Banco de Dados
		return notas;
	}
}
