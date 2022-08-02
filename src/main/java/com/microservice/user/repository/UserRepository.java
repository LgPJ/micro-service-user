package com.microservice.user.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.microservice.commons.user.entity.Users;

/*Este endPoint, exporta la direccion donde se va a utilizar los metodos rest*/
@RepositoryRestResource(path="user")
public interface UserRepository extends PagingAndSortingRepository<Users, Long>{

	/*Para la sobreescritura de los metodos a la hora de ser utilizados dentro de los path del tipo Rest
	 * los endpoint rest, usando dependencia data-rest, se acceden de la siguiente forma
	 * localhost:8090/api/service-user/user/search/{Nombre del path resource}find-user?{parametro}userName={valor}andres
	 * 
	 * */
	@RestResource(path = "find-user")
	public Users findByUserName(String userName);
	
}
