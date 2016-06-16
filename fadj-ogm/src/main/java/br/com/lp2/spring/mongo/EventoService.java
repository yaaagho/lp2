package br.com.lp2.spring.mongo;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import br.com.lp2.util.SpringUtil;

public class EventoService {

	private EventoRepository db;
	
	public EventoService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(EventoRepository.class);	
	}
	
    public Evento findOne(String id) {
        return db.findOne(id);
    }
 
    public List<Evento> findAll() {
        return db.findAll();
    }
	
	public List<Evento> findByTipo(int a){
		return db.findByTipo(a);
	}
	
	public List<Evento> findByNome(String nome){
			return db.findByNome(nome);
	}
	
	public List<Evento> findByData(Date data){
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

	public boolean save(Evento evento){
		try{
			db.save(evento);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}