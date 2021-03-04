import java.util.Scanner;

public class primeiro {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
    	
    	int i = 1;
       
        int numero2 = sc.nextInt();
        int menor = numero2;
        int numero = sc.nextInt();
        int maior = numero;
        for (i = 2; i < 5; i++) {
          
            numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
            	
            }
        }
        System.out.println("O maior numero e o " + maior);
        System.out.println("o menor numero e o " + menor);
        if (maior == menor) {
        	System.out.print("E todos são iguais");
        }
    }
}