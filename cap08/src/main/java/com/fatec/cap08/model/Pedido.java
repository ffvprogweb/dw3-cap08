package com.fatec.cap08.model;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Long id;
	private String cpf;
	private List<ItemDePedido> itens = new ArrayList<>();
	
	public Pedido(String cpf) {
		this.cpf = cpf;
	}
	
	public double getValorTotal() {
		double soma = 0.0;
		for (ItemDePedido ip : itens) {
			soma = soma + ip.getSubTotal();
		}
		return soma;
	}
	public List<ItemDePedido> getItens() {
		return itens;
	}
}
