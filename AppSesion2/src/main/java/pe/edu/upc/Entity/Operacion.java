package pe.edu.upc.Entity;

public class Operacion {

	//ATRIBUTOS
	private char operacion;
	private double numeroA;
	private double numeroB;
	
	//CONSTRUCTOR
	public Operacion(){
		super();
	}
	//METODOS GET Y SET
	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}

	public double getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(double numeroA) {
		this.numeroA = numeroA;
	}

	public double getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(double numeroB) {
		this.numeroB = numeroB;
	}
	
	//METODOS DE USUARIO: CALCULADORA
	public double Calcular(){
		try {
			switch (this.operacion) {
			case '+':
				return this.numeroA + this.numeroB;
			case '-':
				return this.numeroA - this.numeroB;
			case '*':
				return this.numeroA * this.numeroB;
			case '/':
				return this.numeroA / this.numeroB;
			default:
				return 0;
			}
		} catch (Exception e) {
				return 0;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Calculadora";
	}
}
