package com.daniel.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("99999999999999");
		cliente1.setEmail("joãonectar@gmail.com");
		
		var cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Aline");
		cliente2.setTelefone("777777777777777");
		cliente2.setEmail("alinetop@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
		
	}
}