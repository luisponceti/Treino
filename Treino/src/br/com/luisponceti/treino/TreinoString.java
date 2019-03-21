package br.com.luisponceti.treino;



public class TreinoString {
	 
	public static String nomeMaisculo(String nome1){
		return nome1.toUpperCase();
	}
	
	public static String nomeMinusculo(String nome1){
		return nome1.toLowerCase();
	}
	
	public static String contador(String nome1){
		return nome1;
	}
	
	public static void main(String...args){
		String nomeUser = TreinoString.nomeMaisculo("Luís Fernando");
		System.out.println("O nome todo maíusculo fica: " + nomeUser);
		
		String nomeUser2 = TreinoString.nomeMinusculo("Luís Fernando");
		System.out.println("O nome todo minusculo fica: " + nomeUser2);
		
		String nomeUser3 = TreinoString.contador("DB1START");
		System.out.println("O nome todo minusculo fica: " + nomeUser3.length());
		
		String nomeUser4 = TreinoString.contador(" DB1START ");
		System.out.println("O nome todo minusculo fica: " + nomeUser4.length());
		
		String nomeUser5 = TreinoString.contador(" DB1START ");
		System.out.println("O nome todo minusculo fica: " + nomeUser5.length());
		
		
	}

}
