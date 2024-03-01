package br.com.Dominio;

public class Homem implements FormulasHm {
public double CalculaCaloriaTotalHomem( double peso,double altura, int idade) {
		
		double resultado = (10 * peso) + (6.25 * altura) - (5 * idade) + 5;

		 
		
		return resultado;// é necessário incluir a este metodo um indice de ativida, tanto esse como o outro
									//faça isso da proxima vez.	
	}

@Override
public double CalculaCaloriaTotalMulher(double peso, double altura, int idade) {
	
	return 0;
}

	
}
