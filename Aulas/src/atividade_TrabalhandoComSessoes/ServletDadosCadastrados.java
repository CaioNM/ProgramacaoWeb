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
 * Servlet implementation class ServletDadosCadastrados
 */
@WebServlet("/ServletDadosCadastrados")
public class ServletDadosCadastrados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDadosCadastrados() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	public static final String EMPRESA = "empresa";
	public static final String RUAEMPRESA = "ruaEmpresa";
	public static final String COMPLEMENTOEMPRESA = "complementoEmpresa";
	public static final String CIDADEEMPRESA = "cidadeEmpresa";
	public static final String CEPEMPRESA = "cepEmpresa";
	public static final String ESTADOEMPRESA = "estadoEmpresa";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter resposta = response.getWriter();
    	
    	String empresa = request.getParameter("empresa");
    	String ruaEmpresa = request.getParameter("ruaEmpresa");
    	String complementoEmpresa = request.getParameter("complementoEmpresa");
    	String cidadeEmpresa = request.getParameter("cidadeEmpresa");
    	String cepEmpresa = request.getParameter("cepEmpresa");
    	String estadoEmpresa = request.getParameter("estadoEmpresa");
    	
    	HttpSession sessao = request.getSession();
    	
    	String nome = (String) sessao.getAttribute("NOME");
    	String sobrenome = (String) sessao.getAttribute("SOBRENOME");
    	String rua = (String) sessao.getAttribute("RUA");
    	String complemento = (String) sessao.getAttribute("COMPLEMENTO");
    	String cidade = (String) sessao.getAttribute("CIDADE");
    	String cep = (String) sessao.getAttribute("CEP");
    	String estado = (String) sessao.getAttribute("ESTADO");
    	
    	
    	resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Confirmação de registro</title>");
        resposta.write("</head>");
        resposta.write("<body>");  
    	
        resposta.write("<h3>Registro realizado com sucesso! :D</h3><br/><br/>");
        resposta.write("<b>Seus dados pessoais:</b><br/>");
        resposta.write("<b>- Nome: </b>" + nome + " " + sobrenome);
        resposta.write("<br/>");
        resposta.write("<b>- Rua: </b>" + rua);
        resposta.write("<br/>");
        resposta.write("<b>- Complemento: </b>" + complemento);
        resposta.write("<br/>");
        resposta.write("<b>- Cidade/CEP/Estado: </b>" +  cidade);
        resposta.write(", ");
        resposta.write(cep);
        resposta.write(", ");
        resposta.write(estado);
        resposta.write("<br/><br/>");
        resposta.write("<b>Seus dados profissionais:</b><br/>");
        resposta.write("<b>- Empresa: </b>" + empresa);
        resposta.write("<br/>");
        resposta.write("<b>- Rua: </b>" + ruaEmpresa);
        resposta.write("<br/>");
        resposta.write("<b>- Complemento: </b>" + complementoEmpresa);
        resposta.write("<br/>");
        resposta.write("<b>- Cidade/CEP/Estado: </b>" +  cidadeEmpresa);
        resposta.write(", ");
        resposta.write(cepEmpresa);
        resposta.write(", ");
        resposta.write(estadoEmpresa);
        resposta.write("</body></html>");

    }
}