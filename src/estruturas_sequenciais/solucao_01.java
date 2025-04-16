package estruturas_sequenciais;

import java.util.Scanner; 

public class solucao_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.print("Informe o primeiro valor: ");
		x = sc.nextInt();
		System.out.print("Informe o  segunndo valor: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.print("Soma: " + soma);
		
		sc.close();

	}

}
