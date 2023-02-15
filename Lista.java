import java.util.Scanner;

public class Lista {
    public static Nodo aggiungiTesta(int i, Nodo head)
    {
        Nodo n = new Nodo(i, head);
        head = n;
        System.out.println("aggiunto in testa");
        return head;
    }

    public static Nodo rimuoviTesta(Nodo head) 
    {
        if(head != null){
            head = head.getLinkNodo();
            System.out.println("rimosso in testa");
        }
        return head;
    }

    public static String toString(Nodo head)
    {
        Nodo copia = null;
        String s = "";
        if(head != null) 
            copia = new Nodo(head.getInfoNodo(), head.getLinkNodo());

        while(copia != null) {
            s += "\n" + copia.getInfoNodo();
            copia = copia.getLinkNodo();
        }
        return s;
    }

	public static void main(String[] args) {		
		Nodo head = null;

        int x = 0;
        Scanner scan = new Scanner(System.in);


        while(x != 4){
            System.out.println("Inserisci 1 per inserire in testa, 2 per " 
                +"rimuovere in testa, 3 per stampare l'intera lista, 4 per fermare il ciclo");
            x = scan.nextInt();

            int i = 0;

            switch(x){
                case 1:
                    System.out.println("Inserisci l'informazione del nodo: ");
                    i = scan.nextInt();

                    head = aggiungiTesta(i, head);
                    System.out.println(toString(head));
                    break;
                case 2: 
                    head = rimuoviTesta(head);
                    System.out.println(toString(head));
                    break;
                case 4: 
                    break;
                case 3: 
                    System.out.println(toString(head));
                    break;
                default:
                    System.out.println("inserito num scoretto, riprova!");
                    System.out.println("YES!");
                    
            }
        }
        scan.close();
	}
}