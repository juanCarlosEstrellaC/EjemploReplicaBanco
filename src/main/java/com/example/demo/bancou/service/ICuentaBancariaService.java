package com.example.demo.bancou.service;

import java.math.BigDecimal;

import com.example.demo.bancou.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	// ICuentaBancariaService No tiene mas funcionalidad q ser un bypass para el repository [c]
	public CuentaBancaria buscar(String id);
	public void borrar(String id);
	public void actualizar(CuentaBancaria cuenta);
	public void insertar(CuentaBancaria cuenta);
}
