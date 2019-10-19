package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pedcom database table.
 * 
 */
@Embeddable
public class PedcomPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer codemp;

	@Temporal(TemporalType.DATE)
	@Column(insertable=false, updatable=false)
	private java.util.Date dteres;

	@Column(insertable=false, updatable=false)
	private Integer numres;

	private Integer seqcom;

	public PedcomPK() {
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
	public Integer getSeqcom() {
		return this.seqcom;
	}
	public void setSeqcom(Integer seqcom) {
		this.seqcom = seqcom;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PedcomPK)) {
			return false;
		}
		PedcomPK castOther = (PedcomPK)other;
		return 
			this.codemp.equals(castOther.codemp)
			&& this.dteres.equals(castOther.dteres)
			&& this.numres.equals(castOther.numres)
			&& this.seqcom.equals(castOther.seqcom);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codemp.hashCode();
		hash = hash * prime + this.dteres.hashCode();
		hash = hash * prime + this.numres.hashCode();
		hash = hash * prime + this.seqcom.hashCode();
		
		return hash;
	}
}