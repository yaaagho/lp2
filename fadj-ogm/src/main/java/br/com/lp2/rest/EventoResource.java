package br.com.lp2.rest;

import java.util.Date;
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

import br.com.lp2.spring.mongo.Evento;
import br.com.lp2.spring.mongo.EventoService;
import br.com.lp2.spring.mongo.Response;

@Path("/evento")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class EventoResource {

	EventoService service = new EventoService();
	
	@GET
	public List<Evento> findAll() {
		return service.findAll();
	}
	
	@GET
	@Path("{id}")
	public Evento findOne(@PathParam("id") String id) {
		return service.findOne(id);
	}
	
	@GET
	@Path("/tipo/{tipo}")
	public List<Evento> findByTipo(@PathParam("tipo") int tipo) {
		return service.findByTipo(tipo);
	}
	
	@GET
	@Path("/data/{data}")
	public List<Evento> findByData(@PathParam("data") Date data) {
		return service.findByData(data);
	}
	
	@GET
	@Path("/nome/{nome}")
	public List<Evento> findByNome(@PathParam("nome") String nome) {
		return service.findByNome(nome);
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") String id){
		service.delete(id);
		return Response.Ok("Evento deletado com sucesso.");
	}
	
	@POST
	public Response save(Evento a){
		service.save(a);
		return Response.Ok("Evento salvo com sucesso.");
	}
	
	@PUT
	public Response put(Evento a) {
		service.save(a);
		return Response.Ok("Evento atualizado com sucesso.");
	}

}