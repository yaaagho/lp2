package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PublicacaoService {

	
	private static final Object Publicacao = null;
	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Publicacao> getPublicacao() {
		try {
			
			List<Publicacao> Publicacao = (List<Publicacao>) db.findAll();
					
			return Publicacao;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Publicacao>();

		}
	}
	
	public List<Publicacao> getByPagina(String a){
		return db.findByPagina(a);
	}
	
	public List<Publicacao> getByTexto(String a){
		return db.findByTexto(a);
	}

	public Publicacao getPublicacao(Long id) {
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

	public boolean save(Publicacao publicacao) {
		try {
			
				db.save(publicacao);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
