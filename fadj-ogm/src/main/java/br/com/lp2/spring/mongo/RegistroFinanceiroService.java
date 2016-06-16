package br.com.lp2.spring.mongo;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import br.com.lp2.util.SpringUtil;

public class RegistroFinanceiroService {

	private RegistroFinanceiroRepository db;
	
	public RegistroFinanceiroService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(RegistroFinanceiroRepository.class);	
	}
	
    public RegistroFinanceiro findOne(String id) {
        return db.findOne(id);
    }
 
    public List<RegistroFinanceiro> findAll() {
        return db.findAll();
    }
    
	public List<RegistroFinanceiro> findByTipo(boolean a){
		return db.findByTipo(a);
	}
	
	public List<RegistroFinanceiro> findByData(Date data){
		return db.findByData(data);
	}
	
	public boolean delete(String id){
		try{
			db.delete(id);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
	public List<RegistroFinanceiro> sortByQuantidade(Sort sort) {  
		  return db.findAll(sort);
		 }

	public boolean save(RegistroFinanceiro registroFinanceiro){
		try{
			db.save(registroFinanceiro);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}