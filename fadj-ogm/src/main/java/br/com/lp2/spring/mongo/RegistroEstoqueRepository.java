package br.com.lp2.spring.mongo;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface RegistroEstoqueRepository extends MongoRepository<RegistroEstoque, String>{
	
	List<RegistroEstoque> findByTipo(boolean tipo);
	List<RegistroEstoque> findByData(Date data);

}

