package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception
	{
		InputStream is = Main.class.getClassLoader().getResourceAsStream("test/resource/app.js");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		br.lines().forEach(System.out::println);
	}



}
