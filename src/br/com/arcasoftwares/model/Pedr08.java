package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedr08 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr08.findAll", query = "SELECT p FROM Pedr08 p")
public class Pedr08 implements Serializable {
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

	private Integer codemp;

	private String codgru;

	private String codpro;

	private String codsub;

	private String dscpro;

	private BigDecimal qtdped;

	private BigDecimal qtdpro;

	private String seqarq;

	private BigDecimal sldpro;

	public Pedr08() {
	}

	public String getCodclp() {
		return this.codclp;
	}

	public void setCodclp(String codclp) {
		this.codclp = codclp;
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
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

	public String getDscpro() {
		return this.dscpro;
	}

	public void setDscpro(String dscpro) {
		this.dscpro = dscpro;
	}

	public BigDecimal getQtdped() {
		return this.qtdped;
	}

	public void setQtdped(BigDecimal qtdped) {
		this.qtdped = qtdped;
	}

	public BigDecimal getQtdpro() {
		return this.qtdpro;
	}

	public void setQtdpro(BigDecimal qtdpro) {
		this.qtdpro = qtdpro;
	}

	public String getSeqarq() {
		return this.seqarq;
	}

	public void setSeqarq(String seqarq) {
		this.seqarq = seqarq;
	}

	public BigDecimal getSldpro() {
		return this.sldpro;
	}

	public void setSldpro(BigDecimal sldpro) {
		this.sldpro = sldpro;
	}

}