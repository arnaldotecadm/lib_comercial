package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.PeddpePK;


/**
 * The persistent class for the peddpe database table.
 * 
 */
@Entity
@NamedQuery(name="Peddpe.findAll", query="SELECT p FROM Peddpe p")
public class Peddpe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PeddpePK id;

	@Column(name="app_ver")
	private Integer appVer;

	private Integer codcli;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dtedpe;

	private String hredpe;

	private String sitdpe;

	public Peddpe() {
	}

	public PeddpePK getId() {
		return this.id;
	}

	public void setId(PeddpePK id) {
		this.id = id;
	}

	public Integer getAppVer() {
		return this.appVer;
	}

	public void setAppVer(Integer appVer) {
		this.appVer = appVer;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDtedpe() {
		return this.dtedpe;
	}

	public void setDtedpe(Date dtedpe) {
		this.dtedpe = dtedpe;
	}

	public String getHredpe() {
		return this.hredpe;
	}

	public void setHredpe(String hredpe) {
		this.hredpe = hredpe;
	}

	public String getSitdpe() {
		return this.sitdpe;
	}

	public void setSitdpe(String sitdpe) {
		this.sitdpe = sitdpe;
	}

}