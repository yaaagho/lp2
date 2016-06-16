package br.com.lp2.spring.mongo;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;


@Component
public interface EventoRepository extends MongoRepository<Evento, String>{
	
	List<Evento> findByTipo(int tipo);
	List<Evento> findByData(Date data);
	List<Evento> findByNome(String nome);
	
}

