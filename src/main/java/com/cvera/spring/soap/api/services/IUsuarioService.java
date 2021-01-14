package com.cvera.spring.soap.api.services;
import com.cvera.spring.soap.api.models.Usuario;
import com.cvera.spring.soap.api.utils.TipoDocumentoEnum;


public interface IUsuarioService {

	public Usuario registrarUsuario(Usuario usuario);
	public Usuario consultarUsuario(String tipoDocumento, int numeroDocumento);
}
