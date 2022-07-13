package aula_5;

public enum TipoOperacao {
	SUBTRACAO("-"), SOMA("+"), DIVISAO("/"), MULTIPLICACAO("*");
	
	public String tipo;

	TipoOperacao(String tipo) {
    	this.tipo = tipo;
	}
}
