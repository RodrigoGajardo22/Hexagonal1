package hex.domain.portsin;

import hex.domain.model.ErrorDeDatos;

//Puente que conecta con la UI

public interface Usuarios {

	public void nuevoRegistro(String nombre, String tel, String region) throws ErrorDeDatos;

}
