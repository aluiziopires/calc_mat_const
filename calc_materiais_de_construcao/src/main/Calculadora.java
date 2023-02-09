package main;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int etapa;
		
		System.out.println("Calculadora de materiais de construção:");
		System.out.println(" ");
		System.out.println("Selecione a etapa atual da sua obra:");
		System.out.println(" ");
		System.out.println("1 - Alvenaria");
		System.out.println("2 - Constrapiso");
		System.out.println("3 - Reboco");
		System.out.println("4 - Cerâmica");
		System.out.println("5 - Pintura");
		System.out.println(" ");
		System.out.print("Digite a etapa desejada: ");
		etapa=sc.nextInt();
		System.out.println(" ");
		if (etapa==1) {
			System.out.println("Materiais necessários para execução:");	
			System.out.println(" ");
			System.out.println("1 - Tijolo");	
			System.out.println("2 - Massa de cimento e areia (traço 1:4)");
				}
		else {
			System.out.println("0");	
}	
		
		
		
		
		
		sc.close();	
}
}
