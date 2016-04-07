package br.com.herbertrausch.rest;

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

import br.com.herbertrausch.domain.Usuario;
import br.com.herbertrausch.domain.UsuarioService;
import br.com.herbertrausch.domain.Response;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UsuarioResource {
	
	public UsuarioService usuarioService = new UsuarioService();
	

	@GET
	public List<Usuario> get() {
		List<Usuario> Usuario = usuarioService.getUsuario();
		return Usuario;
	}

	@GET
	@Path("{id}")
	public Usuario get(@PathParam("id") long id) {
		Usuario c = usuarioService.getUsuario(id);
		return c;
	}

	@GET
	@Path("/nome/{nome}")
	public List<Usuario> getByNome(@PathParam("nome") String nome) {
		List<Usuario> Usuarios = usuarioService.getByNome(nome);
		return Usuarios;
	}
	
	@GET
	@Path("/senha/{senha}")
	public List<Usuario> getBysenha(@PathParam("senha") String senha) {
		List<Usuario> Usuario = usuarioService.getBySenha(senha);
		return Usuario;
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		usuarioService.delete(id);
		return Response.Ok("Usuario deletado com sucesso");
	}

	@POST
	public Response post(Usuario c) {
		usuarioService.save(c);
		return Response.Ok("Usuario salvo com sucesso");
	}
	
	@PUT
	public Response put(Usuario c) {
		usuarioService.save(c);
		return Response.Ok("Usuario atualizado com sucesso");
	}

}
