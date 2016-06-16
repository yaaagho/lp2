package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comentario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String comentario;
	
	@ManyToOne
	private Usuario IdPublicacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Usuario getIdPublicacao() {
		return IdPublicacao;
	}
	public void setIdPublicacao(Usuario IdPublicacao) {
		this.IdPublicacao = IdPublicacao;
	}
	
	public String getTexto() {
		return comentario;
	}
	public void setTexto(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Publicação [id=" + id + ", comentario=" + comentario + "]";
	}
}