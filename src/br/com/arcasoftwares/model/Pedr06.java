package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedr06 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr06.findAll", query = "SELECT p FROM Pedr06 p")
public class Pedr06 implements Serializable {
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

	private String codclp;

	private String codcor;

	private String codgru;

	private String codpro;

	private String codsub;

	private String codtam;

	private String dscpro;

	private BigDecimal markup;

	private BigDecimal qtdped;

	private Integer qtdreg;

	private String seqarq;

	private BigDecimal totcst;

	private BigDecimal totped;

	public Pedr06() {
	}

	public String getCodclp() {
		return this.codclp;
	}

	public void setCodclp(String codclp) {
		this.codclp = codclp;
	}

	public String getCodcor() {
		return this.codcor;
	}

	public void setCodcor(String codcor) {
		this.codcor = codcor;
	}

	public String getCodgru() {
		return this.codgru;
	}

	public void setCodgru(String codgru) {
		this.codgru = codgru;
	}

	public String getCodpro() {
		return this.codpro;
	}

	public void setCodpro(String codpro) {
		this.codpro = codpro;
	}

	public String getCodsub() {
		return this.codsub;
	}

	public void setCodsub(String codsub) {
		this.codsub = codsub;
	}

	public String getCodtam() {
		return this.codtam;
	}

	public void setCodtam(String codtam) {
		this.codtam = codtam;
	}

	public String getDscpro() {
		return this.dscpro;
	}

	public void setDscpro(String dscpro) {
		this.dscpro = dscpro;
	}

	public BigDecimal getMarkup() {
		return this.markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}

	public BigDecimal getQtdped() {
		return this.qtdped;
	}

	public void setQtdped(BigDecimal qtdped) {
		this.qtdped = qtdped;
	}

	public Integer getQtdreg() {
		return this.qtdreg;
	}

	public void setQtdreg(Integer qtdreg) {
		this.qtdreg = qtdreg;
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

	public BigDecimal getTotped() {
		return this.totped;
	}

	public void setTotped(BigDecimal totped) {
		this.totped = totped;
	}

}