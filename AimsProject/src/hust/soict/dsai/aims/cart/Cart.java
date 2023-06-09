package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    

    public Cart(){}
    public int getMaxNumbersOrdered(){
        return MAX_NUMBERS_ORDERED;
    }
    
    
        

    
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    public void addMedia(Media media){
        
        if (itemsOrdered.size()<MAX_NUMBERS_ORDERED){
            if (itemsOrdered.contains(media)){
                System.out.println("This media is already in cart");
            } else {
                itemsOrdered.add(media);
                System.out.println("This media is added successfully.");
            }
        } else {
            System.out.println("This cart is full");
        }

        
    }
    
    public void removeMedia(Media media){
        if (itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println("This media is removed successfully.");
        } else {
            System.out.println("This media is not in cart.");
        }
    }


    
    
    public float totalCost(){
        float cost = 0;
        for (Media media: itemsOrdered){
            cost += media.getCost();
        }
        return cost;
    }
    public void display(){
        System.out.println("This is your cart now: ");
        for (Media media: itemsOrdered){
            System.out.println(media);
        }
    }
    public void searchId(int id){
        boolean isinCart = false;
        for (Media media: itemsOrdered){
            if (media.getId() == id){
                System.out.println(media);
            }
        }
        if (!isinCart){
            System.out.println("Can not find media with ID " + id);
        }
    }
    public void searchTitle(String title){
        boolean isinCart = false;
        for (Media media: itemsOrdered){
            if (media.getTitle().equals(title)){
                isinCart = true;
                System.out.println(media);
            }
        }
        if (!isinCart){
            System.out.println("Can not find medid with title " + title);
        }
    }

}
