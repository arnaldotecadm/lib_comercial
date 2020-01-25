package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the pedr15 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr15.findAll", query = "SELECT p FROM Pedr15 p")
public class Pedr15 implements Serializable {
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

	private String apecli;

	private String apeven;

	private Integer codcli;

	private Integer codemp;

	private Integer codven;

	private BigDecimal cstpfi;

	private BigDecimal cstprt;

	private BigDecimal cstvme;

	private BigDecimal difdsc;

	private BigDecimal dscper;

	private BigDecimal dscprt;

	@Temporal(TemporalType.DATE)
	private Date dtefat;

	@Temporal(TemporalType.DATE)
	private Date dteres;

	private BigDecimal lucrol;

	private BigDecimal lucrop;

	private BigDecimal marped;

	private BigDecimal marpre;

	private Integer nronfs;

	private Integer numres;

	private String seqarq;

	private Integer seqlib;

	private BigDecimal totbrt;

	private BigDecimal totge2;

	private BigDecimal totipi;

	private BigDecimal totliq;

	private BigDecimal totnat;

	private BigDecimal totper;

	private BigDecimal totsub;

	private Integer totvol;

	public Pedr15() {
	}

	public String getApecli() {
		return this.apecli;
	}

	public void setApecli(String apecli) {
		this.apecli = apecli;
	}

	public String getApeven() {
		return this.apeven;
	}

	public void setApeven(String apeven) {
		this.apeven = apeven;
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

	public BigDecimal getCstpfi() {
		return this.cstpfi;
	}

	public void setCstpfi(BigDecimal cstpfi) {
		this.cstpfi = cstpfi;
	}

	public BigDecimal getCstprt() {
		return this.cstprt;
	}

	public void setCstprt(BigDecimal cstprt) {
		this.cstprt = cstprt;
	}

	public BigDecimal getCstvme() {
		return this.cstvme;
	}

	public void setCstvme(BigDecimal cstvme) {
		this.cstvme = cstvme;
	}

	public BigDecimal getDifdsc() {
		return this.difdsc;
	}

	public void setDifdsc(BigDecimal difdsc) {
		this.difdsc = difdsc;
	}

	public BigDecimal getDscper() {
		return this.dscper;
	}

	public void setDscper(BigDecimal dscper) {
		this.dscper = dscper;
	}

	public BigDecimal getDscprt() {
		return this.dscprt;
	}

	public void setDscprt(BigDecimal dscprt) {
		this.dscprt = dscprt;
	}

	public Date getDtefat() {
		return this.dtefat;
	}

	public void setDtefat(Date dtefat) {
		this.dtefat = dtefat;
	}

	public Date getDteres() {
		return this.dteres;
	}

	public void setDteres(Date dteres) {
		this.dteres = dteres;
	}

	public BigDecimal getLucrol() {
		return this.lucrol;
	}

	public void setLucrol(BigDecimal lucrol) {
		this.lucrol = lucrol;
	}

	public BigDecimal getLucrop() {
		return this.lucrop;
	}

	public void setLucrop(BigDecimal lucrop) {
		this.lucrop = lucrop;
	}

	public BigDecimal getMarped() {
		return this.marped;
	}

	public void setMarped(BigDecimal marped) {
		this.marped = marped;
	}

	public BigDecimal getMarpre() {
		return this.marpre;
	}

	public void setMarpre(BigDecimal marpre) {
		this.marpre = marpre;
	}

	public Integer getNronfs() {
		return this.nronfs;
	}

	public void setNronfs(Integer nronfs) {
		this.nronfs = nronfs;
	}

	public Integer getNumres() {
		return this.numres;
	}

	public void setNumres(Integer numres) {
		this.numres = numres;
	}

	public String getSeqarq() {
		return this.seqarq;
	}

	public void setSeqarq(String seqarq) {
		this.seqarq = seqarq;
	}

	public Integer getSeqlib() {
		return this.seqlib;
	}

	public void setSeqlib(Integer seqlib) {
		this.seqlib = seqlib;
	}

	public BigDecimal getTotbrt() {
		return this.totbrt;
	}

	public void setTotbrt(BigDecimal totbrt) {
		this.totbrt = totbrt;
	}

	public BigDecimal getTotge2() {
		return this.totge2;
	}

	public void setTotge2(BigDecimal totge2) {
		this.totge2 = totge2;
	}

	public BigDecimal getTotipi() {
		return this.totipi;
	}

	public void setTotipi(BigDecimal totipi) {
		this.totipi = totipi;
	}

	public BigDecimal getTotliq() {
		return this.totliq;
	}

	public void setTotliq(BigDecimal totliq) {
		this.totliq = totliq;
	}

	public BigDecimal getTotnat() {
		return this.totnat;
	}

	public void setTotnat(BigDecimal totnat) {
		this.totnat = totnat;
	}

	public BigDecimal getTotper() {
		return this.totper;
	}

	public void setTotper(BigDecimal totper) {
		this.totper = totper;
	}

	public BigDecimal getTotsub() {
		return this.totsub;
	}

	public void setTotsub(BigDecimal totsub) {
		this.totsub = totsub;
	}

	public Integer getTotvol() {
		return this.totvol;
	}

	public void setTotvol(Integer totvol) {
		this.totvol = totvol;
	}

}