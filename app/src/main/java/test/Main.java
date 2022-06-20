package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ResourceList;
import io.github.classgraph.ScanResult;

public class Main {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Start");
		Main.test2();
		Main.test1();
		System.out.println("End");
	}
	
	public static void test1()
	{
		String path = "test/resources/app.js";

		//path = "test/resources/test.txt";

		InputStream is = Main.class.getClassLoader().getResourceAsStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Output");
		br.lines().forEach(System.out::println);
	}
	
	public static void test2()
	{
		ClassGraph graph = new ClassGraph()
				
				.acceptPackages("test.resources")
				
				;
		
		System.out.println(graph);
		
		try(ScanResult r = graph.scan())
		{
			Map<String, ResourceList> map = r.getAllResourcesAsMap();
			
			map.entrySet().stream()
				.forEach(e -> System.out.println(e));
		}
	}

	public static void test3()
	{
		String path = "test/resources/app.js";
		InputStream is = Main.class.getClassLoader().getResourceAsStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
	}


}
