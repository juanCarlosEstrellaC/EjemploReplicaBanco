package com.example.demo.bancou.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bancou.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	private static List<CuentaBancaria> baseDatos = new ArrayList<>();
	
	
	@Override
	public CuentaBancaria buscar(String id) {
		CuentaBancaria cuenta = null;
		for(CuentaBancaria cuentaBancaria : baseDatos) {
			if (cuentaBancaria.getNumero().equals(id)) {
				cuenta = cuentaBancaria;
			}
		}
		return cuenta;
	}

	
	@Override
	public void borrar(String id) {
		baseDatos.remove(id);
	}

	
	@Override
	public void actualizar(CuentaBancaria cb) {
		CuentaBancaria cuenta = null;
		for (CuentaBancaria cuentaBancaria : baseDatos) {
			if (cuentaBancaria.getNumero().equals(cb.getNumero())) {
				cuenta = cuentaBancaria;
			}
		}
		baseDatos.remove(cuenta);
		baseDatos.add(cb);
		System.out.println("Se actualiza la cuenta bancaria "+cb.getNumero());

	}

	
	@Override
	public void insertar(CuentaBancaria cb) {
		baseDatos.add(cb);
	}
	
}


/* 
 implemento Interface
 añado anotación: @Repository
 creo una List para la DB
 No uso autowired para crear objetos de modelo
 
 */

