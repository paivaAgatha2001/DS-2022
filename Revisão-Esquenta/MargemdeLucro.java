import java.util.Scanner;
public class MargemdeLucro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double precop, porcep, pm; 
		char op;
		
		
		do {

			System.out.println("Digite o preço do produto: ");
			precop = in.nextDouble();
			
			System.out.println("Escreva a margem de lucro: ");
			porcep = in.nextDouble();
			
			porcep = (porcep/100) * precop;
			pm = precop + porcep;
			
			System.out.println("o preço do produto é: " + pm);
			
			System.out.println ("deseja continuar?S/N");
			op= in.next().charAt(0);
			
		}while (op == 'S');
		in.close();
	}
}
