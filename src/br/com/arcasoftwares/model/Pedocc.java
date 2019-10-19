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

import br.com.arcasoftwares.model.primaryKey.PedoccPK;


/**
 * The persistent class for the pedocc database table.
 * 
 */
@Entity
@NamedQuery(name="Pedocc.findAll", query="SELECT p FROM Pedocc p")
public class Pedocc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedoccPK id;

	@Temporal(TemporalType.DATE)
	private Date dteope;

	private String nomocc;

	private String tipocc;

	//bi-directional many-to-one association to Pedcta
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codemp", referencedColumnName="codemp"),
		@JoinColumn(name="dtecta", referencedColumnName="dtecta"),
		@JoinColumn(name="numcta", referencedColumnName="numcta")
		})
	private Pedcta pedcta;

	public Pedocc() {
	}

	public PedoccPK getId() {
		return this.id;
	}

	public void setId(PedoccPK id) {
		this.id = id;
	}

	public Date getDteope() {
		return this.dteope;
	}

	public void setDteope(Date dteope) {
		this.dteope = dteope;
	}

	public String getNomocc() {
		return this.nomocc;
	}

	public void setNomocc(String nomocc) {
		this.nomocc = nomocc;
	}

	public String getTipocc() {
		return this.tipocc;
	}

	public void setTipocc(String tipocc) {
		this.tipocc = tipocc;
	}

	public Pedcta getPedcta() {
		return this.pedcta;
	}

	public void setPedcta(Pedcta pedcta) {
		this.pedcta = pedcta;
	}

}