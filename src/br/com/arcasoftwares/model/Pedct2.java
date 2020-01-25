<<<<<<< HEAD
package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import br.com.arcasoftwares.model.primaryKey.Pedct2PK;


/**
 * The persistent class for the pedct2 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedct2.findAll", query="SELECT p FROM Pedct2 p")
public class Pedct2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedct2PK id;

	@Column(name="aliq_fcpufdest")
	private BigDecimal aliqFcpufdest;

	@Column(name="aliq_icmsinter")
	private BigDecimal aliqIcmsinter;

	@Column(name="aliq_icmsinterpart")
	private BigDecimal aliqIcmsinterpart;

	@Column(name="aliq_icmsufdest")
	private BigDecimal aliqIcmsufdest;

	private BigDecimal aliqcof;

	@Column(name="aliqcof_zf")
	private BigDecimal aliqcofZf;

	private BigDecimal aliqpis;

	@Column(name="aliqpis_zf")
	private BigDecimal aliqpisZf;

	private BigDecimal bascof;

	private BigDecimal basesb;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal baspis;

	private BigDecimal bassub;

	private BigDecimal brtct2;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String cbact2;

	private String cest;

	private String clsipi;

	@Column(name="cod_enq")
	private String codEnq;

	private Integer codcat;

	private String codcfo;

	private String codclp;

	private String codcor;

	private Integer codeit;

	private String codgru;

	private Integer codmrc;

	private String codpro;

	private String codst1;

	private String codst2;

	private String codstr;

	private String codsub;

	private String codtam;

	private Integer codtip;

	private String codtxf;

	private String codtxf2;

	private String codund;

	private String cstcof;

	private BigDecimal cstcst;

	private BigDecimal cstct2;

	private String cstipi;

	private String cstpis;

	private String desct2;

	private BigDecimal desicm;

	private BigDecimal desipi;

	private BigDecimal dessub;

	private BigDecimal dsccom;

	private BigDecimal dscct2;

	private BigDecimal dscicm;

	private BigDecimal dscipi;

	private BigDecimal dscorgpublic;

	private BigDecimal dscper;

	private BigDecimal dscreg;

	private BigDecimal dscsub;

	private BigDecimal dspct2;

	private BigDecimal dsrct2;

	private String flaseq;

	@Column(name="flg_desc_zf_cof")
	private String flgDescZfCof;

	@Column(name="flg_desc_zf_pis")
	private String flgDescZfPis;

	@Column(name="flg_sineif20")
	private String flgSineif20;

	private String flgdup;

	private String flgmobile;

	@Column(name="flgncalc_dif_mva")
	private String flgncalcDifMva;

	private BigDecimal frticm;

	private BigDecimal frtipi;

	private BigDecimal frtsub;

	private BigDecimal icmct2;

	private BigDecimal icmsub;

	@Column(name="id_esticm")
	private Integer idEsticm;

	@Column(name="id_pedct2")
	private Integer idPedct2;

	@Column(name="id_regra_fcp")
	private Integer idRegraFcp;

	private BigDecimal incfin;

	private BigDecimal increv;

	private BigDecimal ipict2;

	private BigDecimal issct2;

	private BigDecimal liqct2;

	private BigDecimal mrgsub;

	private Integer nroct2;

	private Integer numitemcompra;

	private String numpedcompra;

	private String obsct2;

	private BigDecimal pacct2;

	private BigDecimal qtdemb;

	private BigDecimal qtnct2;

	private BigDecimal qtpct2;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private BigDecimal redsub;

	private String refct2;

	private String regicm;

	private String regipi;

	private String regsub;

	private BigDecimal segicm;

	private BigDecimal segipi;

	private BigDecimal segsub;

	private Integer tabprc;

	private String tipicm;

	private String tipipi;

	private String tipstr;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcof;

	private BigDecimal totcofzf;

	private BigDecimal totcst;

	private BigDecimal totct2;

	private BigDecimal totdco;

	private BigDecimal totdescinc;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totfrt;

	private BigDecimal totge2;

	private BigDecimal totgeral;

	private BigDecimal toticm;

	private BigDecimal totipc;

	private BigDecimal totipi;

	private BigDecimal totitetrb;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totpis;

	private BigDecimal totpiszf;

	private BigDecimal totren;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private String trbcof;

	private String trbicm;

	private String trbipi;

	private String trbpis;

	private String trbsub;

	private BigDecimal vacct2;

	private BigDecimal vchcst;

	private BigDecimal vchct2;

	private BigDecimal vcpcst;

	private BigDecimal vcpct2;

	private BigDecimal vcrcst;

	private BigDecimal vcrct2;

	private BigDecimal vcsct2;

	private BigDecimal vdpct2;

	private BigDecimal vdrct2;

	private BigDecimal vdscom;

	private BigDecimal vdsct2;

	private BigDecimal vldorgpublic;

	private BigDecimal vlqct2;

	private BigDecimal vluct2;

	private BigDecimal vmecst;

	private BigDecimal vmect2;

	private BigDecimal volct2;

	private BigDecimal vpfcst;

	private BigDecimal vpfct2;

	private BigDecimal vprcst;

	private BigDecimal vprct2;

	private BigDecimal vrecst;

	private BigDecimal vrect2;

	//bi-directional many-to-one association to Pedcta
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp", insertable = false, updatable = false),
		@JoinColumn(name="dtecta", referencedColumnName="dtecta", insertable = false, updatable = false),
		@JoinColumn(name="numcta", referencedColumnName="numcta", insertable = false, updatable = false)
		})
	private Pedcta pedcta;

	public Pedct2() {
	}

	public Pedct2PK getId() {
		return this.id;
	}

	public void setId(Pedct2PK id) {
		this.id = id;
	}

	public BigDecimal getAliqFcpufdest() {
		return this.aliqFcpufdest;
	}

	public void setAliqFcpufdest(BigDecimal aliqFcpufdest) {
		this.aliqFcpufdest = aliqFcpufdest;
	}

	public BigDecimal getAliqIcmsinter() {
		return this.aliqIcmsinter;
	}

	public void setAliqIcmsinter(BigDecimal aliqIcmsinter) {
		this.aliqIcmsinter = aliqIcmsinter;
	}

	public BigDecimal getAliqIcmsinterpart() {
		return this.aliqIcmsinterpart;
	}

	public void setAliqIcmsinterpart(BigDecimal aliqIcmsinterpart) {
		this.aliqIcmsinterpart = aliqIcmsinterpart;
	}

	public BigDecimal getAliqIcmsufdest() {
		return this.aliqIcmsufdest;
	}

	public void setAliqIcmsufdest(BigDecimal aliqIcmsufdest) {
		this.aliqIcmsufdest = aliqIcmsufdest;
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

	public BigDecimal getBascof() {
		return this.bascof;
	}

	public void setBascof(BigDecimal bascof) {
		this.bascof = bascof;
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

	public BigDecimal getBrtct2() {
		return this.brtct2;
	}

	public void setBrtct2(BigDecimal brtct2) {
		this.brtct2 = brtct2;
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

	public String getCbact2() {
		return this.cbact2;
	}

	public void setCbact2(String cbact2) {
		this.cbact2 = cbact2;
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

	public String getCodEnq() {
		return this.codEnq;
	}

	public void setCodEnq(String codEnq) {
		this.codEnq = codEnq;
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

	public String getCodtxf2() {
		return this.codtxf2;
	}

	public void setCodtxf2(String codtxf2) {
		this.codtxf2 = codtxf2;
	}

	public String getCodund() {
		return this.codund;
	}

	public void setCodund(String codund) {
		this.codund = codund;
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

	public BigDecimal getCstct2() {
		return this.cstct2;
	}

	public void setCstct2(BigDecimal cstct2) {
		this.cstct2 = cstct2;
	}

	public String getCstipi() {
		return this.cstipi;
	}

	public void setCstipi(String cstipi) {
		this.cstipi = cstipi;
	}

	public String getCstpis() {
		return this.cstpis;
	}

	public void setCstpis(String cstpis) {
		this.cstpis = cstpis;
	}

	public String getDesct2() {
		return this.desct2;
	}

	public void setDesct2(String desct2) {
		this.desct2 = desct2;
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

	public BigDecimal getDscct2() {
		return this.dscct2;
	}

	public void setDscct2(BigDecimal dscct2) {
		this.dscct2 = dscct2;
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

	public BigDecimal getDspct2() {
		return this.dspct2;
	}

	public void setDspct2(BigDecimal dspct2) {
		this.dspct2 = dspct2;
	}

	public BigDecimal getDsrct2() {
		return this.dsrct2;
	}

	public void setDsrct2(BigDecimal dsrct2) {
		this.dsrct2 = dsrct2;
	}

	public String getFlaseq() {
		return this.flaseq;
	}

	public void setFlaseq(String flaseq) {
		this.flaseq = flaseq;
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

	public String getFlgSineif20() {
		return this.flgSineif20;
	}

	public void setFlgSineif20(String flgSineif20) {
		this.flgSineif20 = flgSineif20;
	}

	public String getFlgdup() {
		return this.flgdup;
	}

	public void setFlgdup(String flgdup) {
		this.flgdup = flgdup;
	}

	public String getFlgmobile() {
		return this.flgmobile;
	}

	public void setFlgmobile(String flgmobile) {
		this.flgmobile = flgmobile;
	}

	public String getFlgncalcDifMva() {
		return this.flgncalcDifMva;
	}

	public void setFlgncalcDifMva(String flgncalcDifMva) {
		this.flgncalcDifMva = flgncalcDifMva;
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

	public BigDecimal getIcmct2() {
		return this.icmct2;
	}

	public void setIcmct2(BigDecimal icmct2) {
		this.icmct2 = icmct2;
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

	public Integer getIdPedct2() {
		return this.idPedct2;
	}

	public void setIdPedct2(Integer idPedct2) {
		this.idPedct2 = idPedct2;
	}

	public Integer getIdRegraFcp() {
		return this.idRegraFcp;
	}

	public void setIdRegraFcp(Integer idRegraFcp) {
		this.idRegraFcp = idRegraFcp;
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

	public BigDecimal getIpict2() {
		return this.ipict2;
	}

	public void setIpict2(BigDecimal ipict2) {
		this.ipict2 = ipict2;
	}

	public BigDecimal getIssct2() {
		return this.issct2;
	}

	public void setIssct2(BigDecimal issct2) {
		this.issct2 = issct2;
	}

	public BigDecimal getLiqct2() {
		return this.liqct2;
	}

	public void setLiqct2(BigDecimal liqct2) {
		this.liqct2 = liqct2;
	}

	public BigDecimal getMrgsub() {
		return this.mrgsub;
	}

	public void setMrgsub(BigDecimal mrgsub) {
		this.mrgsub = mrgsub;
	}

	public Integer getNroct2() {
		return this.nroct2;
	}

	public void setNroct2(Integer nroct2) {
		this.nroct2 = nroct2;
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

	public String getObsct2() {
		return this.obsct2;
	}

	public void setObsct2(String obsct2) {
		this.obsct2 = obsct2;
	}

	public BigDecimal getPacct2() {
		return this.pacct2;
	}

	public void setPacct2(BigDecimal pacct2) {
		this.pacct2 = pacct2;
	}

	public BigDecimal getQtdemb() {
		return this.qtdemb;
	}

	public void setQtdemb(BigDecimal qtdemb) {
		this.qtdemb = qtdemb;
	}

	public BigDecimal getQtnct2() {
		return this.qtnct2;
	}

	public void setQtnct2(BigDecimal qtnct2) {
		this.qtnct2 = qtnct2;
	}

	public BigDecimal getQtpct2() {
		return this.qtpct2;
	}

	public void setQtpct2(BigDecimal qtpct2) {
		this.qtpct2 = qtpct2;
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

	public String getRefct2() {
		return this.refct2;
	}

	public void setRefct2(String refct2) {
		this.refct2 = refct2;
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

	public String getRegsub() {
		return this.regsub;
	}

	public void setRegsub(String regsub) {
		this.regsub = regsub;
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

	public BigDecimal getTotcofzf() {
		return this.totcofzf;
	}

	public void setTotcofzf(BigDecimal totcofzf) {
		this.totcofzf = totcofzf;
	}

	public BigDecimal getTotcst() {
		return this.totcst;
	}

	public void setTotcst(BigDecimal totcst) {
		this.totcst = totcst;
	}

	public BigDecimal getTotct2() {
		return this.totct2;
	}

	public void setTotct2(BigDecimal totct2) {
		this.totct2 = totct2;
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

	public BigDecimal getTotgeral() {
		return this.totgeral;
	}

	public void setTotgeral(BigDecimal totgeral) {
		this.totgeral = totgeral;
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

	public String getTrbsub() {
		return this.trbsub;
	}

	public void setTrbsub(String trbsub) {
		this.trbsub = trbsub;
	}

	public BigDecimal getVacct2() {
		return this.vacct2;
	}

	public void setVacct2(BigDecimal vacct2) {
		this.vacct2 = vacct2;
	}

	public BigDecimal getVchcst() {
		return this.vchcst;
	}

	public void setVchcst(BigDecimal vchcst) {
		this.vchcst = vchcst;
	}

	public BigDecimal getVchct2() {
		return this.vchct2;
	}

	public void setVchct2(BigDecimal vchct2) {
		this.vchct2 = vchct2;
	}

	public BigDecimal getVcpcst() {
		return this.vcpcst;
	}

	public void setVcpcst(BigDecimal vcpcst) {
		this.vcpcst = vcpcst;
	}

	public BigDecimal getVcpct2() {
		return this.vcpct2;
	}

	public void setVcpct2(BigDecimal vcpct2) {
		this.vcpct2 = vcpct2;
	}

	public BigDecimal getVcrcst() {
		return this.vcrcst;
	}

	public void setVcrcst(BigDecimal vcrcst) {
		this.vcrcst = vcrcst;
	}

	public BigDecimal getVcrct2() {
		return this.vcrct2;
	}

	public void setVcrct2(BigDecimal vcrct2) {
		this.vcrct2 = vcrct2;
	}

	public BigDecimal getVcsct2() {
		return this.vcsct2;
	}

	public void setVcsct2(BigDecimal vcsct2) {
		this.vcsct2 = vcsct2;
	}

	public BigDecimal getVdpct2() {
		return this.vdpct2;
	}

	public void setVdpct2(BigDecimal vdpct2) {
		this.vdpct2 = vdpct2;
	}

	public BigDecimal getVdrct2() {
		return this.vdrct2;
	}

	public void setVdrct2(BigDecimal vdrct2) {
		this.vdrct2 = vdrct2;
	}

	public BigDecimal getVdscom() {
		return this.vdscom;
	}

	public void setVdscom(BigDecimal vdscom) {
		this.vdscom = vdscom;
	}

	public BigDecimal getVdsct2() {
		return this.vdsct2;
	}

	public void setVdsct2(BigDecimal vdsct2) {
		this.vdsct2 = vdsct2;
	}

	public BigDecimal getVldorgpublic() {
		return this.vldorgpublic;
	}

	public void setVldorgpublic(BigDecimal vldorgpublic) {
		this.vldorgpublic = vldorgpublic;
	}

	public BigDecimal getVlqct2() {
		return this.vlqct2;
	}

	public void setVlqct2(BigDecimal vlqct2) {
		this.vlqct2 = vlqct2;
	}

	public BigDecimal getVluct2() {
		return this.vluct2;
	}

	public void setVluct2(BigDecimal vluct2) {
		this.vluct2 = vluct2;
	}

	public BigDecimal getVmecst() {
		return this.vmecst;
	}

	public void setVmecst(BigDecimal vmecst) {
		this.vmecst = vmecst;
	}

	public BigDecimal getVmect2() {
		return this.vmect2;
	}

	public void setVmect2(BigDecimal vmect2) {
		this.vmect2 = vmect2;
	}

	public BigDecimal getVolct2() {
		return this.volct2;
	}

	public void setVolct2(BigDecimal volct2) {
		this.volct2 = volct2;
	}

	public BigDecimal getVpfcst() {
		return this.vpfcst;
	}

	public void setVpfcst(BigDecimal vpfcst) {
		this.vpfcst = vpfcst;
	}

	public BigDecimal getVpfct2() {
		return this.vpfct2;
	}

	public void setVpfct2(BigDecimal vpfct2) {
		this.vpfct2 = vpfct2;
	}

	public BigDecimal getVprcst() {
		return this.vprcst;
	}

	public void setVprcst(BigDecimal vprcst) {
		this.vprcst = vprcst;
	}

	public BigDecimal getVprct2() {
		return this.vprct2;
	}

	public void setVprct2(BigDecimal vprct2) {
		this.vprct2 = vprct2;
	}

	public BigDecimal getVrecst() {
		return this.vrecst;
	}

	public void setVrecst(BigDecimal vrecst) {
		this.vrecst = vrecst;
	}

	public BigDecimal getVrect2() {
		return this.vrect2;
	}

	public void setVrect2(BigDecimal vrect2) {
		this.vrect2 = vrect2;
	}

	public Pedcta getPedcta() {
		return this.pedcta;
	}

	public void setPedcta(Pedcta pedcta) {
		this.pedcta = pedcta;
	}

=======
package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import br.com.arcasoftwares.model.primaryKey.Pedct2PK;


/**
 * The persistent class for the pedct2 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedct2.findAll", query="SELECT p FROM Pedct2 p")
public class Pedct2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedct2PK id;

	@Column(name="aliq_fcpufdest")
	private BigDecimal aliqFcpufdest;

	@Column(name="aliq_icmsinter")
	private BigDecimal aliqIcmsinter;

	@Column(name="aliq_icmsinterpart")
	private BigDecimal aliqIcmsinterpart;

	@Column(name="aliq_icmsufdest")
	private BigDecimal aliqIcmsufdest;

	private BigDecimal aliqcof;

	@Column(name="aliqcof_zf")
	private BigDecimal aliqcofZf;

	private BigDecimal aliqpis;

	@Column(name="aliqpis_zf")
	private BigDecimal aliqpisZf;

	private BigDecimal bascof;

	private BigDecimal basesb;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal baspis;

	private BigDecimal bassub;

	private BigDecimal brtct2;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String cbact2;

	private String cest;

	private String clsipi;

	@Column(name="cod_enq")
	private String codEnq;

	private Integer codcat;

	private String codcfo;

	private String codclp;

	private String codcor;

	private Integer codeit;

	private String codgru;

	private Integer codmrc;

	private String codpro;

	private String codst1;

	private String codst2;

	private String codstr;

	private String codsub;

	private String codtam;

	private Integer codtip;

	private String codtxf;

	private String codtxf2;

	private String codund;

	private String cstcof;

	private BigDecimal cstcst;

	private BigDecimal cstct2;

	private String cstipi;

	private String cstpis;

	private String desct2;

	private BigDecimal desicm;

	private BigDecimal desipi;

	private BigDecimal dessub;

	private BigDecimal dsccom;

	private BigDecimal dscct2;

	private BigDecimal dscicm;

	private BigDecimal dscipi;

	private BigDecimal dscorgpublic;

	private BigDecimal dscper;

	private BigDecimal dscreg;

	private BigDecimal dscsub;

	private BigDecimal dspct2;

	private BigDecimal dsrct2;

	private String flaseq;

	@Column(name="flg_desc_zf_cof")
	private String flgDescZfCof;

	@Column(name="flg_desc_zf_pis")
	private String flgDescZfPis;

	@Column(name="flg_sineif20")
	private String flgSineif20;

	private String flgdup;

	private String flgmobile;

	@Column(name="flgncalc_dif_mva")
	private String flgncalcDifMva;

	private BigDecimal frticm;

	private BigDecimal frtipi;

	private BigDecimal frtsub;

	private BigDecimal icmct2;

	private BigDecimal icmsub;

	@Column(name="id_esticm")
	private Integer idEsticm;

	@Column(name="id_pedct2")
	private Integer idPedct2;

	@Column(name="id_regra_fcp")
	private Integer idRegraFcp;

	private BigDecimal incfin;

	private BigDecimal increv;

	private BigDecimal ipict2;

	private BigDecimal issct2;

	private BigDecimal liqct2;

	private BigDecimal mrgsub;

	private Integer nroct2;

	private Integer numitemcompra;

	private String numpedcompra;

	private String obsct2;

	private BigDecimal pacct2;

	private BigDecimal qtdemb;

	private BigDecimal qtnct2;

	private BigDecimal qtpct2;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private BigDecimal redsub;

	private String refct2;

	private String regicm;

	private String regipi;

	private String regsub;

	private BigDecimal segicm;

	private BigDecimal segipi;

	private BigDecimal segsub;

	private Integer tabprc;

	private String tipicm;

	private String tipipi;

	private String tipstr;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcof;

	private BigDecimal totcofzf;

	private BigDecimal totcst;

	private BigDecimal totct2;

	private BigDecimal totdco;

	private BigDecimal totdescinc;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totfrt;

	private BigDecimal totge2;

	private BigDecimal totgeral;

	private BigDecimal toticm;

	private BigDecimal totipc;

	private BigDecimal totipi;

	private BigDecimal totitetrb;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totpis;

	private BigDecimal totpiszf;

	private BigDecimal totren;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private String trbcof;

	private String trbicm;

	private String trbipi;

	private String trbpis;

	private String trbsub;

	private BigDecimal vacct2;

	private BigDecimal vchcst;

	private BigDecimal vchct2;

	private BigDecimal vcpcst;

	private BigDecimal vcpct2;

	private BigDecimal vcrcst;

	private BigDecimal vcrct2;

	private BigDecimal vcsct2;

	private BigDecimal vdpct2;

	private BigDecimal vdrct2;

	private BigDecimal vdscom;

	private BigDecimal vdsct2;

	private BigDecimal vldorgpublic;

	private BigDecimal vlqct2;

	private BigDecimal vluct2;

	private BigDecimal vmecst;

	private BigDecimal vmect2;

	private BigDecimal volct2;

	private BigDecimal vpfcst;

	private BigDecimal vpfct2;

	private BigDecimal vprcst;

	private BigDecimal vprct2;

	private BigDecimal vrecst;

	private BigDecimal vrect2;

	//bi-directional many-to-one association to Pedcta
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp", insertable = false, updatable = false),
		@JoinColumn(name="dtecta", referencedColumnName="dtecta", insertable = false, updatable = false),
		@JoinColumn(name="numcta", referencedColumnName="numcta", insertable = false, updatable = false)
		})
	private Pedcta pedcta;

	public Pedct2() {
	}

	public Pedct2PK getId() {
		return this.id;
	}

	public void setId(Pedct2PK id) {
		this.id = id;
	}

	public BigDecimal getAliqFcpufdest() {
		return this.aliqFcpufdest;
	}

	public void setAliqFcpufdest(BigDecimal aliqFcpufdest) {
		this.aliqFcpufdest = aliqFcpufdest;
	}

	public BigDecimal getAliqIcmsinter() {
		return this.aliqIcmsinter;
	}

	public void setAliqIcmsinter(BigDecimal aliqIcmsinter) {
		this.aliqIcmsinter = aliqIcmsinter;
	}

	public BigDecimal getAliqIcmsinterpart() {
		return this.aliqIcmsinterpart;
	}

	public void setAliqIcmsinterpart(BigDecimal aliqIcmsinterpart) {
		this.aliqIcmsinterpart = aliqIcmsinterpart;
	}

	public BigDecimal getAliqIcmsufdest() {
		return this.aliqIcmsufdest;
	}

	public void setAliqIcmsufdest(BigDecimal aliqIcmsufdest) {
		this.aliqIcmsufdest = aliqIcmsufdest;
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

	public BigDecimal getBascof() {
		return this.bascof;
	}

	public void setBascof(BigDecimal bascof) {
		this.bascof = bascof;
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

	public BigDecimal getBrtct2() {
		return this.brtct2;
	}

	public void setBrtct2(BigDecimal brtct2) {
		this.brtct2 = brtct2;
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

	public String getCbact2() {
		return this.cbact2;
	}

	public void setCbact2(String cbact2) {
		this.cbact2 = cbact2;
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

	public String getCodEnq() {
		return this.codEnq;
	}

	public void setCodEnq(String codEnq) {
		this.codEnq = codEnq;
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

	public String getCodtxf2() {
		return this.codtxf2;
	}

	public void setCodtxf2(String codtxf2) {
		this.codtxf2 = codtxf2;
	}

	public String getCodund() {
		return this.codund;
	}

	public void setCodund(String codund) {
		this.codund = codund;
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

	public BigDecimal getCstct2() {
		return this.cstct2;
	}

	public void setCstct2(BigDecimal cstct2) {
		this.cstct2 = cstct2;
	}

	public String getCstipi() {
		return this.cstipi;
	}

	public void setCstipi(String cstipi) {
		this.cstipi = cstipi;
	}

	public String getCstpis() {
		return this.cstpis;
	}

	public void setCstpis(String cstpis) {
		this.cstpis = cstpis;
	}

	public String getDesct2() {
		return this.desct2;
	}

	public void setDesct2(String desct2) {
		this.desct2 = desct2;
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

	public BigDecimal getDscct2() {
		return this.dscct2;
	}

	public void setDscct2(BigDecimal dscct2) {
		this.dscct2 = dscct2;
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

	public BigDecimal getDspct2() {
		return this.dspct2;
	}

	public void setDspct2(BigDecimal dspct2) {
		this.dspct2 = dspct2;
	}

	public BigDecimal getDsrct2() {
		return this.dsrct2;
	}

	public void setDsrct2(BigDecimal dsrct2) {
		this.dsrct2 = dsrct2;
	}

	public String getFlaseq() {
		return this.flaseq;
	}

	public void setFlaseq(String flaseq) {
		this.flaseq = flaseq;
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

	public String getFlgSineif20() {
		return this.flgSineif20;
	}

	public void setFlgSineif20(String flgSineif20) {
		this.flgSineif20 = flgSineif20;
	}

	public String getFlgdup() {
		return this.flgdup;
	}

	public void setFlgdup(String flgdup) {
		this.flgdup = flgdup;
	}

	public String getFlgmobile() {
		return this.flgmobile;
	}

	public void setFlgmobile(String flgmobile) {
		this.flgmobile = flgmobile;
	}

	public String getFlgncalcDifMva() {
		return this.flgncalcDifMva;
	}

	public void setFlgncalcDifMva(String flgncalcDifMva) {
		this.flgncalcDifMva = flgncalcDifMva;
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

	public BigDecimal getIcmct2() {
		return this.icmct2;
	}

	public void setIcmct2(BigDecimal icmct2) {
		this.icmct2 = icmct2;
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

	public Integer getIdPedct2() {
		return this.idPedct2;
	}

	public void setIdPedct2(Integer idPedct2) {
		this.idPedct2 = idPedct2;
	}

	public Integer getIdRegraFcp() {
		return this.idRegraFcp;
	}

	public void setIdRegraFcp(Integer idRegraFcp) {
		this.idRegraFcp = idRegraFcp;
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

	public BigDecimal getIpict2() {
		return this.ipict2;
	}

	public void setIpict2(BigDecimal ipict2) {
		this.ipict2 = ipict2;
	}

	public BigDecimal getIssct2() {
		return this.issct2;
	}

	public void setIssct2(BigDecimal issct2) {
		this.issct2 = issct2;
	}

	public BigDecimal getLiqct2() {
		return this.liqct2;
	}

	public void setLiqct2(BigDecimal liqct2) {
		this.liqct2 = liqct2;
	}

	public BigDecimal getMrgsub() {
		return this.mrgsub;
	}

	public void setMrgsub(BigDecimal mrgsub) {
		this.mrgsub = mrgsub;
	}

	public Integer getNroct2() {
		return this.nroct2;
	}

	public void setNroct2(Integer nroct2) {
		this.nroct2 = nroct2;
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

	public String getObsct2() {
		return this.obsct2;
	}

	public void setObsct2(String obsct2) {
		this.obsct2 = obsct2;
	}

	public BigDecimal getPacct2() {
		return this.pacct2;
	}

	public void setPacct2(BigDecimal pacct2) {
		this.pacct2 = pacct2;
	}

	public BigDecimal getQtdemb() {
		return this.qtdemb;
	}

	public void setQtdemb(BigDecimal qtdemb) {
		this.qtdemb = qtdemb;
	}

	public BigDecimal getQtnct2() {
		return this.qtnct2;
	}

	public void setQtnct2(BigDecimal qtnct2) {
		this.qtnct2 = qtnct2;
	}

	public BigDecimal getQtpct2() {
		return this.qtpct2;
	}

	public void setQtpct2(BigDecimal qtpct2) {
		this.qtpct2 = qtpct2;
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

	public String getRefct2() {
		return this.refct2;
	}

	public void setRefct2(String refct2) {
		this.refct2 = refct2;
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

	public String getRegsub() {
		return this.regsub;
	}

	public void setRegsub(String regsub) {
		this.regsub = regsub;
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

	public BigDecimal getTotcofzf() {
		return this.totcofzf;
	}

	public void setTotcofzf(BigDecimal totcofzf) {
		this.totcofzf = totcofzf;
	}

	public BigDecimal getTotcst() {
		return this.totcst;
	}

	public void setTotcst(BigDecimal totcst) {
		this.totcst = totcst;
	}

	public BigDecimal getTotct2() {
		return this.totct2;
	}

	public void setTotct2(BigDecimal totct2) {
		this.totct2 = totct2;
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

	public BigDecimal getTotgeral() {
		return this.totgeral;
	}

	public void setTotgeral(BigDecimal totgeral) {
		this.totgeral = totgeral;
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

	public String getTrbsub() {
		return this.trbsub;
	}

	public void setTrbsub(String trbsub) {
		this.trbsub = trbsub;
	}

	public BigDecimal getVacct2() {
		return this.vacct2;
	}

	public void setVacct2(BigDecimal vacct2) {
		this.vacct2 = vacct2;
	}

	public BigDecimal getVchcst() {
		return this.vchcst;
	}

	public void setVchcst(BigDecimal vchcst) {
		this.vchcst = vchcst;
	}

	public BigDecimal getVchct2() {
		return this.vchct2;
	}

	public void setVchct2(BigDecimal vchct2) {
		this.vchct2 = vchct2;
	}

	public BigDecimal getVcpcst() {
		return this.vcpcst;
	}

	public void setVcpcst(BigDecimal vcpcst) {
		this.vcpcst = vcpcst;
	}

	public BigDecimal getVcpct2() {
		return this.vcpct2;
	}

	public void setVcpct2(BigDecimal vcpct2) {
		this.vcpct2 = vcpct2;
	}

	public BigDecimal getVcrcst() {
		return this.vcrcst;
	}

	public void setVcrcst(BigDecimal vcrcst) {
		this.vcrcst = vcrcst;
	}

	public BigDecimal getVcrct2() {
		return this.vcrct2;
	}

	public void setVcrct2(BigDecimal vcrct2) {
		this.vcrct2 = vcrct2;
	}

	public BigDecimal getVcsct2() {
		return this.vcsct2;
	}

	public void setVcsct2(BigDecimal vcsct2) {
		this.vcsct2 = vcsct2;
	}

	public BigDecimal getVdpct2() {
		return this.vdpct2;
	}

	public void setVdpct2(BigDecimal vdpct2) {
		this.vdpct2 = vdpct2;
	}

	public BigDecimal getVdrct2() {
		return this.vdrct2;
	}

	public void setVdrct2(BigDecimal vdrct2) {
		this.vdrct2 = vdrct2;
	}

	public BigDecimal getVdscom() {
		return this.vdscom;
	}

	public void setVdscom(BigDecimal vdscom) {
		this.vdscom = vdscom;
	}

	public BigDecimal getVdsct2() {
		return this.vdsct2;
	}

	public void setVdsct2(BigDecimal vdsct2) {
		this.vdsct2 = vdsct2;
	}

	public BigDecimal getVldorgpublic() {
		return this.vldorgpublic;
	}

	public void setVldorgpublic(BigDecimal vldorgpublic) {
		this.vldorgpublic = vldorgpublic;
	}

	public BigDecimal getVlqct2() {
		return this.vlqct2;
	}

	public void setVlqct2(BigDecimal vlqct2) {
		this.vlqct2 = vlqct2;
	}

	public BigDecimal getVluct2() {
		return this.vluct2;
	}

	public void setVluct2(BigDecimal vluct2) {
		this.vluct2 = vluct2;
	}

	public BigDecimal getVmecst() {
		return this.vmecst;
	}

	public void setVmecst(BigDecimal vmecst) {
		this.vmecst = vmecst;
	}

	public BigDecimal getVmect2() {
		return this.vmect2;
	}

	public void setVmect2(BigDecimal vmect2) {
		this.vmect2 = vmect2;
	}

	public BigDecimal getVolct2() {
		return this.volct2;
	}

	public void setVolct2(BigDecimal volct2) {
		this.volct2 = volct2;
	}

	public BigDecimal getVpfcst() {
		return this.vpfcst;
	}

	public void setVpfcst(BigDecimal vpfcst) {
		this.vpfcst = vpfcst;
	}

	public BigDecimal getVpfct2() {
		return this.vpfct2;
	}

	public void setVpfct2(BigDecimal vpfct2) {
		this.vpfct2 = vpfct2;
	}

	public BigDecimal getVprcst() {
		return this.vprcst;
	}

	public void setVprcst(BigDecimal vprcst) {
		this.vprcst = vprcst;
	}

	public BigDecimal getVprct2() {
		return this.vprct2;
	}

	public void setVprct2(BigDecimal vprct2) {
		this.vprct2 = vprct2;
	}

	public BigDecimal getVrecst() {
		return this.vrecst;
	}

	public void setVrecst(BigDecimal vrecst) {
		this.vrecst = vrecst;
	}

	public BigDecimal getVrect2() {
		return this.vrect2;
	}

	public void setVrect2(BigDecimal vrect2) {
		this.vrect2 = vrect2;
	}

	public Pedcta getPedcta() {
		return this.pedcta;
	}

	public void setPedcta(Pedcta pedcta) {
		this.pedcta = pedcta;
	}

>>>>>>> ec6b347c2e7ce48f2cf4c2fe44ad79d0a7341b57
}