package br.com.arcasoftwares.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the pedtip database table.
 * 
 */
@Entity
@NamedQuery(name="Pedtip.findAll", query="SELECT p FROM Pedtip p")
public class Pedtip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codtip;

	private String nomtip;

	//bi-directional many-to-one association to Pedres
	@JsonIgnore
	@OneToMany(mappedBy="pedtip")
	private List<Pedres> pedres;

	public Pedtip() {
	}

	public Integer getCodtip() {
		return this.codtip;
	}

	public void setCodtip(Integer codtip) {
		this.codtip = codtip;
	}

	public String getNomtip() {
		return this.nomtip;
	}

	public void setNomtip(String nomtip) {
		this.nomtip = nomtip;
	}

	public List<Pedres> getPedres() {
		return this.pedres;
	}

	public void setPedres(List<Pedres> pedres) {
		this.pedres = pedres;
	}

	public Pedres addPedre(Pedres pedre) {
		getPedres().add(pedre);
		pedre.setPedtip(this);

		return pedre;
	}

	public Pedres removePedre(Pedres pedre) {
		getPedres().remove(pedre);
		pedre.setPedtip(null);

		return pedre;
	}

}