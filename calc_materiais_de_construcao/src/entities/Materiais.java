package entities;

public class Materiais {

	
	public double quantExec;
	
	public double quantTijolo() {
		return quantExec*25;
	}

	public double quantCimentoAlv() {
		return quantExec*16;
	}
	public double quantAreiaAlv() {
		return quantExec*0.04;
	}
	
	public double quantCimentoContra() {
		return quantExec*5;
	}
	
	public double quantAreiaContra() {
		return quantExec*0.02;
	}
	
	public double quantCimentoReboco() {
		return quantExec*5;
	}
	
	public double quantAreiaReboco() {
		return quantExec*0.03;
	}
	
	public double quantCeramica() {
		return quantExec*1.1;
	}
	
	public double quantArgColanteSimples() {
		return quantExec*5;
	}
	
	public double quantArgColanteDupla() {
		return quantExec*10;
	}
	
	public double quantRejunte() {
		return quantExec*0.02;
	}
	
	public double quantSelador() {
		return quantExec*0.12;
	}
	
	public double quantMassaCor() {
		return quantExec*0.34;
	}
	
	public double quantTinta() {
		return quantExec*0.5;
	}
	
}
