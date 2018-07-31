import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookStock;
    private int capacity;
    private String location;

    public Library(String location, int capacity){

        this.bookStock = new ArrayList<Book>();
        this.capacity = capacity;
        this.location = location;
    }

    public int countBookStock(){
        return bookStock.size();
    }

    public void addBook(Book book){
        if (canAddBook() == true){
            this.bookStock.add(book);
        } else {
            return;
        }

    }

    public boolean canAddBook(){
        if (capacity > countBookStock()) {
            return true;
        }
        else {
            return false;
        }
    }

}
