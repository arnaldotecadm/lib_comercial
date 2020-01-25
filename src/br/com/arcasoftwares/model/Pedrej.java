package br.com.arcasoftwares.model;

import java.io.Serializable;
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

import br.com.arcasoftwares.model.primaryKey.PedrejPK;


/**
 * The persistent class for the pedrej database table.
 * 
 */
@Entity
@NamedQuery(name="Pedrej.findAll", query="SELECT p FROM Pedrej p")
public class Pedrej implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedrejPK id;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dterej;

	private String hrerej;

	@Column(name="id_pedrej")
	private Integer idPedrej;

	@Column(name="id_pedres")
	private Integer idPedres;

	private String ob1rej;

	private String ob2rej;

	private String ob3rej;

	private String ob4rej;

	private String ob5rej;

	private String obsrej;

	//bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp", insertable = false, updatable = false),
		@JoinColumn(name="dteres", referencedColumnName="dteres", insertable = false, updatable = false),
		@JoinColumn(name="numres", referencedColumnName="numres", insertable = false, updatable = false)
		})
	private Pedres pedre;

	public Pedrej() {
	}

	public PedrejPK getId() {
		return this.id;
	}

	public void setId(PedrejPK id) {
		this.id = id;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDterej() {
		return this.dterej;
	}

	public void setDterej(Date dterej) {
		this.dterej = dterej;
	}

	public String getHrerej() {
		return this.hrerej;
	}

	public void setHrerej(String hrerej) {
		this.hrerej = hrerej;
	}

	public Integer getIdPedrej() {
		return this.idPedrej;
	}

	public void setIdPedrej(Integer idPedrej) {
		this.idPedrej = idPedrej;
	}

	public Integer getIdPedres() {
		return this.idPedres;
	}

	public void setIdPedres(Integer idPedres) {
		this.idPedres = idPedres;
	}

	public String getOb1rej() {
		return this.ob1rej;
	}

	public void setOb1rej(String ob1rej) {
		this.ob1rej = ob1rej;
	}

	public String getOb2rej() {
		return this.ob2rej;
	}

	public void setOb2rej(String ob2rej) {
		this.ob2rej = ob2rej;
	}

	public String getOb3rej() {
		return this.ob3rej;
	}

	public void setOb3rej(String ob3rej) {
		this.ob3rej = ob3rej;
	}

	public String getOb4rej() {
		return this.ob4rej;
	}

	public void setOb4rej(String ob4rej) {
		this.ob4rej = ob4rej;
	}

	public String getOb5rej() {
		return this.ob5rej;
	}

	public void setOb5rej(String ob5rej) {
		this.ob5rej = ob5rej;
	}

	public String getObsrej() {
		return this.obsrej;
	}

	public void setObsrej(String obsrej) {
		this.obsrej = obsrej;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}

}