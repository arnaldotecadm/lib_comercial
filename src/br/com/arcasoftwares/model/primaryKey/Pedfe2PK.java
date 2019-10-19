package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pedfe2 database table.
 * 
 */
@Embeddable
public class Pedfe2PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String seqarq;

	private Integer seqfec;

	private Integer seqfe2;

	public Pedfe2PK() {
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
	public Integer getSeqfe2() {
		return this.seqfe2;
	}
	public void setSeqfe2(Integer seqfe2) {
		this.seqfe2 = seqfe2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Pedfe2PK)) {
			return false;
		}
		Pedfe2PK castOther = (Pedfe2PK)other;
		return 
			this.seqarq.equals(castOther.seqarq)
			&& this.seqfec.equals(castOther.seqfec)
			&& this.seqfe2.equals(castOther.seqfe2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.seqarq.hashCode();
		hash = hash * prime + this.seqfec.hashCode();
		hash = hash * prime + this.seqfe2.hashCode();
		
		return hash;
	}
}