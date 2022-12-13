package com.example.demo.bancou.repository;

import com.example.demo.bancou.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	//CRUD sin implementar
	public CuentaBancaria buscar(String id);
	public void borrar(String id);
	public void actualizar(CuentaBancaria cb);
	public void insertar(CuentaBancaria cb);

}
