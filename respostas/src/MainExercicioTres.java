import java.util.Scanner;

public class MainExercicioTres {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int peso1 = scanner.nextInt();
		int peso2 =  scanner.nextInt();
		int valor1 =  scanner.nextInt();
		int valor2 = scanner.nextInt();
		int distancia1 = scanner.nextInt();
		int distancia2 = scanner.nextInt();

		Caminhao caminhao = new Caminhao();
		System.out.println(caminhao.calculaFrete(peso1, valor1, distancia1));
		
		Vagao vagao = new Vagao();
		System.out.println(vagao.calculaFrete(peso2, valor2, distancia2));
	}
}
