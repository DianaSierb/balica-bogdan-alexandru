public class Client {
	public static void main(String[] args) {
		Structura v = new Vector();
	    Structura l = new Lista();
	    Structura m = new Multime();    
	    v.adauga(1);       
	    v.adauga(2);
	    v.adauga(3);
	    v.adauga(4);
	    v.adauga(5);
	    v.adauga(6);
	    System.out.println("Vector: ");
	    v.print();
	    v.sterge(2);
	    v.sterge(3);
        System.out.println();
        v.print();
        System.out.println();
	    l.adauga(1);
	    l.adauga(2);
	    l.adauga(3);
	    l.adauga(5);
        System.out.println("Lista: ");
        l.print();
	    l.sterge(2);
        System.out.println();
        l.print();	        
        System.out.println();
	    m.adauga(1);
	    m.adauga(2);
	    m.adauga(3);
	    m.adauga(4);
	    System.out.println("Multime: ");
        m.print();
        m.sterge(4);
	    System.out.println();
  	    m.print();
	    System.out.println();
	    }
	}