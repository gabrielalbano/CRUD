package crud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/series")
public class ListaSeriesServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Serie> series = SeriesDAO.getListaSeries();
		
		RequestDispatcher rd = req.getRequestDispatcher("lista-series.jsp");
		req.setAttribute("series", series);
		rd.forward(req, resp);
	}
}
