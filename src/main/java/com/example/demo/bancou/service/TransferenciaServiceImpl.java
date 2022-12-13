package com.example.demo.bancou.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bancou.modelo.CuentaBancaria;
import com.example.demo.bancou.modelo.Transferencia;
import com.example.demo.bancou.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Override
	public void realizar(String origen, String destino, BigDecimal monto) {

	// Pasos origen:
	// 0. Buscar el origen
		CuentaBancaria cuentaOrigen = this.bancariaService.buscar(origen);
		
	// 1. Revisar si tiene saldo el origen
		
		
		
		if (cuentaOrigen.getSaldo().compareTo(monto) == 1 || cuentaOrigen.getSaldo().compareTo(monto) == 0) {
		// 2. Aplicar operaciones para quitar saldo
			BigDecimal saldoNuevoOrigen = cuentaOrigen.getSaldo().subtract(monto);
		// 3. Actualizar saldo origen
			cuentaOrigen.setSaldo(saldoNuevoOrigen);
		// 4. Actualizar cuenta origen
			this.bancariaService.actualizar(cuentaOrigen);
		} else {
			System.out.println("no hay saldo suficiente");
		}

	// Destino:
		
		CuentaBancaria cuentadestino = this.bancariaService.buscar(destino);
		BigDecimal saldoNuevoDestino = cuentadestino.getSaldo().add(monto);
		cuentadestino.setSaldo(saldoNuevoDestino);
		this.bancariaService.actualizar(cuentadestino);
		
	// ¿Cómo dejo constancia de la transferencia?, con el objeto transferencia:
		
		//Creo el objeto,
		Transferencia t = new Transferencia();
		t.setCuentaOrigen(origen);
		t.setCuentaOrigen(destino);
		t.setFecha(LocalDateTime.now());
		t.setMonto(monto);
		t.setNumero("123");
		
		// le guardo en la DB de las transferencias
		this.transferenciaRepository.insertar(t);
		
	}

	@Override
	public Transferencia buscar(String id) {
		return this.transferenciaRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.transferenciaRepository.borrar(id);
	}

	@Override
	public void actualizar(Transferencia trans) {
		this.transferenciaRepository.actualizar(trans);
	}

	@Override
	public void insertar(Transferencia trans) {
		this.transferenciaRepository.insertar(trans);
	}

}
