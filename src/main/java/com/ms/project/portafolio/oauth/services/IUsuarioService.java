package com.ms.project.portafolio.oauth.services;

import com.ms.project.portafolio.app.usuarios.commons.models.entity.Usuario;

/**
 * @author German Vazquez Renteria
 * Date:  19 jul. 2019
 * Package Name: com.ms.project.portafolio.oauth.services
 * Project Name: ms-oauth
 */
public interface IUsuarioService {

	public Usuario findByUsername(String username);

}
