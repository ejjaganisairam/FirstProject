package com.searchy.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.searchy.dao.DbConnection;

public class LoginServlet extends HttpServlet {

	/**
	 * @throws IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			String username = request.getParameter("uname");
			String password = request.getParameter("pass");
			pw.print("Hello" + username);
			if (username.equals("abc123") && password.equals("pass123")) {
				response.sendRedirect("HTML/home.html");
			} else {
				response.sendRedirect("index.html");
			}
		} catch (Exception e) {

		}

	}

}
