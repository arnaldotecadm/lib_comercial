package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedr18 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr18.findAll", query = "SELECT p FROM Pedr18 p")
public class Pedr18 implements Serializable {
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

	private Integer codmrc;

	private BigDecimal cstfat;

	private BigDecimal cstpfi;

	private BigDecimal cstprt;

	private BigDecimal cstvme;

	private BigDecimal difdsc;

	private BigDecimal dscper;

	private BigDecimal dscprt;

	private BigDecimal lucrol;

	private BigDecimal lucrop;

	private BigDecimal marped;

	private BigDecimal marpre;

	private String nommrc;

	private BigDecimal prtcst;

	private BigDecimal prtfat;

	private String seqarq;

	private BigDecimal totbrt;

	private BigDecimal totfat;

	private BigDecimal totliq;

	private BigDecimal totnat;

	private BigDecimal totper;

	public Pedr18() {
	}

	public Integer getCodmrc() {
		return this.codmrc;
	}

	public void setCodmrc(Integer codmrc) {
		this.codmrc = codmrc;
	}

	public BigDecimal getCstfat() {
		return this.cstfat;
	}

	public void setCstfat(BigDecimal cstfat) {
		this.cstfat = cstfat;
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

	public String getNommrc() {
		return this.nommrc;
	}

	public void setNommrc(String nommrc) {
		this.nommrc = nommrc;
	}

	public BigDecimal getPrtcst() {
		return this.prtcst;
	}

	public void setPrtcst(BigDecimal prtcst) {
		this.prtcst = prtcst;
	}

	public BigDecimal getPrtfat() {
		return this.prtfat;
	}

	public void setPrtfat(BigDecimal prtfat) {
		this.prtfat = prtfat;
	}

	public String getSeqarq() {
		return this.seqarq;
	}

	public void setSeqarq(String seqarq) {
		this.seqarq = seqarq;
	}

	public BigDecimal getTotbrt() {
		return this.totbrt;
	}

	public void setTotbrt(BigDecimal totbrt) {
		this.totbrt = totbrt;
	}

	public BigDecimal getTotfat() {
		return this.totfat;
	}

	public void setTotfat(BigDecimal totfat) {
		this.totfat = totfat;
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

}