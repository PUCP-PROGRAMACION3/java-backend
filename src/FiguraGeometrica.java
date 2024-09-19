

public abstract class FiguraGeometrica 
				implements IFiguraOperaciones {
	
	private static int contador;

	private String nombre;
	protected int id;

	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
		this.id = contador;
		contador++;
	}	

	public String getNombre(){
		return nombre;
	}
}