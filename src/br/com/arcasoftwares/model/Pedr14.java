package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the pedr14 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr14.findAll", query = "SELECT p FROM Pedr14 p")
public class Pedr14 implements Serializable {
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

	private BigDecimal bascom;

	private Integer codcli;

	private Integer codemp;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dtedev;

	@Temporal(TemporalType.DATE)
	private Date dtefat;

	@Temporal(TemporalType.DATE)
	private Date dteres;

	private String nfscli;

	private Integer nfsdev;

	private Integer nronfs;

	private Integer numres;

	private String opelib;

	private String seqarq;

	private Integer seqlib;

	private BigDecimal totcom;

	public Pedr14() {
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

	public Date getDtedev() {
		return this.dtedev;
	}

	public void setDtedev(Date dtedev) {
		this.dtedev = dtedev;
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

	public String getNfscli() {
		return this.nfscli;
	}

	public void setNfscli(String nfscli) {
		this.nfscli = nfscli;
	}

	public Integer getNfsdev() {
		return this.nfsdev;
	}

	public void setNfsdev(Integer nfsdev) {
		this.nfsdev = nfsdev;
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

	public String getOpelib() {
		return this.opelib;
	}

	public void setOpelib(String opelib) {
		this.opelib = opelib;
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

	public BigDecimal getTotcom() {
		return this.totcom;
	}

	public void setTotcom(BigDecimal totcom) {
		this.totcom = totcom;
	}

}