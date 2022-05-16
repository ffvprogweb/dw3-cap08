package com.fatec.cap08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.joda.time.DateTime;
import org.joda.time.Days;

import com.fatec.cap08.model.Cliente;
import com.fatec.cap08.model.ItemDePedido;
import com.fatec.cap08.model.Pedido;
import com.fatec.cap08.model.Produto;

public class Principal {

	public static void main(String[] args) {
		// *******************************************************************************************
		// * repository – arraylist (armazem de dados)
		// *******************************************************************************************
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Pedido> pedidos = new ArrayList<Pedido>();
		// *******************************************************************************************
		// * repository - arraylist
		// *******************************************************************************************
		Cliente c1 = new Cliente("Andrade", "25/05/1960", "M", "99504993052", "04280130", "1234");
		Cliente c2 = new Cliente("Silva", "18/03/1964", "M", "43011831084", "08545160", "1234");
		Cliente c3 = new Cliente("Claudia", "11/05/1974", "F", "85765535380", "08545160", "1234");
		clientes.addAll(Arrays.asList(c1, c2, c3));
		// *******************************************************************************************
		// * salva os produtos no repositorio (armazem de dados)
		// *******************************************************************************************
		Produto produto1 = new Produto(1L, "parafuso", 12, 200);// custo e quant no estoque
		Produto produto2 = new Produto(2L, "tijolo", 5, 500);
		Produto produto3 = new Produto(3L, "tomada eletrica", 20, 300);
		produtos.addAll(Arrays.asList(produto1, produto2, produto3));
		// *******************************************************************************************
		// * relatorio - lista de produtos
		// *******************************************************************************************
		for (Produto item : produtos) {
			System.out.print(item.toString());
			System.out.println();
		}
		System.out.println("=====================================");
		produtos.forEach(item -> System.out.println(item));
		// anomalia
		Produto produto4 = new Produto(4L, "", 20, 300);
		// *******************************************************************************************
		// * manipulacao de datas
		// *******************************************************************************************
		DateTime dateTime = new DateTime();
		// Imprimindo a data no formato YYYY-MM-dd
		System.out.println("Data atual = " + dateTime.toString("dd-MM-YYYY"));
		System.out.println("Data atual = " + dateTime.toString("dd/MM/YYYY"));
		System.out.println("Data de cadastro cliente c1 =" + c1.getDataCadastro());
		// **************************************************************************
		// * calculo entre datas
		// **************************************************************************
		DateTime dataInicio = new DateTime(2021, 1, 1, 0, 0); // data de cadastro do cliente
		System.out.println("data inicio = " + dataInicio.toString("dd-MM-YYYY"));
		DateTime dataFinal = new DateTime();
		Days d = Days.daysBetween(dataInicio, dataFinal);
		System.out.println("Diferença dias:" + d.getDays());
		// Obtem a data do cliente c1 para calculo entre datas
		String ano = c1.getDataCadastro().substring(6, 10);
		System.out.println("ano do cadastro:" + ano);
		String mes = c1.getDataCadastro().substring(3, 5);
		System.out.println("mes do cadastro:" + mes);
		String dia = c1.getDataCadastro().substring(0, 2);
		System.out.println("dia do cadastro:" + dia);
		dataInicio = new DateTime(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia), 0, 0);
		d = Days.daysBetween(dataInicio, dataFinal);
		System.out.println("Diferença dias:" + d.getDays());
		// *******************************************************************************************
		// Pedido1 - entrada de dados de pedido - o cliente deve estar previamente cadastrado
		// informações sobre o nome do cliente, endereço são obtidos com base no cpf do cliente
		// *******************************************************************************************
		Pedido pedido1 = new Pedido("43011831084");
		// *******************************************************************************************
		// Detalhes do pedido1 - o produto deve estar cadastrado este cliente comprou 2
		// itens parafuso e bucha
		// *******************************************************************************************
		Optional<Produto> umProduto = Optional.of(produtos.get(0));
		Produto produtoComprado1 = umProduto.get();
		umProduto = Optional.of(produtos.get(2));
		Produto produtoComprado2 = umProduto.get();
		ItemDePedido ip1 = new ItemDePedido(produtoComprado1, 20); // quantidade comprada
		ItemDePedido ip2 = new ItemDePedido(produtoComprado2, 10); // quantidade comprada
		System.out.println("Subtotal item 1 = " + ip1.getSubTotal());
		System.out.println("Subtotal item 2 = " + ip2.getSubTotal());
		// *******************************************************************************************
		// adiciona os itens comprados no pedido e salva no array de pedidos
		// *******************************************************************************************
		pedido1.getItens().addAll(Arrays.asList(ip1, ip2));
		// parafuso custo = R$ 12 comprado 20 - tomada eletrica custo = R$ 20 comprado  10
		System.out.println("Valor total do pedido = " + pedido1.getValorTotal());
		pedidos.add(pedido1);

	}
}
