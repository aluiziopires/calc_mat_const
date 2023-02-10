package main;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int etapa;
		double quantExec;
		
		System.out.println("Calculadora de materiais de construção:");
		System.out.println(" ");
		
		do {
		
		System.out.println("Selecione a etapa atual da sua obra:");
		System.out.println(" ");
		System.out.println("1 - Alvenaria");
		System.out.println("2 - Contrapiso");
		System.out.println("3 - Reboco");
		System.out.println("4 - Cerâmica");
		System.out.println("5 - Pintura");
		System.out.println("6 - Sair");
		System.out.println(" ");
		System.out.print("Digite a etapa desejada: ");
		etapa=sc.nextInt();
		System.out.println(" ");
		if (etapa==1) {
			System.out.print("Quantidade a ser executada (m²): ");
			quantExec=sc.nextDouble();
			System.out.println("Materiais necessários para execução:");	
			System.out.println(" ");
			System.out.println("1 - Tijolo");
			System.out.println("2 - Massa de cimento e areia (traço 1:4)");
			System.out.println(" ");
				}
		else {
			if (etapa==2) {
				System.out.print("Quantidade a ser executada (m²): ");
				quantExec=sc.nextDouble();
				System.out.println("Materiais necessários para execução:");	
				System.out.println(" ");
				System.out.println("1 - Massa de cimento e areia (traço 1:4)");	
				System.out.println(" ");
					}	
			else {
				if (etapa==3) {
					System.out.print("Quantidade a ser executada (m²): ");
					quantExec=sc.nextDouble();
					System.out.println("Materiais necessários para execução:");	
					System.out.println(" ");
					System.out.println("1 - Massa de cimento e areia (traço 1:4)");	
					System.out.println(" ");
						}
				else {
					if (etapa==4) {
						System.out.print("Quantidade a ser executada (m²): ");
						quantExec=sc.nextDouble();
						System.out.println("Materiais necessários para execução:");	
						System.out.println(" ");
						System.out.println("1 - Cerâmica");	
						System.out.println("2 - Argamassa colante");
						System.out.println("3 - Espaçador plástico");
						System.out.println("4 - Rejunte");
						System.out.println(" ");
							}
					else {
						if (etapa==5) {
							System.out.print("Quantidade a ser executada (m²): ");
							quantExec=sc.nextDouble();
							System.out.println("Materiais necessários para execução:");	
							System.out.println(" ");
							System.out.println("1 - Selador");	
							System.out.println("2 - Massa corrida");
							System.out.println("3 - Tinta");
							System.out.println(" ");
								}
						else {
							System.out.print("Programa finalizado!");	
						}
					}
				}
			}
		}
		
		
		
		}while (etapa<6);
		
		sc.close();	
}
}
