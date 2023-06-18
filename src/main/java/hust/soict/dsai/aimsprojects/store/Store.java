package hust.soict.dsai.aimsprojects.store;

import hust.soict.dsai.aimsprojects.media.Media;

import java.util.ArrayList;

public class Store {
    private static final int MAX_ITEM = 1000;
    
    private ArrayList<Media> itemsInStore  = new ArrayList<>();

    public Store(){}

    public void addMedia(Media media){
        if (itemsInStore.contains(media)){
            System.out.println("This median is already in store.");
        } else {
            itemsInStore.add(media);
            System.out.println("This media is added successfully.");

        }
    }
    public void removeMedia(Media media){
        if (itemsInStore.contains(media)){
            itemsInStore.remove(media);
            System.out.println("This media is removed successfully.");
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
