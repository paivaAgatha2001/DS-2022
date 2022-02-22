import java.util.Scanner;
public class VetorSoma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, a[], b[], c[];
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor A:");
			a[i] = in.nextInt();
		}
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor B:");
			b[i] = in.nextInt();
			c[i] = a[i]+b[i];
		}
		System.out.print("\nC = ");
		for (i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		in.close();
	}
}
