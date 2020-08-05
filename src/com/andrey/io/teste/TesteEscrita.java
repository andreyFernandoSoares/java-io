package com.andrey.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	//Fluxo de saida de um arquivo
	
	public static void main(String[] args) throws IOException {
		
		OutputStream file = new FileOutputStream("lorem2.txt");
		Writer leitor = new OutputStreamWriter(file, "UTF-8");
		BufferedWriter buffer = new BufferedWriter(leitor);
		
		buffer.write("Teste de escrita");
		buffer.newLine();
		buffer.write("Mais um text");
		
		buffer.close();
		
	}
}
