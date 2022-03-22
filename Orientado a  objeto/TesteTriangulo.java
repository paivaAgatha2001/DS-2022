import java.util.Scanner;
public class TesteTriangulo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Triangulo t1= new Triangulo ();
		
		System.out.println("TESTE 1:");
		System.out.println("Digite a base do Triângulo: ");
		t1.base = in.nextDouble();
		
		System.out.println("Digite a altura do Triângulo: ");
		t1.altura = in.nextDouble();

		System.out.println("Digite a cor do Triângulo: ");
		t1.cor = in.next();
		
		
		System.out.println("\nDados do Triângulo: ");
		System.out.println("Base: "+t1.base);
		System.out.println("Altura: "+t1.altura);
		System.out.println("Cor: "+t1.cor);
		
		//SEM PARAMETRO E SEM RETORNO
		t1.exibirDadosT();
		
		//SEM PARAMETRO E COM RETORNO
		System.out.println("A área do trângulo é:"+ t1.calcularAreaT());
		
		
		//M�TODO COM PARAMETRO E SEM RETORNO
		System.out.println("\nTESTE 2");
		t1.atribuirExibirT(10, 20, "vermelho");
		System.out.println("A área desse novo triângulo é: "+t1.calcularAreaT());
		

		//M�TODO COM PARAMETRO E COM RETORNO
		System.out.println("A área desse novo triângulo é igual a: "+ t1.atribuirCalcularExibirT(5, 6, "Lilás"));
	}

}
