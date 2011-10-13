import java.util.HashSet;
import java.util.Set;

public class Multime implements Structura {
    HashSet<Integer> s1 = new HashSet<Integer>();
    HashSet<Integer> s2 = new HashSet<Integer>();
    Set<Integer> union;
    int i; 
    public Multime() {
    	s1.add(1);
        s1.add(2);
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);
        }
    public void adauga(int i) {
    	s1.add(i);
        s2.add(i);
        }
    public void sterge(int i) {
        s1.remove(i);
        s2.remove(i);
        }
    public void reuniune() {
    	union = s1;
        union.addAll(s2);
        }
    public void print() {
    	System.out.print(s1);
        System.out.println(s2);
        }
    }