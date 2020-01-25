<<<<<<< HEAD
package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.arcasoftwares.model.primaryKey.PedproPK;


/**
 * The persistent class for the pedpro database table.
 * 
 */
@Entity
@NamedQuery(name="Pedpro.findAll", query="SELECT p FROM Pedpro p")
public class Pedpro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedproPK id;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dtepro;

	private String hrepro;

	private String obspro;

	//bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp", insertable = false, updatable = false),
		@JoinColumn(name="dteres", referencedColumnName="dteres", insertable = false, updatable = false),
		@JoinColumn(name="numres", referencedColumnName="numres", insertable = false, updatable = false)
		})
	private Pedres pedre;

	public Pedpro() {
	}

	public PedproPK getId() {
		return this.id;
	}

	public void setId(PedproPK id) {
		this.id = id;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDtepro() {
		return this.dtepro;
	}

	public void setDtepro(Date dtepro) {
		this.dtepro = dtepro;
	}

	public String getHrepro() {
		return this.hrepro;
	}

	public void setHrepro(String hrepro) {
		this.hrepro = hrepro;
	}

	public String getObspro() {
		return this.obspro;
	}

	public void setObspro(String obspro) {
		this.obspro = obspro;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}

=======
package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.arcasoftwares.model.primaryKey.PedproPK;


/**
 * The persistent class for the pedpro database table.
 * 
 */
@Entity
@NamedQuery(name="Pedpro.findAll", query="SELECT p FROM Pedpro p")
public class Pedpro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedproPK id;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dtepro;

	private String hrepro;

	private String obspro;

	//bi-directional many-to-one association to Pedres
	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp", insertable = false, updatable = false),
		@JoinColumn(name="dteres", referencedColumnName="dteres", insertable = false, updatable = false),
		@JoinColumn(name="numres", referencedColumnName="numres", insertable = false, updatable = false)
		})
	private Pedres pedre;

	public Pedpro() {
	}

	public PedproPK getId() {
		return this.id;
	}

	public void setId(PedproPK id) {
		this.id = id;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDtepro() {
		return this.dtepro;
	}

	public void setDtepro(Date dtepro) {
		this.dtepro = dtepro;
	}

	public String getHrepro() {
		return this.hrepro;
	}

	public void setHrepro(String hrepro) {
		this.hrepro = hrepro;
	}

	public String getObspro() {
		return this.obspro;
	}

	public void setObspro(String obspro) {
		this.obspro = obspro;
	}

	public Pedres getPedre() {
		return this.pedre;
	}

	public void setPedre(Pedres pedre) {
		this.pedre = pedre;
	}

>>>>>>> ec6b347c2e7ce48f2cf4c2fe44ad79d0a7341b57
}