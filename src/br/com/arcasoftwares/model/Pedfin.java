package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.arcasoftwares.model.primaryKey.PedfinPK;

/**
 * The persistent class for the pedfin database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedfin.findAll", query = "SELECT p FROM Pedfin p")
public class Pedfin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedfinPK id;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dtefin;

	private String hrefin;

	private String obsfin;

	// bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "codemp", referencedColumnName = "codemp", insertable = false, updatable = false),
			@JoinColumn(name = "dteres", referencedColumnName = "dteres", insertable = false, updatable = false),
			@JoinColumn(name = "numres", referencedColumnName = "numres", insertable = false, updatable = false) })
	private Pedres pedre;

	public Pedfin() {
	}

	public PedfinPK getId() {
		return this.id;
	}

	public void setId(PedfinPK id) {
		this.id = id;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDtefin() {
		return this.dtefin;
	}

	public void setDtefin(Date dtefin) {
		this.dtefin = dtefin;
	}

	public String getHrefin() {
		return this.hrefin;
	}

	public void setHrefin(String hrefin) {
		this.hrefin = hrefin;
	}

	public String getObsfin() {
		return this.obsfin;
	}

	public void setObsfin(String obsfin) {
		this.obsfin = obsfin;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}

}