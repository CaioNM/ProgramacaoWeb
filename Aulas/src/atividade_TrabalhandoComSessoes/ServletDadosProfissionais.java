package atividade_TrabalhandoComSessoes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletDadosProfissionais
 */
@WebServlet("/ServletDadosProfissionais")
public class ServletDadosProfissionais extends HttpServlet {
	private static final long serialVersionUID = 1L;

      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDadosProfissionais() {
        super();

    }
    
    public static final String NOME = "nome";
    public static final String SOBRENOME = "sobrenome";
    public static final String RUA = "rua";
    public static final String COMPLEMENTO = "complemento";
    public static final String CIDADE = "cidade";
    public static final String CEP = "cep";
    public static final String ESTADO = "estado";

    		
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter resposta = response.getWriter();
    	
    	String nome = request.getParameter("nome");
    	String sobrenome = request.getParameter("sobrenome");
    	String rua = request.getParameter("rua");
    	String complemento = request.getParameter("complemento");
    	String cidade = request.getParameter("cidade");
    	String cep = request.getParameter("cep");
    	String estado = request.getParameter("estado");
    	
    	HttpSession sessao = request.getSession();
    	
    	sessao.setAttribute("NOME", nome);
    	sessao.setAttribute("SOBRENOME", sobrenome);
    	sessao.setAttribute("RUA", rua);
    	sessao.setAttribute("COMPLEMENTO", complemento);
    	sessao.setAttribute("CIDADE", cidade);
    	sessao.setAttribute("CEP", cep);
    	sessao.setAttribute("ESTADO", estado);
    	
    	
    	resposta.write("<html>");	
    	resposta.write("<head>");
    	resposta.write("<title>Dados Profissionais</title>");
    	resposta.write("</head>");
    	resposta.write("<body>");
    	resposta.write("Ótimo, agora por favor, prencha seus dados profissionais:");
    	resposta.write("<form action=\"ServletDadosCadastrados\">");     	
    	resposta.write("<input type=\"text\" name=\"empresa\" placeholder=\"Empresa\"> <BR><BR>");
    	resposta.write("Endereço profissional:<BR>");
    	resposta.write("<input type=\"text\" name=\"ruaEmpresa\" placeholder=\"Rua\">");
    	resposta.write("<input type=\"text\" name=\"complementoEmpresa\" placeholder=\"Complemento\"><BR>");
    	resposta.write("<input type=\"text\" name=\"cidadeEmpresa\" placeholder=\"Cidade\">");
    	resposta.write("<input type=\"text\" name=\"cepEmpresa\" placeholder=\"CEP\"><BR>");
    	resposta.write("<input type=\"text\" name=\"estadoEmpresa\" placeholder=\"Estado\"><BR><BR>");    	
    	resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
    	resposta.write("</form>");
    	resposta.write("</body>");
    	resposta.write("</html>");
    }
}

