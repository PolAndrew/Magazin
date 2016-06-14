package ua.lviv.metods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Scan {
	
	
	public static Integer scInt(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		try {
			a=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Ви ввели не число!");
			
		}
		return a;
		
	}
	public static String scStr(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a = null;
		try {
			return a= br.readLine();
		} catch (IOException e) {
			System.out.println("Ви ввели некоhректну назву");
		}
		return a;
	}
}
