package br.com.luisponceti.treino;


public class TreinoInteger {
	
	public static Integer somar(Integer numero1, Integer numero2){
		return numero1 + numero2;
	}
	
	public static Integer subtrair(Integer numero1, Integer numero2){
		return numero1 - numero2;
	}
	
	public static Integer multiplique(Integer numero1, Integer numero2){
		return numero1 * numero2;
	}
	
	public static Integer divisao(Integer numero1, Integer numero2){
		return numero1 / numero2;
	}
	
	public static Integer par(Integer numero1) {
		return numero1;
	}
	
	public static Integer valorMenor(Integer numero1, Integer numero2){
		if(numero1 >= numero2){
			return  numero1;
			}	
			return numero2;
	}
			
	public static Integer verifica(Integer numero1) {
		return numero1;
	}
	
	public static void main(String...args){
		Integer resultado = TreinoInteger.somar(1, 9);
		
		Integer resultado1 = TreinoInteger.subtrair(1, 9);
		
		Integer resultado2 = TreinoInteger.multiplique(2, 9);
		
		Integer resultado3 = TreinoInteger.divisao(9, 1);
		
		Integer resultado4 = TreinoInteger.par(3);
		
		System.out.println("O resultado da soma é: " + resultado);
		
		System.out.println("O resultado da subtração é: " + resultado1);
		
		System.out.println("O resultado da multiplação é: " + resultado2);
		
		System.out.println("O resultado da divisão é: " + resultado3);
		
		if(resultado4 % 2==0) {
			System.out.println("É par!");
		}else {
			System.out.println("É impar!");
		}
		
		Integer valorMenorReal = TreinoInteger.valorMenor(3, 2);
		System.out.println("O menor valor da primeira operação é: " + valorMenorReal);
		
		for(Integer resultado5=1;  resultado5<=100; resultado5++){
            if(resultado5% 2!=0){
              System.out.println("Impar: " + resultado5);
            }
		}
	}
		
	

}
