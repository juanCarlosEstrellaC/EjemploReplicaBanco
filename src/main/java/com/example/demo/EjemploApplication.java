package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bancou.modelo.CuentaBancaria;
import com.example.demo.bancou.modelo.Transferencia;
import com.example.demo.bancou.service.ICuentaBancariaService;
import com.example.demo.bancou.service.ITransferenciaService;

@SpringBootApplication
public class EjemploApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("0001");
		cuenta1.setTipo("A");
		cuenta1.setTitular("Pepe Perez");
		cuenta1.setSaldo(new BigDecimal(100));
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("0002");
		cuenta2.setTipo("A");
		cuenta2.setTitular("Diana Teran");
		cuenta2.setSaldo(new BigDecimal(200));
		this.bancariaService.insertar(cuenta2);
		
		
		// necesito realizar una transferencia, entoces:
		this.iTransferenciaService.realizar(cuenta1.getNumero(), cuenta2.getNumero(), new BigDecimal(35));
	}

}
