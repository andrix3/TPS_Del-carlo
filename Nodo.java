public class Nodo {
	private int info;
	private Nodo nodo;

	
	public Nodo() {
		creaNodo(0, null);
	}
	
	public Nodo(int i, Nodo link) {
		creaNodo(i, link);
	}
	
	private void creaNodo(int i, Nodo link) {
		this.info = i;
		this.nodo = link;
	}
	
	public void setInfoNodo(int i) {
		this.info = i;
	}
	
	public int getInfoNodo() {
		return info;
	}
	
	public void setLinkNodo(Nodo link) {
		this.nodo = link;
	}
	
	public Nodo getLinkNodo() {
		return this.nodo;
	}
	
	public int visualizza() {
		return getInfoNodo();
	}
}