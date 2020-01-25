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

import br.com.arcasoftwares.model.primaryKey.Pedlb2PK;


/**
 * The persistent class for the pedlb2 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedlb2.findAll", query="SELECT p FROM Pedlb2 p")
public class Pedlb2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedlb2PK id;

	private BigDecimal aliqcof;

	@Column(name="aliqcof_zf")
	private BigDecimal aliqcofZf;

	private BigDecimal aliqpis;

	@Column(name="aliqpis_zf")
	private BigDecimal aliqpisZf;

	private Integer anolib;

	private BigDecimal bascat;

	private BigDecimal bascof;

	private BigDecimal bascom;

	private BigDecimal basesb;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal basiss;

	private BigDecimal baspis;

	private BigDecimal bassub;

	private BigDecimal brtlb2;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String clsipi;

	private Integer codcat;

	private String codcfo;

	private String codclp;

	private String codcor;

	private Integer codeit;

	private String codgru;

	private Integer codmrc;

	private Integer codprm;

	private String codpro;

	private String codst1;

	private String codst2;

	private String codstr;

	private String codsub;

	private String codtam;

	private Integer codtip;

	private String codtxf;

	private String codund;

	private String codvwa;

	private String cstcof;

	private BigDecimal cstcst;

	private String cstipi;

	private BigDecimal cstlb2;

	private String cstpis;

	private BigDecimal desicm;

	private BigDecimal desipi;

	private String deslb2;

	private BigDecimal dessub;

	private BigDecimal difdsc;

	private BigDecimal doplb2;

	private BigDecimal dsccom;

	private BigDecimal dscicm;

	private BigDecimal dscipi;

	private BigDecimal dsclb2;

	private BigDecimal dscorgpublic;

	private BigDecimal dscper;

	private BigDecimal dscreg;

	private BigDecimal dscsub;

	private BigDecimal dsplb2;

	private BigDecimal dsrlb2;

	@Temporal(TemporalType.DATE)
	private Date dteent;

	private Integer empent;

	@Column(name="flg_desc_zf_cof")
	private String flgDescZfCof;

	@Column(name="flg_desc_zf_pis")
	private String flgDescZfPis;

	private String flgdup;

	@Column(name="flgncalc_dif_mva")
	private String flgncalcDifMva;

	private String flgreq;

	private String flgres;

	private String flgsep;

	private String flgseq;

	private String flgser;

	private BigDecimal frticm;

	private BigDecimal frtipi;

	private BigDecimal frtsub;

	private BigDecimal icmlb2;

	private BigDecimal icmlb2sn;

	private BigDecimal icmsub;

	@Column(name="id_esticm")
	private Integer idEsticm;

	@Column(name="id_pedlb2")
	private Integer idPedlb2;

	@Column(name="id_pedre2")
	private Integer idPedre2;

	private BigDecimal incfin;

	private BigDecimal increv;

	private BigDecimal ipilb2;

	private BigDecimal isslb2;

	private String lancst;

	private BigDecimal liqlb2;

	private BigDecimal lucrol;

	private BigDecimal lucrop;

	private BigDecimal marped;

	private BigDecimal marpre;

	private BigDecimal medcat;

	private String meslib;

	private BigDecimal mrgsub;

	private Integer nrore2;

	private Integer nument;

	private Integer numitemcompra;

	private String numpedcompra;

	private String obslb2;

	private BigDecimal outcst;

	private BigDecimal paclb2;

	private BigDecimal pcoatd;

	private BigDecimal pcolb2;

	private BigDecimal qtdlb2;

	private BigDecimal qtdqte;

	private BigDecimal qtplb2;

	private BigDecimal qtslb2;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private BigDecimal redsub;

	private String reflb2;

	private String regicm;

	private String regipi;

	private BigDecimal segicm;

	private BigDecimal segipi;

	private BigDecimal segsub;

	private Integer seqen2;

	private Integer seqpr2;

	private Integer seqre2;

	private BigDecimal sldlb2;

	private String tipcpa;

	private String tipicm;

	private String tipipi;

	private String tipstr;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcat;

	private BigDecimal totcof;

	private BigDecimal totcofzf;

	private BigDecimal totcom;

	private BigDecimal totcst;

	private BigDecimal totdco;

	private BigDecimal totdescinc;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totfrt;

	private BigDecimal totge2;

	private BigDecimal toticm;

	private BigDecimal toticmsn;

	private BigDecimal totipc;

	private BigDecimal totipi;

	private BigDecimal totiss;

	private BigDecimal totlb2;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totper;

	private BigDecimal totpis;

	private BigDecimal totpiszf;

	private BigDecimal totren;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private Integer totvol;

	private String trbicm;

	private String trbipi;

	private String trbsub;

	private BigDecimal ultqts;

	private BigDecimal vaclb2;

	private BigDecimal valtmo;

	private BigDecimal vchcst;

	private BigDecimal vchlb2;

	private BigDecimal vcpcst;

	private BigDecimal vcplb2;

	private BigDecimal vcrcst;

	private BigDecimal vcrlb2;

	private BigDecimal vcslb2;

	private BigDecimal vdplb2;

	private BigDecimal vdrlb2;

	private BigDecimal vdscom;

	private BigDecimal vdslb2;

	private BigDecimal vldorgpublic;

	private BigDecimal vlqlb2;

	private BigDecimal vlulb2;

	private BigDecimal vmecst;

	private BigDecimal vmelb2;

	private BigDecimal vollb2;

	private BigDecimal vpfcst;

	private BigDecimal vpflb2;

	private BigDecimal vpfout;

	private BigDecimal vprcst;

	private BigDecimal vprlb2;

	private BigDecimal vrecst;

	private BigDecimal vrelb2;

	public Pedlb2() {
	}

	public Pedlb2PK getId() {
		return this.id;
	}

	public void setId(Pedlb2PK id) {
		this.id = id;
	}

	public BigDecimal getAliqcof() {
		return this.aliqcof;
	}

	public void setAliqcof(BigDecimal aliqcof) {
		this.aliqcof = aliqcof;
	}

	public BigDecimal getAliqcofZf() {
		return this.aliqcofZf;
	}

	public void setAliqcofZf(BigDecimal aliqcofZf) {
		this.aliqcofZf = aliqcofZf;
	}

	public BigDecimal getAliqpis() {
		return this.aliqpis;
	}

	public void setAliqpis(BigDecimal aliqpis) {
		this.aliqpis = aliqpis;
	}

	public BigDecimal getAliqpisZf() {
		return this.aliqpisZf;
	}

	public void setAliqpisZf(BigDecimal aliqpisZf) {
		this.aliqpisZf = aliqpisZf;
	}

	public Integer getAnolib() {
		return this.anolib;
	}

	public void setAnolib(Integer anolib) {
		this.anolib = anolib;
	}

	public BigDecimal getBascat() {
		return this.bascat;
	}

	public void setBascat(BigDecimal bascat) {
		this.bascat = bascat;
	}

	public BigDecimal getBascof() {
		return this.bascof;
	}

	public void setBascof(BigDecimal bascof) {
		this.bascof = bascof;
	}

	public BigDecimal getBascom() {
		return this.bascom;
	}

	public void setBascom(BigDecimal bascom) {
		this.bascom = bascom;
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

	public BigDecimal getBasiss() {
		return this.basiss;
	}

	public void setBasiss(BigDecimal basiss) {
		this.basiss = basiss;
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

	public BigDecimal getBrtlb2() {
		return this.brtlb2;
	}

	public void setBrtlb2(BigDecimal brtlb2) {
		this.brtlb2 = brtlb2;
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

	public String getClsipi() {
		return this.clsipi;
	}

	public void setClsipi(String clsipi) {
		this.clsipi = clsipi;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
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

	public Integer getCodmrc() {
		return this.codmrc;
	}

	public void setCodmrc(Integer codmrc) {
		this.codmrc = codmrc;
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

	public Integer getCodtip() {
		return this.codtip;
	}

	public void setCodtip(Integer codtip) {
		this.codtip = codtip;
	}

	public String getCodtxf() {
		return this.codtxf;
	}

	public void setCodtxf(String codtxf) {
		this.codtxf = codtxf;
	}

	public String getCodund() {
		return this.codund;
	}

	public void setCodund(String codund) {
		this.codund = codund;
	}

	public String getCodvwa() {
		return this.codvwa;
	}

	public void setCodvwa(String codvwa) {
		this.codvwa = codvwa;
	}

	public String getCstcof() {
		return this.cstcof;
	}

	public void setCstcof(String cstcof) {
		this.cstcof = cstcof;
	}

	public BigDecimal getCstcst() {
		return this.cstcst;
	}

	public void setCstcst(BigDecimal cstcst) {
		this.cstcst = cstcst;
	}

	public String getCstipi() {
		return this.cstipi;
	}

	public void setCstipi(String cstipi) {
		this.cstipi = cstipi;
	}

	public BigDecimal getCstlb2() {
		return this.cstlb2;
	}

	public void setCstlb2(BigDecimal cstlb2) {
		this.cstlb2 = cstlb2;
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

	public String getDeslb2() {
		return this.deslb2;
	}

	public void setDeslb2(String deslb2) {
		this.deslb2 = deslb2;
	}

	public BigDecimal getDessub() {
		return this.dessub;
	}

	public void setDessub(BigDecimal dessub) {
		this.dessub = dessub;
	}

	public BigDecimal getDifdsc() {
		return this.difdsc;
	}

	public void setDifdsc(BigDecimal difdsc) {
		this.difdsc = difdsc;
	}

	public BigDecimal getDoplb2() {
		return this.doplb2;
	}

	public void setDoplb2(BigDecimal doplb2) {
		this.doplb2 = doplb2;
	}

	public BigDecimal getDsccom() {
		return this.dsccom;
	}

	public void setDsccom(BigDecimal dsccom) {
		this.dsccom = dsccom;
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

	public BigDecimal getDsclb2() {
		return this.dsclb2;
	}

	public void setDsclb2(BigDecimal dsclb2) {
		this.dsclb2 = dsclb2;
	}

	public BigDecimal getDscorgpublic() {
		return this.dscorgpublic;
	}

	public void setDscorgpublic(BigDecimal dscorgpublic) {
		this.dscorgpublic = dscorgpublic;
	}

	public BigDecimal getDscper() {
		return this.dscper;
	}

	public void setDscper(BigDecimal dscper) {
		this.dscper = dscper;
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

	public BigDecimal getDsplb2() {
		return this.dsplb2;
	}

	public void setDsplb2(BigDecimal dsplb2) {
		this.dsplb2 = dsplb2;
	}

	public BigDecimal getDsrlb2() {
		return this.dsrlb2;
	}

	public void setDsrlb2(BigDecimal dsrlb2) {
		this.dsrlb2 = dsrlb2;
	}

	public Date getDteent() {
		return this.dteent;
	}

	public void setDteent(Date dteent) {
		this.dteent = dteent;
	}

	public Integer getEmpent() {
		return this.empent;
	}

	public void setEmpent(Integer empent) {
		this.empent = empent;
	}

	public String getFlgDescZfCof() {
		return this.flgDescZfCof;
	}

	public void setFlgDescZfCof(String flgDescZfCof) {
		this.flgDescZfCof = flgDescZfCof;
	}

	public String getFlgDescZfPis() {
		return this.flgDescZfPis;
	}

	public void setFlgDescZfPis(String flgDescZfPis) {
		this.flgDescZfPis = flgDescZfPis;
	}

	public String getFlgdup() {
		return this.flgdup;
	}

	public void setFlgdup(String flgdup) {
		this.flgdup = flgdup;
	}

	public String getFlgncalcDifMva() {
		return this.flgncalcDifMva;
	}

	public void setFlgncalcDifMva(String flgncalcDifMva) {
		this.flgncalcDifMva = flgncalcDifMva;
	}

	public String getFlgreq() {
		return this.flgreq;
	}

	public void setFlgreq(String flgreq) {
		this.flgreq = flgreq;
	}

	public String getFlgres() {
		return this.flgres;
	}

	public void setFlgres(String flgres) {
		this.flgres = flgres;
	}

	public String getFlgsep() {
		return this.flgsep;
	}

	public void setFlgsep(String flgsep) {
		this.flgsep = flgsep;
	}

	public String getFlgseq() {
		return this.flgseq;
	}

	public void setFlgseq(String flgseq) {
		this.flgseq = flgseq;
	}

	public String getFlgser() {
		return this.flgser;
	}

	public void setFlgser(String flgser) {
		this.flgser = flgser;
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

	public BigDecimal getIcmlb2() {
		return this.icmlb2;
	}

	public void setIcmlb2(BigDecimal icmlb2) {
		this.icmlb2 = icmlb2;
	}

	public BigDecimal getIcmlb2sn() {
		return this.icmlb2sn;
	}

	public void setIcmlb2sn(BigDecimal icmlb2sn) {
		this.icmlb2sn = icmlb2sn;
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

	public Integer getIdPedlb2() {
		return this.idPedlb2;
	}

	public void setIdPedlb2(Integer idPedlb2) {
		this.idPedlb2 = idPedlb2;
	}

	public Integer getIdPedre2() {
		return this.idPedre2;
	}

	public void setIdPedre2(Integer idPedre2) {
		this.idPedre2 = idPedre2;
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

	public BigDecimal getIpilb2() {
		return this.ipilb2;
	}

	public void setIpilb2(BigDecimal ipilb2) {
		this.ipilb2 = ipilb2;
	}

	public BigDecimal getIsslb2() {
		return this.isslb2;
	}

	public void setIsslb2(BigDecimal isslb2) {
		this.isslb2 = isslb2;
	}

	public String getLancst() {
		return this.lancst;
	}

	public void setLancst(String lancst) {
		this.lancst = lancst;
	}

	public BigDecimal getLiqlb2() {
		return this.liqlb2;
	}

	public void setLiqlb2(BigDecimal liqlb2) {
		this.liqlb2 = liqlb2;
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

	public BigDecimal getMedcat() {
		return this.medcat;
	}

	public void setMedcat(BigDecimal medcat) {
		this.medcat = medcat;
	}

	public String getMeslib() {
		return this.meslib;
	}

	public void setMeslib(String meslib) {
		this.meslib = meslib;
	}

	public BigDecimal getMrgsub() {
		return this.mrgsub;
	}

	public void setMrgsub(BigDecimal mrgsub) {
		this.mrgsub = mrgsub;
	}

	public Integer getNrore2() {
		return this.nrore2;
	}

	public void setNrore2(Integer nrore2) {
		this.nrore2 = nrore2;
	}

	public Integer getNument() {
		return this.nument;
	}

	public void setNument(Integer nument) {
		this.nument = nument;
	}

	public Integer getNumitemcompra() {
		return this.numitemcompra;
	}

	public void setNumitemcompra(Integer numitemcompra) {
		this.numitemcompra = numitemcompra;
	}

	public String getNumpedcompra() {
		return this.numpedcompra;
	}

	public void setNumpedcompra(String numpedcompra) {
		this.numpedcompra = numpedcompra;
	}

	public String getObslb2() {
		return this.obslb2;
	}

	public void setObslb2(String obslb2) {
		this.obslb2 = obslb2;
	}

	public BigDecimal getOutcst() {
		return this.outcst;
	}

	public void setOutcst(BigDecimal outcst) {
		this.outcst = outcst;
	}

	public BigDecimal getPaclb2() {
		return this.paclb2;
	}

	public void setPaclb2(BigDecimal paclb2) {
		this.paclb2 = paclb2;
	}

	public BigDecimal getPcoatd() {
		return this.pcoatd;
	}

	public void setPcoatd(BigDecimal pcoatd) {
		this.pcoatd = pcoatd;
	}

	public BigDecimal getPcolb2() {
		return this.pcolb2;
	}

	public void setPcolb2(BigDecimal pcolb2) {
		this.pcolb2 = pcolb2;
	}

	public BigDecimal getQtdlb2() {
		return this.qtdlb2;
	}

	public void setQtdlb2(BigDecimal qtdlb2) {
		this.qtdlb2 = qtdlb2;
	}

	public BigDecimal getQtdqte() {
		return this.qtdqte;
	}

	public void setQtdqte(BigDecimal qtdqte) {
		this.qtdqte = qtdqte;
	}

	public BigDecimal getQtplb2() {
		return this.qtplb2;
	}

	public void setQtplb2(BigDecimal qtplb2) {
		this.qtplb2 = qtplb2;
	}

	public BigDecimal getQtslb2() {
		return this.qtslb2;
	}

	public void setQtslb2(BigDecimal qtslb2) {
		this.qtslb2 = qtslb2;
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

	public BigDecimal getRedsub() {
		return this.redsub;
	}

	public void setRedsub(BigDecimal redsub) {
		this.redsub = redsub;
	}

	public String getReflb2() {
		return this.reflb2;
	}

	public void setReflb2(String reflb2) {
		this.reflb2 = reflb2;
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

	public Integer getSeqen2() {
		return this.seqen2;
	}

	public void setSeqen2(Integer seqen2) {
		this.seqen2 = seqen2;
	}

	public Integer getSeqpr2() {
		return this.seqpr2;
	}

	public void setSeqpr2(Integer seqpr2) {
		this.seqpr2 = seqpr2;
	}

	public Integer getSeqre2() {
		return this.seqre2;
	}

	public void setSeqre2(Integer seqre2) {
		this.seqre2 = seqre2;
	}

	public BigDecimal getSldlb2() {
		return this.sldlb2;
	}

	public void setSldlb2(BigDecimal sldlb2) {
		this.sldlb2 = sldlb2;
	}

	public String getTipcpa() {
		return this.tipcpa;
	}

	public void setTipcpa(String tipcpa) {
		this.tipcpa = tipcpa;
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

	public BigDecimal getTotbrt() {
		return this.totbrt;
	}

	public void setTotbrt(BigDecimal totbrt) {
		this.totbrt = totbrt;
	}

	public BigDecimal getTotcat() {
		return this.totcat;
	}

	public void setTotcat(BigDecimal totcat) {
		this.totcat = totcat;
	}

	public BigDecimal getTotcof() {
		return this.totcof;
	}

	public void setTotcof(BigDecimal totcof) {
		this.totcof = totcof;
	}

	public BigDecimal getTotcofzf() {
		return this.totcofzf;
	}

	public void setTotcofzf(BigDecimal totcofzf) {
		this.totcofzf = totcofzf;
	}

	public BigDecimal getTotcom() {
		return this.totcom;
	}

	public void setTotcom(BigDecimal totcom) {
		this.totcom = totcom;
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

	public BigDecimal getTotge2() {
		return this.totge2;
	}

	public void setTotge2(BigDecimal totge2) {
		this.totge2 = totge2;
	}

	public BigDecimal getToticm() {
		return this.toticm;
	}

	public void setToticm(BigDecimal toticm) {
		this.toticm = toticm;
	}

	public BigDecimal getToticmsn() {
		return this.toticmsn;
	}

	public void setToticmsn(BigDecimal toticmsn) {
		this.toticmsn = toticmsn;
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

	public BigDecimal getTotiss() {
		return this.totiss;
	}

	public void setTotiss(BigDecimal totiss) {
		this.totiss = totiss;
	}

	public BigDecimal getTotlb2() {
		return this.totlb2;
	}

	public void setTotlb2(BigDecimal totlb2) {
		this.totlb2 = totlb2;
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

	public BigDecimal getTotper() {
		return this.totper;
	}

	public void setTotper(BigDecimal totper) {
		this.totper = totper;
	}

	public BigDecimal getTotpis() {
		return this.totpis;
	}

	public void setTotpis(BigDecimal totpis) {
		this.totpis = totpis;
	}

	public BigDecimal getTotpiszf() {
		return this.totpiszf;
	}

	public void setTotpiszf(BigDecimal totpiszf) {
		this.totpiszf = totpiszf;
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

	public Integer getTotvol() {
		return this.totvol;
	}

	public void setTotvol(Integer totvol) {
		this.totvol = totvol;
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

	public BigDecimal getUltqts() {
		return this.ultqts;
	}

	public void setUltqts(BigDecimal ultqts) {
		this.ultqts = ultqts;
	}

	public BigDecimal getVaclb2() {
		return this.vaclb2;
	}

	public void setVaclb2(BigDecimal vaclb2) {
		this.vaclb2 = vaclb2;
	}

	public BigDecimal getValtmo() {
		return this.valtmo;
	}

	public void setValtmo(BigDecimal valtmo) {
		this.valtmo = valtmo;
	}

	public BigDecimal getVchcst() {
		return this.vchcst;
	}

	public void setVchcst(BigDecimal vchcst) {
		this.vchcst = vchcst;
	}

	public BigDecimal getVchlb2() {
		return this.vchlb2;
	}

	public void setVchlb2(BigDecimal vchlb2) {
		this.vchlb2 = vchlb2;
	}

	public BigDecimal getVcpcst() {
		return this.vcpcst;
	}

	public void setVcpcst(BigDecimal vcpcst) {
		this.vcpcst = vcpcst;
	}

	public BigDecimal getVcplb2() {
		return this.vcplb2;
	}

	public void setVcplb2(BigDecimal vcplb2) {
		this.vcplb2 = vcplb2;
	}

	public BigDecimal getVcrcst() {
		return this.vcrcst;
	}

	public void setVcrcst(BigDecimal vcrcst) {
		this.vcrcst = vcrcst;
	}

	public BigDecimal getVcrlb2() {
		return this.vcrlb2;
	}

	public void setVcrlb2(BigDecimal vcrlb2) {
		this.vcrlb2 = vcrlb2;
	}

	public BigDecimal getVcslb2() {
		return this.vcslb2;
	}

	public void setVcslb2(BigDecimal vcslb2) {
		this.vcslb2 = vcslb2;
	}

	public BigDecimal getVdplb2() {
		return this.vdplb2;
	}

	public void setVdplb2(BigDecimal vdplb2) {
		this.vdplb2 = vdplb2;
	}

	public BigDecimal getVdrlb2() {
		return this.vdrlb2;
	}

	public void setVdrlb2(BigDecimal vdrlb2) {
		this.vdrlb2 = vdrlb2;
	}

	public BigDecimal getVdscom() {
		return this.vdscom;
	}

	public void setVdscom(BigDecimal vdscom) {
		this.vdscom = vdscom;
	}

	public BigDecimal getVdslb2() {
		return this.vdslb2;
	}

	public void setVdslb2(BigDecimal vdslb2) {
		this.vdslb2 = vdslb2;
	}

	public BigDecimal getVldorgpublic() {
		return this.vldorgpublic;
	}

	public void setVldorgpublic(BigDecimal vldorgpublic) {
		this.vldorgpublic = vldorgpublic;
	}

	public BigDecimal getVlqlb2() {
		return this.vlqlb2;
	}

	public void setVlqlb2(BigDecimal vlqlb2) {
		this.vlqlb2 = vlqlb2;
	}

	public BigDecimal getVlulb2() {
		return this.vlulb2;
	}

	public void setVlulb2(BigDecimal vlulb2) {
		this.vlulb2 = vlulb2;
	}

	public BigDecimal getVmecst() {
		return this.vmecst;
	}

	public void setVmecst(BigDecimal vmecst) {
		this.vmecst = vmecst;
	}

	public BigDecimal getVmelb2() {
		return this.vmelb2;
	}

	public void setVmelb2(BigDecimal vmelb2) {
		this.vmelb2 = vmelb2;
	}

	public BigDecimal getVollb2() {
		return this.vollb2;
	}

	public void setVollb2(BigDecimal vollb2) {
		this.vollb2 = vollb2;
	}

	public BigDecimal getVpfcst() {
		return this.vpfcst;
	}

	public void setVpfcst(BigDecimal vpfcst) {
		this.vpfcst = vpfcst;
	}

	public BigDecimal getVpflb2() {
		return this.vpflb2;
	}

	public void setVpflb2(BigDecimal vpflb2) {
		this.vpflb2 = vpflb2;
	}

	public BigDecimal getVpfout() {
		return this.vpfout;
	}

	public void setVpfout(BigDecimal vpfout) {
		this.vpfout = vpfout;
	}

	public BigDecimal getVprcst() {
		return this.vprcst;
	}

	public void setVprcst(BigDecimal vprcst) {
		this.vprcst = vprcst;
	}

	public BigDecimal getVprlb2() {
		return this.vprlb2;
	}

	public void setVprlb2(BigDecimal vprlb2) {
		this.vprlb2 = vprlb2;
	}

	public BigDecimal getVrecst() {
		return this.vrecst;
	}

	public void setVrecst(BigDecimal vrecst) {
		this.vrecst = vrecst;
	}

	public BigDecimal getVrelb2() {
		return this.vrelb2;
	}

	public void setVrelb2(BigDecimal vrelb2) {
		this.vrelb2 = vrelb2;
	}

}