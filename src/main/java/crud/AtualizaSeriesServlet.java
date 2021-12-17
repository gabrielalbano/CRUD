package crud;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/atualiza")
public class AtualizaSeriesServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String replacedId = req.getParameter("id");
		String nome = req.getParameter("nome");
		Serie serie = new Serie(Integer.parseInt(replacedId), nome);
		
		SeriesDAO.atualiza(Integer.parseInt(replacedId), serie);
		
		RequestDispatcher rd = req.getRequestDispatcher("/series");
		resp.sendRedirect("series");
	}

}
