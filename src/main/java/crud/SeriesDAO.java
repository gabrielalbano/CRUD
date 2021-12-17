package crud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class SeriesDAO {
	private static List<Serie> series = new ArrayList<>();
	
	public static void adiciona(Serie serie) {
		series.add(serie);
	}
	
	public static void remove(int id) {
		series.remove(id - 1);
	}
	
	public static void atualiza(int id, Serie serie) {
		series.forEach(serieCadastrada -> {
			if (serieCadastrada.getId() == id) {
				series.set(series.indexOf(serieCadastrada), serie);
			}
		});
	}
	
	public static List<Serie> getListaSeries() {
		return Collections.unmodifiableList(series);
	}
	
	static {
		adiciona(new Serie(1, "The Office"));
		adiciona(new Serie(2, "True Detective"));
	}
}
