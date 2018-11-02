package br.com.richardmartins.uriexercicios;

import java.util.Scanner;

public class Uri1581_ConversaInternacional {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		for(int i = 0 ;i < n ; i ++){
			int j = ler.nextInt();
			String asdf = "";
			for(int k = 0 ; k < j ; k++){
				if(k == 0){
					asdf = ler.next();
				} else {
					String sddf = ler.next();
					if(sddf.equals(asdf)){
						if(k == j-1){
							System.out.println(asdf);
						}
					} else {
						System.out.println("ingles");
						break;
					}
				}
			}
		}
	}
}
