import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double vHoraAula, nAulaDadas, pInss, salarioB, salarioL, descontoInss;
		
		System.out.println("Digite o valor das horas de aula: ");
		vHoraAula = in.nextDouble();
		System.out.println("Digite o número de aulas dadas no mês: ");
		nAulaDadas = in.nextDouble();
		System.out.println("Digite o percentual de desconto: ");
		pInss = in.nextDouble();
		
		salarioB = vHoraAula*nAulaDadas;
		descontoInss = salarioB *pInss/100;
		salarioL = salarioB - descontoInss;
		
		System.out.println("O valor do salário liquido é:  "+salarioL);
		
		in.close();
	}

}
