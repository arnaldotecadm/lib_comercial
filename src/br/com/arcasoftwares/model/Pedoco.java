
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

import br.com.arcasoftwares.model.primaryKey.PedocoPK;

/**
 * The persistent class for the pedoco database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedoco.findAll", query = "SELECT p FROM Pedoco p")
public class Pedoco implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedocoPK id;

	@Temporal(TemporalType.DATE)
	private Date dteope;

	private String nomoco;

	private Integer nrore2;

	private String tipoco;

	// bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "codemp", referencedColumnName = "codemp", insertable = false, updatable = false),
			@JoinColumn(name = "dteres", referencedColumnName = "dteres", insertable = false, updatable = false),
			@JoinColumn(name = "numres", referencedColumnName = "numres", insertable = false, updatable = false) })
	private Pedres pedre;

	public Pedoco() {
	}

	public PedocoPK getId() {
		return this.id;
	}

	public void setId(PedocoPK id) {
		this.id = id;
	}

	public Date getDteope() {
		return this.dteope;
	}

	public void setDteope(Date dteope) {
		this.dteope = dteope;
	}

	public String getNomoco() {
		return this.nomoco;
	}

	public void setNomoco(String nomoco) {
		this.nomoco = nomoco;
	}

	public Integer getNrore2() {
		return this.nrore2;
	}

	public void setNrore2(Integer nrore2) {
		this.nrore2 = nrore2;
	}

	public String getTipoco() {
		return this.tipoco;
	}

	public void setTipoco(String tipoco) {
		this.tipoco = tipoco;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}

}