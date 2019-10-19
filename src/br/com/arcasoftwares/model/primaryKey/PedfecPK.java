package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pedfec database table.
 * 
 */
@Embeddable
public class PedfecPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String seqarq;

	private Integer seqfec;

	public PedfecPK() {
	}
	public String getSeqarq() {
		return this.seqarq;
	}
	public void setSeqarq(String seqarq) {
		this.seqarq = seqarq;
	}
	public Integer getSeqfec() {
		return this.seqfec;
	}
	public void setSeqfec(Integer seqfec) {
		this.seqfec = seqfec;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PedfecPK)) {
			return false;
		}
		PedfecPK castOther = (PedfecPK)other;
		return 
			this.seqarq.equals(castOther.seqarq)
			&& this.seqfec.equals(castOther.seqfec);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.seqarq.hashCode();
		hash = hash * prime + this.seqfec.hashCode();
		
		return hash;
	}
}