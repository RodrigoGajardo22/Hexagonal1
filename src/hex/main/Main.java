package hex.main;

import hex.domain.model.RegistroUsuario;
import hex.infrastructure.data.JdbcParticipantes;
import hex.infrastructure.ui.UI;

public class Main {

	public static void main(String[] args) {

		JdbcParticipantes repositorio = new JdbcParticipantes();

		UI                ui          = new UI(new RegistroUsuario(repositorio));

	}
}
