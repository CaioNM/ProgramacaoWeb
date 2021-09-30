package Aula08;

public class Contador {
	private static int contagem;
	public static void novoAcesso() {
		contagem += 1;
	}
	
	public static int getQuantidadeAcessos() {
		return contagem;
	}
	
}
