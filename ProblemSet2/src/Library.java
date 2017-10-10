public class Library {
    public static void main(String[] args) {
        //Book bk1= new Book();
        Book bk2 = new Book("Ask and the Answer","14713564",567,5.99f);
        Book bk3 = new Book("A Game Of Thrones","123458763",600,15.99f);

        //System.out.println(bk1.toString());

        System.out.println(bk2.toString());

        System.out.println(bk3.toString());
    }
}