public class Conta {
	int numeroConta;
	String nomeCorrentista;
	double saldo;
	
	//1
	public void abreConta(int numeroConta, String nomeCorrentista, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}
	
	//2
	public void depositaValor(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	//3
	public void retiraValor(double valor) {
		if (this.saldo > valor) {
			System.out.println("Saldo suficiente!");
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
		
	//4
	public double retiraValorSaldo(double valor) {
		if (this.saldo > valor) {
			System.out.println("Saldo suficiente! Pode fazer a retirada.");
			this.saldo = this.saldo - valor;
		}else {
			System.out.println("Saldo insuficiente. Nãoo foi possivel fazer o saque.");
		}
		
		return this.saldo;
	}
	
	//5
	public void exibirSaldo() {
		System.out.println("Valor do saldo atual é: "+this.saldo);
	}
	
	public void exibirDados() {
		System.out.println("\nDados da conta-------------------- ");
		System.out.println("Número da conta: "+this.numeroConta);
		System.out.println("Nome do Correntista: "+this.nomeCorrentista);
		System.out.println("Saldo atual: "+this.saldo);
	}
}
