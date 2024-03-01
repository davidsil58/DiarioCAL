package br.com.Dominio;

public class MacroCaL {
	private double proteinas;
	private double carboidratos;
	private double gorduras;
	
	
	public MacroCaL(double proteinas, double carboidratos, double gorduras) {
		super();
		this.proteinas = proteinas;
		this.carboidratos = carboidratos;
		this.gorduras = gorduras;
	}

	public double TotalCalMacro() {
		double CaloriasEmP = proteinas * 2;
		double CaloriasEmC = carboidratos * 4;
		double CaloriasEmG = gorduras * 1;
		 
		return CaloriasEmP + CaloriasEmC + CaloriasEmC;
		
		
	}
	
	
	public double CalculaImc(double altura,double peso) {
		double imc= peso/(altura*altura); 
	return imc;
	
	}

	
}
