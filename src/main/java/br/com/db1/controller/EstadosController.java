package br.com.db1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean
public class EstadosController {
	
	public List<SelectItem> estadosSul() {
		List<SelectItem> estados = new ArrayList<SelectItem>();
		estados.add(new SelectItem("Paraná"));
		estados.add(new SelectItem("Santa Catarina"));
		estados.add(new SelectItem("Rio Grande do Sul"));
	return estados;
	}
}
