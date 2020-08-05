package com.andrey.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	
	//Fluxo de entrada e saida de um arquivo
	
	public static void main(String[] args) throws IOException {
		
		InputStream file = new FileInputStream("lorem.txt");
		Reader leitor = new InputStreamReader(file, "UTF-8");
		BufferedReader buffer = new BufferedReader(leitor);
		
		
		String linha = buffer.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		
		buffer.close();
	}
}
