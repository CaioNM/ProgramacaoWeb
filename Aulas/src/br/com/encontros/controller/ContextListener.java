package br.com.encontros.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.encontros.model.SistemaEncontros;

@WebListener
public class ContextListener implements ServletContextListener {

	public static final String SISTEMA_ENCONTROS = "sistemaEncontros";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(SISTEMA_ENCONTROS, new SistemaEncontros());
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(SISTEMA_ENCONTROS);
		
	}
	
}
