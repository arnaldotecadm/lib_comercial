package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pedlb2 database table.
 * 
 */
@Embeddable
public class Pedlb2PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer codemp;

	@Temporal(TemporalType.DATE)
	private java.util.Date dteres;

	private Integer numres;

	private Integer seqlib;

	private Integer seqlb2;

	public Pedlb2PK() {
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
	public Integer getSeqlib() {
		return this.seqlib;
	}
	public void setSeqlib(Integer seqlib) {
		this.seqlib = seqlib;
	}
	public Integer getSeqlb2() {
		return this.seqlb2;
	}
	public void setSeqlb2(Integer seqlb2) {
		this.seqlb2 = seqlb2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Pedlb2PK)) {
			return false;
		}
		Pedlb2PK castOther = (Pedlb2PK)other;
		return 
			this.codemp.equals(castOther.codemp)
			&& this.dteres.equals(castOther.dteres)
			&& this.numres.equals(castOther.numres)
			&& this.seqlib.equals(castOther.seqlib)
			&& this.seqlb2.equals(castOther.seqlb2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codemp.hashCode();
		hash = hash * prime + this.dteres.hashCode();
		hash = hash * prime + this.numres.hashCode();
		hash = hash * prime + this.seqlib.hashCode();
		hash = hash * prime + this.seqlb2.hashCode();
		
		return hash;
	}
}