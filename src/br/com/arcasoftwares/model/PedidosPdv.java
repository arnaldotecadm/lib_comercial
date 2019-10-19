package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the pedidos_pdv database table.
 * 
 */
@Entity
@Table(name = "pedidos_pdv")
@NamedQuery(name = "PedidosPdv.findAll", query = "SELECT p FROM PedidosPdv p")
public class PedidosPdv implements Serializable {
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

	private String ccf;

	@Column(name = "ccf_cript")
	private String ccfCript;

	@Column(name = "codigo_cliente")
	private String codigoCliente;

	@Column(name = "codigo_empresa")
	private String codigoEmpresa;

	@Column(name = "codigo_vendedor")
	private String codigoVendedor;

	private String coo;

	@Column(name = "coo_cript")
	private String cooCript;

	private Integer cupom;

	@Column(name = "dt_emissao")
	private String dtEmissao;

	@Column(name = "dt_emissao_cript")
	private String dtEmissaoCript;

	private Integer fechado;

	@Column(name = "modo_bd")
	private String modoBd;

	@Column(name = "nome_cliente")
	private String nomeCliente;

	@Column(name = "nome_vendedor")
	private String nomeVendedor;

	@Column(name = "num_nf_gerada")
	private String numNfGerada;

	@Column(name = "num_nf_venda")
	private String numNfVenda;

	@Column(name = "numero_pedido")
	private String numeroPedido;

	@Column(name = "numero_pedido_cript")
	private String numeroPedidoCript;

	@Column(name = "tipo_pagamento")
	private String tipoPagamento;

	@Column(name = "tipo_pedido")
	private String tipoPedido;

	@Column(name = "total_pedido")
	private String totalPedido;

	@Column(name = "total_pedido_cript")
	private String totalPedidoCript;

	@Column(name = "valor_acrescimo")
	private BigDecimal valorAcrescimo;

	@Column(name = "valor_desconto")
	private BigDecimal valorDesconto;

	public PedidosPdv() {
	}

	public String getCcf() {
		return this.ccf;
	}

	public void setCcf(String ccf) {
		this.ccf = ccf;
	}

	public String getCcfCript() {
		return this.ccfCript;
	}

	public void setCcfCript(String ccfCript) {
		this.ccfCript = ccfCript;
	}

	public String getCodigoCliente() {
		return this.codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoEmpresa() {
		return this.codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getCodigoVendedor() {
		return this.codigoVendedor;
	}

	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getCoo() {
		return this.coo;
	}

	public void setCoo(String coo) {
		this.coo = coo;
	}

	public String getCooCript() {
		return this.cooCript;
	}

	public void setCooCript(String cooCript) {
		this.cooCript = cooCript;
	}

	public Integer getCupom() {
		return this.cupom;
	}

	public void setCupom(Integer cupom) {
		this.cupom = cupom;
	}

	public String getDtEmissao() {
		return this.dtEmissao;
	}

	public void setDtEmissao(String dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public String getDtEmissaoCript() {
		return this.dtEmissaoCript;
	}

	public void setDtEmissaoCript(String dtEmissaoCript) {
		this.dtEmissaoCript = dtEmissaoCript;
	}

	public Integer getFechado() {
		return this.fechado;
	}

	public void setFechado(Integer fechado) {
		this.fechado = fechado;
	}

	public String getModoBd() {
		return this.modoBd;
	}

	public void setModoBd(String modoBd) {
		this.modoBd = modoBd;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeVendedor() {
		return this.nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getNumNfGerada() {
		return this.numNfGerada;
	}

	public void setNumNfGerada(String numNfGerada) {
		this.numNfGerada = numNfGerada;
	}

	public String getNumNfVenda() {
		return this.numNfVenda;
	}

	public void setNumNfVenda(String numNfVenda) {
		this.numNfVenda = numNfVenda;
	}

	public String getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getNumeroPedidoCript() {
		return this.numeroPedidoCript;
	}

	public void setNumeroPedidoCript(String numeroPedidoCript) {
		this.numeroPedidoCript = numeroPedidoCript;
	}

	public String getTipoPagamento() {
		return this.tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getTipoPedido() {
		return this.tipoPedido;
	}

	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	public String getTotalPedido() {
		return this.totalPedido;
	}

	public void setTotalPedido(String totalPedido) {
		this.totalPedido = totalPedido;
	}

	public String getTotalPedidoCript() {
		return this.totalPedidoCript;
	}

	public void setTotalPedidoCript(String totalPedidoCript) {
		this.totalPedidoCript = totalPedidoCript;
	}

	public BigDecimal getValorAcrescimo() {
		return this.valorAcrescimo;
	}

	public void setValorAcrescimo(BigDecimal valorAcrescimo) {
		this.valorAcrescimo = valorAcrescimo;
	}

	public BigDecimal getValorDesconto() {
		return this.valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

}