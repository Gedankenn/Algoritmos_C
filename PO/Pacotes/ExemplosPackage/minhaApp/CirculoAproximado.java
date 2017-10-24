package minhaApp;
import geometria.Circulo;
import geometria.Ponto2D;
public class CirculoAproximado extends Circulo
{
	// O construtor param�trico deve existir.
	public CirculoAproximado(Ponto2D centro, double raio)
	{
		super(centro, raio);
	}
	public double calcula�rea()
	{
		return 3.14*raio*raio;
	}
	//protected double calculaPer�metro() // Erro de compila��o!
	public double calculaPer�metro() // Sem erro de compila��o!
	{
		return 3.14*Math.PI*raio;
	}
}