
public class IPI implements CalculadorDeImposto {

	@Override
	public double calculaImposto(double valor) {
		if (valor >= 20000) {
			return valor * 0.19;
		} else {
			return valor * 0.07;
		}
	};
}
