package br.com.luisponceti.treino;


public class TreinoDouble {

	public static Double valorMenor(Double valor1, Double valor2){
		
		if(valor1 <= valor2){
			return  valor1;
			}	
			return valor2;
	}
	
	public static Double valorMenor(Double valor1, Double valor2, Double valor3){
		
	Double valorMenor = valorMenor(valor1, valor2);
	return valorMenor = valorMenor(valorMenor, valor3);
}
	
	public static Double media(Double valor1, Double valor2, Double valor3) {
		return  valor1 + valor2 + valor3  / 3;
	}
	
	public static Double triangulo(Double altura, Double base) {
		return base * altura / 2;
	}
	
	public static void main(String[] args){
	
		Double valorMenorReal2 = TreinoDouble.valorMenor(3.0, 2.0);
		System.out.println("O menor valor da primeira operação é: " + valorMenorReal2);
		
		Double valorMenorReal3 = TreinoDouble.valorMenor(50.0, 40.0,30.0);
		System.out.println("O menor valor da segunda operação é: " + valorMenorReal3);
		
		Double mediaReal = TreinoDouble.media(1.0, 2.0, 3.0);
		System.out.println("O menor valor da três operação é: " + mediaReal);
		
		Double areaTriangulo = TreinoDouble.triangulo(10.2, 23.2);
		System.out.println("A área do triangulo é: " + areaTriangulo);
		
	}
}
	

