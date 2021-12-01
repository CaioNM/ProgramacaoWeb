package br.com.notas.controller;

import static javax.swing.JOptionPane.showMessageDialog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class verificador
 */
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
		 String username = request.getParameter("usuario");
		 String password = request.getParameter("senha");
		if (username.equals("professor") && username!=null && password!=null && password.equals("Progweb2021")) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, username);
			// Verificar se o atributo da sessão está preenchido
			HttpSession session = request.getSession(true);
			request.getRequestDispatcher("ServletControladora").forward(request, response);
		}else{
		showMessageDialog(null, "Usuário/Senha incorretos, tente novamente...");
	}
	}
	}
