package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	
	private static final Object Usuario = null;
	private UsuarioRepository db;
	
	public UsuarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(UsuarioRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Usuario> getUsuario() {
		try {
			
			List<Usuario> Usuario = (List<Usuario>) db.findAll();
					
			return Usuario;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();

		}
	}
	
	
	public List<Usuario> getByNome(String a){
		return db.findByNome(a);
	}
	
	public List<Usuario> getBySenha(String a){
		return db.findBySenha(a);
	}

	public Usuario getUsuario(Long id) {
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

	public boolean save(Usuario usuario) {
		try {
			
				db.save(usuario);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
