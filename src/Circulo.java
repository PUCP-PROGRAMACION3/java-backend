
public class Circulo extends FiguraGeometrica {
	private double radio;

	public Circulo(double radio){
		super("Circulo");
		this.radio = radio;
	}

	public double getRadio(){
		return radio;
	}

	@Override
	public double calcularArea(){
		return Math.PI * radio * radio;
	}

	@Override
	public double calcularPerimetro(){
		return  2 * Math.PI * radio;
	}

	@Override
	public String toString(){
		return getNombre() + "("+id+") : " + this.radio;
	}
}