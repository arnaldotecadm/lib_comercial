package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedpar database table.
 * 
 */
@Entity
@NamedQuery(name = "Pedpar.findAll", query = "SELECT p FROM Pedpar p")
public class Pedpar implements Serializable {
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

	private BigDecimal acrmax;

	@Column(name = "alt_desc_prod")
	private String altDescProd;

	private String blocre;

	@Column(name = "bloqueia_limite_credito")
	private Integer bloqueiaLimiteCredito;

	private String clisemcad;

	@Column(name = "com_manual")
	private Integer comManual;

	@Column(name = "concatenar_qtd_emb_via_sep")
	private Integer concatenarQtdEmbViaSep;

	@Column(name = "conf_pag")
	private Integer confPag;

	@Column(name = "cons_cad")
	private Integer consCad;

	private Integer conscli;

	private String contra;

	@Column(name = "cot_comp_red")
	private Integer cotCompRed;

	@Column(name = "decimais_qtd")
	private String decimaisQtd;

	@Column(name = "decimais_valor")
	private String decimaisValor;

	@Column(name = "dup_item_pedido")
	private String dupItemPedido;

	private String exicli;

	private String exicom;

	private String exifor;

	private String eximka;

	private String exiven;

	@Column(name = "flg_acumula_imp")
	private String flgAcumulaImp;

	@Column(name = "flg_obriga_trans")
	private String flgObrigaTrans;

	@Column(name = "flg_obs_fat")
	private String flgObsFat;

	private String flgatd;

	private Boolean flgativo;

	private String flgatr;

	@Column(name = "flgbloqcta_semcli")
	private String flgbloqctaSemcli;

	private String flgblq;

	private String flgcod;

	private String flgcom;

	private String flgcre;

	private String flgdsc;

	private String flgexp;

	private String flgimp;

	private String flgipi;

	private String flgord;

	private String flgres;

	private Integer fretevendedor;

	@Column(name = "id_frete_padrao")
	private Integer idFretePadrao;

	@Column(name = "imp_deposito_pedido")
	private String impDepositoPedido;

	@Column(name = "imp_marca_pedido_cotacao")
	private Integer impMarcaPedidoCotacao;

	@Column(name = "imp_parcela_pedido")
	private Integer impParcelaPedido;

	private String impfin;

	private String imploc;

	private String impmrc;

	private String impobs;

	private String imppartnumber;

	@Column(name = "imppedcat_custo_mk")
	private String imppedcatCustoMk;

	private String impqtdviasep;

	private String impref;

	private String imprefdep;

	private String imprefped;

	private Integer impsitemail;

	private String imptra;

	private String intimpped;

	private String lanmai;

	@Column(name = "lib_fatura")
	private Integer libFatura;

	@Column(name = "lib_financ")
	private Integer libFinanc;

	@Column(name = "lib_ven_outros")
	private Integer libVenOutros;

	private String libcad;

	@Column(name = "libera_ven")
	private String liberaVen;

	private String libfin;

	@Column(name = "limite_inativo")
	private Integer limiteInativo;

	@Column(name = "mostra_valor_expedicao")
	private String mostraValorExpedicao;

	@Column(name = "msg_cotacao")
	private String msgCotacao;

	private BigDecimal mvamax;

	@Column(name = "obriga_ver_obs_cli")
	private String obrigaVerObsCli;

	private String obrlibped;

	@Column(name = "op_padrao")
	private Integer opPadrao;

	@Column(name = "ordem_impressao")
	private String ordemImpressao;

	@Column(name = "ordem_viaseploc")
	private String ordemViaseploc;

	@Column(name = "ordena_viasep_loc")
	private String ordenaViasepLoc;

	@Column(name = "ped_bloc_novo")
	private String pedBlocNovo;

	private BigDecimal peddsc;

	@Column(name = "per_prog")
	private Integer perProg;

	private BigDecimal percst;

