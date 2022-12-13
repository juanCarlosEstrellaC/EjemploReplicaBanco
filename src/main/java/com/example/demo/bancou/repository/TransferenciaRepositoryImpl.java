package com.example.demo.bancou.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bancou.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	private static List<Transferencia> baseDatos = new ArrayList<>();
	
	
	@Override
	public Transferencia buscar(String id) {
		Transferencia trans = null;
		for (Transferencia transferencia : baseDatos) {
			if (transferencia.getNumero().equals(id)) {
				trans = transferencia;
			}
		}
		return trans;
	}

	
	@Override
	public void borrar(String id) {
		baseDatos.remove(id);
	}

	
	@Override
	public void actualizar(Transferencia transferencia) {
		Transferencia trans = null;
		for (Transferencia transferencia2 : baseDatos) {
			if (transferencia2.getNumero().equals(transferencia.getNumero())) {
				trans = transferencia2;
			}
		}
		baseDatos.remove(trans);
		baseDatos.add(transferencia);
		System.out.println("Se actualiza la transferencia "+transferencia.getNumero());
	}

	
	@Override
	public void insertar(Transferencia transferencia) {
		baseDatos.add(transferencia);
	}


	@Override
	public List<Transferencia> buscarTodo() {
		return baseDatos;
	}

	
	
}
