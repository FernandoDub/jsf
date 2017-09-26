package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraController {
	
    private Integer resultado;
    private Integer valor1;
    private Integer valor2;
    private Double exercicio6;
    private Double exercicio6Formatado;
    
    public void formatar() {
    	exercicio6Formatado = exercicio6;
    }
    
	public Double getExercicio6() {
		return exercicio6;
	}

	public void setExercicio6(Double exercicio6) {
		this.exercicio6 = exercicio6;
	}

	public Double getExercicio6Formatado() {
		return exercicio6Formatado;
	}

	public void setExercicio6Formatado(Double exercicio6Formatado) {
		this.exercicio6Formatado = exercicio6Formatado;
	}

	public Integer getResultado() {
		return resultado;
	}
	
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	
	public void somar() {
		resultado = valor1 + valor2;
	}
	
	public void subtrair() {
		resultado = valor1 - valor2;
	}
	
	public void dividir() {
		resultado = valor1 / valor2;
	}
	
	public void multiplicar() {
		resultado = valor1 * valor2;
	}
	
	public void exibirResultado() {
		setResultado(resultado);
	}

}
