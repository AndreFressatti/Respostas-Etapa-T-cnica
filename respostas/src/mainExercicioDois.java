import java.util.Scanner;

public class mainExercicioDois {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double ipi = scanner.nextDouble();
		double confins = scanner.nextDouble();
		double icms = scanner.nextDouble();

		IPI a = new IPI();
		System.out.println(a.calculaImposto(ipi));

		ICMS b = new ICMS();
		System.out.println(b.calculaImposto(icms));

		CONFINS c = new CONFINS();
		System.out.println(c.calculaImposto(confins));
	}
}
