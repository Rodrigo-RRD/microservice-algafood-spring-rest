package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.v1.model.ProdutoModel;
import com.algaworks.algafood.api.v1.model.input.ProdutoInput;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@SecurityRequirement(name = "security_auth")
@Tag(name = "Restaurantes", description = "Gerencia os restaurantes")
public interface RestauranteProdutoControllerOpenApi {

	
	CollectionModel<ProdutoModel> listar(
			Long restauranteId,
			
			Boolean incluirInativos);

	
	ProdutoModel buscar(
			Long restauranteId,
			
			Long produtoId);

	ProdutoModel adicionar(
			Long restauranteId,
			
			ProdutoInput produtoInput);

	
	ProdutoModel atualizar(
			Long restauranteId,
			
			Long produtoId,
			
			ProdutoInput produtoInput);

}