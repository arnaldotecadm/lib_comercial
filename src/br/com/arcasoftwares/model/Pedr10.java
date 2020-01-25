package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedr10 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr10.findAll", query = "SELECT p FROM Pedr10 p")
public class Pedr10 implements Serializable {
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

	private Integer qtdati;

	private Integer qtdcli;

	private Integer qtdped;

	private String seqarq;

	private BigDecimal totcan;

	private BigDecimal totcfa;

	private BigDecimal totcre;

	private BigDecimal totdeb;

	private BigDecimal totdev;

	private BigDecimal totfat;

	private BigDecimal totped;

	public Pedr10() {
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

	public Integer getQtdati() {
		return this.qtdati;
	}

	public void setQtdati(Integer qtdati) {
		this.qtdati = qtdati;
	}

	public Integer getQtdcli() {
		return this.qtdcli;
	}

	public void setQtdcli(Integer qtdcli) {
		this.qtdcli = qtdcli;
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

	public BigDecimal getTotcan() {
		return this.totcan;
	}

	public void setTotcan(BigDecimal totcan) {
		this.totcan = totcan;
	}

	public BigDecimal getTotcfa() {
		return this.totcfa;
	}

	public void setTotcfa(BigDecimal totcfa) {
		this.totcfa = totcfa;
	}

	public BigDecimal getTotcre() {
		return this.totcre;
	}

	public void setTotcre(BigDecimal totcre) {
		this.totcre = totcre;
	}

	public BigDecimal getTotdeb() {
		return this.totdeb;
	}

	public void setTotdeb(BigDecimal totdeb) {
		this.totdeb = totdeb;
	}

	public BigDecimal getTotdev() {
		return this.totdev;
	}

	public void setTotdev(BigDecimal totdev) {
		this.totdev = totdev;
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