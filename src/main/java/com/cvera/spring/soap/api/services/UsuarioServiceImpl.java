package com.cvera.spring.soap.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvera.spring.soap.api.models.Usuario;
import com.cvera.spring.soap.api.repository.IUsuarioRepository;
import com.cvera.spring.soap.api.utils.TipoDocumentoEnum;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository repository;

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		Usuario user = repository.save(usuario);
		return user;
	}

	@Override
	public Usuario consultarUsuario(String tipoDocumento, int numeroDocumento) {
		Usuario user = repository.consultarUsuario(tipoDocumento, numeroDocumento);
		return user;
	}
	
	
}
