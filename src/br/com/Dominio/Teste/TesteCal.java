package br.com.Dominio.Teste;
import java.util.Scanner;

import br.com.Dominio.CaloriasTotais;
import br.com.Dominio.MacroCaL;
import br.com.Dominio.Indices.IndiceAtividade;
import br.com.Dominio.Indices.IndiceDeAtividadeMulher;

public class TesteCal {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner (System.in);
		
	 System.out.println("Escolha uma opção:");
     System.out.println("1. Ganhar peso");
     System.out.println("2. Perder peso");
     int  objetivo= scanner.nextInt();
     
     if(objetivo==1) {
    	 
    	 System.out.println("------------------------------");
    	 System.out.println("Informe seu gênero:");
         System.out.println("1. Homem");
         System.out.println("2. Mulher");
        
         int homemMulher = scanner.nextInt();

         if(homemMulher==1) {
        	 IndiceAtividade calTotal = new IndiceAtividade();
        	 
        	 System.out.println("Informe seu peso em kg");
        	 double peso2= scanner.nextDouble();
        	 
        	 System.out.println("---------------------------");
        	 
        	 System.out.println("Informe sua altura em métros");
        	 double altura2= scanner.nextDouble();
        	 
        	 System.out.println("Informe sua idade");
        	 int idade= scanner.nextInt();
        	 
        	 calTotal.InformaIndice();
        	  
        	 	int informaIndice = scanner.nextInt();      
        	 	if(informaIndice==1) {
        	   
        		   double total = calTotal.CalculaCaloriaTotalHomem( peso2, altura2,idade);
        		   
        		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total);

        	   }else if(informaIndice==2){
        		   
        		   double total= calTotal.CalculaCaloriaTotalHomem2((double) peso2, altura2,idade);
          		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");

        	   }else if (informaIndice==3) {
        		   
        		   double total= calTotal.CalculaCaloriaTotalHomem3((double) peso2, altura2,idade);
          		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");

        	   }else if(informaIndice==4) {
        		   double total= calTotal.CalculaCaloriaTotalHomem4((double) peso2, altura2,idade);
        		   
        		  
        		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");
        	   }
        	
        	 
        	 }else if(homemMulher==2) {
        	IndiceDeAtividadeMulher calTotal= new IndiceDeAtividadeMulher();

        	 System.out.println("Informe seu peso em quilos");
        	 double peso2= scanner.nextDouble();
        	 
        	 System.out.println("---------------------------");
        	 
        	 System.out.println("Informe sua altura em métros");
        	 double altura2= scanner.nextDouble();
        	 
        	 System.out.println("Informe sua idade");
        	 int idade2 = scanner.nextInt();
        	 
        	 calTotal.InformaIndice();//aqui eu mostro as opções.
      	   int informaIndice= scanner.nextInt();      
      	   if(informaIndice==1) {
      	   
      		   double total = calTotal.CalculaCaloriaTotalMulher1( peso2, altura2,idade2);
      		   
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total);

      	   }else if(informaIndice==2){
      		   
      		   double total= calTotal.CalculaCaloriaTotalMulher2((double) peso2, altura2,idade2);
      		   
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");
      	   
      	   }else if (informaIndice==3) {
      		   
      		   double total= calTotal.CalculaCaloriaTotalMulher3((double) peso2, altura2,idade2);
      		   
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");   
      	   
      	   }else if(informaIndice==4) {
      		   double total= calTotal.CalculaCaloriaTotalMulher4((double) peso2, altura2,idade2);
      		   
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");
      	   }

        	
        	 
         
         }
     }else if(objetivo==2) {
    	 System.out.println("você escolheu perder peso");
    	 System.out.println("------------------------------");
    	 System.out.println("Informe seu sexo:");
         System.out.println("1. Homem");
         System.out.println("2. Mulher");
         int genero = scanner.nextInt();
         if(genero==1){
        	 IndiceAtividade calTotal= new IndiceAtividade();

        	 System.out.println("Informe seu peso em quilos");
        	 double peso2= scanner.nextDouble();
        	 
        	 System.out.println("---------------------------");
        	 
        	 System.out.println("Informe sua altura em métros");
        	 double altura2 = scanner.nextDouble();
        	 
        	 System.out.println("Informe sua idade");
        	 int idade2 = scanner.nextInt();
        	
        	 calTotal.InformaIndice();//aqui eu mostro as opções.
      	   int informaIndice = scanner.nextInt();      
      	   if(informaIndice==1) {
      	   
      		   double total = calTotal.CalculaCaloriaTotalHomem((double) peso2, altura2,idade2);
      		  
      		   
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total);
      		   System.out.println();
      		   
      		   
      	   }else if(informaIndice==2){
      		   
      		   double total= calTotal.CalculaCaloriaTotalHomem2((double) peso2, altura2,idade2);
      		   
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");
      	   
      	   }else if (informaIndice==3) {
      		   
      		   double total= calTotal.CalculaCaloriaTotalHomem3((double) peso2, altura2,idade2);
      		   
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");   
      	   
      	   }else if(informaIndice==4) {
      		   double total= calTotal.CalculaCaloriaTotalHomem4((double) peso2, altura2,idade2);
      		  
      		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");
      	   }

        	 
         }else 
        	 if(genero==2) {
            	 IndiceDeAtividadeMulher calTotal= new IndiceDeAtividadeMulher();

            	 System.out.println("Informe seu peso em quilos");
            	 double peso2= scanner.nextDouble();
            	 
            	 System.out.println("---------------------------");
            	 
            	 System.out.println("Informe sua altura em metros");
            	 double altura2= scanner.nextDouble();
            	 
            	 System.out.println("Informe sua idade");
            	 int idade2 = scanner.nextInt();
            	 
            	 calTotal.InformaIndice();//aqui eu mostro as opções.
            	   
            	 int informaIndice= scanner.nextInt();      
            	   if(informaIndice==1) {
            	   
            		   double total= calTotal.CalculaCaloriaTotalMulher1( peso2, altura2,idade2);
            		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total);

            	   }else if(informaIndice==2){
            		   
            		   double total= calTotal.CalculaCaloriaTotalMulher2((double) peso2, altura2,idade2);
            		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");
            	   
            	   }else if (informaIndice==3) {
            		   
            		   double total= calTotal.CalculaCaloriaTotalMulher3((double) peso2, altura2,idade2);
            		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");   
            	   
            	   }else if(informaIndice==4) {
            		   
            		   double total= calTotal.CalculaCaloriaTotalMulher4((double) peso2, altura2,idade2);
            		   
            		   System.out.println("A quantidade que deve ser consumida diáriariamente é: " + total + " kcal");
            	   }
           	     
        	 }
    
         		scanner.close();
     	}
	}
}
