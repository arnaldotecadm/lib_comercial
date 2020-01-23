package br.com.arcasoftwares.model.DTO;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.arcasoftwares.model.Pedre2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedRe2DTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4903457535149763752L;
	
	private Integer codeit;
	private String codclp;
	private String codgru;
	private String codsub;
	private String codpro;
	private String desre2;
	private BigDecimal qtpre2;
	private String item;
	private BigDecimal vlqre2;
	private BigDecimal icmre2;
	private BigDecimal totre2;
	private BigDecimal totren;
	private BigDecimal dscper;
	private BigDecimal dscre2;
	private BigDecimal pacre2;
	private BigDecimal sldre2;
	
	public PedRe2DTO(Pedre2 re2) {
		this.setCodeit(re2.getCodeit());
		this.setCodclp(re2.getCodclp());
		this.setCodgru(re2.getCodgru());
		this.setCodsub(re2.getCodsub());
		this.setCodpro(re2.getCodpro());
		this.setDesre2(re2.getDesre2());
		this.setQtpre2(re2.getQtpre2());
		this.setVlqre2(re2.getVlqre2());
		this.setIcmre2(re2.getIcmre2());
		this.setTotre2(re2.getTotre2());
		this.setTotren(re2.getTotren());
		this.setDscper(re2.getDscper());
		this.setDscre2(re2.getDscre2());
		this.setPacre2(re2.getPacre2());
		this.setSldre2(re2.getSldre2());
		this.setItem(this.getCodgru() + "." + this.getCodsub() + "." + this.getCodpro());
	}
}
