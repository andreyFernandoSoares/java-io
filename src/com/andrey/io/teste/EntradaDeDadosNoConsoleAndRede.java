package com.andrey.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class EntradaDeDadosNoConsoleAndRede {
	
	//Fluxo entrada e saida console e rede
	
	public static void main(String[] args) throws IOException {
		
		try (Socket sock = new Socket()) {
			//System.in;
			InputStream fileR = sock.getInputStream();
			Reader leitorR = new InputStreamReader(fileR);
			BufferedReader bufferR = new BufferedReader(leitorR);
			//System.out;
			OutputStream fileW = sock.getOutputStream();
			Writer leitorW = new OutputStreamWriter(fileW);
			BufferedWriter bufferW = new BufferedWriter(leitorW);
			
			
			String linha = bufferR.readLine();
			
			while (linha != null && !linha.isEmpty()) {
				bufferW.write(linha);
				bufferW.newLine();
				bufferW.flush();
				linha = bufferR.readLine();
			}
			
			bufferW.close();
			bufferR.close();
		}
	}
}
