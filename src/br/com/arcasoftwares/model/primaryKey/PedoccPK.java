package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pedocc database table.
 * 
 */
@Embeddable
public class PedoccPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer codemp;

	@Temporal(TemporalType.DATE)
	@Column(insertable=false, updatable=false)
	private java.util.Date dtecta;

	@Column(insertable=false, updatable=false)
	private Integer numcta;

	private Integer seqocc;

	public PedoccPK() {
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
	public Integer getSeqocc() {
		return this.seqocc;
	}
	public void setSeqocc(Integer seqocc) {
		this.seqocc = seqocc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PedoccPK)) {
			return false;
		}
		PedoccPK castOther = (PedoccPK)other;
		return 
			this.codemp.equals(castOther.codemp)
			&& this.dtecta.equals(castOther.dtecta)
			&& this.numcta.equals(castOther.numcta)
			&& this.seqocc.equals(castOther.seqocc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codemp.hashCode();
		hash = hash * prime + this.dtecta.hashCode();
		hash = hash * prime + this.numcta.hashCode();
		hash = hash * prime + this.seqocc.hashCode();
		
		return hash;
	}
}