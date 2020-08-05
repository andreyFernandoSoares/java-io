package com.andrey.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String s = scanner.nextLine();
			
			Scanner linha = new Scanner(s);
			linha.useDelimiter(",");
			linha.useLocale(Locale.US);
			
			String tipoConta = linha.next();
			Integer agencia = linha.nextInt();
			Integer numero = linha.nextInt();
			String nome = linha.next();
			Double valor = linha.nextDouble();
			
			System.out.println(tipoConta + " - " + agencia + "-" + numero + ", " + nome + ": " + valor);
			
			linha.close();
		}
		
		scanner.close();
	}
}
