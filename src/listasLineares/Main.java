package listasLineares;

public class Main {
	public static void main(String[] args) {
		/*Nodo nodo1 = new Nodo(5);
		Nodo nodo2 = new Nodo(6);
		Nodo nodo3 = new Nodo(8);
		
		nodo1.setProx(nodo2);
		nodo2.setProx(nodo3);
		
		int valorNodo2 = nodo1.getProx().getDado();
		int valorNodo1 = nodo1.getDado();
		System.out.println(valorNodo2);
		System.out.println(valorNodo1);
		
		int valorNodo3 = nodo2.getProx().getDado();
		int valorNodo2Teste = nodo2.getDado();
		System.out.println(valorNodo3);
		System.out.println(valorNodo2Teste);
		*/
		
		ListaEncadeada list = new ListaEncadeada();
		list.inserir(7);
		list.inserir(5);
		list.mostrarLista();
		list.deleteComValor(5);
		list.mostrarLista();
		list.inserirFinal(4);
		list.mostrarLista();
	}
}
