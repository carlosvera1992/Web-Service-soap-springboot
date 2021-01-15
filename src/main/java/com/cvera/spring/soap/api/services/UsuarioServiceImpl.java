package com.cvera.spring.soap.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cvera.spring.soap.api.models.Usuario;
import com.cvera.spring.soap.api.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository repository;

	@Override
	@Transactional
	public Usuario registrarUsuario(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario consultarUsuario(String tipoDocumento, int numeroDocumento) {
		return repository.consultarUsuario(tipoDocumento, numeroDocumento);
	}
	
	
}
