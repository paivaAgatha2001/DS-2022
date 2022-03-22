public class Circulo {

	double raio;
	String cor;
	
	//OPERA��O = A = 3,14 * (RAIO*RAIO)
	
	
	//M�TODO SEM PAR�METRO E SEM RETORNO
		public void exibirDadosC() {
			System.out.println("\nDados do Circulo: ");
			System.out.println("Raio: "+this.raio);
			System.out.println("Cor: "+this.cor);
		}
		
	//M�TODO SEM PARAMETRO E COM RETORNO
		public double calcularAreaC() {
		return 3.14*(this.raio*this.raio); 
	}
		
	//M�TODO COM PAR�METRO E SEM RETORNO
		public void atribuirExibirC(double raio, String cor) {
			this.raio = raio;
			this.cor = cor;
					
				System.out.println("COM PARAMETRO E SEM RETORNO ");
					
				System.out.println("\nDados do Circulo: ");
				System.out.println("Raio: "+this.raio);
				System.out.println("Cor: "+this.cor);
		}
		
		//M�TODO COM PAR�METRO E COM RETORNO
		public double atribuirCalcularExibirC(double raio, String cor) {
			this.raio = raio;
			this.cor = cor;
			
			System.out.println("COM PARAMETRO E RETORNO");
			
			System.out.println("\nDados do Triângulo: ");
			System.out.println("Raio: "+this.raio);
			System.out.println("Cor: "+this.cor);
			
			return 3.14*(this.raio*this.raio); 
			
		}
				
}
