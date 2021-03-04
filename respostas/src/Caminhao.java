
public class Caminhao extends transporte {

	int valor;
	int peso;

	
	public double calculaFrete(int peso, int valor, int distancia) {
		return 0.02* peso + 0.03*valor + 2 * distancia;

	}
}
