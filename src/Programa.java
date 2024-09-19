import java.util.ArrayList;

public class Programa {
	public static void main(String[] args){
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
		figuras.add(new Circulo(12));
		figuras.add(new Circulo(6));
		for (FiguraGeometrica fig : figuras) {
			System.out.println(fig);
			System.out.println("Area:" +fig.calcularArea() + ", " +
			                   "Perimetro: " + fig.calcularPerimetro());
		}

	}
}