class Borrower{
  private Book[] books;

  public Borrower(){
    this.books = new Book[8];
  }

  public int numberOfBooks(){
    int count = 0;
    for (Book book : this.books) {
      if(book != null){
        count++;
      }
    }
    return count;
  }

  public void borrowBook(Library library){
    int bookPosition = library.stockCount() - 1;
    Book bookToBorrow = library.getBook(bookPosition);
    this.shelf(bookToBorrow);
  }


  public void shelf(Book book){
    if( this.isShelfFull() ){
      return;
    }
    int stockCount = numberOfBooks();
    this.books[stockCount] = book;
  }

  public boolean isShelfFull(){
    return this.numberOfBooks() == this.books.length;
  }

}
