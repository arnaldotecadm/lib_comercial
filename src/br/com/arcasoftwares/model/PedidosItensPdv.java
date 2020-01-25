package br.com.arcasoftwares.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the pedidos_itens_pdv database table.
 * 
 */
@Entity
@Table(name = "pedidos_itens_pdv")
@NamedQuery(name = "PedidosItensPdv.findAll", query = "SELECT p FROM PedidosItensPdv p")
public class PedidosItensPdv implements Serializable {
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

	@Column(name = "codigo_empresa")
	private String codigoEmpresa;

	@Column(name = "codigo_fabrica")
	private String codigoFabrica;

	@Column(name = "codigo_produto")
	private String codigoProduto;

	@Column(name = "desconto_perc")
	private String descontoPerc;

	private String item;

	@Column(name = "modo_bd")
	private String modoBd;

	@Column(name = "numero_pedido")
	private String numeroPedido;

	@Column(name = "qtd_vendida")
	private String qtdVendida;

	@Column(name = "valor_desconto")
	private Integer valorDesconto;

	@Column(name = "valor_venda")
	private String valorVenda;

	public PedidosItensPdv() {
	}

	public String getCodigoEmpresa() {
		return this.codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getCodigoFabrica() {
		return this.codigoFabrica;
	}

	public void setCodigoFabrica(String codigoFabrica) {
		this.codigoFabrica = codigoFabrica;
	}

	public String getCodigoProduto() {
		return this.codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescontoPerc() {
		return this.descontoPerc;
	}

	public void setDescontoPerc(String descontoPerc) {
		this.descontoPerc = descontoPerc;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getModoBd() {
		return this.modoBd;
	}

	public void setModoBd(String modoBd) {
		this.modoBd = modoBd;
	}

	public String getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getQtdVendida() {
		return this.qtdVendida;
	}

	public void setQtdVendida(String qtdVendida) {
		this.qtdVendida = qtdVendida;
	}

	public Integer getValorDesconto() {
		return this.valorDesconto;
	}

	public void setValorDesconto(Integer valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public String getValorVenda() {
		return this.valorVenda;
	}

	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}

}