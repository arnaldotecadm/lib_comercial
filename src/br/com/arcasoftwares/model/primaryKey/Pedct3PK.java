package br.com.arcasoftwares.model.primaryKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the pedct3 database table.
 * 
 */
@Embeddable
public class Pedct3PK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "id_pedct3")
	private Integer idPedct3;

	private Integer numcta;

	@Temporal(TemporalType.DATE)
	private java.util.Date dtecta;

	private Integer codemp;

	public Pedct3PK() {
	}

	public Integer getIdPedct3() {
		return this.idPedct3;
	}

	public void setIdPedct3(Integer idPedct3) {
		this.idPedct3 = idPedct3;
	}

	public Integer getNumcta() {
		return this.numcta;
	}

	public void setNumcta(Integer numcta) {
		this.numcta = numcta;
	}

	public java.util.Date getDtecta() {
		return this.dtecta;
	}

	public void setDtecta(java.util.Date dtecta) {
		this.dtecta = dtecta;
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Pedct3PK)) {
			return false;
		}
		Pedct3PK castOther = (Pedct3PK) other;
		return this.idPedct3.equals(castOther.idPedct3) && this.numcta.equals(castOther.numcta)
				&& this.dtecta.equals(castOther.dtecta) && this.codemp.equals(castOther.codemp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPedct3.hashCode();
		hash = hash * prime + this.numcta.hashCode();
		hash = hash * prime + this.dtecta.hashCode();
		hash = hash * prime + this.codemp.hashCode();

		return hash;
	}
}