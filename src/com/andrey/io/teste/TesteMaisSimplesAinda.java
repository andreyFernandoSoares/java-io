package com.andrey.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteMaisSimplesAinda {
	
	//Fluxo de saida de um arquivo
	
	public static void main(String[] args) throws IOException {
		
		//PrintStream printMais = new PrintStream(new File("lorem.txt"));
		//Pode ser usado tambem
		//PrintWriter writer = new PrintWriter("lorem2.txt");
		
		PrintStream print = new PrintStream("lorem2.txt", "UTF-8");
		print.println("jooooooooooooooooj");
		print.println();
		print.println("jooj");
		
		print.close();
	}
}
