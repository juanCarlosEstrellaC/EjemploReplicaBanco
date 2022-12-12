package com.example.demo.bancou.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {

	private String numero; // cuando un dato no es sujeto de operaciones matemáticas, no tiene sentido que sea Integer o Double.
	private String tipo;
	private BigDecimal saldo; // para datos monetarios
	private String titular;		
	
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular
				+ "]";
	}
	
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public BigDecimal getSaldo() {
			return saldo;
		}
		public void setSaldo(BigDecimal saldo) {
			this.saldo = saldo;
		}
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
	
	
	
	
}
