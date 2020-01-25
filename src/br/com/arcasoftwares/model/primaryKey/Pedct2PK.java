package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the pedct2 database table.
 * 
 */
@Embeddable
public class Pedct2PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer codemp;

	@Temporal(TemporalType.DATE)
	@Column(insertable=false, updatable=false)
	private java.util.Date dtecta;

	@Column(insertable=false, updatable=false)
	private Integer numcta;

	private Integer seqct2;

	public Pedct2PK() {
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
	public Integer getSeqct2() {
		return this.seqct2;
	}
	public void setSeqct2(Integer seqct2) {
		this.seqct2 = seqct2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Pedct2PK)) {
			return false;
		}
		Pedct2PK castOther = (Pedct2PK)other;
		return 
			this.codemp.equals(castOther.codemp)
			&& this.dtecta.equals(castOther.dtecta)
			&& this.numcta.equals(castOther.numcta)
			&& this.seqct2.equals(castOther.seqct2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codemp.hashCode();
		hash = hash * prime + this.dtecta.hashCode();
		hash = hash * prime + this.numcta.hashCode();
		hash = hash * prime + this.seqct2.hashCode();
		
		return hash;
	}
}