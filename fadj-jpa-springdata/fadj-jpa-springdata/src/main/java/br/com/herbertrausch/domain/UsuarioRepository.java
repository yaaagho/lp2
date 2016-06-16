package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	List<Usuario> findByNome(String nome);
	List<Usuario> findBySenha(String senha);
}
