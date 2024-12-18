package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.v1.model.GrupoModel;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@SecurityRequirement(name = "security_auth")
@Tag(name = "Usuarios", description = "Gerencia os usuarios")
public interface UsuarioGrupoControllerOpenApi {

	CollectionModel<GrupoModel> listar(
			Long usuarioId);

	ResponseEntity<Void> desassociar(
			Long usuarioId,

			Long grupoId);

	ResponseEntity<Void> associar(
			Long usuarioId,

			Long grupoId);

}