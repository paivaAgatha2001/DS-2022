import java.util.Scanner;
public class NumerosInvertidos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		
		int inv = 0, i;
		
		System.out.println("Digite o número: ");
		num = in.nextInt();
		
		while (num != 0) {
			i = num % 10; 
			inv = inv * 10 + i;
			num = num /10;
		}
		
		System.out.println("O número invertido é: "+inv );
		
		in.close();
	}
}
