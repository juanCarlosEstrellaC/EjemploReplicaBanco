package com.example.demo.bancou.repository;

import java.util.List;

import com.example.demo.bancou.modelo.Transferencia;

public interface ITransferenciaRepository {

	//CRUD sin implementar ********** SI NO ES CON INTEGER, CON STRING
	public Transferencia buscar(String id);					// buscar por id
	public void borrar(String id);								// borrar por id
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	
	public List<Transferencia> buscarTodo();
	
}
