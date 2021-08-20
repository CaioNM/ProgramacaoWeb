package Atividade02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML>"
				+ "<BODY>"
				+ "<H1>Novo Contato:</H1>"
				+ "<FORM>Primeiro Nome: <INPUT TYPE='TEXT' NAME='PrimeiroNome'>"
				+ "<BR><BR>"
				+ "Último Nome: <INPUT TYPE='TEXT' NAME='ÚltimoNome'>"
				+ "<BR><BR>"
				+ "Telefone: <INPUT TYPE='TEXT' NAME='Telefone'>"
				+ "<BR><BR>"
				+ "Data de Nascimento: <INPUT TYPE='TEXT' NAME='Nascimento'>"
				+ "<BR><BR>"
				+ "<A HREF='http://localhost:8080/Aulas/ServletAgenda'>Enviar</A>"
				+ "</FORM>"
				+ "</BODY>"
				+ "</HTML>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
