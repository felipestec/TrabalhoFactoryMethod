package factoryMethod;

public class TestaPoligono {

	public static void main(String[] args) {
		
		Poligono triangulo = PoligonoFactory.createPoligono(3);
		System.out.println(String.format("%s - %s",3, triangulo.getDescricao()));
		
		Poligono quadrado = PoligonoFactory.createPoligono(4);
		System.out.println(String.format("%s - %s",4, quadrado.getDescricao()));
		
		Poligono pentagono = PoligonoFactory.createPoligono(5);
		System.out.println(String.format("%s - %s",5, pentagono.getDescricao()));

	}

}
/*
 * Faça um relatório sobre o uso do padrão de Projeto Factort Method.
 * 
	“Um padrão que define uma interface para criar um objeto, mas permite às classes
	 decidirem qual classe instanciar. O Factory Method permite a uma classe deferir
	 a instanciação para subclasses”.
	 
  1 - O que é o padrão Factort Method
  
		É um método usado para criar objetos em vez de usar uma chamada direta ao construtor.
		O padrão Factory Method sugere que você substitua chamadas diretas de construção de 
		objetos (usando o operador new) por chamadas para um método fábrica especial, os objetos
		ainda são criados através do operador new, mas esse está sendo chamado de dentro do 
		método fábrica. Objetos retornados por um método fábrica geralmente são chamados de produtos.
		
  2 - Quando esse padrão de projeto deve ser usado
 
		Quando voce precisa fornecer mais flexibilidade para seu codigo. Nos casos em que temos apenas
		um Creator o padrão nos oferece um meio de desligar a Implementação de um Product. Adicionando 
		ou alterando Products isso não irá afetar o Creator, pois eles não estão fortemente ligados.
		Com o padrão Factory Method podemos encapsular o código que cria objetos. 


 * 
 */
