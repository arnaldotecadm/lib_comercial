<<<<<<< HEAD
package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.PedresPK;

/**
 * The persistent class for the pedres database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedres.findAll", query = "SELECT p FROM Pedres p")
public class Pedres implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedresPK id;

	private BigDecimal acrcnd;

	@Column(name = "aliq_cred_sn")
	private BigDecimal aliqCredSn;

	private BigDecimal aliqcof;

	private BigDecimal aliqpis;

	private Integer anores;

	@Column(name = "app_ver")
	private Integer appVer;

	private String atuest;

	private String baicli;

	private BigDecimal bascat;

	private BigDecimal bascom;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal basiss;

	private BigDecimal bassub;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String cepcli;

	private String cgccli;

	private String cgecli;

	private String cidcli;

	private String clitab;

	private Integer codatd;

	private String codcfo;

	private Integer codcli;

	private String codcom;

	private Integer coddesoneracao;

	private String codean;

	private Integer codfil;

	private Integer codgcl;

	private Integer codgus;

	private Integer codgve;

	private String codicm;

	private String codipi;

	private String codpfa;

	private Integer codtcl;

	private Integer codtra;

	private Integer codusu;

	private Integer codven;

	private String comatd;

	private String comcli;

	private String comicli;

	private String consum;

	private String cstcof;

	private String cstipi;

	private String cstpis;

	private BigDecimal desicm;

	private BigDecimal desipi;

	private String desreg;

	private BigDecimal dessub;

	private BigDecimal devger;

	private BigDecimal devres;

	private BigDecimal dsccnd;

	private BigDecimal dsccom;

	private BigDecimal dscicm;

	private BigDecimal dscipi;

	private BigDecimal dscreg;

	private BigDecimal dscres;

	private BigDecimal dscsub;

	@Temporal(TemporalType.DATE)
	private Date dtecmp;

	@Temporal(TemporalType.DATE)
	private Date dtecom;

	@Temporal(TemporalType.DATE)
	private Date dtecon;

	@Temporal(TemporalType.DATE)
	private Date dtecta;

	@Temporal(TemporalType.DATE)
	private Date dtedel;

	@Temporal(TemporalType.DATE)
	private Date dtefin;

	@Temporal(TemporalType.DATE)
	private Date dtefpe;

	@Temporal(TemporalType.DATE)
	private Date dteped;

	@Temporal(TemporalType.DATE)
	private Date dtepro;

	@Temporal(TemporalType.DATE)
	private Date dterej;

	@Temporal(TemporalType.DATE)
	private Date dtfres;

	@Temporal(TemporalType.DATE)
	private Date dtlpsq;

	@Temporal(TemporalType.DATE)
	private Date dtvsuf;

	private String ecfemi;

	private Integer empcta;

	private Integer empped;

	private String endcli;

	private BigDecimal fatger;

	private BigDecimal fatres;

	private String flgant;

	private String flgatu;

	private String flgavi;

	private String flgcli;

	private String flgcmp;

	private String flgcom;

	private String flgcon;

	private String flgctb;

	private String flgdif;

	private String flgest;

	private String flgfec;

	private String flgfin;

	private String flgger;

	private String flgimp;

	private String flgipi;

	private String flgmobile;

	private String flgoco;

	private String flgope;

	private String flgpro;

	private String flgpsq;

	private String flgrej;

	private String flgreq;

	private String flgres;

	private String flgser;

	private String flgsld;

	private String flgtab;

	private BigDecimal frticm;

	private BigDecimal frtipi;

	private String frtres;

	private BigDecimal frtsub;

	private String hrecmp;

	private String hrecom;

	private String hrecon;

	private String hredel;

	private String hrefin;

	private String hrefpe;

	private String hrepro;

	private String hrerej;

	private String hreres;

	@Column(name = "id_esticm")
	private Integer idEsticm;

	@Column(name = "id_estipi")
	private Integer idEstipi;

	@Column(name = "id_estsip")
	private Integer idEstsip;

	@Column(name = "id_fincie")
	private Integer idFincie;

	@Column(name = "id_finufe")
	private Integer idFinufe;

	@Column(name = "id_frete")
	private Integer idFrete;

	@Column(name = "id_pedcnd")
	private Integer idPedcnd;

	@Column(name = "id_pedcta")
	private Integer idPedcta;

	@Column(name = "id_pedfe2")
	private Integer idPedfe2;

	@Column(name = "id_pedres")
	private Integer idPedres;

	@Column(name = "id_pedres_orig")
	private Integer idPedresOrig;

	@Column(name = "id_sepped")
	private Integer idSepped;

	private BigDecimal incfin;

	private BigDecimal increv;

	@Column(name = "indic_cf")
	private Integer indicCf;

	@Column(name = "indic_presenca")
	private Integer indicPresenca;

	private String inecli;

	private String inscli;

	private String intfin;

	@Column(name = "is_cta")
	private Integer isCta;

	private String lanest;

	private String libcli;

	private String libsld;

	private BigDecimal limcli;

	private Integer linres;

	private BigDecimal medacr;

	private BigDecimal medcat;

	private BigDecimal medcom;

	private BigDecimal meddco;

	private BigDecimal meddsc;

	private BigDecimal medprm;

	private String mesres;

	private String modpfa;

	private String noment;

	private String nrosuf;

	private String numcli;

	private Integer numcta;

	private Integer numped;

	private String ob1can;

	private String ob1fat;

	private String ob1res;

	private String ob2can;

	private String ob2fat;

	private String ob2res;

	private String ob3can;

	private String ob3fat;

	private String ob3res;

	private String ob4can;

	private String ob4fat;

	private String ob4res;

	private String ob5can;

	private String ob5fat;

	private String ob5res;

	private String ob6fat;

	private String ob6res;

	private String ob7fat;

	private String ob7res;

	private String ob8fat;

	private String ob8res;

	private String obrgve;

	private String obsant;

	private String obscmp;

	private String obscom;

	private String obscon;

	private String obsdel;

	private String obsfin;

	private String obsfpe;

	private String obspro;

	private String obsrej;

	private String obsres;

	private BigDecimal pcoatd;

	private BigDecimal pcores;

	private String pedant;

	private String pedpro;

	private BigDecimal percof;

	private BigDecimal perpis;

	private String prccta;

	private Integer prfres;

	private Integer qtdimp;

	private Integer qtfres;

	private Integer qtilib;

	private Integer qtire2;

	private Integer qtire3;

	private Integer qtire4;

	private Integer qtires;

	private Integer qtlres;

	private Integer qtpres;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private String refcli;

	private Integer regtrb;

	private Integer regtrbemp;

	private BigDecimal renmin;

	private BigDecimal segicm;

	private BigDecimal segipi;

	private BigDecimal segsub;

	private Integer seqite;

	private Integer seqlib;

	private Integer seqpar;

	private Integer seqre3;

	private String seqres;

	private String sitres;

	private BigDecimal sldger;

	private BigDecimal sldres;

	@Column(name = "sufr_cofins")
	private String sufrCofins;

	@Column(name = "sufr_icms")
	private String sufrIcms;

	@Column(name = "sufr_ipi")
	private String sufrIpi;

	@Column(name = "sufr_pis")
	private String sufrPis;

	private String tencli;

	private String tipcom;

	private String tipcpa;

	private String tipfre;

	private String tipfrt;

	private String tipicm;

	private String tipipi;

	private String tippfa;

	private BigDecimal totacp;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcat;

	private BigDecimal totcli;

	private BigDecimal totcof;

	private BigDecimal totcom;

	private BigDecimal totcst;

	private BigDecimal totcub;

	private BigDecimal totdco;

	private BigDecimal totdescinc;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totfrt;

	private BigDecimal totger;

	private BigDecimal totibpt;

	private BigDecimal toticm;

	private BigDecimal totipc;

	private BigDecimal totipi;

	private BigDecimal totiss;

	private BigDecimal totitetrb;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totpis;

	private BigDecimal totren;

	private BigDecimal totres;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private Integer totvol;

	private String trbcof;

	private String trbicm;

	private String trbipi;

	private String trbpis;

	private String txficm;

	private String txfipi;

	private String ufecli;

	private String uferes;

	private String updproc;

	private Integer usuant;

	private Integer usucmp;

	private Integer usucom;

	private Integer usucon;

	private Integer usudel;

	private Integer usufin;

	private Integer usufpe;

	private Integer usuimp;

	private Integer usupro;

	private Integer usurej;

	// bi-directional many-to-one association to Pedcom
	@OneToMany(mappedBy = "pedre")
	private List<Pedcom> pedcoms;

	// bi-directional many-to-one association to Pedfin
	@OneToMany(mappedBy = "pedre")
	private List<Pedfin> pedfins;

	// bi-directional many-to-one association to Pedlog
	@OneToMany(mappedBy = "pedre")
	private List<Pedlog> pedlogs;

	// bi-directional many-to-one association to Pedoco
	@OneToMany(mappedBy = "pedre")
	private List<Pedoco> pedocos;

	// bi-directional many-to-one association to Pedpro
	@OneToMany(mappedBy = "pedre")
	private List<Pedpro> pedpros;

	// bi-directional many-to-one association to Pedre2
	@OneToMany(mappedBy = "pedres")
	private List<Pedre2> pedre2s;

	// bi-directional many-to-one association to Pedre3
	@OneToMany(mappedBy = "pedre")
	private List<Pedre3> pedre3s;

	// bi-directional many-to-one association to Pedrej
	@OneToMany(mappedBy = "pedre")
	private List<Pedrej> pedrejs;

	// bi-directional many-to-one association to Pedtip
	@ManyToOne
	@JoinColumn(name = "codtip")
	private Pedtip pedtip;

	// bi-directional many-to-one association to Pedtip
	@ManyToOne
	@JoinColumn(name = "codcli", insertable = false, updatable = false)
	private Fincli fincli;

	@ManyToOne
	@JoinColumn(name = "codven", insertable = false, updatable = false)
	private Finven finven;

	public Finven getFinven() {
		return finven;
	}

	public void setFinven(Finven finven) {
		this.finven = finven;
	}

	@ManyToOne
	@JoinColumn(name = "codatd", insertable = false, updatable = false)
	private Finatd finatd;

	public Finatd getFinatd() {
		return finatd;
	}

	public void setFinatd(Finatd finatd) {
		this.finatd = finatd;
	}

	public Pedres() {
	}

	public PedresPK getId() {
		return this.id;
	}

	public void setId(PedresPK id) {
		this.id = id;
	}

	public BigDecimal getAcrcnd() {
		return this.acrcnd;
	}

	public void setAcrcnd(BigDecimal acrcnd) {
		this.acrcnd = acrcnd;
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

	public BigDecimal getAliqpis() {
		return this.aliqpis;
	}

	public void setAliqpis(BigDecimal aliqpis) {
		this.aliqpis = aliqpis;
	}

	public Integer getAnores() {
		return this.anores;
	}

	public void setAnores(Integer anores) {
		this.anores = anores;
	}

	public Integer getAppVer() {
		return this.appVer;
	}

	public void setAppVer(Integer appVer) {
		this.appVer = appVer;
	}

	public String getAtuest() {
		return this.atuest;
	}

	public void setAtuest(String atuest) {
		this.atuest = atuest;
	}

	public String getBaicli() {
		return this.baicli;
	}

	public void setBaicli(String baicli) {
		this.baicli = baicli;
	}

	public BigDecimal getBascat() {
		return this.bascat;
	}

	public void setBascat(BigDecimal bascat) {
		this.bascat = bascat;
	}

	public BigDecimal getBascom() {
		return this.bascom;
	}

	public void setBascom(BigDecimal bascom) {
		this.bascom = bascom;
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

	public String getCepcli() {
		return this.cepcli;
	}

	public void setCepcli(String cepcli) {
		this.cepcli = cepcli;
	}

	public String getCgccli() {
		return this.cgccli;
	}

	public void setCgccli(String cgccli) {
		this.cgccli = cgccli;
	}

	public String getCgecli() {
		return this.cgecli;
	}

	public void setCgecli(String cgecli) {
		this.cgecli = cgecli;
	}

	public String getCidcli() {
		return this.cidcli;
	}

	public void setCidcli(String cidcli) {
		this.cidcli = cidcli;
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

	public String getCodcom() {
		return this.codcom;
	}

	public void setCodcom(String codcom) {
		this.codcom = codcom;
	}

	public Integer getCoddesoneracao() {
		return this.coddesoneracao;
	}

	public void setCoddesoneracao(Integer coddesoneracao) {
		this.coddesoneracao = coddesoneracao;
	}

	public String getCodean() {
		return this.codean;
	}

	public void setCodean(String codean) {
		this.codean = codean;
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

	public Integer getCodgus() {
		return this.codgus;
	}

	public void setCodgus(Integer codgus) {
		this.codgus = codgus;
	}

	public Integer getCodgve() {
		return this.codgve;
	}

	public void setCodgve(Integer codgve) {
		this.codgve = codgve;
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

	public Integer getCodtra() {
		return this.codtra;
	}

	public void setCodtra(Integer codtra) {
		this.codtra = codtra;
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

	public String getComatd() {
		return this.comatd;
	}

	public void setComatd(String comatd) {
		this.comatd = comatd;
	}

	public String getComcli() {
		return this.comcli;
	}

	public void setComcli(String comcli) {
		this.comcli = comcli;
	}

	public String getComicli() {
		return this.comicli;
	}

	public void setComicli(String comicli) {
		this.comicli = comicli;
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

	public String getDesreg() {
		return this.desreg;
	}

	public void setDesreg(String desreg) {
		this.desreg = desreg;
	}

	public BigDecimal getDessub() {
		return this.dessub;
	}

	public void setDessub(BigDecimal dessub) {
		this.dessub = dessub;
	}

	public BigDecimal getDevger() {
		return this.devger;
	}

	public void setDevger(BigDecimal devger) {
		this.devger = devger;
	}

	public BigDecimal getDevres() {
		return this.devres;
	}

	public void setDevres(BigDecimal devres) {
		this.devres = devres;
	}

	public BigDecimal getDsccnd() {
		return this.dsccnd;
	}

	public void setDsccnd(BigDecimal dsccnd) {
		this.dsccnd = dsccnd;
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

	public BigDecimal getDscreg() {
		return this.dscreg;
	}

	public void setDscreg(BigDecimal dscreg) {
		this.dscreg = dscreg;
	}

	public BigDecimal getDscres() {
		return this.dscres;
	}

	public void setDscres(BigDecimal dscres) {
		this.dscres = dscres;
	}

	public BigDecimal getDscsub() {
		return this.dscsub;
	}

	public void setDscsub(BigDecimal dscsub) {
		this.dscsub = dscsub;
	}

	public Date getDtecmp() {
		return this.dtecmp;
	}

	public void setDtecmp(Date dtecmp) {
		this.dtecmp = dtecmp;
	}

	public Date getDtecom() {
		return this.dtecom;
	}

	public void setDtecom(Date dtecom) {
		this.dtecom = dtecom;
	}

	public Date getDtecon() {
		return this.dtecon;
	}

	public void setDtecon(Date dtecon) {
		this.dtecon = dtecon;
	}

	public Date getDtecta() {
		return this.dtecta;
	}

	public void setDtecta(Date dtecta) {
		this.dtecta = dtecta;
	}

	public Date getDtedel() {
		return this.dtedel;
	}

	public void setDtedel(Date dtedel) {
		this.dtedel = dtedel;
	}

	public Date getDtefin() {
		return this.dtefin;
	}

	public void setDtefin(Date dtefin) {
		this.dtefin = dtefin;
	}

	public Date getDtefpe() {
		return this.dtefpe;
	}

	public void setDtefpe(Date dtefpe) {
		this.dtefpe = dtefpe;
	}

	public Date getDteped() {
		return this.dteped;
	}

	public void setDteped(Date dteped) {
		this.dteped = dteped;
	}

	public Date getDtepro() {
		return this.dtepro;
	}

	public void setDtepro(Date dtepro) {
		this.dtepro = dtepro;
	}

	public Date getDterej() {
		return this.dterej;
	}

	public void setDterej(Date dterej) {
		this.dterej = dterej;
	}

	public Date getDtfres() {
		return this.dtfres;
	}

	public void setDtfres(Date dtfres) {
		this.dtfres = dtfres;
	}

	public Date getDtlpsq() {
		return this.dtlpsq;
	}

	public void setDtlpsq(Date dtlpsq) {
		this.dtlpsq = dtlpsq;
	}

	public Date getDtvsuf() {
		return this.dtvsuf;
	}

	public void setDtvsuf(Date dtvsuf) {
		this.dtvsuf = dtvsuf;
	}

	public String getEcfemi() {
		return this.ecfemi;
	}

	public void setEcfemi(String ecfemi) {
		this.ecfemi = ecfemi;
	}

	public Integer getEmpcta() {
		return this.empcta;
	}

	public void setEmpcta(Integer empcta) {
		this.empcta = empcta;
	}

	public Integer getEmpped() {
		return this.empped;
	}

	public void setEmpped(Integer empped) {
		this.empped = empped;
	}

	public String getEndcli() {
		return this.endcli;
	}

	public void setEndcli(String endcli) {
		this.endcli = endcli;
	}

	public BigDecimal getFatger() {
		return this.fatger;
	}

	public void setFatger(BigDecimal fatger) {
		this.fatger = fatger;
	}

	public BigDecimal getFatres() {
		return this.fatres;
	}

	public void setFatres(BigDecimal fatres) {
		this.fatres = fatres;
	}

	public String getFlgant() {
		return this.flgant;
	}

	public void setFlgant(String flgant) {
		this.flgant = flgant;
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

	public String getFlgcli() {
		return this.flgcli;
	}

	public void setFlgcli(String flgcli) {
		this.flgcli = flgcli;
	}

	public String getFlgcmp() {
		return this.flgcmp;
	}

	public void setFlgcmp(String flgcmp) {
		this.flgcmp = flgcmp;
	}

	public String getFlgcom() {
		return this.flgcom;
	}

	public void setFlgcom(String flgcom) {
		this.flgcom = flgcom;
	}

	public String getFlgcon() {
		return this.flgcon;
	}

	public void setFlgcon(String flgcon) {
		this.flgcon = flgcon;
	}

	public String getFlgctb() {
		return this.flgctb;
	}

	public void setFlgctb(String flgctb) {
		this.flgctb = flgctb;
	}

	public String getFlgdif() {
		return this.flgdif;
	}

	public void setFlgdif(String flgdif) {
		this.flgdif = flgdif;
	}

	public String getFlgest() {
		return this.flgest;
	}

	public void setFlgest(String flgest) {
		this.flgest = flgest;
	}

	public String getFlgfec() {
		return this.flgfec;
	}

	public void setFlgfec(String flgfec) {
		this.flgfec = flgfec;
	}

	public String getFlgfin() {
		return this.flgfin;
	}

	public void setFlgfin(String flgfin) {
		this.flgfin = flgfin;
	}

	public String getFlgger() {
		return this.flgger;
	}

	public void setFlgger(String flgger) {
		this.flgger = flgger;
	}

	public String getFlgimp() {
		return this.flgimp;
	}

	public void setFlgimp(String flgimp) {
		this.flgimp = flgimp;
	}

	public String getFlgipi() {
		return this.flgipi;
	}

	public void setFlgipi(String flgipi) {
		this.flgipi = flgipi;
	}

	public String getFlgmobile() {
		return this.flgmobile;
	}

	public void setFlgmobile(String flgmobile) {
		this.flgmobile = flgmobile;
	}

	public String getFlgoco() {
		return this.flgoco;
	}

	public void setFlgoco(String flgoco) {
		this.flgoco = flgoco;
	}

	public String getFlgope() {
		return this.flgope;
	}

	public void setFlgope(String flgope) {
		this.flgope = flgope;
	}

	public String getFlgpro() {
		return this.flgpro;
	}

	public void setFlgpro(String flgpro) {
		this.flgpro = flgpro;
	}

	public String getFlgpsq() {
		return this.flgpsq;
	}

	public void setFlgpsq(String flgpsq) {
		this.flgpsq = flgpsq;
	}

	public String getFlgrej() {
		return this.flgrej;
	}

	public void setFlgrej(String flgrej) {
		this.flgrej = flgrej;
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

	public String getFlgser() {
		return this.flgser;
	}

	public void setFlgser(String flgser) {
		this.flgser = flgser;
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

	public String getFrtres() {
		return this.frtres;
	}

	public void setFrtres(String frtres) {
		this.frtres = frtres;
	}

	public BigDecimal getFrtsub() {
		return this.frtsub;
	}

	public void setFrtsub(BigDecimal frtsub) {
		this.frtsub = frtsub;
	}

	public String getHrecmp() {
		return this.hrecmp;
	}

	public void setHrecmp(String hrecmp) {
		this.hrecmp = hrecmp;
	}

	public String getHrecom() {
		return this.hrecom;
	}

	public void setHrecom(String hrecom) {
		this.hrecom = hrecom;
	}

	public String getHrecon() {
		return this.hrecon;
	}

	public void setHrecon(String hrecon) {
		this.hrecon = hrecon;
	}

	public String getHredel() {
		return this.hredel;
	}

	public void setHredel(String hredel) {
		this.hredel = hredel;
	}

	public String getHrefin() {
		return this.hrefin;
	}

	public void setHrefin(String hrefin) {
		this.hrefin = hrefin;
	}

	public String getHrefpe() {
		return this.hrefpe;
	}

	public void setHrefpe(String hrefpe) {
		this.hrefpe = hrefpe;
	}

	public String getHrepro() {
		return this.hrepro;
	}

	public void setHrepro(String hrepro) {
		this.hrepro = hrepro;
	}

	public String getHrerej() {
		return this.hrerej;
	}

	public void setHrerej(String hrerej) {
		this.hrerej = hrerej;
	}

	public String getHreres() {
		return this.hreres;
	}

	public void setHreres(String hreres) {
		this.hreres = hreres;
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

	public Integer getIdEstsip() {
		return this.idEstsip;
	}

	public void setIdEstsip(Integer idEstsip) {
		this.idEstsip = idEstsip;
	}

	public Integer getIdFincie() {
		return this.idFincie;
	}

	public void setIdFincie(Integer idFincie) {
		this.idFincie = idFincie;
	}

	public Integer getIdFinufe() {
		return this.idFinufe;
	}

	public void setIdFinufe(Integer idFinufe) {
		this.idFinufe = idFinufe;
	}

	public Integer getIdFrete() {
		return this.idFrete;
	}

	public void setIdFrete(Integer idFrete) {
		this.idFrete = idFrete;
	}

	public Integer getIdPedcnd() {
		return this.idPedcnd;
	}

	public void setIdPedcnd(Integer idPedcnd) {
		this.idPedcnd = idPedcnd;
	}

	public Integer getIdPedcta() {
		return this.idPedcta;
	}

	public void setIdPedcta(Integer idPedcta) {
		this.idPedcta = idPedcta;
	}

	public Integer getIdPedfe2() {
		return this.idPedfe2;
	}

	public void setIdPedfe2(Integer idPedfe2) {
		this.idPedfe2 = idPedfe2;
	}

	public Integer getIdPedres() {
		return this.idPedres;
	}

	public void setIdPedres(Integer idPedres) {
		this.idPedres = idPedres;
	}

	public Integer getIdPedresOrig() {
		return this.idPedresOrig;
	}

	public void setIdPedresOrig(Integer idPedresOrig) {
		this.idPedresOrig = idPedresOrig;
	}

	public Integer getIdSepped() {
		return this.idSepped;
	}

	public void setIdSepped(Integer idSepped) {
		this.idSepped = idSepped;
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

	public String getInecli() {
		return this.inecli;
	}

	public void setInecli(String inecli) {
		this.inecli = inecli;
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

	public Integer getIsCta() {
		return this.isCta;
	}

	public void setIsCta(Integer isCta) {
		this.isCta = isCta;
	}

	public String getLanest() {
		return this.lanest;
	}

	public void setLanest(String lanest) {
		this.lanest = lanest;
	}

	public String getLibcli() {
		return this.libcli;
	}

	public void setLibcli(String libcli) {
		this.libcli = libcli;
	}

	public String getLibsld() {
		return this.libsld;
	}

	public void setLibsld(String libsld) {
		this.libsld = libsld;
	}

	public BigDecimal getLimcli() {
		return this.limcli;
	}

	public void setLimcli(BigDecimal limcli) {
		this.limcli = limcli;
	}

	public Integer getLinres() {
		return this.linres;
	}

	public void setLinres(Integer linres) {
		this.linres = linres;
	}

	public BigDecimal getMedacr() {
		return this.medacr;
	}

	public void setMedacr(BigDecimal medacr) {
		this.medacr = medacr;
	}

	public BigDecimal getMedcat() {
		return this.medcat;
	}

	public void setMedcat(BigDecimal medcat) {
		this.medcat = medcat;
	}

	public BigDecimal getMedcom() {
		return this.medcom;
	}

	public void setMedcom(BigDecimal medcom) {
		this.medcom = medcom;
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

	public String getMesres() {
		return this.mesres;
	}

	public void setMesres(String mesres) {
		this.mesres = mesres;
	}

	public String getModpfa() {
		return this.modpfa;
	}

	public void setModpfa(String modpfa) {
		this.modpfa = modpfa;
	}

	public String getNoment() {
		return this.noment;
	}

	public void setNoment(String noment) {
		this.noment = noment;
	}

	public String getNrosuf() {
		return this.nrosuf;
	}

	public void setNrosuf(String nrosuf) {
		this.nrosuf = nrosuf;
	}

	public String getNumcli() {
		return this.numcli;
	}

	public void setNumcli(String numcli) {
		this.numcli = numcli;
	}

	public Integer getNumcta() {
		return this.numcta;
	}

	public void setNumcta(Integer numcta) {
		this.numcta = numcta;
	}

	public Integer getNumped() {
		return this.numped;
	}

	public void setNumped(Integer numped) {
		this.numped = numped;
	}

	public String getOb1can() {
		return this.ob1can;
	}

	public void setOb1can(String ob1can) {
		this.ob1can = ob1can;
	}

	public String getOb1fat() {
		return this.ob1fat;
	}

	public void setOb1fat(String ob1fat) {
		this.ob1fat = ob1fat;
	}

	public String getOb1res() {
		return this.ob1res;
	}

	public void setOb1res(String ob1res) {
		this.ob1res = ob1res;
	}

	public String getOb2can() {
		return this.ob2can;
	}

	public void setOb2can(String ob2can) {
		this.ob2can = ob2can;
	}

	public String getOb2fat() {
		return this.ob2fat;
	}

	public void setOb2fat(String ob2fat) {
		this.ob2fat = ob2fat;
	}

	public String getOb2res() {
		return this.ob2res;
	}

	public void setOb2res(String ob2res) {
		this.ob2res = ob2res;
	}

	public String getOb3can() {
		return this.ob3can;
	}

	public void setOb3can(String ob3can) {
		this.ob3can = ob3can;
	}

	public String getOb3fat() {
		return this.ob3fat;
	}

	public void setOb3fat(String ob3fat) {
		this.ob3fat = ob3fat;
	}

	public String getOb3res() {
		return this.ob3res;
	}

	public void setOb3res(String ob3res) {
		this.ob3res = ob3res;
	}

	public String getOb4can() {
		return this.ob4can;
	}

	public void setOb4can(String ob4can) {
		this.ob4can = ob4can;
	}

	public String getOb4fat() {
		return this.ob4fat;
	}

	public void setOb4fat(String ob4fat) {
		this.ob4fat = ob4fat;
	}

	public String getOb4res() {
		return this.ob4res;
	}

	public void setOb4res(String ob4res) {
		this.ob4res = ob4res;
	}

	public String getOb5can() {
		return this.ob5can;
	}

	public void setOb5can(String ob5can) {
		this.ob5can = ob5can;
	}

	public String getOb5fat() {
		return this.ob5fat;
	}

	public void setOb5fat(String ob5fat) {
		this.ob5fat = ob5fat;
	}

	public String getOb5res() {
		return this.ob5res;
	}

	public void setOb5res(String ob5res) {
		this.ob5res = ob5res;
	}

	public String getOb6fat() {
		return this.ob6fat;
	}

	public void setOb6fat(String ob6fat) {
		this.ob6fat = ob6fat;
	}

	public String getOb6res() {
		return this.ob6res;
	}

	public void setOb6res(String ob6res) {
		this.ob6res = ob6res;
	}

	public String getOb7fat() {
		return this.ob7fat;
	}

	public void setOb7fat(String ob7fat) {
		this.ob7fat = ob7fat;
	}

	public String getOb7res() {
		return this.ob7res;
	}

	public void setOb7res(String ob7res) {
		this.ob7res = ob7res;
	}

	public String getOb8fat() {
		return this.ob8fat;
	}

	public void setOb8fat(String ob8fat) {
		this.ob8fat = ob8fat;
	}

	public String getOb8res() {
		return this.ob8res;
	}

	public void setOb8res(String ob8res) {
		this.ob8res = ob8res;
	}

	public String getObrgve() {
		return this.obrgve;
	}

	public void setObrgve(String obrgve) {
		this.obrgve = obrgve;
	}

	public String getObsant() {
		return this.obsant;
	}

	public void setObsant(String obsant) {
		this.obsant = obsant;
	}

	public String getObscmp() {
		return this.obscmp;
	}

	public void setObscmp(String obscmp) {
		this.obscmp = obscmp;
	}

	public String getObscom() {
		return this.obscom;
	}

	public void setObscom(String obscom) {
		this.obscom = obscom;
	}

	public String getObscon() {
		return this.obscon;
	}

	public void setObscon(String obscon) {
		this.obscon = obscon;
	}

	public String getObsdel() {
		return this.obsdel;
	}

	public void setObsdel(String obsdel) {
		this.obsdel = obsdel;
	}

	public String getObsfin() {
		return this.obsfin;
	}

	public void setObsfin(String obsfin) {
		this.obsfin = obsfin;
	}

	public String getObsfpe() {
		return this.obsfpe;
	}

	public void setObsfpe(String obsfpe) {
		this.obsfpe = obsfpe;
	}

	public String getObspro() {
		return this.obspro;
	}

	public void setObspro(String obspro) {
		this.obspro = obspro;
	}

	public String getObsrej() {
		return this.obsrej;
	}

	public void setObsrej(String obsrej) {
		this.obsrej = obsrej;
	}

	public String getObsres() {
		return this.obsres;
	}

	public void setObsres(String obsres) {
		this.obsres = obsres;
	}

	public BigDecimal getPcoatd() {
		return this.pcoatd;
	}

	public void setPcoatd(BigDecimal pcoatd) {
		this.pcoatd = pcoatd;
	}

	public BigDecimal getPcores() {
		return this.pcores;
	}

	public void setPcores(BigDecimal pcores) {
		this.pcores = pcores;
	}

	public String getPedant() {
		return this.pedant;
	}

	public void setPedant(String pedant) {
		this.pedant = pedant;
	}

	public String getPedpro() {
		return this.pedpro;
	}

	public void setPedpro(String pedpro) {
		this.pedpro = pedpro;
	}

	public BigDecimal getPercof() {
		return this.percof;
	}

	public void setPercof(BigDecimal percof) {
		this.percof = percof;
	}

	public BigDecimal getPerpis() {
		return this.perpis;
	}

	public void setPerpis(BigDecimal perpis) {
		this.perpis = perpis;
	}

	public String getPrccta() {
		return this.prccta;
	}

	public void setPrccta(String prccta) {
		this.prccta = prccta;
	}

	public Integer getPrfres() {
		return this.prfres;
	}

	public void setPrfres(Integer prfres) {
		this.prfres = prfres;
	}

	public Integer getQtdimp() {
		return this.qtdimp;
	}

	public void setQtdimp(Integer qtdimp) {
		this.qtdimp = qtdimp;
	}

	public Integer getQtfres() {
		return this.qtfres;
	}

	public void setQtfres(Integer qtfres) {
		this.qtfres = qtfres;
	}

	public Integer getQtilib() {
		return this.qtilib;
	}

	public void setQtilib(Integer qtilib) {
		this.qtilib = qtilib;
	}

	public Integer getQtire2() {
		return this.qtire2;
	}

	public void setQtire2(Integer qtire2) {
		this.qtire2 = qtire2;
	}

	public Integer getQtire3() {
		return this.qtire3;
	}

	public void setQtire3(Integer qtire3) {
		this.qtire3 = qtire3;
	}

	public Integer getQtire4() {
		return this.qtire4;
	}

	public void setQtire4(Integer qtire4) {
		this.qtire4 = qtire4;
	}

	public Integer getQtires() {
		return this.qtires;
	}

	public void setQtires(Integer qtires) {
		this.qtires = qtires;
	}

	public Integer getQtlres() {
		return this.qtlres;
	}

	public void setQtlres(Integer qtlres) {
		this.qtlres = qtlres;
	}

	public Integer getQtpres() {
		return this.qtpres;
	}

	public void setQtpres(Integer qtpres) {
		this.qtpres = qtpres;
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

	public String getRefcli() {
		return this.refcli;
	}

	public void setRefcli(String refcli) {
		this.refcli = refcli;
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

	public BigDecimal getRenmin() {
		return this.renmin;
	}

	public void setRenmin(BigDecimal renmin) {
		this.renmin = renmin;
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

	public Integer getSeqite() {
		return this.seqite;
	}

	public void setSeqite(Integer seqite) {
		this.seqite = seqite;
	}

	public Integer getSeqlib() {
		return this.seqlib;
	}

	public void setSeqlib(Integer seqlib) {
		this.seqlib = seqlib;
	}

	public Integer getSeqpar() {
		return this.seqpar;
	}

	public void setSeqpar(Integer seqpar) {
		this.seqpar = seqpar;
	}

	public Integer getSeqre3() {
		return this.seqre3;
	}

	public void setSeqre3(Integer seqre3) {
		this.seqre3 = seqre3;
	}

	public String getSeqres() {
		return this.seqres;
	}

	public void setSeqres(String seqres) {
		this.seqres = seqres;
	}

	public String getSitres() {
		return this.sitres;
	}

	public void setSitres(String sitres) {
		this.sitres = sitres;
	}

	public BigDecimal getSldger() {
		return this.sldger;
	}

	public void setSldger(BigDecimal sldger) {
		this.sldger = sldger;
	}

	public BigDecimal getSldres() {
		return this.sldres;
	}

	public void setSldres(BigDecimal sldres) {
		this.sldres = sldres;
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

	public String getTencli() {
		return this.tencli;
	}

	public void setTencli(String tencli) {
		this.tencli = tencli;
	}

	public String getTipcom() {
		return this.tipcom;
	}

	public void setTipcom(String tipcom) {
		this.tipcom = tipcom;
	}

	public String getTipcpa() {
		return this.tipcpa;
	}

	public void setTipcpa(String tipcpa) {
		this.tipcpa = tipcpa;
	}

	public String getTipfre() {
		return this.tipfre;
	}

	public void setTipfre(String tipfre) {
		this.tipfre = tipfre;
	}

	public String getTipfrt() {
		return this.tipfrt;
	}

	public void setTipfrt(String tipfrt) {
		this.tipfrt = tipfrt;
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

	public BigDecimal getTotger() {
		return this.totger;
	}

	public void setTotger(BigDecimal totger) {
		this.totger = totger;
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

	public BigDecimal getTotres() {
		return this.totres;
	}

	public void setTotres(BigDecimal totres) {
		this.totres = totres;
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

	public String getUfecli() {
		return this.ufecli;
	}

	public void setUfecli(String ufecli) {
		this.ufecli = ufecli;
	}

	public String getUferes() {
		return this.uferes;
	}

	public void setUferes(String uferes) {
		this.uferes = uferes;
	}

	public String getUpdproc() {
		return this.updproc;
	}

	public void setUpdproc(String updproc) {
		this.updproc = updproc;
	}

	public Integer getUsuant() {
		return this.usuant;
	}

	public void setUsuant(Integer usuant) {
		this.usuant = usuant;
	}

	public Integer getUsucmp() {
		return this.usucmp;
	}

	public void setUsucmp(Integer usucmp) {
		this.usucmp = usucmp;
	}

	public Integer getUsucom() {
		return this.usucom;
	}

	public void setUsucom(Integer usucom) {
		this.usucom = usucom;
	}

	public Integer getUsucon() {
		return this.usucon;
	}

	public void setUsucon(Integer usucon) {
		this.usucon = usucon;
	}

	public Integer getUsudel() {
		return this.usudel;
	}

	public void setUsudel(Integer usudel) {
		this.usudel = usudel;
	}

	public Integer getUsufin() {
		return this.usufin;
	}

	public void setUsufin(Integer usufin) {
		this.usufin = usufin;
	}

	public Integer getUsufpe() {
		return this.usufpe;
	}

	public void setUsufpe(Integer usufpe) {
		this.usufpe = usufpe;
	}

	public Integer getUsuimp() {
		return this.usuimp;
	}

	public void setUsuimp(Integer usuimp) {
		this.usuimp = usuimp;
	}

	public Integer getUsupro() {
		return this.usupro;
	}

	public void setUsupro(Integer usupro) {
		this.usupro = usupro;
	}

	public Integer getUsurej() {
		return this.usurej;
	}

	public void setUsurej(Integer usurej) {
		this.usurej = usurej;
	}

	public List<Pedcom> getPedcoms() {
		return this.pedcoms;
	}

	public void setPedcoms(List<Pedcom> pedcoms) {
		this.pedcoms = pedcoms;
	}

	public Pedcom addPedcom(Pedcom pedcom) {
		getPedcoms().add(pedcom);
		pedcom.setPedre(this);

		return pedcom;
	}

	public Pedcom removePedcom(Pedcom pedcom) {
		getPedcoms().remove(pedcom);
		pedcom.setPedre(null);

		return pedcom;
	}

	public List<Pedfin> getPedfins() {
		return this.pedfins;
	}

	public void setPedfins(List<Pedfin> pedfins) {
		this.pedfins = pedfins;
	}

	public Pedfin addPedfin(Pedfin pedfin) {
		getPedfins().add(pedfin);
		pedfin.setPedre(this);

		return pedfin;
	}

	public Pedfin removePedfin(Pedfin pedfin) {
		getPedfins().remove(pedfin);
		pedfin.setPedre(null);

		return pedfin;
	}

	public List<Pedlog> getPedlogs() {
		return this.pedlogs;
	}

	public void setPedlogs(List<Pedlog> pedlogs) {
		this.pedlogs = pedlogs;
	}

	public Pedlog addPedlog(Pedlog pedlog) {
		getPedlogs().add(pedlog);
		pedlog.setPedre(this);

		return pedlog;
	}

	public Pedlog removePedlog(Pedlog pedlog) {
		getPedlogs().remove(pedlog);
		pedlog.setPedre(null);

		return pedlog;
	}

	public List<Pedoco> getPedocos() {
		return this.pedocos;
	}

	public void setPedocos(List<Pedoco> pedocos) {
		this.pedocos = pedocos;
	}

	public Pedoco addPedoco(Pedoco pedoco) {
		getPedocos().add(pedoco);
		pedoco.setPedre(this);

		return pedoco;
	}

	public Pedoco removePedoco(Pedoco pedoco) {
		getPedocos().remove(pedoco);
		pedoco.setPedre(null);

		return pedoco;
	}

	public List<Pedpro> getPedpros() {
		return this.pedpros;
	}

	public void setPedpros(List<Pedpro> pedpros) {
		this.pedpros = pedpros;
	}

	public Pedpro addPedpro(Pedpro pedpro) {
		getPedpros().add(pedpro);
		pedpro.setPedre(this);

		return pedpro;
	}

	public Pedpro removePedpro(Pedpro pedpro) {
		getPedpros().remove(pedpro);
		pedpro.setPedre(null);

		return pedpro;
	}

	public List<Pedre2> getPedre2s() {
		return this.pedre2s;
	}

	public void setPedre2s(List<Pedre2> pedre2s) {
		this.pedre2s = pedre2s;
	}

	public Pedre2 addPedre2(Pedre2 pedre2) {
		getPedre2s().add(pedre2);
		pedre2.setPedres(this);

		return pedre2;
	}

	public Pedre2 removePedre2(Pedre2 pedre2) {
		getPedre2s().remove(pedre2);
		pedre2.setPedres(null);

		return pedre2;
	}

	public List<Pedre3> getPedre3s() {
		return this.pedre3s;
	}

	public void setPedre3s(List<Pedre3> pedre3s) {
		this.pedre3s = pedre3s;
	}

	public Pedre3 addPedre3(Pedre3 pedre3) {
		getPedre3s().add(pedre3);
		pedre3.setPedre(this);

		return pedre3;
	}

	public Pedre3 removePedre3(Pedre3 pedre3) {
		getPedre3s().remove(pedre3);
		pedre3.setPedre(null);

		return pedre3;
	}

	public List<Pedrej> getPedrejs() {
		return this.pedrejs;
	}

	public void setPedrejs(List<Pedrej> pedrejs) {
		this.pedrejs = pedrejs;
	}

	public Pedrej addPedrej(Pedrej pedrej) {
		getPedrejs().add(pedrej);
		pedrej.setPedre(this);

		return pedrej;
	}

	public Pedrej removePedrej(Pedrej pedrej) {
		getPedrejs().remove(pedrej);
		pedrej.setPedre(null);

		return pedrej;
	}

	public Pedtip getPedtip() {
		return this.pedtip;
	}

	public void setPedtip(Pedtip pedtip) {
		this.pedtip = pedtip;
	}

	public Fincli getFincli() {
		return fincli;
	}

	public void setFincli(Fincli fincli) {
		this.fincli = fincli;
	}
=======
package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.PedresPK;

/**
 * The persistent class for the pedres database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedres.findAll", query = "SELECT p FROM Pedres p")
public class Pedres implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedresPK id;

	private BigDecimal acrcnd;

	@Column(name = "aliq_cred_sn")
	private BigDecimal aliqCredSn;

	private BigDecimal aliqcof;

	private BigDecimal aliqpis;

	private Integer anores;

	@Column(name = "app_ver")
	private Integer appVer;

	private String atuest;

	private String baicli;

	private BigDecimal bascat;

	private BigDecimal bascom;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal basiss;

	private BigDecimal bassub;

	private BigDecimal bscicm;

	private BigDecimal bscipi;

	private String cepcli;

	private String cgccli;

	private String cgecli;

	private String cidcli;

	private String clitab;

	private Integer codatd;

	private String codcfo;

	private Integer codcli;

	private String codcom;

	private Integer coddesoneracao;

	private String codean;

	private Integer codfil;

	private Integer codgcl;

	private Integer codgus;

	private Integer codgve;

	private String codicm;

	private String codipi;

	private String codpfa;

	private Integer codtcl;

	private Integer codtra;

	private Integer codusu;

	private Integer codven;

	private String comatd;

	private String comcli;

	private String comicli;

	private String consum;

	private String cstcof;

	private String cstipi;

	private String cstpis;

	private BigDecimal desicm;

	private BigDecimal desipi;

	private String desreg;

	private BigDecimal dessub;

	private BigDecimal devger;

	private BigDecimal devres;

	private BigDecimal dsccnd;

	private BigDecimal dsccom;

	private BigDecimal dscicm;

	private BigDecimal dscipi;

	private BigDecimal dscreg;

	private BigDecimal dscres;

	private BigDecimal dscsub;

	@Temporal(TemporalType.DATE)
	private Date dtecmp;

	@Temporal(TemporalType.DATE)
	private Date dtecom;

	@Temporal(TemporalType.DATE)
	private Date dtecon;

	@Temporal(TemporalType.DATE)
	private Date dtecta;

	@Temporal(TemporalType.DATE)
	private Date dtedel;

	@Temporal(TemporalType.DATE)
	private Date dtefin;

	@Temporal(TemporalType.DATE)
	private Date dtefpe;

	@Temporal(TemporalType.DATE)
	private Date dteped;

	@Temporal(TemporalType.DATE)
	private Date dtepro;

	@Temporal(TemporalType.DATE)
	private Date dterej;

	@Temporal(TemporalType.DATE)
	private Date dtfres;

	@Temporal(TemporalType.DATE)
	private Date dtlpsq;

	@Temporal(TemporalType.DATE)
	private Date dtvsuf;

	private String ecfemi;

	private Integer empcta;

	private Integer empped;

	private String endcli;

	private BigDecimal fatger;

	private BigDecimal fatres;

	private String flgant;

	private String flgatu;

	private String flgavi;

	private String flgcli;

	private String flgcmp;

	private String flgcom;

	private String flgcon;

	private String flgctb;

	private String flgdif;

	private String flgest;

	private String flgfec;

	private String flgfin;

	private String flgger;

	private String flgimp;

	private String flgipi;

	private String flgmobile;

	private String flgoco;

	private String flgope;

	private String flgpro;

	private String flgpsq;

	private String flgrej;

	private String flgreq;

	private String flgres;

	private String flgser;

	private String flgsld;

	private String flgtab;

	private BigDecimal frticm;

	private BigDecimal frtipi;

	private String frtres;

	private BigDecimal frtsub;

	private String hrecmp;

	private String hrecom;

	private String hrecon;

	private String hredel;

	private String hrefin;

	private String hrefpe;

	private String hrepro;

	private String hrerej;

	private String hreres;

	@Column(name = "id_esticm")
	private Integer idEsticm;

	@Column(name = "id_estipi")
	private Integer idEstipi;

	@Column(name = "id_estsip")
	private Integer idEstsip;

	@Column(name = "id_fincie")
	private Integer idFincie;

	@Column(name = "id_finufe")
	private Integer idFinufe;

	@Column(name = "id_frete")
	private Integer idFrete;

	@Column(name = "id_pedcnd")
	private Integer idPedcnd;

	@Column(name = "id_pedcta")
	private Integer idPedcta;

	@Column(name = "id_pedfe2")
	private Integer idPedfe2;

	@Column(name = "id_pedres")
	private Integer idPedres;

	@Column(name = "id_pedres_orig")
	private Integer idPedresOrig;

	@Column(name = "id_sepped")
	private Integer idSepped;

	private BigDecimal incfin;

	private BigDecimal increv;

	@Column(name = "indic_cf")
	private Integer indicCf;

	@Column(name = "indic_presenca")
	private Integer indicPresenca;

	private String inecli;

	private String inscli;

	private String intfin;

	@Column(name = "is_cta")
	private Integer isCta;

	private String lanest;

	private String libcli;

	private String libsld;

	private BigDecimal limcli;

	private Integer linres;

	private BigDecimal medacr;

	private BigDecimal medcat;

	private BigDecimal medcom;

	private BigDecimal meddco;

	private BigDecimal meddsc;

	private BigDecimal medprm;

	private String mesres;

	private String modpfa;

	private String noment;

	private String nrosuf;

	private String numcli;

	private Integer numcta;

	private Integer numped;

	private String ob1can;

	private String ob1fat;

	private String ob1res;

	private String ob2can;

	private String ob2fat;

	private String ob2res;

	private String ob3can;

	private String ob3fat;

	private String ob3res;

	private String ob4can;

	private String ob4fat;

	private String ob4res;

	private String ob5can;

	private String ob5fat;

	private String ob5res;

	private String ob6fat;

	private String ob6res;

	private String ob7fat;

	private String ob7res;

	private String ob8fat;

	private String ob8res;

	private String obrgve;

	private String obsant;

	private String obscmp;

	private String obscom;

	private String obscon;

	private String obsdel;

	private String obsfin;

	private String obsfpe;

	private String obspro;

	private String obsrej;

	private String obsres;

	private BigDecimal pcoatd;

	private BigDecimal pcores;

	private String pedant;

	private String pedpro;

	private BigDecimal percof;

	private BigDecimal perpis;

	private String prccta;

	private Integer prfres;

	private Integer qtdimp;

	private Integer qtfres;

	private Integer qtilib;

	private Integer qtire2;

	private Integer qtire3;

	private Integer qtire4;

	private Integer qtires;

	private Integer qtlres;

	private Integer qtpres;

	private BigDecimal redicm;

	private BigDecimal redipi;

	private String refcli;

	private Integer regtrb;

	private Integer regtrbemp;

	private BigDecimal renmin;

	private BigDecimal segicm;

	private BigDecimal segipi;

	private BigDecimal segsub;

	private Integer seqite;

	private Integer seqlib;

	private Integer seqpar;

	private Integer seqre3;

	private String seqres;

	private String sitres;

	private BigDecimal sldger;

	private BigDecimal sldres;

	@Column(name = "sufr_cofins")
	private String sufrCofins;

	@Column(name = "sufr_icms")
	private String sufrIcms;

	@Column(name = "sufr_ipi")
	private String sufrIpi;

	@Column(name = "sufr_pis")
	private String sufrPis;

	private String tencli;

	private String tipcom;

	private String tipcpa;

	private String tipfre;

	private String tipfrt;

	private String tipicm;

	private String tipipi;

	private String tippfa;

	private BigDecimal totacp;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcat;

	private BigDecimal totcli;

	private BigDecimal totcof;

	private BigDecimal totcom;

	private BigDecimal totcst;

	private BigDecimal totcub;

	private BigDecimal totdco;

	private BigDecimal totdescinc;

	private BigDecimal totdsc;

	private BigDecimal totdsp;

	private BigDecimal totdsr;

	private BigDecimal totfrt;

	private BigDecimal totger;

	private BigDecimal totibpt;

	private BigDecimal toticm;

	private BigDecimal totipc;

	private BigDecimal totipi;

	private BigDecimal totiss;

	private BigDecimal totitetrb;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totpis;

	private BigDecimal totren;

	private BigDecimal totres;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private Integer totvol;

	private String trbcof;

	private String trbicm;

	private String trbipi;

	private String trbpis;

	private String txficm;

	private String txfipi;

	private String ufecli;

	private String uferes;

	private String updproc;

	private Integer usuant;

	private Integer usucmp;

	private Integer usucom;

	private Integer usucon;

	private Integer usudel;

	private Integer usufin;

	private Integer usufpe;

	private Integer usuimp;

	private Integer usupro;

	private Integer usurej;

	// bi-directional many-to-one association to Pedcom
	@OneToMany(mappedBy = "pedre")
	private List<Pedcom> pedcoms;

	// bi-directional many-to-one association to Pedfin
	@OneToMany(mappedBy = "pedre")
	private List<Pedfin> pedfins;

	// bi-directional many-to-one association to Pedlog
	@OneToMany(mappedBy = "pedre")
	private List<Pedlog> pedlogs;

	// bi-directional many-to-one association to Pedoco
	@OneToMany(mappedBy = "pedre")
	private List<Pedoco> pedocos;

	// bi-directional many-to-one association to Pedpro
	@OneToMany(mappedBy = "pedre")
	private List<Pedpro> pedpros;

	// bi-directional many-to-one association to Pedre2
	@OneToMany(mappedBy = "pedres")
	private List<Pedre2> pedre2s;

	// bi-directional many-to-one association to Pedre3
	@OneToMany(mappedBy = "pedre")
	private List<Pedre3> pedre3s;

	// bi-directional many-to-one association to Pedrej
	@OneToMany(mappedBy = "pedre")
	private List<Pedrej> pedrejs;

	// bi-directional many-to-one association to Pedtip
	@ManyToOne
	@JoinColumn(name = "codtip")
	private Pedtip pedtip;

	// bi-directional many-to-one association to Pedtip
	@ManyToOne
	@JoinColumn(name = "codcli", insertable = false, updatable = false)
	private Fincli fincli;

	@ManyToOne
	@JoinColumn(name = "codven", insertable = false, updatable = false)
	private Finven finven;

	public Finven getFinven() {
		return finven;
	}

	public void setFinven(Finven finven) {
		this.finven = finven;
	}

	@ManyToOne
	@JoinColumn(name = "codatd", insertable = false, updatable = false)
	private Finatd finatd;

	public Finatd getFinatd() {
		return finatd;
	}

	public void setFinatd(Finatd finatd) {
		this.finatd = finatd;
	}

	public Pedres() {
	}

	public PedresPK getId() {
		return this.id;
	}

	public void setId(PedresPK id) {
		this.id = id;
	}

	public BigDecimal getAcrcnd() {
		return this.acrcnd;
	}

	public void setAcrcnd(BigDecimal acrcnd) {
		this.acrcnd = acrcnd;
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

	public BigDecimal getAliqpis() {
		return this.aliqpis;
	}

	public void setAliqpis(BigDecimal aliqpis) {
		this.aliqpis = aliqpis;
	}

	public Integer getAnores() {
		return this.anores;
	}

	public void setAnores(Integer anores) {
		this.anores = anores;
	}

	public Integer getAppVer() {
		return this.appVer;
	}

	public void setAppVer(Integer appVer) {
		this.appVer = appVer;
	}

	public String getAtuest() {
		return this.atuest;
	}

	public void setAtuest(String atuest) {
		this.atuest = atuest;
	}

	public String getBaicli() {
		return this.baicli;
	}

	public void setBaicli(String baicli) {
		this.baicli = baicli;
	}

	public BigDecimal getBascat() {
		return this.bascat;
	}

	public void setBascat(BigDecimal bascat) {
		this.bascat = bascat;
	}

	public BigDecimal getBascom() {
		return this.bascom;
	}

	public void setBascom(BigDecimal bascom) {
		this.bascom = bascom;
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

	public String getCepcli() {
		return this.cepcli;
	}

	public void setCepcli(String cepcli) {
		this.cepcli = cepcli;
	}

	public String getCgccli() {
		return this.cgccli;
	}

	public void setCgccli(String cgccli) {
		this.cgccli = cgccli;
	}

	public String getCgecli() {
		return this.cgecli;
	}

	public void setCgecli(String cgecli) {
		this.cgecli = cgecli;
	}

	public String getCidcli() {
		return this.cidcli;
	}

	public void setCidcli(String cidcli) {
		this.cidcli = cidcli;
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

	public String getCodcom() {
		return this.codcom;
	}

	public void setCodcom(String codcom) {
		this.codcom = codcom;
	}

	public Integer getCoddesoneracao() {
		return this.coddesoneracao;
	}

	public void setCoddesoneracao(Integer coddesoneracao) {
		this.coddesoneracao = coddesoneracao;
	}

	public String getCodean() {
		return this.codean;
	}

	public void setCodean(String codean) {
		this.codean = codean;
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

	public Integer getCodgus() {
		return this.codgus;
	}

	public void setCodgus(Integer codgus) {
		this.codgus = codgus;
	}

	public Integer getCodgve() {
		return this.codgve;
	}

	public void setCodgve(Integer codgve) {
		this.codgve = codgve;
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

	public Integer getCodtra() {
		return this.codtra;
	}

	public void setCodtra(Integer codtra) {
		this.codtra = codtra;
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

	public String getComatd() {
		return this.comatd;
	}

	public void setComatd(String comatd) {
		this.comatd = comatd;
	}

	public String getComcli() {
		return this.comcli;
	}

	public void setComcli(String comcli) {
		this.comcli = comcli;
	}

	public String getComicli() {
		return this.comicli;
	}

	public void setComicli(String comicli) {
		this.comicli = comicli;
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

	public String getDesreg() {
		return this.desreg;
	}

	public void setDesreg(String desreg) {
		this.desreg = desreg;
	}

	public BigDecimal getDessub() {
		return this.dessub;
	}

	public void setDessub(BigDecimal dessub) {
		this.dessub = dessub;
	}

	public BigDecimal getDevger() {
		return this.devger;
	}

	public void setDevger(BigDecimal devger) {
		this.devger = devger;
	}

	public BigDecimal getDevres() {
		return this.devres;
	}

	public void setDevres(BigDecimal devres) {
		this.devres = devres;
	}

	public BigDecimal getDsccnd() {
		return this.dsccnd;
	}

	public void setDsccnd(BigDecimal dsccnd) {
		this.dsccnd = dsccnd;
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

	public BigDecimal getDscreg() {
		return this.dscreg;
	}

	public void setDscreg(BigDecimal dscreg) {
		this.dscreg = dscreg;
	}

	public BigDecimal getDscres() {
		return this.dscres;
	}

	public void setDscres(BigDecimal dscres) {
		this.dscres = dscres;
	}

	public BigDecimal getDscsub() {
		return this.dscsub;
	}

	public void setDscsub(BigDecimal dscsub) {
		this.dscsub = dscsub;
	}

	public Date getDtecmp() {
		return this.dtecmp;
	}

	public void setDtecmp(Date dtecmp) {
		this.dtecmp = dtecmp;
	}

	public Date getDtecom() {
		return this.dtecom;
	}

	public void setDtecom(Date dtecom) {
		this.dtecom = dtecom;
	}

	public Date getDtecon() {
		return this.dtecon;
	}

	public void setDtecon(Date dtecon) {
		this.dtecon = dtecon;
	}

	public Date getDtecta() {
		return this.dtecta;
	}

	public void setDtecta(Date dtecta) {
		this.dtecta = dtecta;
	}

	public Date getDtedel() {
		return this.dtedel;
	}

	public void setDtedel(Date dtedel) {
		this.dtedel = dtedel;
	}

	public Date getDtefin() {
		return this.dtefin;
	}

	public void setDtefin(Date dtefin) {
		this.dtefin = dtefin;
	}

	public Date getDtefpe() {
		return this.dtefpe;
	}

	public void setDtefpe(Date dtefpe) {
		this.dtefpe = dtefpe;
	}

	public Date getDteped() {
		return this.dteped;
	}

	public void setDteped(Date dteped) {
		this.dteped = dteped;
	}

	public Date getDtepro() {
		return this.dtepro;
	}

	public void setDtepro(Date dtepro) {
		this.dtepro = dtepro;
	}

	public Date getDterej() {
		return this.dterej;
	}

	public void setDterej(Date dterej) {
		this.dterej = dterej;
	}

	public Date getDtfres() {
		return this.dtfres;
	}

	public void setDtfres(Date dtfres) {
		this.dtfres = dtfres;
	}

	public Date getDtlpsq() {
		return this.dtlpsq;
	}

	public void setDtlpsq(Date dtlpsq) {
		this.dtlpsq = dtlpsq;
	}

	public Date getDtvsuf() {
		return this.dtvsuf;
	}

	public void setDtvsuf(Date dtvsuf) {
		this.dtvsuf = dtvsuf;
	}

	public String getEcfemi() {
		return this.ecfemi;
	}

	public void setEcfemi(String ecfemi) {
		this.ecfemi = ecfemi;
	}

	public Integer getEmpcta() {
		return this.empcta;
	}

	public void setEmpcta(Integer empcta) {
		this.empcta = empcta;
	}

	public Integer getEmpped() {
		return this.empped;
	}

	public void setEmpped(Integer empped) {
		this.empped = empped;
	}

	public String getEndcli() {
		return this.endcli;
	}

	public void setEndcli(String endcli) {
		this.endcli = endcli;
	}

	public BigDecimal getFatger() {
		return this.fatger;
	}

	public void setFatger(BigDecimal fatger) {
		this.fatger = fatger;
	}

	public BigDecimal getFatres() {
		return this.fatres;
	}

	public void setFatres(BigDecimal fatres) {
		this.fatres = fatres;
	}

	public String getFlgant() {
		return this.flgant;
	}

	public void setFlgant(String flgant) {
		this.flgant = flgant;
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

	public String getFlgcli() {
		return this.flgcli;
	}

	public void setFlgcli(String flgcli) {
		this.flgcli = flgcli;
	}

	public String getFlgcmp() {
		return this.flgcmp;
	}

	public void setFlgcmp(String flgcmp) {
		this.flgcmp = flgcmp;
	}

	public String getFlgcom() {
		return this.flgcom;
	}

	public void setFlgcom(String flgcom) {
		this.flgcom = flgcom;
	}

	public String getFlgcon() {
		return this.flgcon;
	}

	public void setFlgcon(String flgcon) {
		this.flgcon = flgcon;
	}

	public String getFlgctb() {
		return this.flgctb;
	}

	public void setFlgctb(String flgctb) {
		this.flgctb = flgctb;
	}

	public String getFlgdif() {
		return this.flgdif;
	}

	public void setFlgdif(String flgdif) {
		this.flgdif = flgdif;
	}

	public String getFlgest() {
		return this.flgest;
	}

	public void setFlgest(String flgest) {
		this.flgest = flgest;
	}

	public String getFlgfec() {
		return this.flgfec;
	}

	public void setFlgfec(String flgfec) {
		this.flgfec = flgfec;
	}

	public String getFlgfin() {
		return this.flgfin;
	}

	public void setFlgfin(String flgfin) {
		this.flgfin = flgfin;
	}

	public String getFlgger() {
		return this.flgger;
	}

	public void setFlgger(String flgger) {
		this.flgger = flgger;
	}

	public String getFlgimp() {
		return this.flgimp;
	}

	public void setFlgimp(String flgimp) {
		this.flgimp = flgimp;
	}

	public String getFlgipi() {
		return this.flgipi;
	}

	public void setFlgipi(String flgipi) {
		this.flgipi = flgipi;
	}

	public String getFlgmobile() {
		return this.flgmobile;
	}

	public void setFlgmobile(String flgmobile) {
		this.flgmobile = flgmobile;
	}

	public String getFlgoco() {
		return this.flgoco;
	}

	public void setFlgoco(String flgoco) {
		this.flgoco = flgoco;
	}

	public String getFlgope() {
		return this.flgope;
	}

	public void setFlgope(String flgope) {
		this.flgope = flgope;
	}

	public String getFlgpro() {
		return this.flgpro;
	}

	public void setFlgpro(String flgpro) {
		this.flgpro = flgpro;
	}

	public String getFlgpsq() {
		return this.flgpsq;
	}

	public void setFlgpsq(String flgpsq) {
		this.flgpsq = flgpsq;
	}

	public String getFlgrej() {
		return this.flgrej;
	}

	public void setFlgrej(String flgrej) {
		this.flgrej = flgrej;
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

	public String getFlgser() {
		return this.flgser;
	}

	public void setFlgser(String flgser) {
		this.flgser = flgser;
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

	public String getFrtres() {
		return this.frtres;
	}

	public void setFrtres(String frtres) {
		this.frtres = frtres;
	}

	public BigDecimal getFrtsub() {
		return this.frtsub;
	}

	public void setFrtsub(BigDecimal frtsub) {
		this.frtsub = frtsub;
	}

	public String getHrecmp() {
		return this.hrecmp;
	}

	public void setHrecmp(String hrecmp) {
		this.hrecmp = hrecmp;
	}

	public String getHrecom() {
		return this.hrecom;
	}

	public void setHrecom(String hrecom) {
		this.hrecom = hrecom;
	}

	public String getHrecon() {
		return this.hrecon;
	}

	public void setHrecon(String hrecon) {
		this.hrecon = hrecon;
	}

	public String getHredel() {
		return this.hredel;
	}

	public void setHredel(String hredel) {
		this.hredel = hredel;
	}

	public String getHrefin() {
		return this.hrefin;
	}

	public void setHrefin(String hrefin) {
		this.hrefin = hrefin;
	}

	public String getHrefpe() {
		return this.hrefpe;
	}

	public void setHrefpe(String hrefpe) {
		this.hrefpe = hrefpe;
	}

	public String getHrepro() {
		return this.hrepro;
	}

	public void setHrepro(String hrepro) {
		this.hrepro = hrepro;
	}

	public String getHrerej() {
		return this.hrerej;
	}

	public void setHrerej(String hrerej) {
		this.hrerej = hrerej;
	}

	public String getHreres() {
		return this.hreres;
	}

	public void setHreres(String hreres) {
		this.hreres = hreres;
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

	public Integer getIdEstsip() {
		return this.idEstsip;
	}

	public void setIdEstsip(Integer idEstsip) {
		this.idEstsip = idEstsip;
	}

	public Integer getIdFincie() {
		return this.idFincie;
	}

	public void setIdFincie(Integer idFincie) {
		this.idFincie = idFincie;
	}

	public Integer getIdFinufe() {
		return this.idFinufe;
	}

	public void setIdFinufe(Integer idFinufe) {
		this.idFinufe = idFinufe;
	}

	public Integer getIdFrete() {
		return this.idFrete;
	}

	public void setIdFrete(Integer idFrete) {
		this.idFrete = idFrete;
	}

	public Integer getIdPedcnd() {
		return this.idPedcnd;
	}

	public void setIdPedcnd(Integer idPedcnd) {
		this.idPedcnd = idPedcnd;
	}

	public Integer getIdPedcta() {
		return this.idPedcta;
	}

	public void setIdPedcta(Integer idPedcta) {
		this.idPedcta = idPedcta;
	}

	public Integer getIdPedfe2() {
		return this.idPedfe2;
	}

	public void setIdPedfe2(Integer idPedfe2) {
		this.idPedfe2 = idPedfe2;
	}

	public Integer getIdPedres() {
		return this.idPedres;
	}

	public void setIdPedres(Integer idPedres) {
		this.idPedres = idPedres;
	}

	public Integer getIdPedresOrig() {
		return this.idPedresOrig;
	}

	public void setIdPedresOrig(Integer idPedresOrig) {
		this.idPedresOrig = idPedresOrig;
	}

	public Integer getIdSepped() {
		return this.idSepped;
	}

	public void setIdSepped(Integer idSepped) {
		this.idSepped = idSepped;
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

	public String getInecli() {
		return this.inecli;
	}

	public void setInecli(String inecli) {
		this.inecli = inecli;
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

	public Integer getIsCta() {
		return this.isCta;
	}

	public void setIsCta(Integer isCta) {
		this.isCta = isCta;
	}

	public String getLanest() {
		return this.lanest;
	}

	public void setLanest(String lanest) {
		this.lanest = lanest;
	}

	public String getLibcli() {
		return this.libcli;
	}

	public void setLibcli(String libcli) {
		this.libcli = libcli;
	}

	public String getLibsld() {
		return this.libsld;
	}

	public void setLibsld(String libsld) {
		this.libsld = libsld;
	}

	public BigDecimal getLimcli() {
		return this.limcli;
	}

	public void setLimcli(BigDecimal limcli) {
		this.limcli = limcli;
	}

	public Integer getLinres() {
		return this.linres;
	}

	public void setLinres(Integer linres) {
		this.linres = linres;
	}

	public BigDecimal getMedacr() {
		return this.medacr;
	}

	public void setMedacr(BigDecimal medacr) {
		this.medacr = medacr;
	}

	public BigDecimal getMedcat() {
		return this.medcat;
	}

	public void setMedcat(BigDecimal medcat) {
		this.medcat = medcat;
	}

	public BigDecimal getMedcom() {
		return this.medcom;
	}

	public void setMedcom(BigDecimal medcom) {
		this.medcom = medcom;
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

	public String getMesres() {
		return this.mesres;
	}

	public void setMesres(String mesres) {
		this.mesres = mesres;
	}

	public String getModpfa() {
		return this.modpfa;
	}

	public void setModpfa(String modpfa) {
		this.modpfa = modpfa;
	}

	public String getNoment() {
		return this.noment;
	}

	public void setNoment(String noment) {
		this.noment = noment;
	}

	public String getNrosuf() {
		return this.nrosuf;
	}

	public void setNrosuf(String nrosuf) {
		this.nrosuf = nrosuf;
	}

	public String getNumcli() {
		return this.numcli;
	}

	public void setNumcli(String numcli) {
		this.numcli = numcli;
	}

	public Integer getNumcta() {
		return this.numcta;
	}

	public void setNumcta(Integer numcta) {
		this.numcta = numcta;
	}

	public Integer getNumped() {
		return this.numped;
	}

	public void setNumped(Integer numped) {
		this.numped = numped;
	}

	public String getOb1can() {
		return this.ob1can;
	}

	public void setOb1can(String ob1can) {
		this.ob1can = ob1can;
	}

	public String getOb1fat() {
		return this.ob1fat;
	}

	public void setOb1fat(String ob1fat) {
		this.ob1fat = ob1fat;
	}

	public String getOb1res() {
		return this.ob1res;
	}

	public void setOb1res(String ob1res) {
		this.ob1res = ob1res;
	}

	public String getOb2can() {
		return this.ob2can;
	}

	public void setOb2can(String ob2can) {
		this.ob2can = ob2can;
	}

	public String getOb2fat() {
		return this.ob2fat;
	}

	public void setOb2fat(String ob2fat) {
		this.ob2fat = ob2fat;
	}

	public String getOb2res() {
		return this.ob2res;
	}

	public void setOb2res(String ob2res) {
		this.ob2res = ob2res;
	}

	public String getOb3can() {
		return this.ob3can;
	}

	public void setOb3can(String ob3can) {
		this.ob3can = ob3can;
	}

	public String getOb3fat() {
		return this.ob3fat;
	}

	public void setOb3fat(String ob3fat) {
		this.ob3fat = ob3fat;
	}

	public String getOb3res() {
		return this.ob3res;
	}

	public void setOb3res(String ob3res) {
		this.ob3res = ob3res;
	}

	public String getOb4can() {
		return this.ob4can;
	}

	public void setOb4can(String ob4can) {
		this.ob4can = ob4can;
	}

	public String getOb4fat() {
		return this.ob4fat;
	}

	public void setOb4fat(String ob4fat) {
		this.ob4fat = ob4fat;
	}

	public String getOb4res() {
		return this.ob4res;
	}

	public void setOb4res(String ob4res) {
		this.ob4res = ob4res;
	}

	public String getOb5can() {
		return this.ob5can;
	}

	public void setOb5can(String ob5can) {
		this.ob5can = ob5can;
	}

	public String getOb5fat() {
		return this.ob5fat;
	}

	public void setOb5fat(String ob5fat) {
		this.ob5fat = ob5fat;
	}

	public String getOb5res() {
		return this.ob5res;
	}

	public void setOb5res(String ob5res) {
		this.ob5res = ob5res;
	}

	public String getOb6fat() {
		return this.ob6fat;
	}

	public void setOb6fat(String ob6fat) {
		this.ob6fat = ob6fat;
	}

	public String getOb6res() {
		return this.ob6res;
	}

	public void setOb6res(String ob6res) {
		this.ob6res = ob6res;
	}

	public String getOb7fat() {
		return this.ob7fat;
	}

	public void setOb7fat(String ob7fat) {
		this.ob7fat = ob7fat;
	}

	public String getOb7res() {
		return this.ob7res;
	}

	public void setOb7res(String ob7res) {
		this.ob7res = ob7res;
	}

	public String getOb8fat() {
		return this.ob8fat;
	}

	public void setOb8fat(String ob8fat) {
		this.ob8fat = ob8fat;
	}

	public String getOb8res() {
		return this.ob8res;
	}

	public void setOb8res(String ob8res) {
		this.ob8res = ob8res;
	}

	public String getObrgve() {
		return this.obrgve;
	}

	public void setObrgve(String obrgve) {
		this.obrgve = obrgve;
	}

	public String getObsant() {
		return this.obsant;
	}

	public void setObsant(String obsant) {
		this.obsant = obsant;
	}

	public String getObscmp() {
		return this.obscmp;
	}

	public void setObscmp(String obscmp) {
		this.obscmp = obscmp;
	}

	public String getObscom() {
		return this.obscom;
	}

	public void setObscom(String obscom) {
		this.obscom = obscom;
	}

	public String getObscon() {
		return this.obscon;
	}

	public void setObscon(String obscon) {
		this.obscon = obscon;
	}

	public String getObsdel() {
		return this.obsdel;
	}

	public void setObsdel(String obsdel) {
		this.obsdel = obsdel;
	}

	public String getObsfin() {
		return this.obsfin;
	}

	public void setObsfin(String obsfin) {
		this.obsfin = obsfin;
	}

	public String getObsfpe() {
		return this.obsfpe;
	}

	public void setObsfpe(String obsfpe) {
		this.obsfpe = obsfpe;
	}

	public String getObspro() {
		return this.obspro;
	}

	public void setObspro(String obspro) {
		this.obspro = obspro;
	}

	public String getObsrej() {
		return this.obsrej;
	}

	public void setObsrej(String obsrej) {
		this.obsrej = obsrej;
	}

	public String getObsres() {
		return this.obsres;
	}

	public void setObsres(String obsres) {
		this.obsres = obsres;
	}

	public BigDecimal getPcoatd() {
		return this.pcoatd;
	}

	public void setPcoatd(BigDecimal pcoatd) {
		this.pcoatd = pcoatd;
	}

	public BigDecimal getPcores() {
		return this.pcores;
	}

	public void setPcores(BigDecimal pcores) {
		this.pcores = pcores;
	}

	public String getPedant() {
		return this.pedant;
	}

	public void setPedant(String pedant) {
		this.pedant = pedant;
	}

	public String getPedpro() {
		return this.pedpro;
	}

	public void setPedpro(String pedpro) {
		this.pedpro = pedpro;
	}

	public BigDecimal getPercof() {
		return this.percof;
	}

	public void setPercof(BigDecimal percof) {
		this.percof = percof;
	}

	public BigDecimal getPerpis() {
		return this.perpis;
	}

	public void setPerpis(BigDecimal perpis) {
		this.perpis = perpis;
	}

	public String getPrccta() {
		return this.prccta;
	}

	public void setPrccta(String prccta) {
		this.prccta = prccta;
	}

	public Integer getPrfres() {
		return this.prfres;
	}

	public void setPrfres(Integer prfres) {
		this.prfres = prfres;
	}

	public Integer getQtdimp() {
		return this.qtdimp;
	}

	public void setQtdimp(Integer qtdimp) {
		this.qtdimp = qtdimp;
	}

	public Integer getQtfres() {
		return this.qtfres;
	}

	public void setQtfres(Integer qtfres) {
		this.qtfres = qtfres;
	}

	public Integer getQtilib() {
		return this.qtilib;
	}

	public void setQtilib(Integer qtilib) {
		this.qtilib = qtilib;
	}

	public Integer getQtire2() {
		return this.qtire2;
	}

	public void setQtire2(Integer qtire2) {
		this.qtire2 = qtire2;
	}

	public Integer getQtire3() {
		return this.qtire3;
	}

	public void setQtire3(Integer qtire3) {
		this.qtire3 = qtire3;
	}

	public Integer getQtire4() {
		return this.qtire4;
	}

	public void setQtire4(Integer qtire4) {
		this.qtire4 = qtire4;
	}

	public Integer getQtires() {
		return this.qtires;
	}

	public void setQtires(Integer qtires) {
		this.qtires = qtires;
	}

	public Integer getQtlres() {
		return this.qtlres;
	}

	public void setQtlres(Integer qtlres) {
		this.qtlres = qtlres;
	}

	public Integer getQtpres() {
		return this.qtpres;
	}

	public void setQtpres(Integer qtpres) {
		this.qtpres = qtpres;
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

	public String getRefcli() {
		return this.refcli;
	}

	public void setRefcli(String refcli) {
		this.refcli = refcli;
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

	public BigDecimal getRenmin() {
		return this.renmin;
	}

	public void setRenmin(BigDecimal renmin) {
		this.renmin = renmin;
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

	public Integer getSeqite() {
		return this.seqite;
	}

	public void setSeqite(Integer seqite) {
		this.seqite = seqite;
	}

	public Integer getSeqlib() {
		return this.seqlib;
	}

	public void setSeqlib(Integer seqlib) {
		this.seqlib = seqlib;
	}

	public Integer getSeqpar() {
		return this.seqpar;
	}

	public void setSeqpar(Integer seqpar) {
		this.seqpar = seqpar;
	}

	public Integer getSeqre3() {
		return this.seqre3;
	}

	public void setSeqre3(Integer seqre3) {
		this.seqre3 = seqre3;
	}

	public String getSeqres() {
		return this.seqres;
	}

	public void setSeqres(String seqres) {
		this.seqres = seqres;
	}

	public String getSitres() {
		return this.sitres;
	}

	public void setSitres(String sitres) {
		this.sitres = sitres;
	}

	public BigDecimal getSldger() {
		return this.sldger;
	}

	public void setSldger(BigDecimal sldger) {
		this.sldger = sldger;
	}

	public BigDecimal getSldres() {
		return this.sldres;
	}

	public void setSldres(BigDecimal sldres) {
		this.sldres = sldres;
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

	public String getTencli() {
		return this.tencli;
	}

	public void setTencli(String tencli) {
		this.tencli = tencli;
	}

	public String getTipcom() {
		return this.tipcom;
	}

	public void setTipcom(String tipcom) {
		this.tipcom = tipcom;
	}

	public String getTipcpa() {
		return this.tipcpa;
	}

	public void setTipcpa(String tipcpa) {
		this.tipcpa = tipcpa;
	}

	public String getTipfre() {
		return this.tipfre;
	}

	public void setTipfre(String tipfre) {
		this.tipfre = tipfre;
	}

	public String getTipfrt() {
		return this.tipfrt;
	}

	public void setTipfrt(String tipfrt) {
		this.tipfrt = tipfrt;
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

	public BigDecimal getTotger() {
		return this.totger;
	}

	public void setTotger(BigDecimal totger) {
		this.totger = totger;
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

	public BigDecimal getTotres() {
		return this.totres;
	}

	public void setTotres(BigDecimal totres) {
		this.totres = totres;
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

	public String getUfecli() {
		return this.ufecli;
	}

	public void setUfecli(String ufecli) {
		this.ufecli = ufecli;
	}

	public String getUferes() {
		return this.uferes;
	}

	public void setUferes(String uferes) {
		this.uferes = uferes;
	}

	public String getUpdproc() {
		return this.updproc;
	}

	public void setUpdproc(String updproc) {
		this.updproc = updproc;
	}

	public Integer getUsuant() {
		return this.usuant;
	}

	public void setUsuant(Integer usuant) {
		this.usuant = usuant;
	}

	public Integer getUsucmp() {
		return this.usucmp;
	}

	public void setUsucmp(Integer usucmp) {
		this.usucmp = usucmp;
	}

	public Integer getUsucom() {
		return this.usucom;
	}

	public void setUsucom(Integer usucom) {
		this.usucom = usucom;
	}

	public Integer getUsucon() {
		return this.usucon;
	}

	public void setUsucon(Integer usucon) {
		this.usucon = usucon;
	}

	public Integer getUsudel() {
		return this.usudel;
	}

	public void setUsudel(Integer usudel) {
		this.usudel = usudel;
	}

	public Integer getUsufin() {
		return this.usufin;
	}

	public void setUsufin(Integer usufin) {
		this.usufin = usufin;
	}

	public Integer getUsufpe() {
		return this.usufpe;
	}

	public void setUsufpe(Integer usufpe) {
		this.usufpe = usufpe;
	}

	public Integer getUsuimp() {
		return this.usuimp;
	}

	public void setUsuimp(Integer usuimp) {
		this.usuimp = usuimp;
	}

	public Integer getUsupro() {
		return this.usupro;
	}

	public void setUsupro(Integer usupro) {
		this.usupro = usupro;
	}

	public Integer getUsurej() {
		return this.usurej;
	}

	public void setUsurej(Integer usurej) {
		this.usurej = usurej;
	}

	public List<Pedcom> getPedcoms() {
		return this.pedcoms;
	}

	public void setPedcoms(List<Pedcom> pedcoms) {
		this.pedcoms = pedcoms;
	}

	public Pedcom addPedcom(Pedcom pedcom) {
		getPedcoms().add(pedcom);
		pedcom.setPedre(this);

		return pedcom;
	}

	public Pedcom removePedcom(Pedcom pedcom) {
		getPedcoms().remove(pedcom);
		pedcom.setPedre(null);

		return pedcom;
	}

	public List<Pedfin> getPedfins() {
		return this.pedfins;
	}

	public void setPedfins(List<Pedfin> pedfins) {
		this.pedfins = pedfins;
	}

	public Pedfin addPedfin(Pedfin pedfin) {
		getPedfins().add(pedfin);
		pedfin.setPedre(this);

		return pedfin;
	}

	public Pedfin removePedfin(Pedfin pedfin) {
		getPedfins().remove(pedfin);
		pedfin.setPedre(null);

		return pedfin;
	}

	public List<Pedlog> getPedlogs() {
		return this.pedlogs;
	}

	public void setPedlogs(List<Pedlog> pedlogs) {
		this.pedlogs = pedlogs;
	}

	public Pedlog addPedlog(Pedlog pedlog) {
		getPedlogs().add(pedlog);
		pedlog.setPedre(this);

		return pedlog;
	}

	public Pedlog removePedlog(Pedlog pedlog) {
		getPedlogs().remove(pedlog);
		pedlog.setPedre(null);

		return pedlog;
	}

	public List<Pedoco> getPedocos() {
		return this.pedocos;
	}

	public void setPedocos(List<Pedoco> pedocos) {
		this.pedocos = pedocos;
	}

	public Pedoco addPedoco(Pedoco pedoco) {
		getPedocos().add(pedoco);
		pedoco.setPedre(this);

		return pedoco;
	}

	public Pedoco removePedoco(Pedoco pedoco) {
		getPedocos().remove(pedoco);
		pedoco.setPedre(null);

		return pedoco;
	}

	public List<Pedpro> getPedpros() {
		return this.pedpros;
	}

	public void setPedpros(List<Pedpro> pedpros) {
		this.pedpros = pedpros;
	}

	public Pedpro addPedpro(Pedpro pedpro) {
		getPedpros().add(pedpro);
		pedpro.setPedre(this);

		return pedpro;
	}

	public Pedpro removePedpro(Pedpro pedpro) {
		getPedpros().remove(pedpro);
		pedpro.setPedre(null);

		return pedpro;
	}

	public List<Pedre2> getPedre2s() {
		return this.pedre2s;
	}

	public void setPedre2s(List<Pedre2> pedre2s) {
		this.pedre2s = pedre2s;
	}

	public Pedre2 addPedre2(Pedre2 pedre2) {
		getPedre2s().add(pedre2);
		pedre2.setPedres(this);

		return pedre2;
	}

	public Pedre2 removePedre2(Pedre2 pedre2) {
		getPedre2s().remove(pedre2);
		pedre2.setPedres(null);

		return pedre2;
	}

	public List<Pedre3> getPedre3s() {
		return this.pedre3s;
	}

	public void setPedre3s(List<Pedre3> pedre3s) {
		this.pedre3s = pedre3s;
	}

	public Pedre3 addPedre3(Pedre3 pedre3) {
		getPedre3s().add(pedre3);
		pedre3.setPedre(this);

		return pedre3;
	}

	public Pedre3 removePedre3(Pedre3 pedre3) {
		getPedre3s().remove(pedre3);
		pedre3.setPedre(null);

		return pedre3;
	}

	public List<Pedrej> getPedrejs() {
		return this.pedrejs;
	}

	public void setPedrejs(List<Pedrej> pedrejs) {
		this.pedrejs = pedrejs;
	}

	public Pedrej addPedrej(Pedrej pedrej) {
		getPedrejs().add(pedrej);
		pedrej.setPedre(this);

		return pedrej;
	}

	public Pedrej removePedrej(Pedrej pedrej) {
		getPedrejs().remove(pedrej);
		pedrej.setPedre(null);

		return pedrej;
	}

	public Pedtip getPedtip() {
		return this.pedtip;
	}

	public void setPedtip(Pedtip pedtip) {
		this.pedtip = pedtip;
	}

	public Fincli getFincli() {
		return fincli;
	}

	public void setFincli(Fincli fincli) {
		this.fincli = fincli;
	}
>>>>>>> ec6b347c2e7ce48f2cf4c2fe44ad79d0a7341b57
}