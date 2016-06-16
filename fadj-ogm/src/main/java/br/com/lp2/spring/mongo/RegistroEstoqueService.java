package br.com.lp2.spring.mongo;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import br.com.lp2.util.SpringUtil;

public class RegistroEstoqueService {

	private RegistroEstoqueRepository db;
	
	public RegistroEstoqueService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(RegistroEstoqueRepository.class);	
	}
	
    public RegistroEstoque findOne(String id) {
        return db.findOne(id);
    }
 
    public List<RegistroEstoque> findAll() {
        return db.findAll();
    }
    
	public List<RegistroEstoque> findByTipo(boolean a){
		return db.findByTipo(a);
	}
	
	public List<RegistroEstoque> findByData(Date data){
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
	
	public List<RegistroEstoque> sortByQuantidade(Sort sort) {  
		  return db.findAll(sort);
		 }

	public boolean save(RegistroEstoque registroEstoque){
		try{
			db.save(registroEstoque);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}