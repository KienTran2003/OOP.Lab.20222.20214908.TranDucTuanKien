package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
    private static final int MAX_ITEM = 1000;
    private int qtyItems = 0;
    DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEM];

    public Store(){}

    public void addDVD(DigitalVideoDisc dvd){
        if (qtyItems<MAX_ITEM){
            itemsInStore[qtyItems] = dvd;
            qtyItems++;
        } else{
            System.out.println("Store is full!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (int i=0;i<dvdList.length;i++){
            this.addDVD(dvdList[i]);
        }
    }
    public static int getMaxItem() {
        return MAX_ITEM;
    }

    public int getQtyItems() {
        return qtyItems;
    }

    public void setQtyItems(int qtyItems) {
        this.qtyItems = qtyItems;
    }

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(DigitalVideoDisc[] itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    public void removeDVD(DigitalVideoDisc dvd){
        DigitalVideoDisc[] temp = new DigitalVideoDisc[MAX_ITEM];
        
        int j=0;
        for (int i = 0;i<qtyItems;i++){
            if (itemsInStore[i] != dvd){
                temp[j] = itemsInStore[i];
                j++;
            } else {
                
                
            }
        }
        qtyItems--;
        itemsInStore = temp;
    }

}
