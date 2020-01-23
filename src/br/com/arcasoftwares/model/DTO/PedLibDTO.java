package br.com.arcasoftwares.model.DTO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import br.com.arcasoftwares.model.Pedlib;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedLibDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4132376245716610070L;

	private Integer seqlib;
	private String dtelib;
	private String hrelib;
	private Integer qtslib;
	private BigDecimal totger;
	private Integer codemp;
	private String dteres;
	private Integer numres;
	private String sitlib;

	public PedLibDTO(Pedlib pedlib) {
		this.setSeqlib(pedlib.getId().getSeqlib());
		this.setDtelib(new SimpleDateFormat("dd/MM/yyyy").format(pedlib.getDtelib()));
		this.setHrelib(pedlib.getHrelib());
		this.setQtslib(pedlib.getQtslib());
		this.setTotger(pedlib.getTotger());
		this.setCodemp(pedlib.getId().getCodemp());
		this.setDteres(new SimpleDateFormat("dd/MM/yyyy").format(pedlib.getId().getDteres()));
		this.setNumres(pedlib.getId().getNumres());
		this.setSitlib(pedlib.getSitlib());
	}
}