	@Column(name = "permitir_qtd_fracionada")
	private Integer permitirQtdFracionada;

	private String perpro;

	@Column(name = "qtd_dec_via_sep")
	private Integer qtdDecViaSep;

	private Integer qtdcta;

	private Integer qtlite;

	private String refint;

	@Column(name = "rep_ite")
	private Integer repIte;

	@Column(name = "res_item_naoconcluido")
	private String resItemNaoconcluido;

	@Column(name = "sep_estoque")
	private Integer sepEstoque;

	@Column(name = "suprimir_qtde_emb")
	private String suprimirQtdeEmb;

	@Column(name = "suprimir_zeros")
	private Integer suprimirZeros;

	@Column(name = "tip_imp_ped")
	private String tipImpPed;

	private String tipcom;

	private String tipdsc;

	@Column(name = "tipo_impressao_viasep")
	private String tipoImpressaoViasep;

	private String tippag;

	private String tipped;

	private String tipres;

	private String totalizaqtdviasep;

	@Column(name = "trava_embalagem")
	private String travaEmbalagem;

	@Column(name = "trava_embalagemchar")
	private String travaEmbalagemchar;

	private String usadec;

	private BigDecimal valmax;

	private String valparcela;

	@Column(name = "ver_disp_estoque")
	private String verDispEstoque;

	private String verest;

	@Column(name = "via_sep_graf")
	private String viaSepGraf;

	public Pedpar() {
	}

	public BigDecimal getAcrmax() {
		return this.acrmax;
	}

	public void setAcrmax(BigDecimal acrmax) {
		this.acrmax = acrmax;
	}

	public String getAltDescProd() {
		return this.altDescProd;
	}

	public void setAltDescProd(String altDescProd) {
		this.altDescProd = altDescProd;
	}

	public String getBlocre() {
		return this.blocre;
	}

	public void setBlocre(String blocre) {
		this.blocre = blocre;
	}

	public Integer getBloqueiaLimiteCredito() {
		return this.bloqueiaLimiteCredito;
	}

	public void setBloqueiaLimiteCredito(Integer bloqueiaLimiteCredito) {
		this.bloqueiaLimiteCredito = bloqueiaLimiteCredito;
	}

	public String getClisemcad() {
		return this.clisemcad;
	}

	public void setClisemcad(String clisemcad) {
		this.clisemcad = clisemcad;
	}

	public Integer getComManual() {
		return this.comManual;
	}

	public void setComManual(Integer comManual) {
		this.comManual = comManual;
	}

	public Integer getConcatenarQtdEmbViaSep() {
		return this.concatenarQtdEmbViaSep;
	}

	public void setConcatenarQtdEmbViaSep(Integer concatenarQtdEmbViaSep) {
		this.concatenarQtdEmbViaSep = concatenarQtdEmbViaSep;
	}

	public Integer getConfPag() {
		return this.confPag;
	}

	public void setConfPag(Integer confPag) {
		this.confPag = confPag;
	}

	public Integer getConsCad() {
		return this.consCad;
	}

	public void setConsCad(Integer consCad) {
		this.consCad = consCad;
	}

	public Integer getConscli() {
		return this.conscli;
	}

	public void setConscli(Integer conscli) {
		this.conscli = conscli;
	}

