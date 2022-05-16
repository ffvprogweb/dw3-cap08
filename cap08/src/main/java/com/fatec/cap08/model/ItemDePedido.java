package com.fatec.cap08.model;
public class ItemDePedido {
     Long id;
    Produto produto;
    int quantidade;
    public ItemDePedido(Produto p, int q) {
    	this.produto = p;
    	this.quantidade = q;
    }
    public Produto getProduto() {
		return produto;
    }
    public double getSubTotal() { 
           return quantidade * getProduto().getCusto();
    }
}
