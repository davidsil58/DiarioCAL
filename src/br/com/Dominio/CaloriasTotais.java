package br.com.Dominio;



public class CaloriasTotais   {

	
	public static double CalculaCaloriaTotalHomem( double peso,double altura, int idade) {
		
		double resultado= 66.5 + (13.75 * peso) + (5.0 * altura) - (6.8 * idade);

		 
		long resultadoArredondado = Math.round(resultado); //resultado arredondado.
		return resultadoArredondado;	
	}
		
	
	
	public static double CalculaCaloriaTotalMulher( double peso,double altura, int idade) {
			double resultado=665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
			long resultadoArredondado = Math.round(resultado);
			return resultadoArredondado;
		
		}
	public  void InformaIndice(){
		System.out.println("Informe seu índice de atividade :");
	    System.out.println("1. Sedentário (pouco ou nenhuma atividade diária)");
	    System.out.println("2. Pouco ativo (exercícios leves 1-3 dias por semana)");
	    System.out.println("3. Moderadamente ativo (exercícios 3-5 dias por semana)");
	    System.out.println("4. Muito ativo (exercícios intensos 6-7 dias por semana");
	   
	}
}