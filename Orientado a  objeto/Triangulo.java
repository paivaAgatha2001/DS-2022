public class Triangulo {
	double base;
	double altura;
	String cor;
	
	
	//M�TODO SEM PAR�METRO E SEM RETORNO
		public void exibirDadosT() {
			System.out.println("\nDados do Triângulo ");
			System.out.println("Base: "+this.base);
			System.out.println("Altura: "+this.altura);
			System.out.println("Cor: "+this.cor);
		}
		
		//M�TODO SEM PARAMETRO E COM RETORNO
		public double calcularAreaT() {
			return (this.base *this.altura)/2; 
		}
		
		
		//M�TODO COM PAR�METRO E SEM RETORNO
		public void atribuirExibirT(double base, double altura, String cor) {
			this.base = base;
			this.altura  = altura;
			this.cor = cor;
			
			System.out.println("COM PARAMETRO E SEM RETORNO ");
			
			System.out.println("\nDados do Triângulo: ");
			System.out.println("Base: "+this.base);
			System.out.println("Altura: "+this.altura);
			System.out.println("Cor: "+this.cor);
		}
		
		//M�TODO COM PAR�METRO E COM RETORNO
				public double atribuirCalcularExibirT(double base, double altura, String cor) {
					this.base = base;
					this.altura  = altura;
					this.cor = cor;
					
					System.out.println("COM PARAMETRO E RETORNO");
					
					System.out.println("\nDados do Triãngulo: ");
					System.out.println("Base: "+this.base);
					System.out.println("Altura: "+this.altura);
					System.out.println("Cor: "+this.cor);
					
					return (this.base*this.altura)/2;
			}
		
}
