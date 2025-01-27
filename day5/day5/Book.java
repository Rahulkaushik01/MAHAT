

class Book {
    String title, author, publisher;
    int ISBN_price;


    public int applyDiscount(){
        int new_price =  ISBN_price - (int)(ISBN_price *0.20);
        return new_price;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.ISBN_price = 300;
        book.title = "FIRE";
        book.author = "JAMES GOSLING";
        book.publisher = "NEW_COMPANY";
        System.out.println(book.applyDiscount());

    }
}
