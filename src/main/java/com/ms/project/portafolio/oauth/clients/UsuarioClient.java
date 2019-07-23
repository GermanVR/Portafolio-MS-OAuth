package com.ms.project.portafolio.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ms.project.portafolio.app.usuarios.commons.models.entity.Usuario;

/**
 * @author German Vazquez Renteria
 * Date:  19 jul. 2019
 * Package Name: com.ms.project.portafolio.oauth.clients
 * Project Name: ms-oauth
 */
@FeignClient(name = "ms-usuarios")
public interface UsuarioClient {

	@GetMapping("/usuarios/search/buscar-username")
	public Usuario findByUsername(@RequestParam String username);
}
