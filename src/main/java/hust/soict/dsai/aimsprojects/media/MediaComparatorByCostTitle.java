package hust.soict.dsai.aimsprojects.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        // TODO Auto-generated method stub
        int titleCompare = o1.getTitle().compareTo(o2.getTitle());
        int costCompare = (int) (o1.getCost() - (o2.getCost()));
        return (costCompare == 0) ? titleCompare : costCompare; 
    }
    
}
