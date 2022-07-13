package aula_5;

public class Aplicacao{

	public static void main(String[] args) {

		CalculadoraEletronica calc = new CalculadoraEletronica(new Calculadora());
		calc.defineOperando(5.5)
			.defineOperacao(TipoOperacao.SUBTRACAO)
			.executaOperacao(2)
			.defineOperacao(TipoOperacao.SOMA)
			.executaOperacao(10.3456)
			.defineOperando(20)
			.defineOperacao(TipoOperacao.DIVISAO)
			.executaOperacao(10)
			.defineOperacao(TipoOperacao.MULTIPLICACAO)
			.executaOperacao(3)
			.fim();
	}
}	
