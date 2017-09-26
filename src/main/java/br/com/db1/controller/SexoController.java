package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SexoController {
	
	private Sexo sexo;
	
	public Sexo[] getListaSexo() {
		return sexo.values();
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	

}
