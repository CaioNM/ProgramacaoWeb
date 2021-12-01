package br.com.notas.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.notas.model.SistemaNotas;

@WebListener
public class ContextListener implements ServletContextListener {

	public static final String SISTEMA_NOTAS = "sistemaNotas";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(SISTEMA_NOTAS, new SistemaNotas());		
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(SISTEMA_NOTAS);		
	}	
}