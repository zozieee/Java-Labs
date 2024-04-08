import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookManager {
    private List<Book> bookList;
    
    public BookManager() {
        bookList = new BookCatalog().getCatalog();
    }
    
    public List<Book> getBooks(Predicate<Book> condition){
        List<Book> books = new ArrayList<>();
        for (Book b: bookList){
            //use test() method at beginning of if
            if (condition.test(b)){
                books.add(b);
            }
        }
        return books;    
    }
}