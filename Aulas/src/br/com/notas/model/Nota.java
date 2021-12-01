package br.com.notas.model;

public class Nota {
	private String nomeAluno;
	private String disciplina;
	private float resultado;
	private String situacao;
	
	public String getNomeAluno() {
		return nomeAluno;
	} 
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = (resultado);
	}
	public String getSituacao() {
		return situacao;
}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}