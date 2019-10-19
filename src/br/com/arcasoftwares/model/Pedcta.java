package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.PedctaPK;


/**
 * The persistent class for the pedcta database table.
 * 
 */
@Entity
@NamedQuery(name="Pedcta.findAll", query="SELECT p FROM Pedcta p")
public class Pedcta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedctaPK id;

	@Column(name="aliq_cred_sn")
	private BigDecimal aliqCredSn;

	private BigDecimal aliqcof;

	private Integer aliqpis;

	private String atuest;

	private BigDecimal bascof;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal baspis;

	private BigDecimal bassub;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String cgccli;

	private String clitab;

	private Integer codatd;

	private String codcfo;

	private Integer codcli;

	private Integer codfil;

	private Integer codgcl;

	private String codicm;

	private String codipi;

	private String codpfa;

	private Integer codregtrib;

	private Integer codtcl;

	private Integer codusu;

	private Integer codven;

	private String consum;

	private String cstcof;

	private String cstpis;

	private BigDecimal desicm;

	private BigDecimal desipi;

	private BigDecimal dessub;

	private BigDecimal dsccom;

	private BigDecimal dsccta;

	private BigDecimal dscicm;

	private BigDecimal dscipi;

	private BigDecimal dscreg;

	private BigDecimal dscsub;

	@Temporal(TemporalType.DATE)
	private Date dteres;

	@Temporal(TemporalType.DATE)
	private Date dtvsuf;

	private Integer empres;

	private String flgatu;

	private String flgavi;

	private String flgbloqatendida;

	private String flgctb;

	private String flgipi;

	private String flgoco;

	private String flgpsq;

	private String flgsld;

	private String flgtab;

	private BigDecimal frticm;

	private BigDecimal frtipi;

	private BigDecimal frtsub;

	private String hrecta;

	@Column(name="id_esticm")
	private Integer idEsticm;

	@Column(name="id_estipi")
	private Integer idEstipi;

	@Column(name="id_frete")
	private Integer idFrete;

	@Column(name="id_pedcta")
	private Integer idPedcta;

	private BigDecimal incfin;

	private BigDecimal increv;

	@Column(name="indic_cf")
	private Integer indicCf;

	@Column(name="indic_presenca")
	private Integer indicPresenca;

	private String inscli;

	private String intfin;

	private String lanest;

	private BigDecimal medacr;

	private BigDecimal meddco;

	private BigDecimal meddsc;

	private BigDecimal medprm;

	private String modpfa;

	private String nomcli;

	private String nrosuf;

	private Integer numres;

	private String obscli;

	private String obscnd;

	private String obscta;

	private String obsent;

	private String obsval;

	private Integer qtict2;

	private Integer qtict3;

	private Integer qtict4;

	private Integer qticta;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private Integer regtrb;

	private Integer regtrbemp;

	private BigDecimal segicm;

	private BigDecimal segipi;

	private BigDecimal segsub;

	private Integer seqct3;

	private String seqcta;

	private Integer seqite;

	private String sitcta;

	@Column(name="sufr_cofins")
	private String sufrCofins;

	@Column(name="sufr_icms")
	private String sufrIcms;

	@Column(name="sufr_ipi")
	private String sufrIpi;

	@Column(name="sufr_pis")
	private String sufrPis;

	private String tipicm;

	private String tipipi;

	private String tippfa;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcof;

	private BigDecimal totcst;

	private BigDecimal totdco;

	private BigDecimal totdescinc;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totfrt;

	private BigDecimal totger;

	private BigDecimal toticm;

	private BigDecimal totipc;

	private BigDecimal totipi;

	private BigDecimal totite;

	private BigDecimal totitetrb;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totpis;

	private BigDecimal totren;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private String trbcof;

	private String trbicm;

	private String trbipi;

	private String trbpis;

	private String txficm;

	private String txfipi;

	private String ufecta;

	//bi-directional many-to-one association to Pedct2
	@OneToMany(mappedBy="pedcta")
	private List<Pedct2> pedct2s;

	//bi-directional many-to-one association to Pedocc
	@OneToMany(mappedBy="pedcta")
	private List<Pedocc> pedoccs;

	public Pedcta() {
	}

	public PedctaPK getId() {
		return this.id;
	}

	public void setId(PedctaPK id) {
		this.id = id;
	}

	public BigDecimal getAliqCredSn() {
		return this.aliqCredSn;
	}

	public void setAliqCredSn(BigDecimal aliqCredSn) {
		this.aliqCredSn = aliqCredSn;
	}

	public BigDecimal getAliqcof() {
		return this.aliqcof;
	}

	public void setAliqcof(BigDecimal aliqcof) {
		this.aliqcof = aliqcof;
	}

	public Integer getAliqpis() {
		return this.aliqpis;
	}

	public void setAliqpis(Integer aliqpis) {
		this.aliqpis = aliqpis;
	}

	public String getAtuest() {
		return this.atuest;
	}

	public void setAtuest(String atuest) {
		this.atuest = atuest;
	}

	public BigDecimal getBascof() {
		return this.bascof;
	}

	public void setBascof(BigDecimal bascof) {
		this.bascof = bascof;
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

	public BigDecimal getBaspis() {
		return this.baspis;
	}

	public void setBaspis(BigDecimal baspis) {
		this.baspis = baspis;
	}

	public BigDecimal getBassub() {
		return this.bassub;
	}

	public void setBassub(BigDecimal bassub) {
		this.bassub = bassub;
	}

	public BigDecimal getBscicm() {
		return this.bscicm;
	}

	public void setBscicm(BigDecimal bscicm) {
		this.bscicm = bscicm;
	}

	public BigDecimal getBscipi() {
		return this.bscipi;
	}

	public void setBscipi(BigDecimal bscipi) {
		this.bscipi = bscipi;
	}

	public String getCgccli() {
		return this.cgccli;
	}

	public void setCgccli(String cgccli) {
		this.cgccli = cgccli;
	}

	public String getClitab() {
		return this.clitab;
	}

	public void setClitab(String clitab) {
		this.clitab = clitab;
	}

	public Integer getCodatd() {
		return this.codatd;
	}

	public void setCodatd(Integer codatd) {
		this.codatd = codatd;
	}

	public String getCodcfo() {
		return this.codcfo;
	}

	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodfil() {
		return this.codfil;
	}

	public void setCodfil(Integer codfil) {
		this.codfil = codfil;
	}

	public Integer getCodgcl() {
		return this.codgcl;
	}

	public void setCodgcl(Integer codgcl) {
		this.codgcl = codgcl;
	}

	public String getCodicm() {
		return this.codicm;
	}

	public void setCodicm(String codicm) {
		this.codicm = codicm;
	}

	public String getCodipi() {
		return this.codipi;
	}

	public void setCodipi(String codipi) {
		this.codipi = codipi;
	}

	public String getCodpfa() {
		return this.codpfa;
	}

	public void setCodpfa(String codpfa) {
		this.codpfa = codpfa;
	}

	public Integer getCodregtrib() {
		return this.codregtrib;
	}

	public void setCodregtrib(Integer codregtrib) {
		this.codregtrib = codregtrib;
	}

	public Integer getCodtcl() {
		return this.codtcl;
	}

	public void setCodtcl(Integer codtcl) {
		this.codtcl = codtcl;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public String getConsum() {
		return this.consum;
	}

	public void setConsum(String consum) {
		this.consum = consum;
	}

	public String getCstcof() {
		return this.cstcof;
	}

	public void setCstcof(String cstcof) {
		this.cstcof = cstcof;
	}

	public String getCstpis() {
		return this.cstpis;
	}

	public void setCstpis(String cstpis) {
		this.cstpis = cstpis;
	}

	public BigDecimal getDesicm() {
		return this.desicm;
	}

	public void setDesicm(BigDecimal desicm) {
		this.desicm = desicm;
	}

	public BigDecimal getDesipi() {
		return this.desipi;
	}

	public void setDesipi(BigDecimal desipi) {
		this.desipi = desipi;
	}

	public BigDecimal getDessub() {
		return this.dessub;
	}

	public void setDessub(BigDecimal dessub) {
		this.dessub = dessub;
	}

	public BigDecimal getDsccom() {
		return this.dsccom;
	}

	public void setDsccom(BigDecimal dsccom) {
		this.dsccom = dsccom;
	}

	public BigDecimal getDsccta() {
		return this.dsccta;
	}

	public void setDsccta(BigDecimal dsccta) {
		this.dsccta = dsccta;
	}

	public BigDecimal getDscicm() {
		return this.dscicm;
	}

	public void setDscicm(BigDecimal dscicm) {
		this.dscicm = dscicm;
	}

	public BigDecimal getDscipi() {
		return this.dscipi;
	}

	public void setDscipi(BigDecimal dscipi) {
		this.dscipi = dscipi;
	}

	public BigDecimal getDscreg() {
		return this.dscreg;
	}

	public void setDscreg(BigDecimal dscreg) {
		this.dscreg = dscreg;
	}

	public BigDecimal getDscsub() {
		return this.dscsub;
	}

	public void setDscsub(BigDecimal dscsub) {
		this.dscsub = dscsub;
	}

	public Date getDteres() {
		return this.dteres;
	}

	public void setDteres(Date dteres) {
		this.dteres = dteres;
	}

	public Date getDtvsuf() {
		return this.dtvsuf;
	}

	public void setDtvsuf(Date dtvsuf) {
		this.dtvsuf = dtvsuf;
	}

	public Integer getEmpres() {
		return this.empres;
	}

	public void setEmpres(Integer empres) {
		this.empres = empres;
	}

	public String getFlgatu() {
		return this.flgatu;
	}

	public void setFlgatu(String flgatu) {
		this.flgatu = flgatu;
	}

	public String getFlgavi() {
		return this.flgavi;
	}

	public void setFlgavi(String flgavi) {
		this.flgavi = flgavi;
	}

	public String getFlgbloqatendida() {
		return this.flgbloqatendida;
	}

	public void setFlgbloqatendida(String flgbloqatendida) {
		this.flgbloqatendida = flgbloqatendida;
	}

	public String getFlgctb() {
		return this.flgctb;
	}

	public void setFlgctb(String flgctb) {
		this.flgctb = flgctb;
	}

	public String getFlgipi() {
		return this.flgipi;
	}

	public void setFlgipi(String flgipi) {
		this.flgipi = flgipi;
	}

	public String getFlgoco() {
		return this.flgoco;
	}

	public void setFlgoco(String flgoco) {
		this.flgoco = flgoco;
	}

	public String getFlgpsq() {
		return this.flgpsq;
	}

	public void setFlgpsq(String flgpsq) {
		this.flgpsq = flgpsq;
	}

	public String getFlgsld() {
		return this.flgsld;
	}

	public void setFlgsld(String flgsld) {
		this.flgsld = flgsld;
	}

	public String getFlgtab() {
		return this.flgtab;
	}

	public void setFlgtab(String flgtab) {
		this.flgtab = flgtab;
	}

	public BigDecimal getFrticm() {
		return this.frticm;
	}

	public void setFrticm(BigDecimal frticm) {
		this.frticm = frticm;
	}

	public BigDecimal getFrtipi() {
		return this.frtipi;
	}

	public void setFrtipi(BigDecimal frtipi) {
		this.frtipi = frtipi;
	}

	public BigDecimal getFrtsub() {
		return this.frtsub;
	}

	public void setFrtsub(BigDecimal frtsub) {
		this.frtsub = frtsub;
	}

	public String getHrecta() {
		return this.hrecta;
	}

	public void setHrecta(String hrecta) {
		this.hrecta = hrecta;
	}

	public Integer getIdEsticm() {
		return this.idEsticm;
	}

	public void setIdEsticm(Integer idEsticm) {
		this.idEsticm = idEsticm;
	}

	public Integer getIdEstipi() {
		return this.idEstipi;
	}

	public void setIdEstipi(Integer idEstipi) {
		this.idEstipi = idEstipi;
	}

	public Integer getIdFrete() {
		return this.idFrete;
	}

	public void setIdFrete(Integer idFrete) {
		this.idFrete = idFrete;
	}

	public Integer getIdPedcta() {
		return this.idPedcta;
	}

	public void setIdPedcta(Integer idPedcta) {
		this.idPedcta = idPedcta;
	}

	public BigDecimal getIncfin() {
		return this.incfin;
	}

	public void setIncfin(BigDecimal incfin) {
		this.incfin = incfin;
	}

	public BigDecimal getIncrev() {
		return this.increv;
	}

	public void setIncrev(BigDecimal increv) {
		this.increv = increv;
	}

	public Integer getIndicCf() {
		return this.indicCf;
	}

	public void setIndicCf(Integer indicCf) {
		this.indicCf = indicCf;
	}

	public Integer getIndicPresenca() {
		return this.indicPresenca;
	}

	public void setIndicPresenca(Integer indicPresenca) {
		this.indicPresenca = indicPresenca;
	}

	public String getInscli() {
		return this.inscli;
	}

	public void setInscli(String inscli) {
		this.inscli = inscli;
	}

	public String getIntfin() {
		return this.intfin;
	}

	public void setIntfin(String intfin) {
		this.intfin = intfin;
	}

	public String getLanest() {
		return this.lanest;
	}

	public void setLanest(String lanest) {
		this.lanest = lanest;
	}

	public BigDecimal getMedacr() {
		return this.medacr;
	}

	public void setMedacr(BigDecimal medacr) {
		this.medacr = medacr;
	}

	public BigDecimal getMeddco() {
		return this.meddco;
	}

	public void setMeddco(BigDecimal meddco) {
		this.meddco = meddco;
	}

	public BigDecimal getMeddsc() {
		return this.meddsc;
	}

	public void setMeddsc(BigDecimal meddsc) {
		this.meddsc = meddsc;
	}

	public BigDecimal getMedprm() {
		return this.medprm;
	}

	public void setMedprm(BigDecimal medprm) {
		this.medprm = medprm;
	}

	public String getModpfa() {
		return this.modpfa;
	}

	public void setModpfa(String modpfa) {
		this.modpfa = modpfa;
	}

	public String getNomcli() {
		return this.nomcli;
	}

	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}

	public String getNrosuf() {
		return this.nrosuf;
	}

	public void setNrosuf(String nrosuf) {
		this.nrosuf = nrosuf;
	}

	public Integer getNumres() {
		return this.numres;
	}

	public void setNumres(Integer numres) {
		this.numres = numres;
	}

	public String getObscli() {
		return this.obscli;
	}

	public void setObscli(String obscli) {
		this.obscli = obscli;
	}

	public String getObscnd() {
		return this.obscnd;
	}

	public void setObscnd(String obscnd) {
		this.obscnd = obscnd;
	}

	public String getObscta() {
		return this.obscta;
	}

	public void setObscta(String obscta) {
		this.obscta = obscta;
	}

	public String getObsent() {
		return this.obsent;
	}

	public void setObsent(String obsent) {
		this.obsent = obsent;
	}

	public String getObsval() {
		return this.obsval;
	}

	public void setObsval(String obsval) {
		this.obsval = obsval;
	}

	public Integer getQtict2() {
		return this.qtict2;
	}

	public void setQtict2(Integer qtict2) {
		this.qtict2 = qtict2;
	}

	public Integer getQtict3() {
		return this.qtict3;
	}

	public void setQtict3(Integer qtict3) {
		this.qtict3 = qtict3;
	}

	public Integer getQtict4() {
		return this.qtict4;
	}

	public void setQtict4(Integer qtict4) {
		this.qtict4 = qtict4;
	}

	public Integer getQticta() {
		return this.qticta;
	}

	public void setQticta(Integer qticta) {
		this.qticta = qticta;
	}

	public BigDecimal getRedicm() {
		return this.redicm;
	}

	public void setRedicm(BigDecimal redicm) {
		this.redicm = redicm;
	}

	public BigDecimal getRedipi() {
		return this.redipi;
	}

	public void setRedipi(BigDecimal redipi) {
		this.redipi = redipi;
	}

	public Integer getRegtrb() {
		return this.regtrb;
	}

	public void setRegtrb(Integer regtrb) {
		this.regtrb = regtrb;
	}

	public Integer getRegtrbemp() {
		return this.regtrbemp;
	}

	public void setRegtrbemp(Integer regtrbemp) {
		this.regtrbemp = regtrbemp;
	}

	public BigDecimal getSegicm() {
		return this.segicm;
	}

	public void setSegicm(BigDecimal segicm) {
		this.segicm = segicm;
	}

	public BigDecimal getSegipi() {
		return this.segipi;
	}

	public void setSegipi(BigDecimal segipi) {
		this.segipi = segipi;
	}

	public BigDecimal getSegsub() {
		return this.segsub;
	}

	public void setSegsub(BigDecimal segsub) {
		this.segsub = segsub;
	}

	public Integer getSeqct3() {
		return this.seqct3;
	}

	public void setSeqct3(Integer seqct3) {
		this.seqct3 = seqct3;
	}

	public String getSeqcta() {
		return this.seqcta;
	}

	public void setSeqcta(String seqcta) {
		this.seqcta = seqcta;
	}

	public Integer getSeqite() {
		return this.seqite;
	}

	public void setSeqite(Integer seqite) {
		this.seqite = seqite;
	}

	public String getSitcta() {
		return this.sitcta;
	}

	public void setSitcta(String sitcta) {
		this.sitcta = sitcta;
	}

	public String getSufrCofins() {
		return this.sufrCofins;
	}

	public void setSufrCofins(String sufrCofins) {
		this.sufrCofins = sufrCofins;
	}

	public String getSufrIcms() {
		return this.sufrIcms;
	}

	public void setSufrIcms(String sufrIcms) {
		this.sufrIcms = sufrIcms;
	}

	public String getSufrIpi() {
		return this.sufrIpi;
	}

	public void setSufrIpi(String sufrIpi) {
		this.sufrIpi = sufrIpi;
	}

	public String getSufrPis() {
		return this.sufrPis;
	}

	public void setSufrPis(String sufrPis) {
		this.sufrPis = sufrPis;
	}

	public String getTipicm() {
		return this.tipicm;
	}

	public void setTipicm(String tipicm) {
		this.tipicm = tipicm;
	}

	public String getTipipi() {
		return this.tipipi;
	}

	public void setTipipi(String tipipi) {
		this.tipipi = tipipi;
	}

	public String getTippfa() {
		return this.tippfa;
	}

	public void setTippfa(String tippfa) {
		this.tippfa = tippfa;
	}

	public BigDecimal getTotacr() {
		return this.totacr;
	}

	public void setTotacr(BigDecimal totacr) {
		this.totacr = totacr;
	}

	public BigDecimal getTotbrt() {
		return this.totbrt;
	}

	public void setTotbrt(BigDecimal totbrt) {
		this.totbrt = totbrt;
	}

	public BigDecimal getTotcof() {
		return this.totcof;
	}

	public void setTotcof(BigDecimal totcof) {
		this.totcof = totcof;
	}

	public BigDecimal getTotcst() {
		return this.totcst;
	}

	public void setTotcst(BigDecimal totcst) {
		this.totcst = totcst;
	}

	public BigDecimal getTotdco() {
		return this.totdco;
	}

	public void setTotdco(BigDecimal totdco) {
		this.totdco = totdco;
	}

	public BigDecimal getTotdescinc() {
		return this.totdescinc;
	}

	public void setTotdescinc(BigDecimal totdescinc) {
		this.totdescinc = totdescinc;
	}

	public BigDecimal getTotdsc() {
		return this.totdsc;
	}

	public void setTotdsc(BigDecimal totdsc) {
		this.totdsc = totdsc;
	}

	public BigDecimal getTotdsp() {
		return this.totdsp;
	}

	public void setTotdsp(BigDecimal totdsp) {
		this.totdsp = totdsp;
	}

	public BigDecimal getTotdsr() {
		return this.totdsr;
	}

	public void setTotdsr(BigDecimal totdsr) {
		this.totdsr = totdsr;
	}

	public BigDecimal getTotfrt() {
		return this.totfrt;
	}

	public void setTotfrt(BigDecimal totfrt) {
		this.totfrt = totfrt;
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

	public BigDecimal getTotipc() {
		return this.totipc;
	}

	public void setTotipc(BigDecimal totipc) {
		this.totipc = totipc;
	}

	public BigDecimal getTotipi() {
		return this.totipi;
	}

	public void setTotipi(BigDecimal totipi) {
		this.totipi = totipi;
	}

	public BigDecimal getTotite() {
		return this.totite;
	}

	public void setTotite(BigDecimal totite) {
		this.totite = totite;
	}

	public BigDecimal getTotitetrb() {
		return this.totitetrb;
	}

	public void setTotitetrb(BigDecimal totitetrb) {
		this.totitetrb = totitetrb;
	}

	public BigDecimal getTotliq() {
		return this.totliq;
	}

	public void setTotliq(BigDecimal totliq) {
		this.totliq = totliq;
	}

	public BigDecimal getTotoutdesp() {
		return this.totoutdesp;
	}

	public void setTotoutdesp(BigDecimal totoutdesp) {
		this.totoutdesp = totoutdesp;
	}

	public BigDecimal getTotpis() {
		return this.totpis;
	}

	public void setTotpis(BigDecimal totpis) {
		this.totpis = totpis;
	}

	public BigDecimal getTotren() {
		return this.totren;
	}

	public void setTotren(BigDecimal totren) {
		this.totren = totren;
	}

	public BigDecimal getTotseg() {
		return this.totseg;
	}

	public void setTotseg(BigDecimal totseg) {
		this.totseg = totseg;
	}

	public BigDecimal getTotsub() {
		return this.totsub;
	}

	public void setTotsub(BigDecimal totsub) {
		this.totsub = totsub;
	}

	public BigDecimal getTotven() {
		return this.totven;
	}

	public void setTotven(BigDecimal totven) {
		this.totven = totven;
	}

	public String getTrbcof() {
		return this.trbcof;
	}

	public void setTrbcof(String trbcof) {
		this.trbcof = trbcof;
	}

	public String getTrbicm() {
		return this.trbicm;
	}

	public void setTrbicm(String trbicm) {
		this.trbicm = trbicm;
	}

	public String getTrbipi() {
		return this.trbipi;
	}

	public void setTrbipi(String trbipi) {
		this.trbipi = trbipi;
	}

	public String getTrbpis() {
		return this.trbpis;
	}

	public void setTrbpis(String trbpis) {
		this.trbpis = trbpis;
	}

	public String getTxficm() {
		return this.txficm;
	}

	public void setTxficm(String txficm) {
		this.txficm = txficm;
	}

	public String getTxfipi() {
		return this.txfipi;
	}

	public void setTxfipi(String txfipi) {
		this.txfipi = txfipi;
	}

	public String getUfecta() {
		return this.ufecta;
	}

	public void setUfecta(String ufecta) {
		this.ufecta = ufecta;
	}

	public List<Pedct2> getPedct2s() {
		return this.pedct2s;
	}

	public void setPedct2s(List<Pedct2> pedct2s) {
		this.pedct2s = pedct2s;
	}

	public Pedct2 addPedct2(Pedct2 pedct2) {
		getPedct2s().add(pedct2);
		pedct2.setPedcta(this);

		return pedct2;
	}

	public Pedct2 removePedct2(Pedct2 pedct2) {
		getPedct2s().remove(pedct2);
		pedct2.setPedcta(null);

		return pedct2;
	}

	public List<Pedocc> getPedoccs() {
		return this.pedoccs;
	}

	public void setPedoccs(List<Pedocc> pedoccs) {
		this.pedoccs = pedoccs;
	}

	public Pedocc addPedocc(Pedocc pedocc) {
		getPedoccs().add(pedocc);
		pedocc.setPedcta(this);

		return pedocc;
	}

	public Pedocc removePedocc(Pedocc pedocc) {
		getPedoccs().remove(pedocc);
		pedocc.setPedcta(null);

		return pedocc;
	}

}