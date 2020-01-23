package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import br.com.arcasoftwares.model.primaryKey.Pedpr2PK;


/**
 * The persistent class for the pedpr2 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedpr2.findAll", query="SELECT p FROM Pedpr2 p")
public class Pedpr2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedpr2PK id;

	private String codclp;

	private String codgru;

	private String codpro;

	private String codsub;

	private BigDecimal ds1pr2;

	private BigDecimal ds2pr2;

	private BigDecimal ds3pr2;

	private BigDecimal ds4pr2;

	private BigDecimal ds5pr2;

	private String flgtrg;

	private Integer nropr2;

	private BigDecimal qt1pr2;

	private BigDecimal qt2pr2;

	private BigDecimal qt3pr2;

	private BigDecimal qt4pr2;

	private BigDecimal qt5pr2;

	//bi-directional many-to-one association to Pedprm
	@ManyToOne
	@JoinColumn(name="codprm", insertable = false, updatable = false)
	private Pedprm pedprm;

	public Pedpr2() {
	}

	public Pedpr2PK getId() {
		return this.id;
	}

	public void setId(Pedpr2PK id) {
		this.id = id;
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

	public BigDecimal getDs1pr2() {
		return this.ds1pr2;
	}

	public void setDs1pr2(BigDecimal ds1pr2) {
		this.ds1pr2 = ds1pr2;
	}

	public BigDecimal getDs2pr2() {
		return this.ds2pr2;
	}

	public void setDs2pr2(BigDecimal ds2pr2) {
		this.ds2pr2 = ds2pr2;
	}

	public BigDecimal getDs3pr2() {
		return this.ds3pr2;
	}

	public void setDs3pr2(BigDecimal ds3pr2) {
		this.ds3pr2 = ds3pr2;
	}

	public BigDecimal getDs4pr2() {
		return this.ds4pr2;
	}

	public void setDs4pr2(BigDecimal ds4pr2) {
		this.ds4pr2 = ds4pr2;
	}

	public BigDecimal getDs5pr2() {
		return this.ds5pr2;
	}

	public void setDs5pr2(BigDecimal ds5pr2) {
		this.ds5pr2 = ds5pr2;
	}

	public String getFlgtrg() {
		return this.flgtrg;
	}

	public void setFlgtrg(String flgtrg) {
		this.flgtrg = flgtrg;
	}

	public Integer getNropr2() {
		return this.nropr2;
	}

	public void setNropr2(Integer nropr2) {
		this.nropr2 = nropr2;
	}

	public BigDecimal getQt1pr2() {
		return this.qt1pr2;
	}

	public void setQt1pr2(BigDecimal qt1pr2) {
		this.qt1pr2 = qt1pr2;
	}

	public BigDecimal getQt2pr2() {
		return this.qt2pr2;
	}

	public void setQt2pr2(BigDecimal qt2pr2) {
		this.qt2pr2 = qt2pr2;
	}

	public BigDecimal getQt3pr2() {
		return this.qt3pr2;
	}

	public void setQt3pr2(BigDecimal qt3pr2) {
		this.qt3pr2 = qt3pr2;
	}

	public BigDecimal getQt4pr2() {
		return this.qt4pr2;
	}

	public void setQt4pr2(BigDecimal qt4pr2) {
		this.qt4pr2 = qt4pr2;
	}

	public BigDecimal getQt5pr2() {
		return this.qt5pr2;
	}

	public void setQt5pr2(BigDecimal qt5pr2) {
		this.qt5pr2 = qt5pr2;
	}

	public Pedprm getPedprm() {
		return this.pedprm;
	}

	public void setPedprm(Pedprm pedprm) {
		this.pedprm = pedprm;
	}

}