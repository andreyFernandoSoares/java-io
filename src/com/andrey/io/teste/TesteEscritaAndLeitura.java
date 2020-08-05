package com.andrey.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaAndLeitura {
	
	//Fluxo de saida de um arquivo
	
	public static void main(String[] args) throws IOException {
		
		InputStream fileR = new FileInputStream("lorem.txt");
		Reader leitorR = new InputStreamReader(fileR);
		BufferedReader bufferR = new BufferedReader(leitorR);
		
		OutputStream fileW = new FileOutputStream("lorem2.txt");
		Writer leitorW = new OutputStreamWriter(fileW);
		BufferedWriter bufferW = new BufferedWriter(leitorW);
		
		
		String linha = bufferR.readLine();
		
		while (linha != null) {
			bufferW.write(linha);
			bufferW.newLine();
			linha = bufferR.readLine();
		}
		
		bufferW.close();
		bufferR.close();
	}
}
