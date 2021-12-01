package br.com.encontros.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaEncontros {

	private List<Encontro> encontros = new ArrayList<Encontro>();
	
	public void adicionar(Encontro e) {
		encontros.add(e);
		// Gravar no Banco de dados
	}
	
	public List<Encontro> listarEncontros(){
		//Consultar no Banco de Dados
		return encontros;
	}
}
