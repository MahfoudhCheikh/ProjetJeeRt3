package mr.iscae.rt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import mr.iscae.*;
import mr.iscae.acces.GestionAccess;
import mr.iscae.acces.Users;
public class principale extends HttpServlet{
	GestionAccess UserDefault = new GestionAccess();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		
		
		String user = req.getParameter("user");
		String password = req.getParameter("password");
		//UserDefault.AfficheUsers();
		out.println(UserDefault.RechercheUser(user, password));
/*
		if ((UserDefault.RechercheUser(user, password)) ) {
			resp.sendRedirect("Secure");
		} else {
			resp.sendRedirect("login");
		}*/
	}

}
