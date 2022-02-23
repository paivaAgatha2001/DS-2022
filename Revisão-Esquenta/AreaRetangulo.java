import java.util.Scanner;

	public class AreaRetangulo {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double base, altura, area, ladoA, ladoB, ladoC, ladoD, p;
		
		System.out.println("Escreva o tamanho da base: ");
		base = in.nextDouble();
		
		
		System.out.println("Escreva a altura: ");
		altura = in.nextDouble();
		
		area = base*altura;
		
		System.out.println("Escreva o tamanho do primeiro lado: ");
		ladoA = in.nextDouble();
		
		System.out.println("Escreva o tamanho do segundo lado: ");
		ladoB = in.nextDouble();
		
		System.out.println("Escreva o tamanho do terceiro lado: ");
		ladoC = in.nextDouble();
		
		System.out.println("Escreva o tamanho do quarto lado: ");
		ladoD = in.nextDouble();
		
		p = ladoA + ladoB + ladoC + ladoD;
		
		System.out.println("a área do retângulo é: "+area);
		System.out.println("o perímetro do retângulo é: "+p);
	
		in.close();
		}
}
