package Aula08;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Contador{
	private static int contagem; 
	static ArrayList<String> datas = new ArrayList<>();
	

	public static void novoAcesso() {
		contagem += 1;
	}

	public static int getQuantidadeAcessos(){
		return contagem;
	}
	
	public static Object getPrimeiraData() {
		return datas.get(0);
	}
	
public static String getData() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	datas.add(dateFormat.format(new Date()));
	return dateFormat.format(date);
}



public static void main(String[] args) {
	Contador.novoAcesso();
}
}