package com.andrey.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncode {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String c = "C";
		
		System.out.println(c.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytesC = c.getBytes(StandardCharsets.UTF_8);
		String novoC = new String(bytesC, "UTF-8");
		
		System.out.println(bytesC.length + " - " + novoC);
	}
}
