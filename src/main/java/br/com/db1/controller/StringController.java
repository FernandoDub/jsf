package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StringController {
	
	private String texto;
	private String minusculo;
	private String maiusculo;

	public String getMinusculo() {
		return minusculo;
	}

	public void setMinusculo(String minusculo) {
		this.minusculo = minusculo;
	}

	public String getMaiusculo() {
		return maiusculo;
	}

	public void setMaiusculo(String maiusculo) {
		this.maiusculo = maiusculo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void letraMinuscula() {
		minusculo = texto.toLowerCase();
	}

	public void letraMaiuscula() {
		maiusculo = texto.toUpperCase();
	}
	
	public void exibirMinusculo() {
		setMinusculo(minusculo);
	}
	
	public void exibirMaiusculo() {
		setMaiusculo(maiusculo);
	}
}
