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

import br.com.arcasoftwares.model.primaryKey.Pedre3PK;


/**
 * The persistent class for the pedre3 database table.
 * 
 */
@Entity
@NamedQuery(name="Pedre3.findAll", query="SELECT p FROM Pedre3 p")
public class Pedre3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Pedre3PK id;

	private String flgapr;

	private String flgatu;

	@Column(name="id_pedre3")
	private Integer idPedre3;

	@Column(name="id_pedres")
	private Integer idPedres;

	private Integer nrore3;

	private Integer prare3;

	private BigDecimal vlpre3;

	//bi-directional many-to-one association to Pedres
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp"),
		@JoinColumn(name="dteres", referencedColumnName="dteres"),
		@JoinColumn(name="numres", referencedColumnName="numres")
		})
	private Pedres pedre;

	public Pedre3() {
	}

	public Pedre3PK getId() {
		return this.id;
	}

	public void setId(Pedre3PK id) {
		this.id = id;
	}

	public String getFlgapr() {
		return this.flgapr;
	}

	public void setFlgapr(String flgapr) {
		this.flgapr = flgapr;
	}

	public String getFlgatu() {
		return this.flgatu;
	}

	public void setFlgatu(String flgatu) {
		this.flgatu = flgatu;
	}

	public Integer getIdPedre3() {
		return this.idPedre3;
	}

	public void setIdPedre3(Integer idPedre3) {
		this.idPedre3 = idPedre3;
	}

	public Integer getIdPedres() {
		return this.idPedres;
	}

	public void setIdPedres(Integer idPedres) {
		this.idPedres = idPedres;
	}

	public Integer getNrore3() {
		return this.nrore3;
	}

	public void setNrore3(Integer nrore3) {
		this.nrore3 = nrore3;
	}

	public Integer getPrare3() {
		return this.prare3;
	}

	public void setPrare3(Integer prare3) {
		this.prare3 = prare3;
	}

	public BigDecimal getVlpre3() {
		return this.vlpre3;
	}

	public void setVlpre3(BigDecimal vlpre3) {
		this.vlpre3 = vlpre3;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}

}