import java.util.*;

public class Depozit {
    ArrayList<Produs> produse = new ArrayList<Produs>();
    public void insert() {      
    	Scanner in = new Scanner(System.in);
        try {
        	String nume = in.next();
            double pret = in.nextDouble();
            double cantitate = in.nextDouble();
            produse.add(new Produs(nume,pret,cantitate));
            }
        catch(Exception e){}
        }
    public void vanzareProdus() {
    	try{
    		Scanner in = new Scanner(System.in);
            int id = in.nextInt();
            double cant = in.nextDouble();
            for(int i=0;i<produse.size();i++)
            	if(produse.get(i).getId() == id)
            		if(cant > produse.get(i).getCantitate())
            			System.out.println("Cantitate prea mare. Cantitate max: " +produse.get(i).getCantitate());
                    else
                        produse.get(i).setCantitate(produse.get(i).getCantitate()-cant);
            }
    	catch(Exception e){}
    	}
    public void afisareInventar() {
    	for(int i=0;i<produse.size();i++)
    		System.out.println(produse.get(i));
    	}
    }