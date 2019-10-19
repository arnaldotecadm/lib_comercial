package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.Pedfe2PK;


/**
 * The persistent class for the pedfe2 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedfe2.findAll", query="SELECT p FROM Pedfe2 p")
public class Pedfe2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedfe2PK id;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal bassub;

	private Integer codemp;

	private String codst1;

	private String codst2;

	private String cstipi;

	@Temporal(TemporalType.DATE)
	private Date dtemov;

	@Temporal(TemporalType.DATE)
	private Date dteped;

	private String flgenv;

	private String hreped;

	private BigDecimal icmfe2;

	private BigDecimal icmsub;

	private BigDecimal mrgsub;

	private Integer numped;

	private Integer qtiped;

	private String seqped;

	private BigDecimal totfe2;

	private BigDecimal totger;

	private BigDecimal toticm;

	private BigDecimal totipi;

	private BigDecimal totsub;

	private BigDecimal vlufe2;

	public Pedfe2() {
	}

	public Pedfe2PK getId() {
		return this.id;
	}

	public void setId(Pedfe2PK id) {
		this.id = id;
	}

	public BigDecimal getBasicm() {
		return this.basicm;
	}

	public void setBasicm(BigDecimal basicm) {
		this.basicm = basicm;
	}

	public BigDecimal getBasipi() {
		return this.basipi;
	}

	public void setBasipi(BigDecimal basipi) {
		this.basipi = basipi;
	}

	public BigDecimal getBassub() {
		return this.bassub;
	}

	public void setBassub(BigDecimal bassub) {
		this.bassub = bassub;
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	public String getCodst1() {
		return this.codst1;
	}

	public void setCodst1(String codst1) {
		this.codst1 = codst1;
	}

	public String getCodst2() {
		return this.codst2;
	}

	public void setCodst2(String codst2) {
		this.codst2 = codst2;
	}

	public String getCstipi() {
		return this.cstipi;
	}

	public void setCstipi(String cstipi) {
		this.cstipi = cstipi;
	}

	public Date getDtemov() {
		return this.dtemov;
	}

	public void setDtemov(Date dtemov) {
		this.dtemov = dtemov;
	}

	public Date getDteped() {
		return this.dteped;
	}

	public void setDteped(Date dteped) {
		this.dteped = dteped;
	}

	public String getFlgenv() {
		return this.flgenv;
	}

	public void setFlgenv(String flgenv) {
		this.flgenv = flgenv;
	}

	public String getHreped() {
		return this.hreped;
	}

	public void setHreped(String hreped) {
		this.hreped = hreped;
	}

	public BigDecimal getIcmfe2() {
		return this.icmfe2;
	}

	public void setIcmfe2(BigDecimal icmfe2) {
		this.icmfe2 = icmfe2;
	}

	public BigDecimal getIcmsub() {
		return this.icmsub;
	}

	public void setIcmsub(BigDecimal icmsub) {
		this.icmsub = icmsub;
	}

	public BigDecimal getMrgsub() {
		return this.mrgsub;
	}

	public void setMrgsub(BigDecimal mrgsub) {
		this.mrgsub = mrgsub;
	}

	public Integer getNumped() {
		return this.numped;
	}

	public void setNumped(Integer numped) {
		this.numped = numped;
	}

	public Integer getQtiped() {
		return this.qtiped;
	}

	public void setQtiped(Integer qtiped) {
		this.qtiped = qtiped;
	}

	public String getSeqped() {
		return this.seqped;
	}

	public void setSeqped(String seqped) {
		this.seqped = seqped;
	}

	public BigDecimal getTotfe2() {
		return this.totfe2;
	}

	public void setTotfe2(BigDecimal totfe2) {
		this.totfe2 = totfe2;
	}

	public BigDecimal getTotger() {
		return this.totger;
	}

	public void setTotger(BigDecimal totger) {
		this.totger = totger;
	}

	public BigDecimal getToticm() {
		return this.toticm;
	}

	public void setToticm(BigDecimal toticm) {
		this.toticm = toticm;
	}

	public BigDecimal getTotipi() {
		return this.totipi;
	}

	public void setTotipi(BigDecimal totipi) {
		this.totipi = totipi;
	}

	public BigDecimal getTotsub() {
		return this.totsub;
	}

	public void setTotsub(BigDecimal totsub) {
		this.totsub = totsub;
	}

	public BigDecimal getVlufe2() {
		return this.vlufe2;
	}

	public void setVlufe2(BigDecimal vlufe2) {
		this.vlufe2 = vlufe2;
	}

}