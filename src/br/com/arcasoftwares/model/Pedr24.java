package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the pedr24 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr24.findAll", query = "SELECT p FROM Pedr24 p")
public class Pedr24 implements Serializable {
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

	private BigDecimal bascom;

	private Integer codcli;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dpgpgc;

	@Temporal(TemporalType.DATE)
	private Date dtecre;

	@Temporal(TemporalType.DATE)
	private Date dtefat;

	@Temporal(TemporalType.DATE)
	private Date dteorc;

	@Temporal(TemporalType.DATE)
	private Date dteres;

	private Integer empfat;

	private Integer emporc;

	private Integer libfat;

	private Integer liborc;

	private BigDecimal medcom;

	private String modpfa;

	private Integer nronfs;

	private Integer numres;

	private Integer qtpcre;

	private Integer resfat;

	private Integer resorc;

	private String seqarq;

	private Integer seqfat;

	private Integer seqorc;

	private String sitfat;

	private String tipcom;

	private BigDecimal totcom;

	private BigDecimal totlib;

	public Pedr24() {
	}

	public BigDecimal getBascom() {
		return this.bascom;
	}

	public void setBascom(BigDecimal bascom) {
		this.bascom = bascom;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Date getDpgpgc() {
		return this.dpgpgc;
	}

	public void setDpgpgc(Date dpgpgc) {
		this.dpgpgc = dpgpgc;
	}

	public Date getDtecre() {
		return this.dtecre;
	}

	public void setDtecre(Date dtecre) {
		this.dtecre = dtecre;
	}

	public Date getDtefat() {
		return this.dtefat;
	}

	public void setDtefat(Date dtefat) {
		this.dtefat = dtefat;
	}

	public Date getDteorc() {
		return this.dteorc;
	}

	public void setDteorc(Date dteorc) {
		this.dteorc = dteorc;
	}

	public Date getDteres() {
		return this.dteres;
	}

	public void setDteres(Date dteres) {
		this.dteres = dteres;
	}

	public Integer getEmpfat() {
		return this.empfat;
	}

	public void setEmpfat(Integer empfat) {
		this.empfat = empfat;
	}

	public Integer getEmporc() {
		return this.emporc;
	}

	public void setEmporc(Integer emporc) {
		this.emporc = emporc;
	}

	public Integer getLibfat() {
		return this.libfat;
	}

	public void setLibfat(Integer libfat) {
		this.libfat = libfat;
	}

	public Integer getLiborc() {
		return this.liborc;
	}

	public void setLiborc(Integer liborc) {
		this.liborc = liborc;
	}

	public BigDecimal getMedcom() {
		return this.medcom;
	}

	public void setMedcom(BigDecimal medcom) {
		this.medcom = medcom;
	}

	public String getModpfa() {
		return this.modpfa;
	}

	public void setModpfa(String modpfa) {
		this.modpfa = modpfa;
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

	public Integer getQtpcre() {
		return this.qtpcre;
	}

	public void setQtpcre(Integer qtpcre) {
		this.qtpcre = qtpcre;
	}

	public Integer getResfat() {
		return this.resfat;
	}

	public void setResfat(Integer resfat) {
		this.resfat = resfat;
	}

	public Integer getResorc() {
		return this.resorc;
	}

	public void setResorc(Integer resorc) {
		this.resorc = resorc;
	}

	public String getSeqarq() {
		return this.seqarq;
	}

	public void setSeqarq(String seqarq) {
		this.seqarq = seqarq;
	}

	public Integer getSeqfat() {
		return this.seqfat;
	}

	public void setSeqfat(Integer seqfat) {
		this.seqfat = seqfat;
	}

	public Integer getSeqorc() {
		return this.seqorc;
	}

	public void setSeqorc(Integer seqorc) {
		this.seqorc = seqorc;
	}

	public String getSitfat() {
		return this.sitfat;
	}

	public void setSitfat(String sitfat) {
		this.sitfat = sitfat;
	}

	public String getTipcom() {
		return this.tipcom;
	}

	public void setTipcom(String tipcom) {
		this.tipcom = tipcom;
	}

	public BigDecimal getTotcom() {
		return this.totcom;
	}

	public void setTotcom(BigDecimal totcom) {
		this.totcom = totcom;
	}

	public BigDecimal getTotlib() {
		return this.totlib;
	}

	public void setTotlib(BigDecimal totlib) {
		this.totlib = totlib;
	}

}