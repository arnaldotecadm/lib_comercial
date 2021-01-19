
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

import br.com.arcasoftwares.model.primaryKey.PedlogPK;


/**
 * The persistent class for the pedlog database table.
 * 
 */
@Entity
@NamedQuery(name="Pedlog.findAll", query="SELECT p FROM Pedlog p")
public class Pedlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedlogPK id;

	@Column(name="app_ver")
	private Integer appVer;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dtelog;

	private String hrelog;

	private String sitant;

	private String sitatu;

	//bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp", insertable = false, updatable = false),
		@JoinColumn(name="dteres", referencedColumnName="dteres", insertable = false, updatable = false),
		@JoinColumn(name="numres", referencedColumnName="numres", insertable = false, updatable = false)
		})
	private Pedres pedre;

	public Pedlog() {
	}

	public PedlogPK getId() {
		return this.id;
	}

	public void setId(PedlogPK id) {
		this.id = id;
	}

	public Integer getAppVer() {
		return this.appVer;
	}

	public void setAppVer(Integer appVer) {
		this.appVer = appVer;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDtelog() {
		return this.dtelog;
	}

	public void setDtelog(Date dtelog) {
		this.dtelog = dtelog;
	}

	public String getHrelog() {
		return this.hrelog;
	}

	public void setHrelog(String hrelog) {
		this.hrelog = hrelog;
	}

	public String getSitant() {
		return this.sitant;
	}

	public void setSitant(String sitant) {
		this.sitant = sitant;
	}

	public String getSitatu() {
		return this.sitatu;
	}

	public void setSitatu(String sitatu) {
		this.sitatu = sitatu;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}


}