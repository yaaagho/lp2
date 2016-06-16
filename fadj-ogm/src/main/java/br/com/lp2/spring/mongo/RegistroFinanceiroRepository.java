package br.com.lp2.spring.mongo;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface RegistroFinanceiroRepository extends MongoRepository<RegistroFinanceiro, String>{
	
	List<RegistroFinanceiro> findByTipo(boolean tipo);
	List<RegistroFinanceiro> findByData(Date data);

}

