package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the peddli database table.
 * 
 */
@Entity
@NamedQuery(name = "Peddli.findAll", query = "SELECT p FROM Peddli p")
public class Peddli implements Serializable {
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

	private Integer codemp;

	@Temporal(TemporalType.DATE)
	private Date dteres;

	private Integer numres;

	private Integer seqlib;

	public Peddli() {
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	public Date getDteres() {
		return this.dteres;
	}

	public void setDteres(Date dteres) {
		this.dteres = dteres;
	}

	public Integer getNumres() {
		return this.numres;
	}

	public void setNumres(Integer numres) {
		this.numres = numres;
	}

	public Integer getSeqlib() {
		return this.seqlib;
	}

	public void setSeqlib(Integer seqlib) {
		this.seqlib = seqlib;
	}

}