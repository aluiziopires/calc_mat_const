package main;

import java.util.Locale;
import java.util.Scanner;
import entities.Materiais;

public class Calculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int etapa;
				
		Materiais material = new Materiais();
		
		System.out.println("Calculadora de materiais de construção:");
		System.out.println(" ");
		
		do {
		
		etapa=0;
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
								
			System.out.println("Etapa selecionada: Alvenaria");
			System.out.println(" ");
			System.out.print("Quantidade a ser executada (m²): ");
			material.quantExec=sc.nextDouble();
			System.out.println(" ");
			System.out.println("Materiais necessários para execução:");	
			System.out.println(" ");
			System.out.printf("1 - Tijolo: "+ material.quantTijolo()+ " unidades");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("2 - Massa de cimento e areia (traço 1:3)");
			System.out.println(" ");
			System.out.printf("Cimento: "+ material.quantCimentoAlv()+ " Kg");
			System.out.println(" ");
			System.out.println(" ");
			System.out.printf("Areia: "+ material.quantAreiaAlv()+ " m³");
			System.out.println(" ");
			System.out.println(" ");				
			}
		
		else {
			
			if (etapa==2) {
				System.out.println("Etapa selecionada: Contrapiso");
				System.out.println(" ");
				System.out.print("Quantidade a ser executada (m²): ");
				material.quantExec=sc.nextDouble();
				System.out.println(" ");
				System.out.println("Materiais necessários para execução:");	
				System.out.println(" ");
				System.out.println("1 - Massa de cimento e areia (traço 1:5)");	
				System.out.println(" ");
				System.out.printf("Cimento: "+ material.quantCimentoContra()+ " Kg");
				System.out.println(" ");
				System.out.println(" ");
				System.out.printf("Areia: "+ material.quantAreiaContra()+ " m³");
				System.out.println(" ");
				System.out.println(" ");
				}	
			else {
				
				if (etapa==3) {
					System.out.println("Etapa selecionada: Reboco");
					System.out.println(" ");
					System.out.print("Quantidade a ser executada (m²): ");
					material.quantExec=sc.nextDouble();
					System.out.println(" ");
					System.out.println("Materiais necessários para execução:");	
					System.out.println(" ");
					System.out.println("1 - Massa de cimento e areia (traço 1:4)");	
					System.out.println(" ");
					System.out.printf("Cimento: "+ material.quantCimentoReboco()+ " Kg");
					System.out.println(" ");
					System.out.println(" ");
					System.out.printf("Areia: "+ material.quantAreiaReboco()+ " m³");
					System.out.println(" ");
					System.out.println(" ");
					}
				else {
					
					if (etapa==4) {
						System.out.println("Etapa selecionada: Cerâmica");
						System.out.println(" ");
						System.out.print("Quantidade a ser executada (m²): ");
						material.quantExec=sc.nextDouble();
						System.out.println(" ");
						System.out.println("Materiais necessários para execução:");	
						System.out.println(" ");
						System.out.printf("1 - Cerâmica: "+ material.quantCeramica()+ " m²");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("2 - Argamassa colante");
						System.out.printf("Para colagem simples: "+ material.quantArgColanteSimples()+ " Kg");
						System.out.println(" ");
						System.out.printf("Para colagem dupla: "+ material.quantArgColanteDupla()+ " Kg");
						System.out.println(" ");
						System.out.println(" ");
						System.out.printf("3 - Rejunte: "+ material.quantRejunte()+ " Kg");
						System.out.println(" ");
						System.out.println(" ");
							}
					else {
						
						if (etapa==5) {
							System.out.println("Etapa selecionada: Pintura");
							System.out.println(" ");
							System.out.print("Quantidade a ser executada (m²): ");
							material.quantExec=sc.nextDouble();
							System.out.println(" ");
							System.out.println("Materiais necessários para execução:");	
							System.out.println(" ");
							System.out.printf("1 - Selador: "+ material.quantSelador()+ " Litros");
							System.out.println(" ");
							System.out.println(" ");
							System.out.printf("2 - Massa corrida: "+ material.quantMassaCor()+ " Kg");
							System.out.println(" ");
							System.out.println(" ");
							System.out.printf("3 - Tinta: "+ material.quantTinta()+ " Litros");
							System.out.println(" ");
							System.out.println(" ");
								}
						
						else {
							
							if (etapa==6) {
							System.out.print("Programa finalizado!");	
							
							}
							
							else {
								System.out.println("Etapa não encontrada!");
								System.out.println(" ");
							}
						}
					}
				}
			}
		}
			
		}while (etapa!=6);
		
		sc.close();	
}
}
