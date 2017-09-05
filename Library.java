public class Library{
  private String name;
  private Book[] shelf;

  public Library(String name){
    this.name = name;
    this.shelf = new Book[5];
  }

  public String getName(){
    return this.name;
  }

  public int stockCount(){
    int count = 0;
    for ( Book stockItem : this.shelf ) {
      if (stockItem !=null){
        count++;
      }
    }
  return count;
  }

  public void shelf(Book book){
    if( this.isShelfFull() ){
      return;
    }
    int stockCount = stockCount();
    shelf[stockCount] = book;
  }

  public boolean isShelfFull(){
    return this.stockCount() == this.shelf.length;
  }

  public Book getBook(int position){
    Book book = this.shelf[position];
    this.shelf[position] = null;
    return book;
  }










}
