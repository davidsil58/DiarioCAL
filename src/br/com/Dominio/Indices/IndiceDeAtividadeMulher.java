package br.com.Dominio.Indices;

import br.com.Dominio.Mulher;

public class IndiceDeAtividadeMulher extends Mulher {
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
		
	public  double CalculaCaloriaTotalMulher1( double peso,double altura, int idade) {
		try {
		double resultado=665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
		long resultadoArredondado = Math.round(resultado);
		return resultadoArredondado*indice1;
		
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	
	}
	public  double CalculaCaloriaTotalMulher2( double peso,double altura, int idade) {
		try {
		double resultado=665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
		long resultadoArredondado = Math.round(resultado);
		return resultadoArredondado*indice2;
		
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	
	}
	public  double CalculaCaloriaTotalMulher3( double peso,double altura, int idade) {
		try {
		double resultado=665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
		long resultadoArredondado = Math.round(resultado);
		return resultadoArredondado*indice3;
		
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	
	}
	public  double CalculaCaloriaTotalMulher4( double peso,double altura, int idade) {
		try {
		double resultado=665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
		long resultadoArredondado = Math.round(resultado);
		return resultadoArredondado*indice4;
		
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	
	}
}
