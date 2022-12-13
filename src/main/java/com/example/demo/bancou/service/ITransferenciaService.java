package com.example.demo.bancou.service;

import java.math.BigDecimal;

import com.example.demo.bancou.modelo.Transferencia;

public interface ITransferenciaService {

	// a realizar, no le paso el objeto directamente, porque el dato viene del controller, donde usa el usuario.
	public void realizar(String origen, String destino, BigDecimal monto);

	public Transferencia buscar(String id);
	public void borrar(String id);
	public void actualizar(Transferencia trans);
	public void insertar(Transferencia trans);
	
}
