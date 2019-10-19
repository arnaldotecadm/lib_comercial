package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import br.com.arcasoftwares.model.primaryKey.Pedgr2PK;


/**
 * The persistent class for the pedgr2 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedgr2.findAll", query="SELECT p FROM Pedgr2 p")
public class Pedgr2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedgr2PK id;

	private BigDecimal basesb;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal bassub;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String cest;

	private String clsipi;

	private String codcfo;

	private String codclp;

	private String codcor;

	private Integer codeit;

	private String codgru;

	private Integer codprm;

	private String codpro;

	private String codst1;

	private String codst2;

	private String codstr;

	private String codsub;

	private String codtam;

	private String codund;

	private BigDecimal cstgr2;

	private String desgr2;

	private BigDecimal dsccom;

	private BigDecimal dscgr2;

	private BigDecimal dspgr2;

	private BigDecimal dsrgr2;

	private String flaseq;

	private String flgdup;

	private String flgres;

	private BigDecimal icmgr2;

	private BigDecimal icmsub;

	@Column(name="id_esticm")
	private Integer idEsticm;

	private BigDecimal incfin;

	private BigDecimal increv;

	private BigDecimal ipigr2;

	private BigDecimal mrgsub;

	private Integer nrogr2;

	private String obsgr2;

	private BigDecimal pacgr2;

	private Integer qtigr3;

	private BigDecimal qtlgr2;

	private BigDecimal qtpgr2;

	private BigDecimal qtsgr2;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private String regicm;

	private String regipi;

	private Integer seqgr3;

	private Integer seqpr2;

	private BigDecimal sldgr2;

	private Integer tabprc;

	private String tipicm;

	private String tipipi;

	private String tipstr;

	private BigDecimal totacr;

	private BigDecimal totcst;

	private BigDecimal totdco;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totge2;

	private BigDecimal totgr2;

	private BigDecimal toticm;

	private BigDecimal totipi;

	private BigDecimal totren;

	private BigDecimal totsub;

	private BigDecimal totven;

	private String trbicm;

	private String trbipi;

	private String trbsub;

	private BigDecimal vacgr2;

	private BigDecimal vchgr2;

	private BigDecimal vcpgr2;

	private BigDecimal vcrgr2;

	private BigDecimal vcsgr2;

	private BigDecimal vdpgr2;

	private BigDecimal vdrgr2;

	private BigDecimal vdscom;

	private BigDecimal vdsgr2;

	private BigDecimal vlqgr2;

	private BigDecimal vlugr2;

	private BigDecimal vprgr2;

	private BigDecimal vregr2;

	public Pedgr2() {
	}

	public Pedgr2PK getId() {
		return this.id;
	}

	public void setId(Pedgr2PK id) {
		this.id = id;
	}

	public BigDecimal getBasesb() {
		return this.basesb;
	}

	public void setBasesb(BigDecimal basesb) {
		this.basesb = basesb;
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

	public String getCest() {
		return this.cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public String getClsipi() {
		return this.clsipi;
	}

	public void setClsipi(String clsipi) {
		this.clsipi = clsipi;
	}

	public String getCodcfo() {
		return this.codcfo;
	}

	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public String getCodclp() {
		return this.codclp;
	}

	public void setCodclp(String codclp) {
		this.codclp = codclp;
	}

	public String getCodcor() {
		return this.codcor;
	}

	public void setCodcor(String codcor) {
		this.codcor = codcor;
	}

	public Integer getCodeit() {
		return this.codeit;
	}

	public void setCodeit(Integer codeit) {
		this.codeit = codeit;
	}

	public String getCodgru() {
		return this.codgru;
	}

	public void setCodgru(String codgru) {
		this.codgru = codgru;
	}

	public Integer getCodprm() {
		return this.codprm;
	}

	public void setCodprm(Integer codprm) {
		this.codprm = codprm;
	}

	public String getCodpro() {
		return this.codpro;
	}

	public void setCodpro(String codpro) {
		this.codpro = codpro;
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

	public String getCodstr() {
		return this.codstr;
	}

	public void setCodstr(String codstr) {
		this.codstr = codstr;
	}

	public String getCodsub() {
		return this.codsub;
	}

	public void setCodsub(String codsub) {
		this.codsub = codsub;
	}

	public String getCodtam() {
		return this.codtam;
	}

	public void setCodtam(String codtam) {
		this.codtam = codtam;
	}

	public String getCodund() {
		return this.codund;
	}

	public void setCodund(String codund) {
		this.codund = codund;
	}

	public BigDecimal getCstgr2() {
		return this.cstgr2;
	}

	public void setCstgr2(BigDecimal cstgr2) {
		this.cstgr2 = cstgr2;
	}

	public String getDesgr2() {
		return this.desgr2;
	}

	public void setDesgr2(String desgr2) {
		this.desgr2 = desgr2;
	}

	public BigDecimal getDsccom() {
		return this.dsccom;
	}

	public void setDsccom(BigDecimal dsccom) {
		this.dsccom = dsccom;
	}

	public BigDecimal getDscgr2() {
		return this.dscgr2;
	}

	public void setDscgr2(BigDecimal dscgr2) {
		this.dscgr2 = dscgr2;
	}

	public BigDecimal getDspgr2() {
		return this.dspgr2;
	}

	public void setDspgr2(BigDecimal dspgr2) {
		this.dspgr2 = dspgr2;
	}

	public BigDecimal getDsrgr2() {
		return this.dsrgr2;
	}

	public void setDsrgr2(BigDecimal dsrgr2) {
		this.dsrgr2 = dsrgr2;
	}

	public String getFlaseq() {
		return this.flaseq;
	}

	public void setFlaseq(String flaseq) {
		this.flaseq = flaseq;
	}

	public String getFlgdup() {
		return this.flgdup;
	}

	public void setFlgdup(String flgdup) {
		this.flgdup = flgdup;
	}

	public String getFlgres() {
		return this.flgres;
	}

	public void setFlgres(String flgres) {
		this.flgres = flgres;
	}

	public BigDecimal getIcmgr2() {
		return this.icmgr2;
	}

	public void setIcmgr2(BigDecimal icmgr2) {
		this.icmgr2 = icmgr2;
	}

	public BigDecimal getIcmsub() {
		return this.icmsub;
	}

	public void setIcmsub(BigDecimal icmsub) {
		this.icmsub = icmsub;
	}

	public Integer getIdEsticm() {
		return this.idEsticm;
	}

	public void setIdEsticm(Integer idEsticm) {
		this.idEsticm = idEsticm;
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

	public BigDecimal getIpigr2() {
		return this.ipigr2;
	}

	public void setIpigr2(BigDecimal ipigr2) {
		this.ipigr2 = ipigr2;
	}

	public BigDecimal getMrgsub() {
		return this.mrgsub;
	}

	public void setMrgsub(BigDecimal mrgsub) {
		this.mrgsub = mrgsub;
	}

	public Integer getNrogr2() {
		return this.nrogr2;
	}

	public void setNrogr2(Integer nrogr2) {
		this.nrogr2 = nrogr2;
	}

	public String getObsgr2() {
		return this.obsgr2;
	}

	public void setObsgr2(String obsgr2) {
		this.obsgr2 = obsgr2;
	}

	public BigDecimal getPacgr2() {
		return this.pacgr2;
	}

	public void setPacgr2(BigDecimal pacgr2) {
		this.pacgr2 = pacgr2;
	}

	public Integer getQtigr3() {
		return this.qtigr3;
	}

	public void setQtigr3(Integer qtigr3) {
		this.qtigr3 = qtigr3;
	}

	public BigDecimal getQtlgr2() {
		return this.qtlgr2;
	}

	public void setQtlgr2(BigDecimal qtlgr2) {
		this.qtlgr2 = qtlgr2;
	}

	public BigDecimal getQtpgr2() {
		return this.qtpgr2;
	}

	public void setQtpgr2(BigDecimal qtpgr2) {
		this.qtpgr2 = qtpgr2;
	}

	public BigDecimal getQtsgr2() {
		return this.qtsgr2;
	}

	public void setQtsgr2(BigDecimal qtsgr2) {
		this.qtsgr2 = qtsgr2;
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

	public String getRegicm() {
		return this.regicm;
	}

	public void setRegicm(String regicm) {
		this.regicm = regicm;
	}

	public String getRegipi() {
		return this.regipi;
	}

	public void setRegipi(String regipi) {
		this.regipi = regipi;
	}

	public Integer getSeqgr3() {
		return this.seqgr3;
	}

	public void setSeqgr3(Integer seqgr3) {
		this.seqgr3 = seqgr3;
	}

	public Integer getSeqpr2() {
		return this.seqpr2;
	}

	public void setSeqpr2(Integer seqpr2) {
		this.seqpr2 = seqpr2;
	}

	public BigDecimal getSldgr2() {
		return this.sldgr2;
	}

	public void setSldgr2(BigDecimal sldgr2) {
		this.sldgr2 = sldgr2;
	}

	public Integer getTabprc() {
		return this.tabprc;
	}

	public void setTabprc(Integer tabprc) {
		this.tabprc = tabprc;
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

	public String getTipstr() {
		return this.tipstr;
	}

	public void setTipstr(String tipstr) {
		this.tipstr = tipstr;
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

	public BigDecimal getTotge2() {
		return this.totge2;
	}

	public void setTotge2(BigDecimal totge2) {
		this.totge2 = totge2;
	}

	public BigDecimal getTotgr2() {
		return this.totgr2;
	}

	public void setTotgr2(BigDecimal totgr2) {
		this.totgr2 = totgr2;
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

	public String getTrbsub() {
		return this.trbsub;
	}

	public void setTrbsub(String trbsub) {
		this.trbsub = trbsub;
	}

	public BigDecimal getVacgr2() {
		return this.vacgr2;
	}

	public void setVacgr2(BigDecimal vacgr2) {
		this.vacgr2 = vacgr2;
	}

	public BigDecimal getVchgr2() {
		return this.vchgr2;
	}

	public void setVchgr2(BigDecimal vchgr2) {
		this.vchgr2 = vchgr2;
	}

	public BigDecimal getVcpgr2() {
		return this.vcpgr2;
	}

	public void setVcpgr2(BigDecimal vcpgr2) {
		this.vcpgr2 = vcpgr2;
	}

	public BigDecimal getVcrgr2() {
		return this.vcrgr2;
	}

	public void setVcrgr2(BigDecimal vcrgr2) {
		this.vcrgr2 = vcrgr2;
	}

	public BigDecimal getVcsgr2() {
		return this.vcsgr2;
	}

	public void setVcsgr2(BigDecimal vcsgr2) {
		this.vcsgr2 = vcsgr2;
	}

	public BigDecimal getVdpgr2() {
		return this.vdpgr2;
	}

	public void setVdpgr2(BigDecimal vdpgr2) {
		this.vdpgr2 = vdpgr2;
	}

	public BigDecimal getVdrgr2() {
		return this.vdrgr2;
	}

	public void setVdrgr2(BigDecimal vdrgr2) {
		this.vdrgr2 = vdrgr2;
	}

	public BigDecimal getVdscom() {
		return this.vdscom;
	}

	public void setVdscom(BigDecimal vdscom) {
		this.vdscom = vdscom;
	}

	public BigDecimal getVdsgr2() {
		return this.vdsgr2;
	}

	public void setVdsgr2(BigDecimal vdsgr2) {
		this.vdsgr2 = vdsgr2;
	}

	public BigDecimal getVlqgr2() {
		return this.vlqgr2;
	}

	public void setVlqgr2(BigDecimal vlqgr2) {
		this.vlqgr2 = vlqgr2;
	}

	public BigDecimal getVlugr2() {
		return this.vlugr2;
	}

	public void setVlugr2(BigDecimal vlugr2) {
		this.vlugr2 = vlugr2;
	}

	public BigDecimal getVprgr2() {
		return this.vprgr2;
	}

	public void setVprgr2(BigDecimal vprgr2) {
		this.vprgr2 = vprgr2;
	}

	public BigDecimal getVregr2() {
		return this.vregr2;
	}

	public void setVregr2(BigDecimal vregr2) {
		this.vregr2 = vregr2;
	}

}