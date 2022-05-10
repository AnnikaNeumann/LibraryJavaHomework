import java.util.ArrayList;

public class Library {


    private ArrayList <Book> library;
    private int capacity;

    public Library(int capacity){
        this.library = new ArrayList<Book>();
        this.capacity = capacity;
    }

   public int bookCount(){
        return library.size();
   }


    public void addNewBook(Book book){
        if (bookCount() < capacity) {
            library.add(book);
        }
    }

}
