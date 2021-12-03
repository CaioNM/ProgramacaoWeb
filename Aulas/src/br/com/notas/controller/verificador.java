package br.com.notas.controller;

import static javax.swing.JOptionPane.showMessageDialog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/verificador")
public class verificador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public verificador() {
        super();
    }
    
    public static final String USUARIO = "usuario";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Chamada dos dados inseridos pelo usuario, seu login e senha
		 String username = request.getParameter("usuario");
		 String password = request.getParameter("senha");
		 //Declara��o dos atributos corretos e preenchimento da sessao:
		if (username.equals("professor") && username!=null && password!=null && password.equals("Progweb2021")) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, username);
			// Verifica se o atributo da sess�o est� preenchido
			HttpSession session = request.getSession(true);
			request.getRequestDispatcher("ServletControladora").forward(request, response);
		}else{
		// Mensagem caso o usu�rio erre seus dados
		showMessageDialog(null, "Usu�rio/Senha incorretos, tente novamente...");
	}
	}
	}
