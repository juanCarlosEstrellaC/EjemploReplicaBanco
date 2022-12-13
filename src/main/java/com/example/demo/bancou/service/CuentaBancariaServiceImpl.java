package com.example.demo.bancou.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bancou.modelo.CuentaBancaria;
import com.example.demo.bancou.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;


	@Override
	public CuentaBancaria buscar(String id) {
		return this.bancariaRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.bancariaRepository.borrar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		this.bancariaRepository.actualizar(cuenta);
	}

	@Override
	public void insertar(CuentaBancaria cuenta) {
		this.bancariaRepository.insertar(cuenta);
	}

	
	
}

/*
 1. implementar interface
 2. poner anotacion @Service
 3. @Autowired
 */
 