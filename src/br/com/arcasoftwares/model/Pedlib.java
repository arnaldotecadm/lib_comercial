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

import br.com.arcasoftwares.model.primaryKey.PedlibPK;


/**
 * The persistent class for the pedlib database table.
 * 
 */
@Entity
@NamedQuery(name="Pedlib.findAll", query="SELECT p FROM Pedlib p")
public class Pedlib implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedlibPK id;

	private Integer anolib;

	private String atuest;

	private BigDecimal bascat;

	private BigDecimal bascom;

	private BigDecimal basicm;

	private BigDecimal basipi;

	private BigDecimal basiss;

	private BigDecimal bassub;

	private Integer codatd;

	private String codcfo;

	private Integer codcli;

	private Integer codfil;

	private String codpfa;

	private Integer codtcl;

	private Integer codtra;

	private Integer codusu;

	private Integer codvei;

	private Integer codven;

	private BigDecimal dsccom;

	private BigDecimal dscreg;

	@Temporal(TemporalType.DATE)
	private Date dteant;

	@Temporal(TemporalType.DATE)
	private Date dteatu;

	@Temporal(TemporalType.DATE)
	private Date dtedel;

	@Temporal(TemporalType.DATE)
	private Date dtedev;

	@Temporal(TemporalType.DATE)
	private Date dteent;

	@Temporal(TemporalType.DATE)
	private Date dtefat;

	@Temporal(TemporalType.DATE)
	private Date dtelib;

	@Temporal(TemporalType.DATE)
	private Date dtesda;

	private String flgant;

	private String flgatu;

	private String flgdif;

	private String flgfec;

	private String flgipi;

	private String flglib;

	private String flgope;

	private String flgreq;

	private String flgres;

	private String flgser;

	private String flgtab;

	private String frtlib;

	private String hreant;

	private String hreatu;

	private String hredel;

	private String hredev;

	private String hreent;

	private String hrefat;

	private String hrelib;

	private String hresda;

	private String intfin;

	private String lanest;

	private BigDecimal medacr;

	private BigDecimal medcat;

	private BigDecimal medcom;

	private BigDecimal meddco;

	private BigDecimal meddsc;

	private BigDecimal medprm;

	private String meslib;

	private String modpfa;

	private Integer nronfs;

	private String nrosuf;

	private String ob1fat;

	private String ob2fat;

	private String ob3fat;

	private String ob4fat;

	private String ob5fat;

	private String ob6fat;

	private String ob7fat;

	private String ob8fat;

	private String obsant;

	private String obsdel;

	private String obsdev;

	private String obsent;

	private String obssda;

	private BigDecimal pcolib;

	private String pedant;

	private Integer pedtip;

	private Integer qtslib;

	private String sitlib;

	@Column(name="sufr_cofins")
	private String sufrCofins;

	@Column(name="sufr_icms")
	private String sufrIcms;

	@Column(name="sufr_ipi")
	private String sufrIpi;

	@Column(name="sufr_pis")
	private String sufrPis;

	private String tipcpa;

	private String tippfa;

	private BigDecimal totacr;

	private BigDecimal totbrt;

	private BigDecimal totcat;

	private BigDecimal totcom;

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

	private BigDecimal totiss;

	private BigDecimal totlib;

	private BigDecimal totliq;

	private BigDecimal totoutdesp;

	private BigDecimal totren;

	private BigDecimal totseg;

	private BigDecimal totsub;

	private BigDecimal totven;

	private Integer totvol;

	private Integer trasda;

	private String ufelib;

	private Integer usuant;

	private Integer usuatu;

	private Integer usudel;

	private Integer usudev;

	private Integer usuent;

	private Integer usufat;

	private Integer ususda;

	private BigDecimal valtmo;

	public Pedlib() {
	}

	public PedlibPK getId() {
		return this.id;
	}

	public void setId(PedlibPK id) {
		this.id = id;
	}

	public Integer getAnolib() {
		return this.anolib;
	}

	public void setAnolib(Integer anolib) {
		this.anolib = anolib;
	}

	public String getAtuest() {
		return this.atuest;
	}

	public void setAtuest(String atuest) {
		this.atuest = atuest;
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

	public Integer getCodvei() {
		return this.codvei;
	}

	public void setCodvei(Integer codvei) {
		this.codvei = codvei;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
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

	public Date getDteant() {
		return this.dteant;
	}

	public void setDteant(Date dteant) {
		this.dteant = dteant;
	}

	public Date getDteatu() {
		return this.dteatu;
	}

	public void setDteatu(Date dteatu) {
		this.dteatu = dteatu;
	}

	public Date getDtedel() {
		return this.dtedel;
	}

	public void setDtedel(Date dtedel) {
		this.dtedel = dtedel;
	}

	public Date getDtedev() {
		return this.dtedev;
	}

	public void setDtedev(Date dtedev) {
		this.dtedev = dtedev;
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

	public Date getDtelib() {
		return this.dtelib;
	}

	public void setDtelib(Date dtelib) {
		this.dtelib = dtelib;
	}

	public Date getDtesda() {
		return this.dtesda;
	}

	public void setDtesda(Date dtesda) {
		this.dtesda = dtesda;
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

	public String getFlgdif() {
		return this.flgdif;
	}

	public void setFlgdif(String flgdif) {
		this.flgdif = flgdif;
	}

	public String getFlgfec() {
		return this.flgfec;
	}

	public void setFlgfec(String flgfec) {
		this.flgfec = flgfec;
	}

	public String getFlgipi() {
		return this.flgipi;
	}

	public void setFlgipi(String flgipi) {
		this.flgipi = flgipi;
	}

	public String getFlglib() {
		return this.flglib;
	}

	public void setFlglib(String flglib) {
		this.flglib = flglib;
	}

	public String getFlgope() {
		return this.flgope;
	}

	public void setFlgope(String flgope) {
		this.flgope = flgope;
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

	public String getFlgtab() {
		return this.flgtab;
	}

	public void setFlgtab(String flgtab) {
		this.flgtab = flgtab;
	}

	public String getFrtlib() {
		return this.frtlib;
	}

	public void setFrtlib(String frtlib) {
		this.frtlib = frtlib;
	}

	public String getHreant() {
		return this.hreant;
	}

	public void setHreant(String hreant) {
		this.hreant = hreant;
	}

	public String getHreatu() {
		return this.hreatu;
	}

	public void setHreatu(String hreatu) {
		this.hreatu = hreatu;
	}

	public String getHredel() {
		return this.hredel;
	}

	public void setHredel(String hredel) {
		this.hredel = hredel;
	}

	public String getHredev() {
		return this.hredev;
	}

	public void setHredev(String hredev) {
		this.hredev = hredev;
	}

	public String getHreent() {
		return this.hreent;
	}

	public void setHreent(String hreent) {
		this.hreent = hreent;
	}

	public String getHrefat() {
		return this.hrefat;
	}

	public void setHrefat(String hrefat) {
		this.hrefat = hrefat;
	}

	public String getHrelib() {
		return this.hrelib;
	}

	public void setHrelib(String hrelib) {
		this.hrelib = hrelib;
	}

	public String getHresda() {
		return this.hresda;
	}

	public void setHresda(String hresda) {
		this.hresda = hresda;
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

	public String getMeslib() {
		return this.meslib;
	}

	public void setMeslib(String meslib) {
		this.meslib = meslib;
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

	public String getNrosuf() {
		return this.nrosuf;
	}

	public void setNrosuf(String nrosuf) {
		this.nrosuf = nrosuf;
	}

	public String getOb1fat() {
		return this.ob1fat;
	}

	public void setOb1fat(String ob1fat) {
		this.ob1fat = ob1fat;
	}

	public String getOb2fat() {
		return this.ob2fat;
	}

	public void setOb2fat(String ob2fat) {
		this.ob2fat = ob2fat;
	}

	public String getOb3fat() {
		return this.ob3fat;
	}

	public void setOb3fat(String ob3fat) {
		this.ob3fat = ob3fat;
	}

	public String getOb4fat() {
		return this.ob4fat;
	}

	public void setOb4fat(String ob4fat) {
		this.ob4fat = ob4fat;
	}

	public String getOb5fat() {
		return this.ob5fat;
	}

	public void setOb5fat(String ob5fat) {
		this.ob5fat = ob5fat;
	}

	public String getOb6fat() {
		return this.ob6fat;
	}

	public void setOb6fat(String ob6fat) {
		this.ob6fat = ob6fat;
	}

	public String getOb7fat() {
		return this.ob7fat;
	}

	public void setOb7fat(String ob7fat) {
		this.ob7fat = ob7fat;
	}

	public String getOb8fat() {
		return this.ob8fat;
	}

	public void setOb8fat(String ob8fat) {
		this.ob8fat = ob8fat;
	}

	public String getObsant() {
		return this.obsant;
	}

	public void setObsant(String obsant) {
		this.obsant = obsant;
	}

	public String getObsdel() {
		return this.obsdel;
	}

	public void setObsdel(String obsdel) {
		this.obsdel = obsdel;
	}

	public String getObsdev() {
		return this.obsdev;
	}

	public void setObsdev(String obsdev) {
		this.obsdev = obsdev;
	}

	public String getObsent() {
		return this.obsent;
	}

	public void setObsent(String obsent) {
		this.obsent = obsent;
	}

	public String getObssda() {
		return this.obssda;
	}

	public void setObssda(String obssda) {
		this.obssda = obssda;
	}

	public BigDecimal getPcolib() {
		return this.pcolib;
	}

	public void setPcolib(BigDecimal pcolib) {
		this.pcolib = pcolib;
	}

	public String getPedant() {
		return this.pedant;
	}

	public void setPedant(String pedant) {
		this.pedant = pedant;
	}

	public Integer getPedtip() {
		return this.pedtip;
	}

	public void setPedtip(Integer pedtip) {
		this.pedtip = pedtip;
	}

	public Integer getQtslib() {
		return this.qtslib;
	}

	public void setQtslib(Integer qtslib) {
		this.qtslib = qtslib;
	}

	public String getSitlib() {
		return this.sitlib;
	}

	public void setSitlib(String sitlib) {
		this.sitlib = sitlib;
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

	public String getTipcpa() {
		return this.tipcpa;
	}

	public void setTipcpa(String tipcpa) {
		this.tipcpa = tipcpa;
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

	public BigDecimal getTotcat() {
		return this.totcat;
	}

	public void setTotcat(BigDecimal totcat) {
		this.totcat = totcat;
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

	public BigDecimal getTotiss() {
		return this.totiss;
	}

	public void setTotiss(BigDecimal totiss) {
		this.totiss = totiss;
	}

	public BigDecimal getTotlib() {
		return this.totlib;
	}

	public void setTotlib(BigDecimal totlib) {
		this.totlib = totlib;
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

	public Integer getTrasda() {
		return this.trasda;
	}

	public void setTrasda(Integer trasda) {
		this.trasda = trasda;
	}

	public String getUfelib() {
		return this.ufelib;
	}

	public void setUfelib(String ufelib) {
		this.ufelib = ufelib;
	}

	public Integer getUsuant() {
		return this.usuant;
	}

	public void setUsuant(Integer usuant) {
		this.usuant = usuant;
	}

	public Integer getUsuatu() {
		return this.usuatu;
	}

	public void setUsuatu(Integer usuatu) {
		this.usuatu = usuatu;
	}

	public Integer getUsudel() {
		return this.usudel;
	}

	public void setUsudel(Integer usudel) {
		this.usudel = usudel;
	}

	public Integer getUsudev() {
		return this.usudev;
	}

	public void setUsudev(Integer usudev) {
		this.usudev = usudev;
	}

	public Integer getUsuent() {
		return this.usuent;
	}

	public void setUsuent(Integer usuent) {
		this.usuent = usuent;
	}

	public Integer getUsufat() {
		return this.usufat;
	}

	public void setUsufat(Integer usufat) {
		this.usufat = usufat;
	}

	public Integer getUsusda() {
		return this.ususda;
	}

	public void setUsusda(Integer ususda) {
		this.ususda = ususda;
	}

	public BigDecimal getValtmo() {
		return this.valtmo;
	}

	public void setValtmo(BigDecimal valtmo) {
		this.valtmo = valtmo;
	}

}