/**
 * Created by t00187846 on 12/10/2017.
 */
public class BicycleDriver {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle("Darren", 0,"Ralleigh");


        System.out.println(b1.toString());
        System.out.println(b2.toString());

        b2.newValue(0);
        System.out.println(b2.toString());
    }
}
