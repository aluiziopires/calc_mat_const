package entities1;

public class Tarefas {

	public String tarefa, unidade;
	public Double quantitativoprog, quantitativoexec;
	public Double funcionarios, horasTrabalhadas;
	
	public double percentualexec() {
		return (quantitativoexec/quantitativoprog)*100;
		
			}
	
	public double totalhoras() {
		return horasTrabalhadas*funcionarios;
	
				}
	
	public double produtividadefuncionario() {
		return quantitativoexec/funcionarios ;
	
				}
	
	public double produtividadehora() {
		return quantitativoexec/(horasTrabalhadas*funcionarios) ;
	
		
		
	}
	
}
