package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the pedre4 database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedre4.findAll", query = "SELECT p FROM Pedre4 p")
public class Pedre4 implements Serializable {
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

	private BigDecimal acrre4;

	private Integer codfor;

	private String codpfo;

	private Integer codusu;

	private BigDecimal ds1re4;

	private BigDecimal ds2re4;

	private BigDecimal ds3re4;

	private BigDecimal ds4re4;

	private BigDecimal ds5re4;

	@Temporal(TemporalType.DATE)
	private Date dteatu;

	@Temporal(TemporalType.DATE)
	private Date dteent;

	private String flgatu;

	private String flgcot;

	private String flgcst;

	private String flgint;

	private String hreatu;

	@Column(name = "id_cmppfo")
	private Integer idCmppfo;

	@Column(name = "id_pedre2")
	private Integer idPedre2;

	@Column(name = "id_pedre4")
	private Integer idPedre4;

	private BigDecimal jurre4;

	private BigDecimal markup;

	private String nomcon;

	private Integer nrore4;

	private String obsre4;

	private BigDecimal pericm;

	private BigDecimal peripi;

	private BigDecimal permva;

	private Integer praent;

	private BigDecimal qtareq;

	private BigDecimal qtdmin;

	private BigDecimal qtdreq;

	private BigDecimal qtnreq;

	private BigDecimal qtpre4;

	private BigDecimal sldreq;

	private BigDecimal toticm;

	private BigDecimal totsub;

	private BigDecimal valfin;

	private BigDecimal vlure4;

	public Pedre4() {
	}

	public BigDecimal getAcrre4() {
		return this.acrre4;
	}

	public void setAcrre4(BigDecimal acrre4) {
		this.acrre4 = acrre4;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public String getCodpfo() {
		return this.codpfo;
	}

	public void setCodpfo(String codpfo) {
		this.codpfo = codpfo;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public BigDecimal getDs1re4() {
		return this.ds1re4;
	}

	public void setDs1re4(BigDecimal ds1re4) {
		this.ds1re4 = ds1re4;
	}

	public BigDecimal getDs2re4() {
		return this.ds2re4;
	}

	public void setDs2re4(BigDecimal ds2re4) {
		this.ds2re4 = ds2re4;
	}

	public BigDecimal getDs3re4() {
		return this.ds3re4;
	}

	public void setDs3re4(BigDecimal ds3re4) {
		this.ds3re4 = ds3re4;
	}

	public BigDecimal getDs4re4() {
		return this.ds4re4;
	}

	public void setDs4re4(BigDecimal ds4re4) {
		this.ds4re4 = ds4re4;
	}

	public BigDecimal getDs5re4() {
		return this.ds5re4;
	}

	public void setDs5re4(BigDecimal ds5re4) {
		this.ds5re4 = ds5re4;
	}

	public Date getDteatu() {
		return this.dteatu;
	}

	public void setDteatu(Date dteatu) {
		this.dteatu = dteatu;
	}

	public Date getDteent() {
		return this.dteent;
	}

	public void setDteent(Date dteent) {
		this.dteent = dteent;
	}

	public String getFlgatu() {
		return this.flgatu;
	}

	public void setFlgatu(String flgatu) {
		this.flgatu = flgatu;
	}

	public String getFlgcot() {
		return this.flgcot;
	}

	public void setFlgcot(String flgcot) {
		this.flgcot = flgcot;
	}

	public String getFlgcst() {
		return this.flgcst;
	}

	public void setFlgcst(String flgcst) {
		this.flgcst = flgcst;
	}

	public String getFlgint() {
		return this.flgint;
	}

	public void setFlgint(String flgint) {
		this.flgint = flgint;
	}

	public String getHreatu() {
		return this.hreatu;
	}

	public void setHreatu(String hreatu) {
		this.hreatu = hreatu;
	}

	public Integer getIdCmppfo() {
		return this.idCmppfo;
	}

	public void setIdCmppfo(Integer idCmppfo) {
		this.idCmppfo = idCmppfo;
	}

	public Integer getIdPedre2() {
		return this.idPedre2;
	}

	public void setIdPedre2(Integer idPedre2) {
		this.idPedre2 = idPedre2;
	}

	public Integer getIdPedre4() {
		return this.idPedre4;
	}

	public void setIdPedre4(Integer idPedre4) {
		this.idPedre4 = idPedre4;
	}

	public BigDecimal getJurre4() {
		return this.jurre4;
	}

	public void setJurre4(BigDecimal jurre4) {
		this.jurre4 = jurre4;
	}

	public BigDecimal getMarkup() {
		return this.markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}

	public String getNomcon() {
		return this.nomcon;
	}

	public void setNomcon(String nomcon) {
		this.nomcon = nomcon;
	}

	public Integer getNrore4() {
		return this.nrore4;
	}

	public void setNrore4(Integer nrore4) {
		this.nrore4 = nrore4;
	}

	public String getObsre4() {
		return this.obsre4;
	}

	public void setObsre4(String obsre4) {
		this.obsre4 = obsre4;
	}

	public BigDecimal getPericm() {
		return this.pericm;
	}

	public void setPericm(BigDecimal pericm) {
		this.pericm = pericm;
	}

	public BigDecimal getPeripi() {
		return this.peripi;
	}

	public void setPeripi(BigDecimal peripi) {
		this.peripi = peripi;
	}

	public BigDecimal getPermva() {
		return this.permva;
	}

	public void setPermva(BigDecimal permva) {
		this.permva = permva;
	}

	public Integer getPraent() {
		return this.praent;
	}

	public void setPraent(Integer praent) {
		this.praent = praent;
	}

	public BigDecimal getQtareq() {
		return this.qtareq;
	}

	public void setQtareq(BigDecimal qtareq) {
		this.qtareq = qtareq;
	}

	public BigDecimal getQtdmin() {
		return this.qtdmin;
	}

	public void setQtdmin(BigDecimal qtdmin) {
		this.qtdmin = qtdmin;
	}

	public BigDecimal getQtdreq() {
		return this.qtdreq;
	}

	public void setQtdreq(BigDecimal qtdreq) {
		this.qtdreq = qtdreq;
	}

	public BigDecimal getQtnreq() {
		return this.qtnreq;
	}

	public void setQtnreq(BigDecimal qtnreq) {
		this.qtnreq = qtnreq;
	}

	public BigDecimal getQtpre4() {
		return this.qtpre4;
	}

	public void setQtpre4(BigDecimal qtpre4) {
		this.qtpre4 = qtpre4;
	}

	public BigDecimal getSldreq() {
		return this.sldreq;
	}

	public void setSldreq(BigDecimal sldreq) {
		this.sldreq = sldreq;
	}

	public BigDecimal getToticm() {
		return this.toticm;
	}

	public void setToticm(BigDecimal toticm) {
		this.toticm = toticm;
	}

	public BigDecimal getTotsub() {
		return this.totsub;
	}

	public void setTotsub(BigDecimal totsub) {
		this.totsub = totsub;
	}

	public BigDecimal getValfin() {
		return this.valfin;
	}

	public void setValfin(BigDecimal valfin) {
		this.valfin = valfin;
	}

	public BigDecimal getVlure4() {
		return this.vlure4;
	}

	public void setVlure4(BigDecimal vlure4) {
		this.vlure4 = vlure4;
	}

}