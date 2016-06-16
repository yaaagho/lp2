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

import br.com.lp2.spring.mongo.RegistroFinanceiro;
import br.com.lp2.spring.mongo.RegistroFinanceiroService;
import br.com.lp2.spring.mongo.Response;

@Path("/registroFinanceiro")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class RegistroFinanceiroResource {

	RegistroFinanceiroService service = new RegistroFinanceiroService();
	
	@GET
	public List<RegistroFinanceiro> getAll() {
		return service.findAll();
	}
	
	@GET
	@Path("{id}")
	public RegistroFinanceiro getOne(@PathParam("id") String id) {
		return service.findOne(id);
	}
	
	@GET
	@Path("/tipo/{tipo}")
	public List<RegistroFinanceiro> getByTipo(@PathParam("tipo") boolean tipo) {
		return service.findByTipo(tipo);
	}
	
	@GET
	@Path("/data/{data}")
	public List<RegistroFinanceiro> getByData(@PathParam("data") Date data) {
		return service.findByData(data);
	}

	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") String id){
		service.delete(id);
		return Response.Ok("RegistroFinanceiro deletado com sucesso.");
	}
	
	@POST
	public Response save(RegistroFinanceiro a){
		service.save(a);
		return Response.Ok("RegistroFinanceiro salvo com sucesso.");
	}
	
	@PUT
	public Response put(RegistroFinanceiro a) {
		service.save(a);
		return Response.Ok("RegistroFinanceiro atualizado com sucesso.");
	}

}