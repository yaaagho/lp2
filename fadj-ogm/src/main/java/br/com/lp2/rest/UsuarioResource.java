package br.com.lp2.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.lp2.spring.mongo.Usuario;
import br.com.lp2.spring.mongo.UsuarioService;
import br.com.lp2.spring.mongo.Response;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class UsuarioResource {

	UsuarioService service = new UsuarioService();
	
	@GET
	public List<Usuario> getAll() {
		return service.findAll();
	}
	
	@GET
	@Path("{id}")
	public Usuario getOne(@PathParam("id") String id) {
		return service.findOne(id);
	}
	
	@GET
	@Path("/tipo/{tipo}")
	public List<Usuario> getByTipo(@PathParam("tipo") boolean tipo) {
		return service.findByTipo(tipo);
	}
	
	@GET
	@Path("/nome/{nome}")
	public List<Usuario> getByNome(@PathParam("nome") String nome) {
		return service.findByNome(nome);
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") String id){
		service.delete(id);
		return Response.Ok("Usuario deletado com sucesso.");
	}
	
	@POST
	public Response save(Usuario a){
		service.save(a);
		return Response.Ok("Usuario salvo com sucesso.");
	}
	
	@PUT
	public Response put(Usuario a) {
		service.save(a);
		return Response.Ok("Usuario atualizado com sucesso.");
	}

}