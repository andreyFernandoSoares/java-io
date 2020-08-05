package com.andrey.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaSimples {
	
	//Fluxo de saida de um arquivo
	
	public static void main(String[] args) throws IOException {

		BufferedWriter buffer = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		buffer.write("Teste Simples");
		buffer.newLine();
		buffer.write("Teste Grande");
		
		buffer.close();
	}
}
