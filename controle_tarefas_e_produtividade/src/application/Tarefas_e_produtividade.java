package application;

import java.util.Locale;
import java.util.Scanner;

import entities1.Tarefas;


public class Tarefas_e_produtividade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		String data, unidade;
		
		Tarefas tarefa = new Tarefas();
				
		System.out.println("Relatório diário de tarefas e produtividade");
		System.out.println(" ");
		System.out.print("Data: ");
		data=sc.nextLine();
		
		System.out.print("Tarefa programada: ");
		tarefa.tarefa=sc.nextLine();
		System.out.print("Unidade de medida: ");
		unidade=sc.nextLine();
		
		System.out.print("Quantitativo programado da tarefa: ");
		tarefa.quantitativoprog=sc.nextDouble();
		
		System.out.print("Quantitativo executado da tarefa: ");
		tarefa.quantitativoexec=sc.nextDouble();
				
		System.out.print("Quantidade de funcionários: ");
		tarefa.funcionarios=sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		tarefa.horasTrabalhadas=sc.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Relatório final:");
		System.out.println(" ");
		System.out.println("Tarefa executada em " +data+ ": " +tarefa.tarefa);
		System.out.printf("Quantidade programada: %.2f%n", tarefa.quantitativoprog);
		System.out.printf("Quantidade executada: %.2f%n", tarefa.quantitativoexec);
		System.out.printf("Percentual executado da tarefa programada: %.2f%n", tarefa.percentualexec());
		
		System.out.println(" ");
		
		if (tarefa.percentualexec()<100) {
			System.out.println("Atenção!!! A tarefa programada não foi completamente executada.");
		}
			else {
				System.out.println("A tarefa programada foi completamente executada.");	
		}
		
		System.out.println(" ");
		
		System.out.printf("Quantidade total de funcionários: %.2f%n", tarefa.funcionarios);
		System.out.printf("Quantidade de horas trabalhadas por funcionário: %.2f%n", tarefa.horasTrabalhadas);
		System.out.printf("Quantidade total de horas trabalhadas: %.2f%n", tarefa.totalhoras());
		System.out.printf("Produtividade média por funcionário: %.2f%n", tarefa.produtividadefuncionario());
		System.out.printf("Produtividade média por hora: %.2f%n", tarefa.produtividadehora());
		

	sc.close();
	}
}
