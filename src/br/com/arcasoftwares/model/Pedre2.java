package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.arcasoftwares.model.primaryKey.Pedre2PK;


/**
 * The persistent class for the pedre2 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedre2.findAll", query="SELECT p FROM Pedre2 p")
public class Pedre2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedre2PK id;

	@Column(name="aliq_fcpufdest")
	private BigDecimal aliqFcpufdest;

	@Column(name="aliq_ibpt")
	private BigDecimal aliqIbpt;

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

	private Integer anores;

	private BigDecimal bascat;

	private BigDecimal bascof;

	private BigDecimal bascom;

	private BigDecimal basesb;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal basiss;

	private BigDecimal baspis;

	private BigDecimal bassub;

	private BigDecimal brtre2;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String cbare2;

	private String cest;

	private String clfre2;

	private String clsipi;

	@Column(name="cod_enq")
	private String codEnq;

	private Integer codcat;

	private String codcfo;

	private String codclp;

	private String codcom;

	private String codcor;

	private Integer coddesoneracao;

	private Integer codeit;

	private String codgru;

	private String codicl;

	@Column(name="codigo_ibpt")
	private String codigoIbpt;

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

	private String codtxf2;

	private String codund;

	private String codvwa;

	private BigDecimal comcli;

	private String cstcof;

	private BigDecimal cstcst;

	private String cstipi;

	private BigDecimal cstlan;

	private String cstpis;

	private BigDecimal cstre2;

	private BigDecimal cubre2;

	private BigDecimal desicm;

	private BigDecimal desipi;

	private String desre2;

	private BigDecimal dessub;

	private BigDecimal difdsc;

	private BigDecimal dsccom;

	private BigDecimal dscicm;

	private BigDecimal dscipi;

	private BigDecimal dscorgpublic;

	private BigDecimal dscper;

	private BigDecimal dscre2;

	private BigDecimal dscreg;

	private BigDecimal dscsub;

	private BigDecimal dspre2;

	private BigDecimal dsrre2;

	@Temporal(TemporalType.DATE)
	private Date dteent;

	@Temporal(TemporalType.DATE)
	private Date dteger;

	@Temporal(TemporalType.DATE)
	private Date dteped;

	private Integer empent;

	private Integer empger;

	private Integer empped;

	@Column(name="ex_ibpt")
	private String exIbpt;

	private String flaseq;

	@Column(name="flg_desc_zf_cof")
	private String flgDescZfCof;

	@Column(name="flg_desc_zf_pis")
	private String flgDescZfPis;

	@Column(name="flg_sineif20")
	private String flgSineif20;

	private String flgatu;

	private String flgdup;

	private String flgfab;

	private String flgfec;

	private String flglib;

	private String flgmar;

	private String flgmobile;

	@Column(name="flgncalc_dif_mva")
	private String flgncalcDifMva;

	private String flgpac;

	private String flgren;

	private String flgreq;

	private String flgres;

	private String flgval;

	private BigDecimal frticm;

	private BigDecimal frtipi;

	private BigDecimal frtsub;

	private BigDecimal icmre2;

	private BigDecimal icmre2sn;

	private BigDecimal icmsub;

	@Column(name="id_esticm")
	private Integer idEsticm;

	@Column(name="id_lojpe2")
	private Integer idLojpe2;

	@Column(name="id_pedct2")
	private Integer idPedct2;

	@Column(name="id_pedger")
	private Integer idPedger;

	@Column(name="id_pedgr3")
	private Integer idPedgr3;

	@Column(name="id_pedicl")
	private Integer idPedicl;

	@Column(name="id_pedre2")
	private Integer idPedre2;

	@Column(name="id_pedres")
	private Integer idPedres;

	@Column(name="id_regra_fcp")
	private Integer idRegraFcp;

	private BigDecimal incfin;

	private BigDecimal increv;

	private BigDecimal ipire2;

	@Column(name="is_cta")
	private Integer isCta;

	private BigDecimal issre2;

	private String lancst;

	private Integer linre2;

	private BigDecimal liqre2;

	private BigDecimal lucrol;

	private BigDecimal lucrop;

	private BigDecimal marped;

	private BigDecimal marpre;

	private BigDecimal medcat;

	private String mesres;

	private BigDecimal mrgsub;

	private Integer nroite;

	private Integer nrore2;

	private Integer nument;

	private Integer numger;

	private Integer numitemcompra;

	private Integer numped;

	private String numpedcompra;

	private String obsre2;

	private BigDecimal outcst;

	private BigDecimal pacre2;

	private BigDecimal papre2;

	private BigDecimal pcoatd;

	private BigDecimal pcore2;

	private BigDecimal pdpre2;

	private String pedcli;

	private String prodep;

	private BigDecimal qtdemb;

	private BigDecimal qtdfab;

	private BigDecimal qtdre2;

	private BigDecimal qtdsep;

	private BigDecimal qtfre2;

	private Integer qtire4;

	private BigDecimal qtpre2;

	private BigDecimal qtsre2;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private BigDecimal redsub;

	private String refre2;

	private String regicm;

	private String regipi;

	private String regsub;

	private BigDecimal segicm;

	private BigDecimal segipi;

	private BigDecimal segsub;

	private Integer seqen2;

	private Integer seqgr2;

	private Integer seqgr3;

	private Integer seqpe2;

	private Integer seqpr2;

	private BigDecimal sldfab;

	private BigDecimal sldre2;

	private BigDecimal sldsep;

	private Integer tabprc;

	private String tipacr;

	private String tipcpa;

	private String tipdsc;

	private String tipicm;

	private String tipipi;

	private String tipstr;

	private BigDecimal totacp;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcat;

	private BigDecimal totcli;

	private BigDecimal totcof;

	private BigDecimal totcofzf;

	private BigDecimal totcom;

	private BigDecimal totcst;

	private BigDecimal totcub;

	private BigDecimal totdco;

	private BigDecimal totdescinc;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totfrt;

	private BigDecimal totge2;

	private BigDecimal totgeral;

	private BigDecimal totibpt;

	private BigDecimal toticm;

	private BigDecimal toticmsn;

	private BigDecimal totipc;

	private BigDecimal totipi;

	private BigDecimal totiss;

	private BigDecimal totitetrb;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totper;

	private BigDecimal totpis;

	private BigDecimal totpiszf;

	private BigDecimal totre2;

	private BigDecimal totren;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private Integer totvol;

	private String trbicm;

	private String trbipi;

	private String trbsub;

	private BigDecimal ultqts;

	private BigDecimal vacre2;

	private BigDecimal valcli;

	private BigDecimal vapre2;

	private BigDecimal vchcst;

	private BigDecimal vchre2;

	private BigDecimal vcpcst;

	private BigDecimal vcpre2;

	private BigDecimal vcrcst;

	private BigDecimal vcrre2;

	private BigDecimal vcsre2;

	private BigDecimal vdpre2;

	private BigDecimal vdrre2;

	private BigDecimal vdscom;

	private BigDecimal vdsre2;

	private BigDecimal vldorgpublic;

	private BigDecimal vlqre2;

	private BigDecimal vlure2;

	private BigDecimal vmecst;

	private BigDecimal vmere2;

	private BigDecimal volre2;

	private BigDecimal vpfcst;

	private BigDecimal vpfout;

	private BigDecimal vpfre2;

	private BigDecimal vprcst;

	private BigDecimal vprre2;

	private BigDecimal vrecst;

	private BigDecimal vrere2;

	//bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp", insertable = false, updatable = false),
		@JoinColumn(name="dteres", referencedColumnName="dteres", insertable = false, updatable = false),
		@JoinColumn(name="numres", referencedColumnName="numres", insertable = false, updatable = false)
		})
	private Pedres pedres;

	public Pedre2() {
	}

	public Pedre2PK getId() {
		return this.id;
	}

	public void setId(Pedre2PK id) {
		this.id = id;
	}

	public BigDecimal getAliqFcpufdest() {
		return this.aliqFcpufdest;
	}

	public void setAliqFcpufdest(BigDecimal aliqFcpufdest) {
		this.aliqFcpufdest = aliqFcpufdest;
	}

	public BigDecimal getAliqIbpt() {
		return this.aliqIbpt;
	}

	public void setAliqIbpt(BigDecimal aliqIbpt) {
		this.aliqIbpt = aliqIbpt;
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

	public Integer getAnores() {
		return this.anores;
	}

	public void setAnores(Integer anores) {
		this.anores = anores;
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

	public BigDecimal getBrtre2() {
		return this.brtre2;
	}

	public void setBrtre2(BigDecimal brtre2) {
		this.brtre2 = brtre2;
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

	public String getCbare2() {
		return this.cbare2;
	}

	public void setCbare2(String cbare2) {
		this.cbare2 = cbare2;
	}

	public String getCest() {
		return this.cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public String getClfre2() {
		return this.clfre2;
	}

	public void setClfre2(String clfre2) {
		this.clfre2 = clfre2;
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

	public String getCodcom() {
		return this.codcom;
	}

	public void setCodcom(String codcom) {
		this.codcom = codcom;
	}

	public String getCodcor() {
		return this.codcor;
	}

	public void setCodcor(String codcor) {
		this.codcor = codcor;
	}

	public Integer getCoddesoneracao() {
		return this.coddesoneracao;
	}

	public void setCoddesoneracao(Integer coddesoneracao) {
		this.coddesoneracao = coddesoneracao;
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

	public String getCodicl() {
		return this.codicl;
	}

	public void setCodicl(String codicl) {
		this.codicl = codicl;
	}

	public String getCodigoIbpt() {
		return this.codigoIbpt;
	}

	public void setCodigoIbpt(String codigoIbpt) {
		this.codigoIbpt = codigoIbpt;
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

	public String getCodvwa() {
		return this.codvwa;
	}

	public void setCodvwa(String codvwa) {
		this.codvwa = codvwa;
	}

	public BigDecimal getComcli() {
		return this.comcli;
	}

	public void setComcli(BigDecimal comcli) {
		this.comcli = comcli;
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

	public BigDecimal getCstlan() {
		return this.cstlan;
	}

	public void setCstlan(BigDecimal cstlan) {
		this.cstlan = cstlan;
	}

	public String getCstpis() {
		return this.cstpis;
	}

	public void setCstpis(String cstpis) {
		this.cstpis = cstpis;
	}

	public BigDecimal getCstre2() {
		return this.cstre2;
	}

	public void setCstre2(BigDecimal cstre2) {
		this.cstre2 = cstre2;
	}

	public BigDecimal getCubre2() {
		return this.cubre2;
	}

	public void setCubre2(BigDecimal cubre2) {
		this.cubre2 = cubre2;
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

	public String getDesre2() {
		return this.desre2;
	}

	public void setDesre2(String desre2) {
		this.desre2 = desre2;
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

	public BigDecimal getDscre2() {
		return this.dscre2;
	}

	public void setDscre2(BigDecimal dscre2) {
		this.dscre2 = dscre2;
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

	public BigDecimal getDspre2() {
		return this.dspre2;
	}

	public void setDspre2(BigDecimal dspre2) {
		this.dspre2 = dspre2;
	}

	public BigDecimal getDsrre2() {
		return this.dsrre2;
	}

	public void setDsrre2(BigDecimal dsrre2) {
		this.dsrre2 = dsrre2;
	}

	public Date getDteent() {
		return this.dteent;
	}

	public void setDteent(Date dteent) {
		this.dteent = dteent;
	}

	public Date getDteger() {
		return this.dteger;
	}

	public void setDteger(Date dteger) {
		this.dteger = dteger;
	}

	public Date getDteped() {
		return this.dteped;
	}

	public void setDteped(Date dteped) {
		this.dteped = dteped;
	}

	public Integer getEmpent() {
		return this.empent;
	}

	public void setEmpent(Integer empent) {
		this.empent = empent;
	}

	public Integer getEmpger() {
		return this.empger;
	}

	public void setEmpger(Integer empger) {
		this.empger = empger;
	}

	public Integer getEmpped() {
		return this.empped;
	}

	public void setEmpped(Integer empped) {
		this.empped = empped;
	}

	public String getExIbpt() {
		return this.exIbpt;
	}

	public void setExIbpt(String exIbpt) {
		this.exIbpt = exIbpt;
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

	public String getFlgatu() {
		return this.flgatu;
	}

	public void setFlgatu(String flgatu) {
		this.flgatu = flgatu;
	}

	public String getFlgdup() {
		return this.flgdup;
	}

	public void setFlgdup(String flgdup) {
		this.flgdup = flgdup;
	}

	public String getFlgfab() {
		return this.flgfab;
	}

	public void setFlgfab(String flgfab) {
		this.flgfab = flgfab;
	}

	public String getFlgfec() {
		return this.flgfec;
	}

	public void setFlgfec(String flgfec) {
		this.flgfec = flgfec;
	}

	public String getFlglib() {
		return this.flglib;
	}

	public void setFlglib(String flglib) {
		this.flglib = flglib;
	}

	public String getFlgmar() {
		return this.flgmar;
	}

	public void setFlgmar(String flgmar) {
		this.flgmar = flgmar;
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

	public String getFlgpac() {
		return this.flgpac;
	}

	public void setFlgpac(String flgpac) {
		this.flgpac = flgpac;
	}

	public String getFlgren() {
		return this.flgren;
	}

	public void setFlgren(String flgren) {
		this.flgren = flgren;
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

	public String getFlgval() {
		return this.flgval;
	}

	public void setFlgval(String flgval) {
		this.flgval = flgval;
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

	public BigDecimal getIcmre2() {
		return this.icmre2;
	}

	public void setIcmre2(BigDecimal icmre2) {
		this.icmre2 = icmre2;
	}

	public BigDecimal getIcmre2sn() {
		return this.icmre2sn;
	}

	public void setIcmre2sn(BigDecimal icmre2sn) {
		this.icmre2sn = icmre2sn;
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

	public Integer getIdLojpe2() {
		return this.idLojpe2;
	}

	public void setIdLojpe2(Integer idLojpe2) {
		this.idLojpe2 = idLojpe2;
	}

	public Integer getIdPedct2() {
		return this.idPedct2;
	}

	public void setIdPedct2(Integer idPedct2) {
		this.idPedct2 = idPedct2;
	}

	public Integer getIdPedger() {
		return this.idPedger;
	}

	public void setIdPedger(Integer idPedger) {
		this.idPedger = idPedger;
	}

	public Integer getIdPedgr3() {
		return this.idPedgr3;
	}

	public void setIdPedgr3(Integer idPedgr3) {
		this.idPedgr3 = idPedgr3;
	}

	public Integer getIdPedicl() {
		return this.idPedicl;
	}

	public void setIdPedicl(Integer idPedicl) {
		this.idPedicl = idPedicl;
	}

	public Integer getIdPedre2() {
		return this.idPedre2;
	}

	public void setIdPedre2(Integer idPedre2) {
		this.idPedre2 = idPedre2;
	}

	public Integer getIdPedres() {
		return this.idPedres;
	}

	public void setIdPedres(Integer idPedres) {
		this.idPedres = idPedres;
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

	public BigDecimal getIpire2() {
		return this.ipire2;
	}

	public void setIpire2(BigDecimal ipire2) {
		this.ipire2 = ipire2;
	}

	public Integer getIsCta() {
		return this.isCta;
	}

	public void setIsCta(Integer isCta) {
		this.isCta = isCta;
	}

	public BigDecimal getIssre2() {
		return this.issre2;
	}

	public void setIssre2(BigDecimal issre2) {
		this.issre2 = issre2;
	}

	public String getLancst() {
		return this.lancst;
	}

	public void setLancst(String lancst) {
		this.lancst = lancst;
	}

	public Integer getLinre2() {
		return this.linre2;
	}

	public void setLinre2(Integer linre2) {
		this.linre2 = linre2;
	}

	public BigDecimal getLiqre2() {
		return this.liqre2;
	}

	public void setLiqre2(BigDecimal liqre2) {
		this.liqre2 = liqre2;
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

	public String getMesres() {
		return this.mesres;
	}

	public void setMesres(String mesres) {
		this.mesres = mesres;
	}

	public BigDecimal getMrgsub() {
		return this.mrgsub;
	}

	public void setMrgsub(BigDecimal mrgsub) {
		this.mrgsub = mrgsub;
	}

	public Integer getNroite() {
		return this.nroite;
	}

	public void setNroite(Integer nroite) {
		this.nroite = nroite;
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

	public Integer getNumger() {
		return this.numger;
	}

	public void setNumger(Integer numger) {
		this.numger = numger;
	}

	public Integer getNumitemcompra() {
		return this.numitemcompra;
	}

	public void setNumitemcompra(Integer numitemcompra) {
		this.numitemcompra = numitemcompra;
	}

	public Integer getNumped() {
		return this.numped;
	}

	public void setNumped(Integer numped) {
		this.numped = numped;
	}

	public String getNumpedcompra() {
		return this.numpedcompra;
	}

	public void setNumpedcompra(String numpedcompra) {
		this.numpedcompra = numpedcompra;
	}

	public String getObsre2() {
		return this.obsre2;
	}

	public void setObsre2(String obsre2) {
		this.obsre2 = obsre2;
	}

	public BigDecimal getOutcst() {
		return this.outcst;
	}

	public void setOutcst(BigDecimal outcst) {
		this.outcst = outcst;
	}

	public BigDecimal getPacre2() {
		return this.pacre2;
	}

	public void setPacre2(BigDecimal pacre2) {
		this.pacre2 = pacre2;
	}

	public BigDecimal getPapre2() {
		return this.papre2;
	}

	public void setPapre2(BigDecimal papre2) {
		this.papre2 = papre2;
	}

	public BigDecimal getPcoatd() {
		return this.pcoatd;
	}

	public void setPcoatd(BigDecimal pcoatd) {
		this.pcoatd = pcoatd;
	}

	public BigDecimal getPcore2() {
		return this.pcore2;
	}

	public void setPcore2(BigDecimal pcore2) {
		this.pcore2 = pcore2;
	}

	public BigDecimal getPdpre2() {
		return this.pdpre2;
	}

	public void setPdpre2(BigDecimal pdpre2) {
		this.pdpre2 = pdpre2;
	}

	public String getPedcli() {
		return this.pedcli;
	}

	public void setPedcli(String pedcli) {
		this.pedcli = pedcli;
	}

	public String getProdep() {
		return this.prodep;
	}

	public void setProdep(String prodep) {
		this.prodep = prodep;
	}

	public BigDecimal getQtdemb() {
		return this.qtdemb;
	}

	public void setQtdemb(BigDecimal qtdemb) {
		this.qtdemb = qtdemb;
	}

	public BigDecimal getQtdfab() {
		return this.qtdfab;
	}

	public void setQtdfab(BigDecimal qtdfab) {
		this.qtdfab = qtdfab;
	}

	public BigDecimal getQtdre2() {
		return this.qtdre2;
	}

	public void setQtdre2(BigDecimal qtdre2) {
		this.qtdre2 = qtdre2;
	}

	public BigDecimal getQtdsep() {
		return this.qtdsep;
	}

	public void setQtdsep(BigDecimal qtdsep) {
		this.qtdsep = qtdsep;
	}

	public BigDecimal getQtfre2() {
		return this.qtfre2;
	}

	public void setQtfre2(BigDecimal qtfre2) {
		this.qtfre2 = qtfre2;
	}

	public Integer getQtire4() {
		return this.qtire4;
	}

	public void setQtire4(Integer qtire4) {
		this.qtire4 = qtire4;
	}

	public BigDecimal getQtpre2() {
		return this.qtpre2;
	}

	public void setQtpre2(BigDecimal qtpre2) {
		this.qtpre2 = qtpre2;
	}

	public BigDecimal getQtsre2() {
		return this.qtsre2;
	}

	public void setQtsre2(BigDecimal qtsre2) {
		this.qtsre2 = qtsre2;
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

	public String getRefre2() {
		return this.refre2;
	}

	public void setRefre2(String refre2) {
		this.refre2 = refre2;
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

	public Integer getSeqen2() {
		return this.seqen2;
	}

	public void setSeqen2(Integer seqen2) {
		this.seqen2 = seqen2;
	}

	public Integer getSeqgr2() {
		return this.seqgr2;
	}

	public void setSeqgr2(Integer seqgr2) {
		this.seqgr2 = seqgr2;
	}

	public Integer getSeqgr3() {
		return this.seqgr3;
	}

	public void setSeqgr3(Integer seqgr3) {
		this.seqgr3 = seqgr3;
	}

	public Integer getSeqpe2() {
		return this.seqpe2;
	}

	public void setSeqpe2(Integer seqpe2) {
		this.seqpe2 = seqpe2;
	}

	public Integer getSeqpr2() {
		return this.seqpr2;
	}

	public void setSeqpr2(Integer seqpr2) {
		this.seqpr2 = seqpr2;
	}

	public BigDecimal getSldfab() {
		return this.sldfab;
	}

	public void setSldfab(BigDecimal sldfab) {
		this.sldfab = sldfab;
	}

	public BigDecimal getSldre2() {
		return this.sldre2;
	}

	public void setSldre2(BigDecimal sldre2) {
		this.sldre2 = sldre2;
	}

	public BigDecimal getSldsep() {
		return this.sldsep;
	}

	public void setSldsep(BigDecimal sldsep) {
		this.sldsep = sldsep;
	}

	public Integer getTabprc() {
		return this.tabprc;
	}

	public void setTabprc(Integer tabprc) {
		this.tabprc = tabprc;
	}

	public String getTipacr() {
		return this.tipacr;
	}

	public void setTipacr(String tipacr) {
		this.tipacr = tipacr;
	}

	public String getTipcpa() {
		return this.tipcpa;
	}

	public void setTipcpa(String tipcpa) {
		this.tipcpa = tipcpa;
	}

	public String getTipdsc() {
		return this.tipdsc;
	}

	public void setTipdsc(String tipdsc) {
		this.tipdsc = tipdsc;
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

	public BigDecimal getTotacp() {
		return this.totacp;
	}

	public void setTotacp(BigDecimal totacp) {
		this.totacp = totacp;
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

	public BigDecimal getTotcli() {
		return this.totcli;
	}

	public void setTotcli(BigDecimal totcli) {
		this.totcli = totcli;
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

	public BigDecimal getTotcub() {
		return this.totcub;
	}

	public void setTotcub(BigDecimal totcub) {
		this.totcub = totcub;
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

	public BigDecimal getTotibpt() {
		return this.totibpt;
	}

	public void setTotibpt(BigDecimal totibpt) {
		this.totibpt = totibpt;
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

	public BigDecimal getTotre2() {
		return this.totre2;
	}

	public void setTotre2(BigDecimal totre2) {
		this.totre2 = totre2;
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

	public BigDecimal getVacre2() {
		return this.vacre2;
	}

	public void setVacre2(BigDecimal vacre2) {
		this.vacre2 = vacre2;
	}

	public BigDecimal getValcli() {
		return this.valcli;
	}

	public void setValcli(BigDecimal valcli) {
		this.valcli = valcli;
	}

	public BigDecimal getVapre2() {
		return this.vapre2;
	}

	public void setVapre2(BigDecimal vapre2) {
		this.vapre2 = vapre2;
	}

	public BigDecimal getVchcst() {
		return this.vchcst;
	}

	public void setVchcst(BigDecimal vchcst) {
		this.vchcst = vchcst;
	}

	public BigDecimal getVchre2() {
		return this.vchre2;
	}

	public void setVchre2(BigDecimal vchre2) {
		this.vchre2 = vchre2;
	}

	public BigDecimal getVcpcst() {
		return this.vcpcst;
	}

	public void setVcpcst(BigDecimal vcpcst) {
		this.vcpcst = vcpcst;
	}

	public BigDecimal getVcpre2() {
		return this.vcpre2;
	}

	public void setVcpre2(BigDecimal vcpre2) {
		this.vcpre2 = vcpre2;
	}

	public BigDecimal getVcrcst() {
		return this.vcrcst;
	}

	public void setVcrcst(BigDecimal vcrcst) {
		this.vcrcst = vcrcst;
	}

	public BigDecimal getVcrre2() {
		return this.vcrre2;
	}

	public void setVcrre2(BigDecimal vcrre2) {
		this.vcrre2 = vcrre2;
	}

	public BigDecimal getVcsre2() {
		return this.vcsre2;
	}

	public void setVcsre2(BigDecimal vcsre2) {
		this.vcsre2 = vcsre2;
	}

	public BigDecimal getVdpre2() {
		return this.vdpre2;
	}

	public void setVdpre2(BigDecimal vdpre2) {
		this.vdpre2 = vdpre2;
	}

	public BigDecimal getVdrre2() {
		return this.vdrre2;
	}

	public void setVdrre2(BigDecimal vdrre2) {
		this.vdrre2 = vdrre2;
	}

	public BigDecimal getVdscom() {
		return this.vdscom;
	}

	public void setVdscom(BigDecimal vdscom) {
		this.vdscom = vdscom;
	}

	public BigDecimal getVdsre2() {
		return this.vdsre2;
	}

	public void setVdsre2(BigDecimal vdsre2) {
		this.vdsre2 = vdsre2;
	}

	public BigDecimal getVldorgpublic() {
		return this.vldorgpublic;
	}

	public void setVldorgpublic(BigDecimal vldorgpublic) {
		this.vldorgpublic = vldorgpublic;
	}

	public BigDecimal getVlqre2() {
		return this.vlqre2;
	}

	public void setVlqre2(BigDecimal vlqre2) {
		this.vlqre2 = vlqre2;
	}

	public BigDecimal getVlure2() {
		return this.vlure2;
	}

	public void setVlure2(BigDecimal vlure2) {
		this.vlure2 = vlure2;
	}

	public BigDecimal getVmecst() {
		return this.vmecst;
	}

	public void setVmecst(BigDecimal vmecst) {
		this.vmecst = vmecst;
	}

	public BigDecimal getVmere2() {
		return this.vmere2;
	}

	public void setVmere2(BigDecimal vmere2) {
		this.vmere2 = vmere2;
	}

	public BigDecimal getVolre2() {
		return this.volre2;
	}

	public void setVolre2(BigDecimal volre2) {
		this.volre2 = volre2;
	}

	public BigDecimal getVpfcst() {
		return this.vpfcst;
	}

	public void setVpfcst(BigDecimal vpfcst) {
		this.vpfcst = vpfcst;
	}

	public BigDecimal getVpfout() {
		return this.vpfout;
	}

	public void setVpfout(BigDecimal vpfout) {
		this.vpfout = vpfout;
	}

	public BigDecimal getVpfre2() {
		return this.vpfre2;
	}

	public void setVpfre2(BigDecimal vpfre2) {
		this.vpfre2 = vpfre2;
	}

	public BigDecimal getVprcst() {
		return this.vprcst;
	}

	public void setVprcst(BigDecimal vprcst) {
		this.vprcst = vprcst;
	}

	public BigDecimal getVprre2() {
		return this.vprre2;
	}

	public void setVprre2(BigDecimal vprre2) {
		this.vprre2 = vprre2;
	}

	public BigDecimal getVrecst() {
		return this.vrecst;
	}

	public void setVrecst(BigDecimal vrecst) {
		this.vrecst = vrecst;
	}

	public BigDecimal getVrere2() {
		return this.vrere2;
	}

	public void setVrere2(BigDecimal vrere2) {
		this.vrere2 = vrere2;
	}

	public Pedres getPedres() {
		return this.pedres;
	}

	public void setPedres(Pedres pedres) {
		this.pedres = pedres;
	}

}