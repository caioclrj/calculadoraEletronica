package aula_5;

import java.math.BigDecimal;

public abstract class Abaco {

	private BigDecimal operando;
	private BigDecimal operador;
	private String resultado;
	private TipoOperacao operacao;

	public Abaco() {
		this.setOperacao(null);
		this.setOperando(new BigDecimal(0));
		this.setOperador(new BigDecimal(0));
		this.setResultado(" ");
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;			
	}
	
	public BigDecimal getOperando() {
		return this.operando;
	}
	
	public void setOperando(BigDecimal operando) {
		this.operando = operando;
	}

	public BigDecimal getOperador() {
		return this.operador;
	}

	public void setOperador(BigDecimal operador) {
		this.operador = operador;
	}

	public TipoOperacao getOperacao() {
		return this.operacao;
	}

	public void setOperacao(TipoOperacao operacao) {
		this.operacao = operacao;
	}		
}
