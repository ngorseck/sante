package com.samanecorporation.sante.controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {

	private static Logger logger = LoggerFactory.getLogger(LoginServlet.class);
	 
	@Override
	public void init(ServletConfig config) throws ServletException {
	
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = "Vous etes sur la page de connexion !";
		logger.info("connexion... ");
		
		req.setAttribute("message", message);
		
		List<String> infos  = Arrays.asList("SECK", "SOW", "WANE");
		req.setAttribute("infos", infos);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//TODO faites les controles ici
		
	    resp.sendRedirect("welcome");
	}
}
