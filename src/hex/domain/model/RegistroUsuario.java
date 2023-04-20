package hex.domain.model;

import hex.domain.portsin.Usuarios;
import hex.domain.portsout.RepositorioParticipantes;

public class RegistroUsuario implements Usuarios {

	private RepositorioParticipantes repositorio;

	public RegistroUsuario(RepositorioParticipantes repositorio) {

		this.repositorio = repositorio;
	}

	@Override
	public void nuevoRegistro(String nombre, String tel, String region) throws ErrorDeDatos {

		Participante participante = new Participante(nombre, tel, region);
		repositorio.registrar(participante.datos());
	}

}
