package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@SecurityRequirement(name = "security_auth")
@Tag(name = "FluxoPedidos", description = "Gerencia as fluxo de pedidos")
public interface FluxoPedidoControllerOpenApi {

	ResponseEntity<Void> confirmar(
	
		
			String codigoPedido);


	ResponseEntity<Void> cancelar(
		
			String codigoPedido);

	
	ResponseEntity<Void> entregar(
		
			String codigoPedido);

}