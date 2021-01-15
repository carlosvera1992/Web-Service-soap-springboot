package com.cvera.spring.soap.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cvera.spring.soap.api.models.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("select u from Usuario u where u.tipoDocumento = ?1 and u.numeroDocumento = ?2")
	public Usuario consultarUsuario (String tipoDocumento, int numeroDocumento);
}
