package br.com.herbertrausch.domain;
import br.com.herbertrausch.domain.Cliente;
import br.com.herbertrausch.domain.ClienteRepositoryCustom;


public class ClienteRepositoryImpl implements ClienteRepositoryCustom {
	
	
	/**
	 * Implementa��o espec�fica que desejar do m�todo definido no Repository
	 */
	public Cliente findClientePeloNome(String nome) {

		Cliente c = new Cliente();
		return c;
	}

}


