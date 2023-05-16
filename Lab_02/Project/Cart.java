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
    public double totalCost(){
        double cost = 0;
        for (int i=0;i<qtyOrdered;i++){
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }

}
