import java.util.Scanner;

public class SalarioLcomif {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		double vHoraAula, nAulaDadas, salarioB, salarioL, descontoInss;
		
		System.out.println("Digite o valor das horas de aula: ");
		vHoraAula = in.nextDouble();
		System.out.println("Digite o número de aulas dadas no mês: ");
		nAulaDadas = in.nextDouble();
		
		salarioB = vHoraAula*nAulaDadas;
		
		System.out.println("O salario bruto é de:" +salarioB);
		
		if (salarioB <= 1212 ) {
			
			descontoInss = (salarioB*7.5)/100;
			salarioL = salarioB - descontoInss;
			System.out.println("o desconto é de:"+descontoInss);
			System.out.println("O salário liquido é: "+salarioL);
			
		}else if(salarioB >= 1212.01 && salarioB <= 2427.35 ){
			descontoInss = (salarioB * 9)/100;
			salarioL = salarioB - descontoInss;
			System.out.println("o desconto é de:"+descontoInss);
			System.out.println("O salário liquido é: "+salarioL);
			
		}else if (salarioB >= 2427.36 && salarioB <= 3641.03){
			descontoInss = (salarioB*12)/100;
			System.out.println("o desconto é de:"+descontoInss);
			salarioL = salarioB - descontoInss;
			System.out.println("O salário liquido é: "+salarioL);
			
		}else if ( salarioB >= 3641.04 && salarioB <= 7089.22 ) {
			descontoInss = (salarioB*14)/100;
			System.out.println("o desconto é de:"+descontoInss);
			salarioL = salarioB - descontoInss;
			System.out.println("O salario liquido é: "+salarioL);
			
		}else if ( salarioB >= 7087.23 && salarioB <= 12136.79) {
			descontoInss = (salarioB*14.5)/100;
			salarioL = salarioB - descontoInss;
			System.out.println("o desconto é de:"+descontoInss);
			System.out.println("O salário liquido é: "+salarioL);
			
		}else if ( salarioB >= 12136.80 && salarioB <= 24273.57 ) {
			descontoInss = (salarioB*16.5)/100;
			salarioL = salarioB - descontoInss;
			System.out.println("o desconto é de:"+descontoInss);
			System.out.println("O salário liquido é: "+salarioL);
			
		}else if ( salarioB >= 24273.58 && salarioB <= 47333.46 ) {
			descontoInss = (salarioB*19)/100;
			salarioL = salarioB - descontoInss;
			System.out.println("o desconto é de:"+descontoInss);
			System.out.println("O salário liquido é: "+salarioL);
			
		}else {
			descontoInss = (salarioB*22)/100;
			salarioL = salarioB - descontoInss;
			System.out.println("o desconto é de:"+descontoInss);
			System.out.println("O salário liquido é: "+salarioL);
		}
		
		in.close();
	}
}
