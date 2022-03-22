import java.util.Scanner;
public class TesteCirculo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Circulo c1= new Circulo ();
		
		System.out.println("TESTE 1:");
		System.out.println("Digite o raio do Circulo: ");
		c1.raio = in.nextDouble();
		

		System.out.println("Digite a cor do Circulo: ");
		c1.cor = in.next();
		
		
		System.out.println("\nDados do Circulo: ");
		System.out.println("Raio: "+c1.raio);
		System.out.println("Cor: "+c1.cor);
		
		
		//SEM PARAMETRO E SEM RETORNO
		c1.exibirDadosC();
		
		//SEM PARAMETRO E COM RETORNO
		System.out.println("A área do Circulo é: "+ c1.calcularAreaC());
		
		//M�TODO COM PARAMETRO E SEM RETORNO
			System.out.println("\nTESTE 2");
			c1.atribuirExibirC(20, "Roxo");
			System.out.println("A área desse novo Circulo é: "+c1.calcularAreaC());
			
			
		//M�TODO COM PARAMETRO E COM RETORNO
		System.out.println("A area desse novo Circulo é igual a: "+ c1.atribuirCalcularExibirC(6, "Laranja"));
	}

}
