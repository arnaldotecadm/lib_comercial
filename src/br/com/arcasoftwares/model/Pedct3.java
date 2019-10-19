package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import br.com.arcasoftwares.model.primaryKey.Pedct3PK;


/**
 * The persistent class for the pedct3 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedct3.findAll", query="SELECT p FROM Pedct3 p")
public class Pedct3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedct3PK id;

	private String flgapr;

	private String flgatu;

	private Integer nroct3;

	private Integer pract3;

	private BigDecimal vlpct3;

	public Pedct3() {
	}

	public Pedct3PK getId() {
		return this.id;
	}

	public void setId(Pedct3PK id) {
		this.id = id;
	}

	public String getFlgapr() {
		return this.flgapr;
	}

	public void setFlgapr(String flgapr) {
		this.flgapr = flgapr;
	}

	public String getFlgatu() {
		return this.flgatu;
	}

	public void setFlgatu(String flgatu) {
		this.flgatu = flgatu;
	}

	public Integer getNroct3() {
		return this.nroct3;
	}

	public void setNroct3(Integer nroct3) {
		this.nroct3 = nroct3;
	}

	public Integer getPract3() {
		return this.pract3;
	}

	public void setPract3(Integer pract3) {
		this.pract3 = pract3;
	}

	public BigDecimal getVlpct3() {
		return this.vlpct3;
	}

	public void setVlpct3(BigDecimal vlpct3) {
		this.vlpct3 = vlpct3;
	}

}