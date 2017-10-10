public class Zoo {
    public static void main(String[] args) {
       Animal an1 = new Animal();
        String [] continents={"Africa"};
        Animal an2 = new Animal("Elephant", 19, 5000, continents);

        System.out.println(an1.toString());
        System.out.println(an2.toString());
    }
}
