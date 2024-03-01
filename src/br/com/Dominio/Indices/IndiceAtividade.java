package br.com.Dominio.Indices;


import br.com.Dominio.Homem;

public class IndiceAtividade extends Homem {
	private double indice1 = 1.26;
	private double indice2 = 1.375;
	private double indice3 = 1.55;
	private double indice4 = 1.725;
	
	public  void InformaIndice(){
		System.out.println("Informe seu índice de atividade :");
	    System.out.println("1. Sedentário (pouco ou nenhuma atividade diária)");
	    System.out.println("2. Pouco ativo (exercícios leves 1-3 dias por semana)");
	    System.out.println("3. Moderadamente ativo (exercícios 3-5 dias por semana)");
	    System.out.println("4. Muito ativo (exercícios intensos 6-7 dias por semana");
	}
	
	public double CalculaCaloriaTotalHomem( double peso,double altura, int idade) {
		try { 
		double resultadoOriginal = super.CalculaCaloriaTotalHomem(  peso, altura,  idade);
		
		double resultadoComIndice1 = resultadoOriginal * indice1;
		long resultadoComIndice1R = Math.round(resultadoComIndice1);

		
		return resultadoComIndice1R;
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	
	}
	
	
	public double CalculaCaloriaTotalHomem2( double peso,double altura, int idade) {
		try {
		double resultadoOriginal =  CalculaCaloriaTotalHomem(  peso, altura,  idade);
		
		double resultadoComIndice2 = resultadoOriginal * indice2;
		long resultadoComIndice1R = Math.round(resultadoComIndice2);


		
		return resultadoComIndice2;
		}catch(IllegalArgumentException e){
			System.out.println(e.getLocalizedMessage());
		}
		return -1;
	}
	
	
	public double CalculaCaloriaTotalHomem3( double peso,double altura, int idade) {
		try {
		double resultadoOriginal =  CalculaCaloriaTotalHomem(  peso, altura,  idade);
		
		double resultadoComIndice3 = resultadoOriginal * indice3;
		long resultadoComIndice1R = Math.round(resultadoComIndice3);


		
		return resultadoComIndice3;
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	public double CalculaCaloriaTotalHomem4( double peso,double altura, int idade) {
		try {
		double resultadoOriginal =  CalculaCaloriaTotalHomem(  peso, altura,  idade);
		
		double resultadoComIndice4 = resultadoOriginal ;
		long resultadoComIndiceR4 = Math.round(resultadoComIndice4);


		
		return resultadoComIndiceR4;
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}

	}
}