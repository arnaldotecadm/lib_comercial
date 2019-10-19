package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.PedgerPK;


/**
 * The persistent class for the pedger database table.
 * 
 */
@Entity
@NamedQuery(name="Pedger.findAll", query="SELECT p FROM Pedger p")
public class Pedger implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedgerPK id;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal bassub;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private Integer codatd;

	private String codcfo;

	private Integer codcli;

	private Integer codfil;

	private String codicm;

	private String codipi;

	private String codpfa;

	private Integer codtcl;

	private Integer codusu;

	private Integer codven;

	private String consum;

	private BigDecimal dsccom;

	private BigDecimal dscreg;

	@Temporal(TemporalType.DATE)
	private Date dtedel;

	private String flgctb;

	private String flgtab;

	private String hredel;

	private String hreger;

	@Column(name="id_esticm")
	private Integer idEsticm;

	@Column(name="id_estipi")
	private Integer idEstipi;

	private BigDecimal incfin;

	private BigDecimal increv;

	private String lanest;

	private BigDecimal medacr;

	private BigDecimal meddco;

	private BigDecimal meddsc;

	private BigDecimal medprm;

	private String obsdel;

	private String pedcli;

	private Integer qtiger;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private String seqger;

	private Integer seqite;

	private String sitger;

	private String tipicm;

	private String tipipi;

	private String tippfa;

	private BigDecimal topprm;

	private BigDecimal totacr;

	private BigDecimal totcst;

	private BigDecimal totdco;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totger;

	private BigDecimal toticm;

	private BigDecimal totipi;

	private BigDecimal totite;

	private BigDecimal totren;

	private BigDecimal totsub;

	private BigDecimal totven;

	private String trbicm;

	private String trbipi;

	private String txficm;

	private String txfipi;

	private String ufeger;

	private Integer usudel;

	public Pedger() {
	}

	public PedgerPK getId() {
		return this.id;
	}

	public void setId(PedgerPK id) {
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

	public BigDecimal getDsccom() {
		return this.dsccom;
	}

	public void setDsccom(BigDecimal dsccom) {
		this.dsccom = dsccom;
	}

	public BigDecimal getDscreg() {
		return this.dscreg;
	}

	public void setDscreg(BigDecimal dscreg) {
		this.dscreg = dscreg;
	}

	public Date getDtedel() {
		return this.dtedel;
	}

	public void setDtedel(Date dtedel) {
		this.dtedel = dtedel;
	}

	public String getFlgctb() {
		return this.flgctb;
	}

	public void setFlgctb(String flgctb) {
		this.flgctb = flgctb;
	}

	public String getFlgtab() {
		return this.flgtab;
	}

	public void setFlgtab(String flgtab) {
		this.flgtab = flgtab;
	}

	public String getHredel() {
		return this.hredel;
	}

	public void setHredel(String hredel) {
		this.hredel = hredel;
	}

	public String getHreger() {
		return this.hreger;
	}

	public void setHreger(String hreger) {
		this.hreger = hreger;
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

	public String getObsdel() {
		return this.obsdel;
	}

	public void setObsdel(String obsdel) {
		this.obsdel = obsdel;
	}

	public String getPedcli() {
		return this.pedcli;
	}

	public void setPedcli(String pedcli) {
		this.pedcli = pedcli;
	}

	public Integer getQtiger() {
		return this.qtiger;
	}

	public void setQtiger(Integer qtiger) {
		this.qtiger = qtiger;
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

	public String getSeqger() {
		return this.seqger;
	}

	public void setSeqger(String seqger) {
		this.seqger = seqger;
	}

	public Integer getSeqite() {
		return this.seqite;
	}

	public void setSeqite(Integer seqite) {
		this.seqite = seqite;
	}

	public String getSitger() {
		return this.sitger;
	}

	public void setSitger(String sitger) {
		this.sitger = sitger;
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

	public BigDecimal getTopprm() {
		return this.topprm;
	}

	public void setTopprm(BigDecimal topprm) {
		this.topprm = topprm;
	}

	public BigDecimal getTotacr() {
		return this.totacr;
	}

	public void setTotacr(BigDecimal totacr) {
		this.totacr = totacr;
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

	public BigDecimal getTotite() {
		return this.totite;
	}

	public void setTotite(BigDecimal totite) {
		this.totite = totite;
	}

	public BigDecimal getTotren() {
		return this.totren;
	}

	public void setTotren(BigDecimal totren) {
		this.totren = totren;
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

	public String getUfeger() {
		return this.ufeger;
	}

	public void setUfeger(String ufeger) {
		this.ufeger = ufeger;
	}

	public Integer getUsudel() {
		return this.usudel;
	}

	public void setUsudel(Integer usudel) {
		this.usudel = usudel;
	}

}