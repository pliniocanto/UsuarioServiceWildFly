package br.com.pmac.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("usuario")
public class UsuarioService {
	
	@GET
	@Path("")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Usuario> list() {
		
		List<Usuario> users = new ArrayList<Usuario>();
		
		for (int i = 0; i < 4; i++) {
			Usuario usu = new Usuario();
			usu.setId(Integer.valueOf(i));
			usu.setEmail("email" + i + "@email.com");
			usu.setNome("Usuario " + i);
			
			users.add(usu);
		}
		
		return users;
	}

	@GET
	@Path("/{id}.xml")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Usuario get(@PathParam("id") String id) {
		Usuario usuario = new Usuario();

		System.out.println("dentro!");
		
		usuario.setId(Integer.valueOf(id));
		usuario.setEmail("email" + id + "@email.com");
		usuario.setNome("Usuario " + id);

		return usuario;
	}
	
	
	@GET
	@Path("/{id}.json")
	@Produces("application/json")
	public Usuario getJSON(@PathParam("id") String id) {
		Usuario usuario = new Usuario();

		System.out.println("dentro!");
		
		usuario.setId(Integer.valueOf(id));
		usuario.setEmail("email" + id + "@email.com");
		usuario.setNome("Usuario " + id);

		return usuario;
	}
}
