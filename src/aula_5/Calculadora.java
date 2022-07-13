package aula_5;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculadora extends Abaco {
	
	public  Calculadora() {
		super();
	}
	
	public Calculadora defineOperando(double operando) {
		
		this.setOperando(BigDecimal.valueOf(operando));
		this.setResultado(formataValores(getOperando()));
		
		return this;
	}
	
	public Calculadora defineOperacao(TipoOperacao tipo) {
	    
		this.setOperacao(tipo);
	    this.setResultado(this.getResultado().concat(" " + tipo.tipo + " "));
	    
	    return this;
	}	
	
	public Calculadora executaOperacao(double operador) {
		
		this.setOperador(BigDecimal.valueOf(operador));
		BigDecimal resultado = new BigDecimal(0);
		
		switch(this.getOperacao().tipo) {
		
		case "+" : resultado = this.getOperando().add(this.getOperador());
					break;
		case "-" : resultado = this.getOperando().subtract(this.getOperador());
					break;
		case "*" : resultado = this.getOperando().multiply(this.getOperador());
					break;
		case "/" : resultado = this.getOperando().divide(this.getOperador());
					break;
		}
		
		this.setResultado(getResultado().concat(formataValores(this.getOperador()) + " = " + formataValores(resultado)));
		//Troca lá fora!!!
		this.setOperador(resultado);
		return this;		
	}
	
	public void fim() {
		
		System.out.println("Resultado final " + formataValores(this.getOperador()));
	}
	
	public static String formataValores(BigDecimal valor){

        Locale locale = new Locale("pt","br");
        NumberFormat format = DecimalFormat.getNumberInstance(locale);
        
        return format.format(valor.doubleValue());
    }
}
