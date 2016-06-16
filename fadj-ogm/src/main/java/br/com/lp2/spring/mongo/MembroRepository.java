package br.com.lp2.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface MembroRepository extends MongoRepository<Membro, String>{
	
	List<Membro> findByTipo(boolean tipo);
	List<Membro> findByNome(String nome);
}

