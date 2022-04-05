import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		Conta r1 = new Conta();
		
		int numeroConta;
		String nomeCorrentista;
		double saldo;
		//double valor;
		
		
		//RECEBE OS DADOS 
		System.out.println("Digite o número da conta: ");
		r1.numeroConta = in.nextInt();
		System.out.println("Digite o nome do correntista: ");
		r1.nomeCorrentista = in.next();
		System.out.println("Digite o saldo para abrir a conta: ");
		r1.saldo = in.nextDouble();		
		
		//1--ABRE A CONTA
		r1.abreConta(r1.numeroConta, r1.nomeCorrentista, r1.saldo);
		
		
		//2--DEPOSITA VALOR
		System.out.println("\nDigite quanto quer depositar:");
		saldo = in.nextDouble();
		r1.depositaValor(saldo);
		
		
		//VAI EXIBIR O VALOR DO SALDO ATUAL + O VALOR DEPOSITADO
		System.out.println("\n");
		r1.exibirSaldo();
		
		
		//3--RETIRA VALOR DO SALDO ATUAL 
		System.out.println("\nDigite o valor que quer retirar:");
		saldo = in.nextDouble();
		r1.retiraValor(saldo);
		
		
		//4--RETIRA VALOR E TEM RETORNO
		r1.retiraValorSaldo(saldo);
		
		
		//5--RETORNA O SALDO ATUAL
		System.out.println("\n");
		r1.exibirSaldo();
		
		
		//EXIBE DADOS DA CONTA
		r1.exibirDados();
		

	}

}
