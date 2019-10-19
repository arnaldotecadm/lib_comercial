package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedr23 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr23.findAll", query = "SELECT p FROM Pedr23 p")
public class Pedr23 implements Serializable {
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

	private String codgru;

	private String codpro;

	private String codsub;

	private BigDecimal qtdnat;

	private String seqarq;

	private BigDecimal totnat;

	public Pedr23() {
	}

	public String getCodclp() {
		return this.codclp;
	}

	public void setCodclp(String codclp) {
		this.codclp = codclp;
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

	public BigDecimal getQtdnat() {
		return this.qtdnat;
	}

	public void setQtdnat(BigDecimal qtdnat) {
		this.qtdnat = qtdnat;
	}

	public String getSeqarq() {
		return this.seqarq;
	}

	public void setSeqarq(String seqarq) {
		this.seqarq = seqarq;
	}

	public BigDecimal getTotnat() {
		return this.totnat;
	}

	public void setTotnat(BigDecimal totnat) {
		this.totnat = totnat;
	}

}