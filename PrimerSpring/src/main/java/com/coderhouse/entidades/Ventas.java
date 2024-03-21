package com.coderhouse.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Ventas")
public class Ventas {
	@Id
	@Column(name="Total")
	private double total;
	@Column(name="Metodo de pago")
	private String metodoDePago;
	public Ventas() {
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getMetodoDePago() {
		return metodoDePago;
	}
	public void setMetodoDePago(String metodoDePago) {
		this.metodoDePago = metodoDePago;
	}
	
	
	

}
