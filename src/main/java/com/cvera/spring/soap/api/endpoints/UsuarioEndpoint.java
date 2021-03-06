package com.cvera.spring.soap.api.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cvera.spring.soap.api.models.Usuario;
import com.cvera.spring.soap.api.services.IUsuarioService;
import com.cvera.spring.soap.api.utils.TipoDocumentoEnum;
import com.cvera.webservices.schemas.ConsultarUserRequest;
import com.cvera.webservices.schemas.ConsultarUserResponse;
import com.cvera.webservices.schemas.RegistrarUserRequest;
import com.cvera.webservices.schemas.RegistrarUserResponse;

@Endpoint
public class UsuarioEndpoint {

	@Autowired
	private IUsuarioService usuarioService;

	public String mensaje = "No fue posible registrar el usuario";
	public int codigoRespuesta = 1;

	private static final String NAMESPACE_URI = "http://www.cvera.com/webservices/schemas";

	private static final Logger log = LoggerFactory.getLogger(UsuarioEndpoint.class);

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "registrarUserRequest")
	@ResponsePayload
	public RegistrarUserResponse registrarUsuario(@RequestPayload RegistrarUserRequest request) {

		log.info("Ingresando al Endpoint registrar");
		RegistrarUserResponse registrarUserResponse = new RegistrarUserResponse();

		Usuario usuario = new Usuario();
		usuario.setNombre(request.getNombreCompleto());

		if (request.getTipoDocumento().name().equals(TipoDocumentoEnum.CC.name())) {
			usuario.setTipoDocumento(TipoDocumentoEnum.CC.name());
		} else {
			usuario.setTipoDocumento(TipoDocumentoEnum.TI.name());
		}
		usuario.setNumeroDocumento(request.getNumeroDocumento());

		Usuario usuarioInsertado = usuarioService.registrarUsuario(usuario);

		log.info(usuarioInsertado.toString());

		if (usuarioInsertado != null) {
			codigoRespuesta = 0;
			mensaje = "Usuario registrado correctamente";
		}

		registrarUserResponse.setCodigoResponse(codigoRespuesta);
		registrarUserResponse.setMensajeRespuesta(mensaje);
		log.info("Saliendo del metodo Endpoint registrar");

		return registrarUserResponse;

	}

	@SuppressWarnings("unused")
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultarUserRequest")
	@ResponsePayload
	public ConsultarUserResponse consultarUsuario(@RequestPayload ConsultarUserRequest request) {
		log.info("Ingresando al Endpoint Consultar");

		ConsultarUserResponse consultarUserResponse = new ConsultarUserResponse();

		String tipoDocumento = request.getTipoDocumento().name();
		int numeroDocumento = request.getNumeroDocumento();
		Usuario usuarioConsultado = null;

			usuarioConsultado = usuarioService.consultarUsuario(tipoDocumento, numeroDocumento);
			if (usuarioConsultado == null) {
				consultarUserResponse.setCodigoResponse(1);
				consultarUserResponse.setMensajeRespuesta("El usuario no existe en la base de datos");
				return consultarUserResponse;
			}
			consultarUserResponse.setCodigoResponse(0);
			consultarUserResponse.setMensajeRespuesta("Consulta realizada éxitosamente");
			consultarUserResponse.setNombreUser(usuarioConsultado.getNombre());

		log.info("Saliendo del metodo Endpoint Consultar");

		return consultarUserResponse;

	}

}
