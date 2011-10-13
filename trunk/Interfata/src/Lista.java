public class Lista implements Structura{
    int j;
    int l[] = new int[10];
    public void adauga(int i) {
    	for(j=0;j<l.length;) {
    		if(l[j] == 0) {
    			l[j] = i;
                break;
                }
    		else
    			j++;
    		}
    	}
    public void sterge(int i) {
    	for(j=0;j<l.length;) {
    		if(l[j] == i) {
    			l[j] = 0;
    			}
    		else
    			j++;
    		}
    	}
    public void insertElem(int elem, int ind){
    	for(j=0;j<l.length;) {
    		if(j == ind) {
    			l[j] = elem;
                break;
                }
            else
                j++;
    		}
    	}
    public void print() {
    	for(int j=0;j<l.length;j++)
            System.out.print(l[j]+" ");
        System.out.println();
        }
    }