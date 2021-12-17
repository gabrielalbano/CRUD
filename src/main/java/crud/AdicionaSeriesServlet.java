package crud;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adiciona")
public class AdicionaSeriesServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		int ultimoId = SeriesDAO.getListaSeries().get(SeriesDAO.getListaSeries().size() - 1).getId();
		Serie serie = new Serie(ultimoId + 1, nome);
		
		SeriesDAO.adiciona(serie);
		
		RequestDispatcher rd = req.getRequestDispatcher("/series");
		resp.sendRedirect("series");
	}

}
