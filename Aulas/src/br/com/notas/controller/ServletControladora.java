package br.com.notas.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.notas.model.Nota;
import br.com.notas.model.SistemaNotas;



@WebServlet("/ServletControladora")
public class ServletControladora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletControladora() {
        super();
    }
    
  
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
    
	// Metodo doPost para envio de dados e páginas sem mostrar na url
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//Definindo uma variavel cujo valor redireciona conforme a escolha
	    	String acao = request.getParameter("acao");
	    	SistemaNotas sistema = (SistemaNotas) getServletContext().getAttribute(ContextListener.SISTEMA_NOTAS);
	    	// Definindo o menu como "página padrão":
	    	String resposta = "menu.jsp";
	    	// Verificando se o login foi feito para conceder acesso
 	    	String sessao = (String) request.getSession().getAttribute("usuario");
	    	if (sessao != null ) {
	    	// Redirecionando conforme a ação do usuário
	    	if ("cadastrar".equals(acao)) {
	    		resposta = "cadastroDisciplinas.jsp";
	    	} else if ("confirmarCadastro".equals(acao)) {
	    		Nota n = new Nota();
	    		// Recebimento dos dados do usuário
	    		n.setNomeAluno(request.getParameter("nomeAluno"));
	    		n.setDisciplina(request.getParameter("disciplina"));
	    		n.setResultado(Float.parseFloat(request.getParameter("resultado")));
	    		// A situaçao do aluno, aprovado ou reprovado é tratada pela condição a seguir conforme sua nota:
	    		if(n.getResultado()>=5) {
	    			n.setSituacao("Aprovado!");
	    		}else {
	    			n.setSituacao("Reprovado!");
	    		}
	    		// Adicionando dados no Banco de Dados
	    		sistema.adicionar(n);
	    		request.setAttribute("lista", sistema.listarNotas());
	    		resposta = "listaDisciplinas.jsp";
	    	//Redirecionamento da pagina que mostra os registros:
	    	}else if ("listar".equals(acao)) {
	    		request.setAttribute("lista", sistema.listarNotas());
	    		resposta = "listaDisciplinas.jsp";
	    	}
	    	// Redirecionamento:
	    	request.getRequestDispatcher(resposta).forward(request, response);
	}
}
}