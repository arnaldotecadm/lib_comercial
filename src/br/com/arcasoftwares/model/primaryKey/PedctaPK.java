package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the pedcta database table.
 * 
 */
@Embeddable
public class PedctaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer codemp;

	@Temporal(TemporalType.DATE)
	private java.util.Date dtecta;

	private Integer numcta;

	public PedctaPK() {
	}
	public Integer getCodemp() {
		return this.codemp;
	}
	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}
	public java.util.Date getDtecta() {
		return this.dtecta;
	}
	public void setDtecta(java.util.Date dtecta) {
		this.dtecta = dtecta;
	}
	public Integer getNumcta() {
		return this.numcta;
	}
	public void setNumcta(Integer numcta) {
		this.numcta = numcta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PedctaPK)) {
			return false;
		}
		PedctaPK castOther = (PedctaPK)other;
		return 
			this.codemp.equals(castOther.codemp)
			&& this.dtecta.equals(castOther.dtecta)
			&& this.numcta.equals(castOther.numcta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codemp.hashCode();
		hash = hash * prime + this.dtecta.hashCode();
		hash = hash * prime + this.numcta.hashCode();
		
		return hash;
	}
}