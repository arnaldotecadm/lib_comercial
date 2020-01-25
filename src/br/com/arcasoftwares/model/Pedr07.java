package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedr07 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr07.findAll", query = "SELECT p FROM Pedr07 p")
public class Pedr07 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String apeven;

	private Integer codven;

	private BigDecimal markup;

	private BigDecimal prtped;

	private BigDecimal prttot;

	private Integer qtdfat;

	private Integer qtdped;

	private String seqarq;

	private BigDecimal totcst;

	private BigDecimal totfat;

	private BigDecimal totped;

	public Pedr07() {
	}

	public String getApeven() {
		return this.apeven;
	}

	public void setApeven(String apeven) {
		this.apeven = apeven;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public BigDecimal getMarkup() {
		return this.markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}

	public BigDecimal getPrtped() {
		return this.prtped;
	}

	public void setPrtped(BigDecimal prtped) {
		this.prtped = prtped;
	}

	public BigDecimal getPrttot() {
		return this.prttot;
	}

	public void setPrttot(BigDecimal prttot) {
		this.prttot = prttot;
	}

	public Integer getQtdfat() {
		return this.qtdfat;
	}

	public void setQtdfat(Integer qtdfat) {
		this.qtdfat = qtdfat;
	}

	public Integer getQtdped() {
		return this.qtdped;
	}

	public void setQtdped(Integer qtdped) {
		this.qtdped = qtdped;
	}

	public String getSeqarq() {
		return this.seqarq;
	}

	public void setSeqarq(String seqarq) {
		this.seqarq = seqarq;
	}

	public BigDecimal getTotcst() {
		return this.totcst;
	}

	public void setTotcst(BigDecimal totcst) {
		this.totcst = totcst;
	}

	public BigDecimal getTotfat() {
		return this.totfat;
	}

	public void setTotfat(BigDecimal totfat) {
		this.totfat = totfat;
	}

	public BigDecimal getTotped() {
		return this.totped;
	}

	public void setTotped(BigDecimal totped) {
		this.totped = totped;
	}

}