package lista;

import java.util.LinkedList;
import java.util.Random;

public class Main {
	/*Crie uma classe Loja que contém uma lista de produtos (da classe abstrata Produto) e um método
	adicionaProduto(Produto prod) que adiciona produto à lista. Produto sempre contém atributos
	nome, preço e quantidade de vendas. Classes concretas de Produto são Calçado e Suplemento, onde
	o primeiro tem os atributos número e tipo (“Esporte” ou “Casual”, use enumeração) e o segundo
	tem os atributos quantidade (em litros) e tipo (“Whey”, “BCAA”). A classe Loja deverá ter um
	método.
	void ordena(Critério crit, Categoria cat)
	que deverá ordenar a lista e imprimir a lista ordenada por critério crit apenas dos produtos da
	categoria cat. Critério é uma enumeração que lista PRECO -> (att de Prod.) e QUANT -> ("") e Categoria é uma
	enumeração que lista CALCADO e SUPLEMENTO. Para fazer o ordenamento, use o algoritmo
	que você usou no exercício 1 (a escolha da classe, ArrayList ou LinkedList fica a sua escolha).
	Não é necessário fazer uma interface com o usuário, apenas construa os objetos na main e faça
	testes da funcionalidade do seu sistema.*/
	
	/* Todo: Implementarw o Insertion Sort na Classe Ordenador para Produto (já chamado em Loja)
	 * Todo: Criar uma loja na Main e adicionar Produtos e depois Ordená-los
	 */
	
	public static void main(String[] args) {
		System.out.println("Ex. 1");
		Ordenador ord = new Ordenador();
		LinkedList<Integer> elementos = new LinkedList<Integer>();
        Random n = new Random();
        for (int i = 0; i < 10; i++) {
            elementos.add(n.nextInt(20000));
        }
        long tempoInicial = System.currentTimeMillis();
        ord.insertion_sort(elementos);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
        for (int j = 0; j < elementos.size(); j++) {
            System.out.println(elementos.get(j));
        }
        System.out.println("Ex. 2");
        Calçado tenis_nike = new Calçado();
        Calçado tenis_adidas = new Calçado();
        Calçado tenis_asics = new Calçado();
        Suplemento suplemento_stronda = new Suplemento();
        Suplemento suplemento_bambam = new Suplemento();
        Suplemento suplemento_norris = new Suplemento();
        
        //Tenis
        tenis_adidas.nome = "Adidas Runner";
        tenis_adidas.numero = 42;
        tenis_adidas.preco = (double) 123.89;
        tenis_adidas.tipo = Tipo.CASUAL;
        tenis_adidas.q_vendas = 39;
        
        tenis_nike.nome = "Nike Mountain Player";
        tenis_nike.numero = 45;
        tenis_nike.preco = (double) 250.33;
        tenis_nike.tipo = Tipo.ESPORTE;
        tenis_nike.q_vendas = 23;
        
        tenis_asics.nome = "Asics";
        tenis_asics.numero = 36;
        tenis_asics.preco = (double) 345.90;
        tenis_asics.tipo = Tipo.ESPORTE;
        tenis_asics.q_vendas = 25;
        
        //Suplementos
        suplemento_stronda.nome = "frango com batata doce";
        suplemento_stronda.litros = 1.20;
        suplemento_stronda.preco = (double) 120.00;
        suplemento_stronda.tipo = Tipo.ESPORTE;
        suplemento_stronda.q_vendas = 34;
        
        suplemento_bambam.nome = "mutante";
        suplemento_bambam.litros = 3.0;
        suplemento_bambam.preco = (double) 170.50;
        suplemento_bambam.tipo = Tipo.CASUAL;
        suplemento_bambam.q_vendas = 48;
        
        suplemento_norris.nome = "Whey";
        suplemento_norris.litros = 5.5;
        suplemento_norris.preco = (double) 329.9;
        suplemento_norris.tipo = Tipo.ESPORTE;
        suplemento_norris.q_vendas = 12;
        
        Loja netshoes = new Loja();
        netshoes.prod.add(tenis_asics);
        netshoes.prod.add(tenis_adidas);
        netshoes.prod.add(tenis_nike);
        netshoes.prod.add(suplemento_norris);
        netshoes.prod.add(suplemento_bambam);
        netshoes.prod.add(suplemento_stronda);
        
        netshoes.ordena(Critério.PREÇO, Categoria.CALÇADO);
       
   
        
        

	}

}
