
public class CONFINS implements CalculadorDeImposto {

	@Override
	public double calculaImposto(double valor) {
		if (valor > 12000) {
			return valor*0.04;
		} else {
			return valor;
		}
	}

}
