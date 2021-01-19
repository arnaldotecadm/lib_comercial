package br.com.arcasoftwares.model.DTO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.arcasoftwares.model.Pedres;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedResDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4132376245716610070L;

	private Integer numres;
	private FinVenDTO finVenDTO;
	private FinCliDTO finCliDTO;
	private FinAtdDTO finAtdDTO;
	private String codpfa;
	private BigDecimal totger;
	private BigDecimal totres;
	private BigDecimal totren;
	private BigDecimal fatger;
	private BigDecimal devger;
	private BigDecimal sldger;
	private String dteRes;
	private String dtfres;
	private String dteResIni;
	private String dteResFim;
	private String uferes;
	private String flgimp;
	private String sitres;
	private int qtdimp;
	private List<PedRe2DTO> pedRe2List;
	private Integer qtdItens;

	public PedResDTO(Pedres pedres) {
		this(pedres, true);
	}

	public PedResDTO(Pedres pedres, boolean addItems) {
		this.setNumres(pedres.getId().getNumres());
		if (pedres.getFinven() != null) {
			this.setFinVenDTO(new FinVenDTO(pedres.getFinven().getCodven(), pedres.getFinven().getNomven()));
		}
		if (pedres.getFincli() != null) {
			this.setFinCliDTO(new FinCliDTO(pedres.getFincli().getCodcli(), pedres.getFincli().getNomcli()));
		}
		if (pedres.getFinatd() != null) {
			this.setFinAtdDTO(new FinAtdDTO(pedres.getFinatd().getCodatd(), pedres.getFinatd().getNomatd()));
		}
		this.setCodpfa(pedres.getCodpfa());
		this.setTotger(pedres.getTotger());
		this.setTotres(pedres.getTotres());
		this.setTotren(pedres.getTotren());
		this.setFatger(pedres.getFatger());
		this.setDevger(pedres.getDevger());
		this.setSldger(pedres.getSldger());
		this.setUferes(pedres.getUferes());
		this.setFlgimp(pedres.getFlgimp());
		this.setSitres(pedres.getSitres());
		this.setQtdimp(pedres.getQtdimp());
		this.setDteRes(new SimpleDateFormat("dd/MM/yyyy").format(pedres.getId().getDteres()));
		this.setDtfres(new SimpleDateFormat("dd/MM/yyyy").format(pedres.getDtfres()));

		/**
		 * Preencher os itens do Pedido
		 */

		qtdItens = pedres.getPedre2s() != null ? pedres.getPedre2s().size() : 0;

		if (addItems) {
			if (pedres.getPedre2s() != null && pedres.getPedre2s().size() > 0) {
				this.pedRe2List = new ArrayList<>();
				pedres.getPedre2s().forEach((re2) -> this.pedRe2List.add(new PedRe2DTO(re2)));
			}
		}
	}
}
