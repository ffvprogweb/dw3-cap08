package com.fatec.cap08.model;
import org.joda.time.DateTime;
public class Cliente {
	String nome;
	String dataNascimento;
	String dataCadastro; //obtida do sistema atualizada com a data da ultima compra do cliente
	String sexo;
	String cpf;
	String cep;
	String endereco; //obtido do ViaCEP
	String complemento;
	public Cliente(String nome, String dataNascimento, String sexo, String cpf, String cep,
			String complemento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.cep = cep;
		this.complemento = complemento;
		setDataCadastro();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro() {
		this.dataCadastro = obtemDataAtual();
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String obtemDataAtual() {
		DateTime dateTime = new DateTime();
		return dateTime.toString("dd-MM-YYYY");
	}
	
}
