package exercicios;

import java.util.Scanner;

public class programaBissexto {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int bissexto = 0;
		int i,anoInicio, anoFinal;
		System.out.println("Insira o ano inicial:");
		anoInicio= in.nextInt();
		System.out.println("Insira o ano final:");
		anoFinal= in.nextInt();
		i = anoInicio;
		while(i < anoFinal) {
			if (i%4 == 0) {
				System.out.println("O ano "+i+" é bissexto");
				bissexto++;
			}
			i++;
		}
		System.out.println("\nQuantidade de anos bissextos no intervalo: "+bissexto);
	}
	
}