public class Book {
    //declare the attributes of the class
    private String title;
    private float price;
    private String isbn;
    private int pages;

    //accessor methods
    public String getTitle(){
        return title;
    }

    public float getPrice(){
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getIsbn() {
        return isbn;
    }

    //mutator methods


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Book(){
       this("Unknown","Unknown",0,0.0f);
    }

    public Book(String title, String isbn, int pages, float price){
        setTitle(title);
        setIsbn(isbn);
        setPages(pages);
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("Title: %-20s \nISBN: %-20s \nPrice:  €%3.2f \nPages: %d\n",
                getTitle(),getIsbn(),getPrice(),getPages());
    }
}