package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EstadosController {
	
	private Uf uf;
	
	public Uf[] getListaUf() {
		return uf.values();
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}
	
}
