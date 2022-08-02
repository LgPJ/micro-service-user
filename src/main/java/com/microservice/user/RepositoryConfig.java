package com.microservice.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.microservice.commons.user.entity.Role;
import com.microservice.commons.user.entity.Users;

@Configuration()
public class RepositoryConfig implements RepositoryRestConfigurer{

	/**Configuracion para exponer los id dentro del JSON*/
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Users.class, Role.class);
	}
	
	

}
