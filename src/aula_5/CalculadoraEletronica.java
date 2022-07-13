package aula_5;

public class CalculadoraEletronica extends Calculadora{

	Calculadora calculadora;
	
	public CalculadoraEletronica(Calculadora calc) {
		this.calculadora = calc;
	}
	
	@Override
	public Calculadora executaOperacao(double operador) {
		
		super.executaOperacao(operador);
		System.out.println(this.getResultado());
		//Troca com o de dentro
		super.defineOperando(this.getOperador().doubleValue());
		
		return this;
	}
}
