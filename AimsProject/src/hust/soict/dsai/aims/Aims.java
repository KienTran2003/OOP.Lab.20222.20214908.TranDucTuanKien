package hust.soict.dsai.aims;

// package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.*;

public class Aims {
	public static void main(String[] args) {
		
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//print total cost
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println(anOrder.getQtyOrdered());
		


		anOrder.removeDigitalVideoDisc(dvd2);
		for (int i = 0; i < anOrder.getQtyOrdered(); i++) {
			System.out.println((anOrder.getItemsOrdered())[i].getTitle());
		}
		anOrder.print();
		anOrder.searchDVD(1);		
		
		
	}
}