package atividadeAvaliativa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_Agenda
 */
@WebServlet("/Servlet_Agenda")
public class Servlet_Agenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_Agenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML>"
				+ "<BODY>"
				+ "<H1>Agenda:</H1>"
				+ "<BR>"
				+ "<H3>Nome: " + request.getParameter("nome")
				+ "<BR>"
				+ "Telefone: " + request.getParameter("telefone")
				+ "<BR>"
				+ "Data de Nascimento: "+ request.getParameter("data")
				+ "</H3>"
				+ "</BODY></HTML>");
		saida.close();
	}

}
