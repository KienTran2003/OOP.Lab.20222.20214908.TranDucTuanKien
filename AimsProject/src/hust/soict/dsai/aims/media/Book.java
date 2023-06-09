package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    
    private List<String> authors = new ArrayList<>();
    


    //Constructor
    public Book(String title, String category, float cost){
        super(title, category, cost);
    }
    public Book(String title, float cost){
        super(title, cost);
    }
    

    
    public List<String> getAuthors() {
        return authors;
    }


    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    //Check existance of author in array list

    private boolean inArrayList(String authorName, List<String> arr){
        return arr.contains(authorName);
    }

    //Add author

    public void addAuthor(String authorName, List<String> arr){
        if (!inArrayList(authorName, arr)){
            arr.add(authorName);
        }else {
            System.out.println("Author has already existed in list.");
        }


    }

    //Remove author

    public void removeAuthor(String author, List<String> arr){
        if (inArrayList(author, arr)){
            arr.remove(author);
        }
        else {
            System.out.println("Author has not been in list.");
        }


    }
  

    


    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Book:  " + this.getTitle() + " - Category: " + this.getCategory() + " - Cost: " + this.getCost();
    }



    public static void main (String[] args){
        Book myBook = new Book("Harry", "Trinh tham", 10);
        myBook.addAuthor("Name", myBook.getAuthors());
        myBook.addAuthor("Minh", myBook.getAuthors());
        System.out.println(myBook.getAuthors());
        myBook.removeAuthor("Nam", myBook.getAuthors());
        System.out.println(myBook.getAuthors());
    }
}

