package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Publicacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texto;
	private String pagina;
	
	@ManyToOne
	private Usuario IdUsuario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Usuario getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Usuario IdUsuario) {
		this.IdUsuario = IdUsuario;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	@Override
	public String toString() {
		return "Publicação [id=" + id + ", texto=" + texto + ", pagina=" + pagina + "]";
	}
}