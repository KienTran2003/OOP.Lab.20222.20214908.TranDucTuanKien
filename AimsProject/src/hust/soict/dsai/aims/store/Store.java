package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
public class Store {
    private static final int MAX_ITEM = 1000;
    
    private ArrayList<Media> itemsInStore  = new ArrayList<>();

    public Store(){}

    public void addMedia(Media media){
        if (itemsInStore.contains(media)){
            System.out.println("This median is already in store.");
        } else {
            itemsInStore.add(media);
            System.out.println("This media is added successful.");

        }
    }
    public void removeMedia(Media media){
        if (itemsInStore.contains(media)){
            itemsInStore.remove(media);
            System.out.println("This media is removed successful.");
        } else {
            System.out.println("This media is not in store.");
        }
    }

    
    
    public static int getMaxItem() {
        return MAX_ITEM;
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public boolean searchTitle(String title){
            for (Media media: itemsInStore){
                if (media.getTitle().equals(title)){
                    return true;
                }
            }
            return false;
    
    }
    public void display(){
        for (Media media: itemsInStore){
            System.out.println(media);
        }
    }

    

    

}
