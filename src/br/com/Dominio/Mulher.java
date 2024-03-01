package br.com.Dominio;

public class Mulher implements FormulasHm {
	@Override
	public  double CalculaCaloriaTotalMulher( double peso,double altura, int idade) {
		double resultado=665.1 + (9.56 * peso) + (1.8 * altura) - (4.7 * idade);
		long resultadoArredondado = Math.round(resultado);
		return resultadoArredondado;
	
	}

	@Override
	public double CalculaCaloriaTotalHomem(double peso, double altura, int idade) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
