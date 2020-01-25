package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the pedres database table.
 * 
 */
@Embeddable
public class PedresPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer codemp;

	@Temporal(TemporalType.DATE)
	private java.util.Date dteres;

	private Integer numres;

	public PedresPK() {
	}
	public Integer getCodemp() {
		return this.codemp;
	}
	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}
	public java.util.Date getDteres() {
		return this.dteres;
	}
	public void setDteres(java.util.Date dteres) {
		this.dteres = dteres;
	}
	public Integer getNumres() {
		return this.numres;
	}
	public void setNumres(Integer numres) {
		this.numres = numres;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PedresPK)) {
			return false;
		}
		PedresPK castOther = (PedresPK)other;
		return 
			this.codemp.equals(castOther.codemp)
			&& this.dteres.equals(castOther.dteres)
			&& this.numres.equals(castOther.numres);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codemp.hashCode();
		hash = hash * prime + this.dteres.hashCode();
		hash = hash * prime + this.numres.hashCode();
		
		return hash;
	}
}