	public String getContra() {
		return this.contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public Integer getCotCompRed() {
		return this.cotCompRed;
	}

	public void setCotCompRed(Integer cotCompRed) {
		this.cotCompRed = cotCompRed;
	}

	public String getDecimaisQtd() {
		return this.decimaisQtd;
	}

	public void setDecimaisQtd(String decimaisQtd) {
		this.decimaisQtd = decimaisQtd;
	}

	public String getDecimaisValor() {
		return this.decimaisValor;
	}

	public void setDecimaisValor(String decimaisValor) {
		this.decimaisValor = decimaisValor;
	}

	public String getDupItemPedido() {
		return this.dupItemPedido;
	}

	public void setDupItemPedido(String dupItemPedido) {
		this.dupItemPedido = dupItemPedido;
	}

	public String getExicli() {
		return this.exicli;
	}

	public void setExicli(String exicli) {
		this.exicli = exicli;
	}

	public String getExicom() {
		return this.exicom;
	}

	public void setExicom(String exicom) {
		this.exicom = exicom;
	}

	public String getExifor() {
		return this.exifor;
	}

	public void setExifor(String exifor) {
		this.exifor = exifor;
	}

	public String getEximka() {
		return this.eximka;
	}

	public void setEximka(String eximka) {
		this.eximka = eximka;
	}

	public String getExiven() {
		return this.exiven;
	}

	public void setExiven(String exiven) {
		this.exiven = exiven;
	}

	public String getFlgAcumulaImp() {
		return this.flgAcumulaImp;
	}

	public void setFlgAcumulaImp(String flgAcumulaImp) {
		this.flgAcumulaImp = flgAcumulaImp;
	}

	public String getFlgObrigaTrans() {
		return this.flgObrigaTrans;
	}

	public void setFlgObrigaTrans(String flgObrigaTrans) {
		this.flgObrigaTrans = flgObrigaTrans;
	}

	public String getFlgObsFat() {
		return this.flgObsFat;
	}

	public void setFlgObsFat(String flgObsFat) {
		this.flgObsFat = flgObsFat;
	}

	public String getFlgatd() {
		return this.flgatd;
	}

	public void setFlgatd(String flgatd) {
		this.flgatd = flgatd;
	}

	public Boolean getFlgativo() {
		return this.flgativo;
	}

	public void setFlgativo(Boolean flgativo) {
		this.flgativo = flgativo;
	}

	public String getFlgatr() {
		return this.flgatr;
	}

	public void setFlgatr(String flgatr) {
		this.flgatr = flgatr;
	}

	public String getFlgbloqctaSemcli() {
		return this.flgbloqctaSemcli;
	}

	public void setFlgbloqctaSemcli(String flgbloqctaSemcli) {
		this.flgbloqctaSemcli = flgbloqctaSemcli;
	}

	public String getFlgblq() {
		return this.flgblq;
	}

	public void setFlgblq(String flgblq) {
		this.flgblq = flgblq;
	}

	public String getFlgcod() {
		return this.flgcod;
	}

	public void setFlgcod(String flgcod) {
		this.flgcod = flgcod;
	}

	public String getFlgcom() {
		return this.flgcom;
	}

	public void setFlgcom(String flgcom) {
		this.flgcom = flgcom;
	}

	public String getFlgcre() {
		return this.flgcre;
	}

	public void setFlgcre(String flgcre) {
		this.flgcre = flgcre;
	}

	public String getFlgdsc() {
		return this.flgdsc;
	}

	public void setFlgdsc(String flgdsc) {
		this.flgdsc = flgdsc;
	}

	public String getFlgexp() {
		return this.flgexp;
	}

	public void setFlgexp(String flgexp) {
		this.flgexp = flgexp;
	}

	public String getFlgimp() {
		return this.flgimp;
	}

	public void setFlgimp(String flgimp) {
		this.flgimp = flgimp;
	}

	public String getFlgipi() {
		return this.flgipi;
	}

	public void setFlgipi(String flgipi) {
		this.flgipi = flgipi;
	}

	public String getFlgord() {
		return this.flgord;
	}

	public void setFlgord(String flgord) {
		this.flgord = flgord;
	}

	public String getFlgres() {
		return this.flgres;
	}

	public void setFlgres(String flgres) {
		this.flgres = flgres;
	}

	public Integer getFretevendedor() {
		return this.fretevendedor;
	}

	public void setFretevendedor(Integer fretevendedor) {
		this.fretevendedor = fretevendedor;
	}

	public Integer getIdFretePadrao() {
		return this.idFretePadrao;
	}

	public void setIdFretePadrao(Integer idFretePadrao) {
		this.idFretePadrao = idFretePadrao;
	}

	public String getImpDepositoPedido() {
		return this.impDepositoPedido;
	}

	public void setImpDepositoPedido(String impDepositoPedido) {
		this.impDepositoPedido = impDepositoPedido;
	}

	public Integer getImpMarcaPedidoCotacao() {
		return this.impMarcaPedidoCotacao;
	}

	public void setImpMarcaPedidoCotacao(Integer impMarcaPedidoCotacao) {
		this.impMarcaPedidoCotacao = impMarcaPedidoCotacao;
	}

	public Integer getImpParcelaPedido() {
		return this.impParcelaPedido;
	}

	public void setImpParcelaPedido(Integer impParcelaPedido) {
		this.impParcelaPedido = impParcelaPedido;
	}

	public String getImpfin() {
		return this.impfin;
	}

	public void setImpfin(String impfin) {
		this.impfin = impfin;
	}

	public String getImploc() {
		return this.imploc;
	}

	public void setImploc(String imploc) {
		this.imploc = imploc;
	}

	public String getImpmrc() {
		return this.impmrc;
	}

	public void setImpmrc(String impmrc) {
		this.impmrc = impmrc;
	}

	public String getImpobs() {
		return this.impobs;
	}

	public void setImpobs(String impobs) {
		this.impobs = impobs;
	}

	public String getImppartnumber() {
		return this.imppartnumber;
	}

	public void setImppartnumber(String imppartnumber) {
		this.imppartnumber = imppartnumber;
	}

	public String getImppedcatCustoMk() {
		return this.imppedcatCustoMk;
	}

	public void setImppedcatCustoMk(String imppedcatCustoMk) {
		this.imppedcatCustoMk = imppedcatCustoMk;
	}

	public String getImpqtdviasep() {
		return this.impqtdviasep;
	}

	public void setImpqtdviasep(String impqtdviasep) {
		this.impqtdviasep = impqtdviasep;
	}

	public String getImpref() {
		return this.impref;
	}

	public void setImpref(String impref) {
		this.impref = impref;
	}

	public String getImprefdep() {
		return this.imprefdep;
	}

	public void setImprefdep(String imprefdep) {
		this.imprefdep = imprefdep;
	}

	public String getImprefped() {
		return this.imprefped;
	}

	public void setImprefped(String imprefped) {
		this.imprefped = imprefped;
	}

	public Integer getImpsitemail() {
		return this.impsitemail;
	}

	public void setImpsitemail(Integer impsitemail) {
		this.impsitemail = impsitemail;
	}

	public String getImptra() {
		return this.imptra;
	}

	public void setImptra(String imptra) {
		this.imptra = imptra;
	}

	public String getIntimpped() {
		return this.intimpped;
	}

	public void setIntimpped(String intimpped) {
		this.intimpped = intimpped;
	}

	public String getLanmai() {
		return this.lanmai;
	}

	public void setLanmai(String lanmai) {
		this.lanmai = lanmai;
	}

	public Integer getLibFatura() {
		return this.libFatura;
	}

	public void setLibFatura(Integer libFatura) {
		this.libFatura = libFatura;
	}

	public Integer getLibFinanc() {
		return this.libFinanc;
	}

	public void setLibFinanc(Integer libFinanc) {
		this.libFinanc = libFinanc;
	}

	public Integer getLibVenOutros() {
		return this.libVenOutros;
	}

	public void setLibVenOutros(Integer libVenOutros) {
		this.libVenOutros = libVenOutros;
	}

	public String getLibcad() {
		return this.libcad;
	}

	public void setLibcad(String libcad) {
		this.libcad = libcad;
	}

	public String getLiberaVen() {
		return this.liberaVen;
	}

	public void setLiberaVen(String liberaVen) {
		this.liberaVen = liberaVen;
	}

	public String getLibfin() {
		return this.libfin;
	}

	public void setLibfin(String libfin) {
		this.libfin = libfin;
	}

	public Integer getLimiteInativo() {
		return this.limiteInativo;
	}

	public void setLimiteInativo(Integer limiteInativo) {
		this.limiteInativo = limiteInativo;
	}

	public String getMostraValorExpedicao() {
		return this.mostraValorExpedicao;
	}

	public void setMostraValorExpedicao(String mostraValorExpedicao) {
		this.mostraValorExpedicao = mostraValorExpedicao;
	}

	public String getMsgCotacao() {
		return this.msgCotacao;
	}

	public void setMsgCotacao(String msgCotacao) {
		this.msgCotacao = msgCotacao;
	}

	public BigDecimal getMvamax() {
		return this.mvamax;
	}

	public void setMvamax(BigDecimal mvamax) {
		this.mvamax = mvamax;
	}

	public String getObrigaVerObsCli() {
		return this.obrigaVerObsCli;
	}

	public void setObrigaVerObsCli(String obrigaVerObsCli) {
		this.obrigaVerObsCli = obrigaVerObsCli;
	}

	public String getObrlibped() {
		return this.obrlibped;
	}

	public void setObrlibped(String obrlibped) {
		this.obrlibped = obrlibped;
	}

	public Integer getOpPadrao() {
		return this.opPadrao;
	}

	public void setOpPadrao(Integer opPadrao) {
		this.opPadrao = opPadrao;
	}

	public String getOrdemImpressao() {
		return this.ordemImpressao;
	}

	public void setOrdemImpressao(String ordemImpressao) {
		this.ordemImpressao = ordemImpressao;
	}

	public String getOrdemViaseploc() {
		return this.ordemViaseploc;
	}

	public void setOrdemViaseploc(String ordemViaseploc) {
		this.ordemViaseploc = ordemViaseploc;
	}

	public String getOrdenaViasepLoc() {
		return this.ordenaViasepLoc;
	}

	public void setOrdenaViasepLoc(String ordenaViasepLoc) {
		this.ordenaViasepLoc = ordenaViasepLoc;
	}

	public String getPedBlocNovo() {
		return this.pedBlocNovo;
	}

	public void setPedBlocNovo(String pedBlocNovo) {
		this.pedBlocNovo = pedBlocNovo;
	}

	public BigDecimal getPeddsc() {
		return this.peddsc;
	}

	public void setPeddsc(BigDecimal peddsc) {
		this.peddsc = peddsc;
	}

	public Integer getPerProg() {
		return this.perProg;
	}

	public void setPerProg(Integer perProg) {
		this.perProg = perProg;
	}

	public BigDecimal getPercst() {
		return this.percst;
	}

	public void setPercst(BigDecimal percst) {
		this.percst = percst;
	}

	public Integer getPermitirQtdFracionada() {
		return this.permitirQtdFracionada;
	}

	public void setPermitirQtdFracionada(Integer permitirQtdFracionada) {
		this.permitirQtdFracionada = permitirQtdFracionada;
	}

	public String getPerpro() {
		return this.perpro;
	}

	public void setPerpro(String perpro) {
		this.perpro = perpro;
	}

	public Integer getQtdDecViaSep() {
		return this.qtdDecViaSep;
	}

	public void setQtdDecViaSep(Integer qtdDecViaSep) {
		this.qtdDecViaSep = qtdDecViaSep;
	}

	public Integer getQtdcta() {
		return this.qtdcta;
	}

	public void setQtdcta(Integer qtdcta) {
		this.qtdcta = qtdcta;
	}

	public Integer getQtlite() {
		return this.qtlite;
	}

	public void setQtlite(Integer qtlite) {
		this.qtlite = qtlite;
	}

	public String getRefint() {
		return this.refint;
	}

	public void setRefint(String refint) {
		this.refint = refint;
	}

	public Integer getRepIte() {
		return this.repIte;
	}

	public void setRepIte(Integer repIte) {
		this.repIte = repIte;
	}

	public String getResItemNaoconcluido() {
		return this.resItemNaoconcluido;
	}

	public void setResItemNaoconcluido(String resItemNaoconcluido) {
		this.resItemNaoconcluido = resItemNaoconcluido;
	}

	public Integer getSepEstoque() {
		return this.sepEstoque;
	}

	public void setSepEstoque(Integer sepEstoque) {
		this.sepEstoque = sepEstoque;
	}

	public String getSuprimirQtdeEmb() {
		return this.suprimirQtdeEmb;
	}

	public void setSuprimirQtdeEmb(String suprimirQtdeEmb) {
		this.suprimirQtdeEmb = suprimirQtdeEmb;
	}

	public Integer getSuprimirZeros() {
		return this.suprimirZeros;
	}

	public void setSuprimirZeros(Integer suprimirZeros) {
		this.suprimirZeros = suprimirZeros;
	}

	public String getTipImpPed() {
		return this.tipImpPed;
	}

	public void setTipImpPed(String tipImpPed) {
		this.tipImpPed = tipImpPed;
	}

	public String getTipcom() {
		return this.tipcom;
	}

	public void setTipcom(String tipcom) {
		this.tipcom = tipcom;
	}

	public String getTipdsc() {
		return this.tipdsc;
	}

	public void setTipdsc(String tipdsc) {
		this.tipdsc = tipdsc;
	}

	public String getTipoImpressaoViasep() {
		return this.tipoImpressaoViasep;
	}

	public void setTipoImpressaoViasep(String tipoImpressaoViasep) {
		this.tipoImpressaoViasep = tipoImpressaoViasep;
	}

	public String getTippag() {
		return this.tippag;
	}

	public void setTippag(String tippag) {
		this.tippag = tippag;
	}

	public String getTipped() {
		return this.tipped;
	}

	public void setTipped(String tipped) {
		this.tipped = tipped;
	}

	public String getTipres() {
		return this.tipres;
	}

	public void setTipres(String tipres) {
		this.tipres = tipres;
	}

	public String getTotalizaqtdviasep() {
		return this.totalizaqtdviasep;
	}

	public void setTotalizaqtdviasep(String totalizaqtdviasep) {
		this.totalizaqtdviasep = totalizaqtdviasep;
	}

	public String getTravaEmbalagem() {
		return this.travaEmbalagem;
	}

	public void setTravaEmbalagem(String travaEmbalagem) {
		this.travaEmbalagem = travaEmbalagem;
	}

	public String getTravaEmbalagemchar() {
		return this.travaEmbalagemchar;
	}

	public void setTravaEmbalagemchar(String travaEmbalagemchar) {
		this.travaEmbalagemchar = travaEmbalagemchar;
	}

	public String getUsadec() {
		return this.usadec;
	}

	public void setUsadec(String usadec) {
		this.usadec = usadec;
	}

	public BigDecimal getValmax() {
		return this.valmax;
	}

	public void setValmax(BigDecimal valmax) {
		this.valmax = valmax;
	}

	public String getValparcela() {
		return this.valparcela;
	}

	public void setValparcela(String valparcela) {
		this.valparcela = valparcela;
	}

	public String getVerDispEstoque() {
		return this.verDispEstoque;
	}

	public void setVerDispEstoque(String verDispEstoque) {
		this.verDispEstoque = verDispEstoque;
	}

	public String getVerest() {
		return this.verest;
	}

	public void setVerest(String verest) {
		this.verest = verest;
	}

	public String getViaSepGraf() {
		return this.viaSepGraf;
	}

	public void setViaSepGraf(String viaSepGraf) {
		this.viaSepGraf = viaSepGraf;
	}

}