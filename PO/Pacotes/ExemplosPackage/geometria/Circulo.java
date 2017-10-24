package geometria;
public class Circulo implements ObjetoGeometrico
{
	protected Ponto2D centro;
	protected double raio;
	public Circulo(Ponto2D centro, double raio)
	{
		this.centro = centro;
		this.raio = raio;
	}
	public Ponto2D centro() { return centro; }
	public double calcula�rea() { return Math.PI*raio*raio; }
	
	public double calculaPer�metro() { return 2.0*Math.PI*raio; }
 //   private double calculaPer�metro() { return 2.0*Math.PI*raio; }
//	protected double calculaPer�metro() { return 2.0*Math.PI*raio; }
	
	public String toString()
	{
		return "C�rculo com centro em "+centro+" e raio "+raio;
	}
	// metodo definido na interface
	public void calcularVolume ( double x, double y, double z ){
		System.out.println("Estou calculando o volume do circulo, que no caso � vazio, aqui!");
	}
}