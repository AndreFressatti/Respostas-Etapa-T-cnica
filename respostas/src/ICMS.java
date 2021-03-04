
public class ICMS implements CalculadorDeImposto {

	@Override
	public double calculaImposto(double valor) {
		return valor * 0.27;
	}

}
