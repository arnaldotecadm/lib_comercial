package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.Pedgr3PK;


/**
 * The persistent class for the pedgr3 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedgr3.findAll", query="SELECT p FROM Pedgr3 p")
public class Pedgr3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedgr3PK id;

	@Temporal(TemporalType.DATE)
	private Date dteres;

	private Integer empres;

	private Integer nrogr3;

	private Integer numres;

	private BigDecimal qtpre2;

	private BigDecimal qtsre2;

	private Integer seqre2;

	public Pedgr3() {
	}

	public Pedgr3PK getId() {
		return this.id;
	}

	public void setId(Pedgr3PK id) {
		this.id = id;
	}

	public Date getDteres() {
		return this.dteres;
	}

	public void setDteres(Date dteres) {
		this.dteres = dteres;
	}

	public Integer getEmpres() {
		return this.empres;
	}

	public void setEmpres(Integer empres) {
		this.empres = empres;
	}

	public Integer getNrogr3() {
		return this.nrogr3;
	}

	public void setNrogr3(Integer nrogr3) {
		this.nrogr3 = nrogr3;
	}

	public Integer getNumres() {
		return this.numres;
	}

	public void setNumres(Integer numres) {
		this.numres = numres;
	}

	public BigDecimal getQtpre2() {
		return this.qtpre2;
	}

	public void setQtpre2(BigDecimal qtpre2) {
		this.qtpre2 = qtpre2;
	}

	public BigDecimal getQtsre2() {
		return this.qtsre2;
	}

	public void setQtsre2(BigDecimal qtsre2) {
		this.qtsre2 = qtsre2;
	}

	public Integer getSeqre2() {
		return this.seqre2;
	}

	public void setSeqre2(Integer seqre2) {
		this.seqre2 = seqre2;
	}

}