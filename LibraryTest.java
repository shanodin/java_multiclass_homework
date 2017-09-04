import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{
  Library library;
  Book book;

  @Before
  public void before(){
    library = new Library("Edinburgh Library");
    book = new Book();
  }


// test library has name
  @Test
  public void hasName(){
    assertEquals( "Edinburgh Library", library.getName() );
  }

// test shelf starts empty
  @Test
  public void shelfStartsEmpty(){
    assertEquals( 0, library.stockCount() );
  }

// test you can add books to shelf
  @Test
  public void canPutBooksOnShelf(){
    library.shelf(book);
    assertEquals( 1, library.stockCount() );
  }

// test shelf is full
  @Test
  public void shelfIsFull(){
    for(int i = 0; i<5; i++){
      library.shelf(book);
    }
    assertEquals( true, library.isShelfFull() );
  }

// test can't add books to a full shelf
  @Test
  public void cannotPutBooksOnFullShelf(){
    for(int i = 0; i<10; i++){
      library.shelf(book);
    }
    assertEquals( 5, library.stockCount() );
  }





}
