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

import br.com.arcasoftwares.model.primaryKey.PedcomPK;

/**
 * The persistent class for the pedcom database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedcom.findAll", query = "SELECT p FROM Pedcom p")
public class Pedcom implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedcomPK id;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dtecom;

	private String hrecom;

	private String obscom;

	// bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "codemp", referencedColumnName = "codemp", insertable = false, updatable = false),
			@JoinColumn(name = "dteres", referencedColumnName = "dteres", insertable = false, updatable = false),
			@JoinColumn(name = "numres", referencedColumnName = "numres", insertable = false, updatable = false) })
	private Pedres pedre;

	public Pedcom() {
	}

	public PedcomPK getId() {
		return this.id;
	}

	public void setId(PedcomPK id) {
		this.id = id;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDtecom() {
		return this.dtecom;
	}

	public void setDtecom(Date dtecom) {
		this.dtecom = dtecom;
	}

	public String getHrecom() {
		return this.hrecom;
	}

	public void setHrecom(String hrecom) {
		this.hrecom = hrecom;
	}

	public String getObscom() {
		return this.obscom;
	}

	public void setObscom(String obscom) {
		this.obscom = obscom;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}

}