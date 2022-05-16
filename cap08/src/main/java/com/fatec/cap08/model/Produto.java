package com.fatec.cap08.model;

public class Produto {
	private Long id;      //supoe que o codigo do produto eh obtido pelo codigo de barras
	private String descricao;
	private double custo;
	private int quantide; //quantidade no estoque
	public Produto(Long id, String descricao, double custo, int quantide) {
		this.id = id;
		this.descricao = descricao;
		this.custo = custo;
		this.quantide = quantide;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public int getQuantide() {
		return quantide;
	}
	public void setQuantide(int quantide) {
		this.quantide = quantide;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", custo=" + custo + ", quantide=" + quantide + "]";
	}
	
}
