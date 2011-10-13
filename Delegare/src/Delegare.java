public class Delegare{
	public static void main(String[] args){
		Depozit depozit = new Depozit();
	    System.out.println("Introduceti 3 produse (nume, pret, cantitate): ");
	    for(int i=0;i<3;i++)
	    	depozit.insert();
	    depozit.afisareInventar();
	    System.out.println("Introduceti id-ul produsului si cantitatea dorita: ");
	    depozit.vanzareProdus();
	    depozit.afisareInventar();
	    }     
	}