package listasLineares;

public class ListaEncadeada {
	private Nodo inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserir(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void mostrarLista() {
		if(vazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		
		Nodo aux = inicio;
		while(aux != null) {
			System.out.print(aux.getDado()+" ");
			aux = aux.getProx();
		}
	}
	
	public void deleteComValor(int valor) {
		if(vazia()) return;
		if(inicio.getDado() == valor) {
			inicio = inicio.getProx();
			return;
		}
		
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
		}
		aux = aux.getProx();
	}
	
	public void inserirFinal(int dado) {
		if(vazia()) {
			inserir(dado);
			return;
		}
		
		Nodo novoNodo = new Nodo(dado);
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
		
		
	}
}
