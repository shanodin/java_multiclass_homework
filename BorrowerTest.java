import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BorrowerTest{
  Borrower borrower;
  Library library;
  Book book;

  @Before
  public void before(){
    borrower = new Borrower();
    library = new Library("Edinburgh Library");
    book = new Book();
    library.shelf(book);
  }

  @Test
  public void startWithNoBooks(){
    assertEquals(0, borrower.numberOfBooks());
  }

  @Test
  public void canBorrowBook(){
    borrower.borrowBook(library);
    assertEquals(1, borrower.numberOfBooks());
    assertEquals(0, library.stockCount());
  }
}
