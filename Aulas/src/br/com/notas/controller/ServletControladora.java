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
	
    
	// redirecionar
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	String acao = request.getParameter("acao");
	    	SistemaNotas sistema = (SistemaNotas) getServletContext().getAttribute(ContextListener.SISTEMA_NOTAS);
	    	String resposta = "menu.jsp";
 	    	String sessao = (String) request.getSession().getAttribute("usuario");
	    	if (sessao != null ) {
	    	// Redirecionando conforme a ação do usuário
	    	if ("cadastrar".equals(acao)) {
	    		resposta = "cadastroDisciplinas.jsp";
	    	} else if ("confirmarCadastro".equals(acao)) {
	    		Nota n = new Nota();
	    		n.setNomeAluno(request.getParameter("nomeAluno"));
	    		n.setDisciplina(request.getParameter("disciplina"));
	    		n.setResultado(Float.parseFloat(request.getParameter("resultado")));
	    		if(n.getResultado()>=5) {
	    			n.setSituacao("Aprovado!");
	    		}else {
	    			n.setSituacao("Reprovado!");
	    		}
			
	    		sistema.adicionar(n);
			
	    		request.setAttribute("lista", sistema.listarNotas());
	    		resposta = "listaDisciplinas.jsp";
	    	}
	    	else if ("listar".equals(acao)) {
	    		request.setAttribute("lista", sistema.listarNotas());
	    		resposta = "listaDisciplinas.jsp";
	    	}
		
	    	request.getRequestDispatcher(resposta).forward(request, response);
	}
}
}