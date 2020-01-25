package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedr05 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr05.findAll", query = "SELECT p FROM Pedr05 p")
public class Pedr05 implements Serializable {
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

	private Integer codcli;

	private BigDecimal markup;

	private String nomcli;

	private Integer qtdped;

	private String seqarq;

	private BigDecimal totcst;

	private BigDecimal totped;

	public Pedr05() {
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public BigDecimal getMarkup() {
		return this.markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}

	public String getNomcli() {
		return this.nomcli;
	}

	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
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

	public BigDecimal getTotped() {
		return this.totped;
	}

	public void setTotped(BigDecimal totped) {
		this.totped = totped;
	}

}