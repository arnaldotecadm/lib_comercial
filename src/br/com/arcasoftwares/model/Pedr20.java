package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the pedr20 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedr20.findAll", query = "SELECT p FROM Pedr20 p")
public class Pedr20 implements Serializable {
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

	private String clsipi;

	private Integer codcli;

	private String codclp;

	private String codgru;

	private String codpro;

	private String codsub;

	private Integer codven;

	@Temporal(TemporalType.DATE)
	private Date dteent;

	@Temporal(TemporalType.DATE)
	private Date dtefat;

	@Temporal(TemporalType.DATE)
	private Date dteres;

	@Temporal(TemporalType.DATE)
	private Date dtesda;

	private String flgtab;

	private BigDecimal icmre2;

	private String idepro;

	private BigDecimal ipire2;

	private Integer nronfs;

	private Integer numres;

	private String refpro;

	private String seqarq;

	private BigDecimal totcst;

	private BigDecimal totlb2;

	private BigDecimal totren;

	private BigDecimal ultqts;

	private BigDecimal vcslb2;

	private BigDecimal vlqlb2;

	public Pedr20() {
	}

	public String getClsipi() {
		return this.clsipi;
	}

	public void setClsipi(String clsipi) {
		this.clsipi = clsipi;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
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

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public Date getDteent() {
		return this.dteent;
	}

	public void setDteent(Date dteent) {
		this.dteent = dteent;
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

	public Date getDtesda() {
		return this.dtesda;
	}

	public void setDtesda(Date dtesda) {
		this.dtesda = dtesda;
	}

	public String getFlgtab() {
		return this.flgtab;
	}

	public void setFlgtab(String flgtab) {
		this.flgtab = flgtab;
	}

	public BigDecimal getIcmre2() {
		return this.icmre2;
	}

	public void setIcmre2(BigDecimal icmre2) {
		this.icmre2 = icmre2;
	}

	public String getIdepro() {
		return this.idepro;
	}

	public void setIdepro(String idepro) {
		this.idepro = idepro;
	}

	public BigDecimal getIpire2() {
		return this.ipire2;
	}

	public void setIpire2(BigDecimal ipire2) {
		this.ipire2 = ipire2;
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

	public String getRefpro() {
		return this.refpro;
	}

	public void setRefpro(String refpro) {
		this.refpro = refpro;
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

	public BigDecimal getTotlb2() {
		return this.totlb2;
	}

	public void setTotlb2(BigDecimal totlb2) {
		this.totlb2 = totlb2;
	}

	public BigDecimal getTotren() {
		return this.totren;
	}

	public void setTotren(BigDecimal totren) {
		this.totren = totren;
	}

	public BigDecimal getUltqts() {
		return this.ultqts;
	}

	public void setUltqts(BigDecimal ultqts) {
		this.ultqts = ultqts;
	}

	public BigDecimal getVcslb2() {
		return this.vcslb2;
	}

	public void setVcslb2(BigDecimal vcslb2) {
		this.vcslb2 = vcslb2;
	}

	public BigDecimal getVlqlb2() {
		return this.vlqlb2;
	}

	public void setVlqlb2(BigDecimal vlqlb2) {
		this.vlqlb2 = vlqlb2;
	}

}