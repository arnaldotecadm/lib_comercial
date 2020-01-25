package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.PedfecPK;


/**
 * The persistent class for the pedfec database table.
 * 
 */
@Entity
@NamedQuery(name="Pedfec.findAll", query="SELECT p FROM Pedfec p")
public class Pedfec implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedfecPK id;

	private Integer codatd;

	private Integer codcli;

	private Integer codemp;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dtefin;

	@Temporal(TemporalType.DATE)
	private Date dteini;

	private String flgenv;

	private Integer qtdite;

	private Integer qtdnot;

	private Integer qtdped;

	private BigDecimal totped;

	public Pedfec() {
	}

	public PedfecPK getId() {
		return this.id;
	}

	public void setId(PedfecPK id) {
		this.id = id;
	}

	public Integer getCodatd() {
		return this.codatd;
	}

	public void setCodatd(Integer codatd) {
		this.codatd = codatd;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Date getDtefin() {
		return this.dtefin;
	}

	public void setDtefin(Date dtefin) {
		this.dtefin = dtefin;
	}

	public Date getDteini() {
		return this.dteini;
	}

	public void setDteini(Date dteini) {
		this.dteini = dteini;
	}

	public String getFlgenv() {
		return this.flgenv;
	}

	public void setFlgenv(String flgenv) {
		this.flgenv = flgenv;
	}

	public Integer getQtdite() {
		return this.qtdite;
	}

	public void setQtdite(Integer qtdite) {
		this.qtdite = qtdite;
	}

	public Integer getQtdnot() {
		return this.qtdnot;
	}

	public void setQtdnot(Integer qtdnot) {
		this.qtdnot = qtdnot;
	}

	public Integer getQtdped() {
		return this.qtdped;
	}

	public void setQtdped(Integer qtdped) {
		this.qtdped = qtdped;
	}

	public BigDecimal getTotped() {
		return this.totped;
	}

	public void setTotped(BigDecimal totped) {
		this.totped = totped;
	}

}