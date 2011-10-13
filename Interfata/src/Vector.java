public class Vector implements Structura {
    int i;
    int v[] = new int[6];
    public Vector() {
    	v[0] = 1;
        v[1] = 2;
        v[2] = 3;
        v[3] = 4;
        v[4] = 5;
        v[5] = 6;
        }
    public void adauga(int j) {
    	for(i=0;i<v.length;) {
    		if(v[i] == 0) {
    			v[i] = j;
                break;
                }
            else
                i++;
    		}
    	}
    public void sterge(int j) {
        for(i=0;i<v.length;) {
            if(v[i] == j) {
                v[i] = 0;
                }
            else
            	i++;
            }
        }
    public void returnElem(int k) {
        for(i=0;i<v.length;) {
            if(i == k) {
            	System.out.println(v[i]);
                break;
                }
            else
                i++;
            }
        }
    public void print() {
    	for(int j=0;j<v.length;j++)
            System.out.print(v[j]+" ");
        System.out.println();
        }
    }