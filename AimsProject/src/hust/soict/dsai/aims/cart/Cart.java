package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    

    public Cart(){}
    public int getMaxNumbersOrdered(){
        return MAX_NUMBERS_ORDERED;
    }
    public DigitalVideoDisc[] getItemsOrdered(){
        return itemsOrdered;
    }
    public int getQtyOrdered(){
        return qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == 20){System.out.println("Cart is full!");}
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
        }
        

    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (int i = 0; i<dvdList.length; i++){
            this.addDigitalVideoDisc(dvdList[i]);
        }
    }
    // public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
    //     for (DigitalVideoDisc dvd : dvds) {
    //         this.addDigitalVideoDisc(dvd);
    //     }
    // }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }



    public void print(){
        for (int i = 0;i<qtyOrdered;i++){
            System.out.println(itemsOrdered[i]);
        }

    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        DigitalVideoDisc[] temp = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        
        int j=0;
        for (int i = 0;i<qtyOrdered;i++){
            if (itemsOrdered[i] != disc){
                temp[j] = itemsOrdered[i];
                j++;
            } else {
                
                
            }
        }
        qtyOrdered--;
        itemsOrdered = temp;
        
    }
    public void searchDVD(int id){
        for (int i =0;i<qtyOrdered;i++){
            if (itemsOrdered[i].getId() == id){
                System.out.println(itemsOrdered[i]);
                break;
            } else {
                if (i == qtyOrdered-1){
                    System.out.println("There is no DVD with id = "+ id);

                }
            }
        }
    }
    public void searchDVD(String title){
        for (int i =0;i<qtyOrdered;i++){
            if (itemsOrdered[i].getTitle().equals(title)){
                System.out.println(itemsOrdered[i]);
                break;
            } else {
                if (i == qtyOrdered-1){
                    System.out.println("There is no DVD with title "+ title);

                }
            }
        }
    }
    public double totalCost(){
        double cost = 0;
        for (int i=0;i<qtyOrdered;i++){
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }

}
