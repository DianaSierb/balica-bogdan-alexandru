public class Produs {
	private String nume;
    static private int id=100;
    private int id2;
    private double pret;
    private double cantitate;

    public Produs(String n,double p,double c) {
    	nume = n;
        pret = p;
        cantitate = c;
        setId();
        }
    public void setId() {
    	this.id2=id++;
    	}
    public int getId() {
    	return this.id2;
        }
    public String getNume() {
        return nume;
        }
    public double getPret() {
        return pret;
        }
    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
        }
    public double getCantitate() {
        return cantitate;
        } 
    public String toString() {
        return "Nume: "+getNume()+" Pret: "+getPret()+" Cantitate: "+getCantitate()+" Id: "+getId();
        }
    }