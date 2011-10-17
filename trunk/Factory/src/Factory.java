public class Factory{
	interface Xyz {
		Xyz cloan();
	}
	static class Tom implements Xyz {
		public Xyz cloan() {
			return new Tom();
			}
		public String toString() {
			return "ttt";
			}
		}
	static class Dick implements Xyz {
		public Xyz cloan() {
			return new Dick();
		    }
		public String toString() {
			return "ddd";
		    }
		}
	static class Harry implements Xyz{
		public Xyz cloan() {
			return new Harry();
			}
		public String toString() {
			return "hhh";
		    }
		}
	
	 static class Factory2 {
		private static java.util.Map<String, Xyz> prototypes=new java.util.HashMap<String, Xyz>();
		static {
			prototypes.put("tom", new Tom());
			prototypes.put("dick", new Dick());
			prototypes.put("harry", new Harry());
			}
		public static Xyz makeObject(String s) {
			return prototypes.get(s).cloan();
		}
		public static void main(String args[]) {
			for(int i=0;i<args.length;i++) {
				System.out.println(Factory2.makeObject(args[i])+" ");
				}
			}
		}
	 }

/*
a) Testati si rulati acest cod sursa. Explicati ce realizeaza.

Dupa rularea codului sursa, se vor crea prototipuri sau copii ale obiectelor create.
Metoda makeObject() are rolul de a returna obiectele prototip, care au ca superclasa
interfata Xyz.

b) Realizati diagrama de clasa pentru codul sursa de mai sus. Explicati relatiile
dintre clase.

Relatii:
- Factory - contine clasele imbricate statice Tom, Dick, Harry, Factory2 si
interfata Xyz
- Tom, Dick si Harry - implementeaza interfata Xyz
- Factory2 - utilizeaza interfata Xyz pentru a accesa obiectele instantiate din
clasele Tom, Dick si Harry

c) Care este rolul metodei cloan() ?

Metoda cloan() are rolul de a clona sau a prototipiza un obiect deja existent.

d) Ce sablon de proiectare este utilizat in cadrul acestei aplicatii ? Explicati.
Utilizati pentru aceste explicatii o diagrama de colaborare.

Sablonul folosit este sablonul Prototype, care este un sablon creational de obiect.
Clientul poate accesa doar prin intermediul metodei makeObject prototipul abstract Xyz,
care are rolul de apela metoda cloan() corespunzatoare protipului concret. Dupa
apelarea metodei corespunzatoare prototipului concret, se returneaza Stringul aferent
prototipului concret, pentru clientul care a accesat obiectele prin metoda makeObject
si se afiseaza Stringul corespunzator.

e) Ce este o clasa incapsulata (inner class) ? Puteti exemplifica pentru cazul de
mai sus.

Limbajul de programare Java permite definirea claselor imbricate (clase aflate in
clase). Aceste clase imbricate, pot fi statice sau nestatice. Clasele imbricate
nestatice sunt denumite si clase incapsulate (inner classes). 
Tom, Dick, Harry si Factory2 au fost declarate statice pentru a evidentia relatia
intre acestea si pentru a mari nivelul de incapsulare.

f) Care este semnificatia modificatorului static pentru atribute, metode si clase ?

Un atribut static este un atribut propriu al clasei caruia apartine si ea este
partajata de toate obiectele clasei. Atributul static este creat o singura data la
initializarea clasei. O metoda statica este o metoda proprie clasei care poate accesa
doar atributele statice si este creata o singura data la initializarea clasei, fiind
partajata de toate obiectele clasei. O clasa statica se comporta la fel ca o clasa
top-level si elimina restrictia care se refera la clasele imbricate nestatica: faptul
ca un obiect al clasei imbricate poate fi instantiat cu ajutorul unui obiect din
clasa exterioara.
*/