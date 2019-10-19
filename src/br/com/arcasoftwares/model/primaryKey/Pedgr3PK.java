package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pedgr3 database table.
 * 
 */
@Embeddable
public class Pedgr3PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer codemp;

	@Temporal(TemporalType.DATE)
	private java.util.Date dteger;

	private Integer numger;

	private Integer seqgr2;

	private Integer seqgr3;

	public Pedgr3PK() {
	}
	public Integer getCodemp() {
		return this.codemp;
	}
	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}
	public java.util.Date getDteger() {
		return this.dteger;
	}
	public void setDteger(java.util.Date dteger) {
		this.dteger = dteger;
	}
	public Integer getNumger() {
		return this.numger;
	}
	public void setNumger(Integer numger) {
		this.numger = numger;
	}
	public Integer getSeqgr2() {
		return this.seqgr2;
	}
	public void setSeqgr2(Integer seqgr2) {
		this.seqgr2 = seqgr2;
	}
	public Integer getSeqgr3() {
		return this.seqgr3;
	}
	public void setSeqgr3(Integer seqgr3) {
		this.seqgr3 = seqgr3;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Pedgr3PK)) {
			return false;
		}
		Pedgr3PK castOther = (Pedgr3PK)other;
		return 
			this.codemp.equals(castOther.codemp)
			&& this.dteger.equals(castOther.dteger)
			&& this.numger.equals(castOther.numger)
			&& this.seqgr2.equals(castOther.seqgr2)
			&& this.seqgr3.equals(castOther.seqgr3);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codemp.hashCode();
		hash = hash * prime + this.dteger.hashCode();
		hash = hash * prime + this.numger.hashCode();
		hash = hash * prime + this.seqgr2.hashCode();
		hash = hash * prime + this.seqgr3.hashCode();
		
		return hash;
	}
}