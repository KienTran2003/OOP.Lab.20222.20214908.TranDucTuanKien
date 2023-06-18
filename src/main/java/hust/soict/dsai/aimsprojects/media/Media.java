package hust.soict.dsai.aimsprojects.media;

import java.util.Comparator;
public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static int nbMedia = 0;

    //Constructor
    public Media(String title){
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
    }

    
    public Media(String title, String category, float cost){
        this(title);
        this.category = category;
        this.cost = cost;
    }
    public Media(String title, float cost){
        this(title);
        this.cost = cost;
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        try {
            if (obj instanceof Media) {
                Media mObj = (Media) obj;
                return this.getTitle().equals(mObj.getTitle());
            } else {
                return false;
            }
        } catch (NullPointerException e){
            System.out.println(e.getMessage());

        } catch (ClassCastException e){
            System.out.println(e.getMessage());

        }
        return false;
        // return super.equals(obj);
    }
    
    
    
}
