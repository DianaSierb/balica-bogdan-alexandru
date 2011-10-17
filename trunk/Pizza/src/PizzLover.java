class PizzaLover {
    /** Create all available pizzas and print their prices */
    public static void main (String args[]) {
        for (PizzaFactory.PizzaType pizzaType : PizzaFactory.PizzaType.values()) {
        	System.out.println("Price of " + pizzaType + " is " + PizzaFactory.createPizza(pizzaType).getPrice());
        	}
        }
    }

/*
a) Testati si rulati acest cod sursa. Explicati ce realizeaza.

Aplicatia afiseaza pretul corespunzator fiecarui tip de pizza. Clientul acceseaza
produsele (tipurile de Pizza, doar prin intermediul clasei PizzaFactory).

b) Realizati diagrama de clasa pentru codul sursa de mai sus. Explicati relatiile
dintre clase.

Relatii:
- Pizza - este superclasa claselor DeluxePizza, HawaiianPizza si HamAndMushroomPizza,
toate aceste clase derivate redefinesc metoda abstracta getPrice din clasa
abstracta Pizza
- PizzaLover - utilizeaza clasa PizzaFactory pentru a accesa tipurile de Pizza
- PizzaFactory - instantiaza un obiect concret de tip Pizza in functie de parametrul
primit

c) Ce sablon de proiectare este utilizat in cadrul acestei aplicatii ? Explicati.
Utilizati o diagrama de colaborare pentru aceste explicati.

Sablonul utilizat in aceasta aplicatie este sablonul creational de clasa, Factory Method.
Clasa Pizza corespunde clasei Produs din Factory Method.
Clasele HawaiianPizza,DeluxePizza, HamAndMushRoomPizza corespund clasei ProdusConcret
din Factory Method.
Clasa PizzaLover corespunde clasei Creator din Factory Method.
Clasa PizzaFactory corespunde clasei CreatorConcret din Factory Method.
*/