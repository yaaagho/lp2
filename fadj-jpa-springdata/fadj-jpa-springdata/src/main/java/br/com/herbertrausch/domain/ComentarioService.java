package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class ComentarioService {

	
	private static final Object Comentario = null;
	private ComentarioRepository db;
	
	public ComentarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ComentarioRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Comentario> getComentario() {
		try {
			
			List<Comentario> Comentario = (List<Comentario>) db.findAll();
					
			return Comentario;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Comentario>();

		}
	}
	
	public List<Comentario> getByComentario(String a){
		return db.findByComentario(a);
	}

	public Comentario getComentario(Long id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public boolean delete(Long id) {
		try {
			db.delete(id);
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean save(Comentario publicacao) {
		try {
			
				db.save(publicacao);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}