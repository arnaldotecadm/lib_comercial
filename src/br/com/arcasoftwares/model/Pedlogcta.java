package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.arcasoftwares.model.primaryKey.PedlogctaPK;


/**
 * The persistent class for the pedlogcta database table.
 * 
 */
@Entity
@NamedQuery(name="Pedlogcta.findAll", query="SELECT p FROM Pedlogcta p")
public class Pedlogcta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedlogctaPK id;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dtelog;

	private String hrelog;

	private String sitant;

	private String sitatu;

	public Pedlogcta() {
	}

	public PedlogctaPK getId() {
		return this.id;
	}

	public void setId(PedlogctaPK id) {
		this.id = id;
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

}