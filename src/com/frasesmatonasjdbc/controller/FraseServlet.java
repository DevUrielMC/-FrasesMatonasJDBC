package com.frasesmatonasjdbc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FraseServlet")
public class FraseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FraseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String txtContenido = req.getParameter("txtContenido");
		String txtCandidad = req.getParameter("txtCandidad");
		String txtFechaDesde = req.getParameter("txtFechaDesde");

	}

}
