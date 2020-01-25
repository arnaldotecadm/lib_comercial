package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pedpr2 database table.
 * 
 */
@Embeddable
public class Pedpr2PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer codprm;

	private Integer seqpr2;

	public Pedpr2PK() {
	}
	public Integer getCodprm() {
		return this.codprm;
	}
	public void setCodprm(Integer codprm) {
		this.codprm = codprm;
	}
	public Integer getSeqpr2() {
		return this.seqpr2;
	}
	public void setSeqpr2(Integer seqpr2) {
		this.seqpr2 = seqpr2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Pedpr2PK)) {
			return false;
		}
		Pedpr2PK castOther = (Pedpr2PK)other;
		return 
			this.codprm.equals(castOther.codprm)
			&& this.seqpr2.equals(castOther.seqpr2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codprm.hashCode();
		hash = hash * prime + this.seqpr2.hashCode();
		
		return hash;
	}
}