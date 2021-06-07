package org.serratec.dto;

import java.time.LocalDate;

import org.serratec.models.Pagamento;
import org.serratec.models.Venda;

public class VendaCompletaDTO {

	private String codigoVenda;
	private String nomeLivro;
	private Double valorLivro;
	private EnderecoCompletoDTO enderecoVenda;
	private Pagamento pagamento;
	private LeitorSimplificadoDTO leitor;
	private LocalDate dataPedido;
	
	public VendaCompletaDTO(Venda venda) {
		this.codigoVenda = venda.getCodigo();
		this.nomeLivro = venda.getLivro().getNome();
		this.valorLivro = venda.getPreco();
		this.pagamento = venda.getPagamento();
		this.leitor = new LeitorSimplificadoDTO(venda.getLeitor());
		this.dataPedido = venda.getDataPedido();
		
	    this.enderecoVenda = new EnderecoCompletoDTO(venda.getEndereco());
	}
	
	
	public String getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(String codigoVenda) {
		this.codigoVenda = codigoVenda;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public Double getValorLivro() {
		return valorLivro;
	}
	public void setValorLivro(Double valorLivro) {
		this.valorLivro = valorLivro;
	}


	public EnderecoCompletoDTO getEnderecoVenda() {
		return enderecoVenda;
	}


	public void setEnderecoVenda(EnderecoCompletoDTO enderecoVenda) {
		this.enderecoVenda = enderecoVenda;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


	public LeitorSimplificadoDTO getLeitor() {
		return leitor;
	}


	public void setLeitor(LeitorSimplificadoDTO leitor) {
		this.leitor = leitor;
	}


	public LocalDate getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	
	
	
}
