package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pedprm database table.
 * 
 */
@Entity
@NamedQuery(name="Pedprm.findAll", query="SELECT p FROM Pedprm p")
public class Pedprm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codprm;

	@Temporal(TemporalType.DATE)
	private Date dtfprm;

	@Temporal(TemporalType.DATE)
	private Date dtiprm;

	private String flgtrg;

	private String nomprm;

	private Integer qtiprm;

	private Integer seqprm;

	private String sitprm;

	//bi-directional many-to-one association to Pedpr2
	@OneToMany(mappedBy="pedprm")
	private List<Pedpr2> pedpr2s;

	public Pedprm() {
	}

	public Integer getCodprm() {
		return this.codprm;
	}

	public void setCodprm(Integer codprm) {
		this.codprm = codprm;
	}

	public Date getDtfprm() {
		return this.dtfprm;
	}

	public void setDtfprm(Date dtfprm) {
		this.dtfprm = dtfprm;
	}

	public Date getDtiprm() {
		return this.dtiprm;
	}

	public void setDtiprm(Date dtiprm) {
		this.dtiprm = dtiprm;
	}

	public String getFlgtrg() {
		return this.flgtrg;
	}

	public void setFlgtrg(String flgtrg) {
		this.flgtrg = flgtrg;
	}

	public String getNomprm() {
		return this.nomprm;
	}

	public void setNomprm(String nomprm) {
		this.nomprm = nomprm;
	}

	public Integer getQtiprm() {
		return this.qtiprm;
	}

	public void setQtiprm(Integer qtiprm) {
		this.qtiprm = qtiprm;
	}

	public Integer getSeqprm() {
		return this.seqprm;
	}

	public void setSeqprm(Integer seqprm) {
		this.seqprm = seqprm;
	}

	public String getSitprm() {
		return this.sitprm;
	}

	public void setSitprm(String sitprm) {
		this.sitprm = sitprm;
	}

	public List<Pedpr2> getPedpr2s() {
		return this.pedpr2s;
	}

	public void setPedpr2s(List<Pedpr2> pedpr2s) {
		this.pedpr2s = pedpr2s;
	}

	public Pedpr2 addPedpr2(Pedpr2 pedpr2) {
		getPedpr2s().add(pedpr2);
		pedpr2.setPedprm(this);

		return pedpr2;
	}

	public Pedpr2 removePedpr2(Pedpr2 pedpr2) {
		getPedpr2s().remove(pedpr2);
		pedpr2.setPedprm(null);

		return pedpr2;
	}

}