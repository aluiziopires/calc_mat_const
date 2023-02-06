package application;

import java.util.Locale;
import java.util.Scanner;

import entities1.Tarefas;
import entities2.Produtividade;

public class Tarefas_e_produtividade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		String data;
		
		Tarefas tarefa = new Tarefas();
		Produtividade produtividade = new Produtividade();
		
		System.out.println("Relatório diário de tarefas e produtividade");
		System.out.println(" ");
		System.out.print("Data: ");
		data=sc.nextLine();
		System.out.print("Tarefa: ");
		tarefa.tarefa=sc.nextLine();
		System.out.print("Quantitativo da tarefa: ");
		tarefa.quantitativo=sc.nextDouble();
		System.out.print("Unidade de medida: ");
		tarefa.unidade=sc.nextLine();
		System.out.print("Quantidade de funcionários: ");
		produtividade.funcionarios=sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		produtividade.horasTrabalhadas=sc.nextDouble();
		
	sc.close();
	}
}
