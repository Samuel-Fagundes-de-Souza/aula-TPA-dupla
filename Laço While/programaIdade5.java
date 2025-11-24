package exercicios;

import java.util.Scanner;

public class programaIdade5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i = 1, anoAtual, anoNasc, idade, resposta;
		
		while (i == 1) {
			System.out.println("Insira o ano atual:");
			anoAtual = in.nextInt();
		    System.out.println("Insira seu ano de nascimento:");
			anoNasc = in.nextInt();
			idade = anoAtual - anoNasc;
			System.out.println (idade);
			System.out.println ("Deseja continuar? 1 - Sim/ 0 - Não");
			resposta = in.nextInt();
			if (resposta == 0) {
				i--;
				
				
				
				
				
				
			}
		}

	}

}
