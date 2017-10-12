public class MyPointDriver {//start class
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(51, 64);

        System.out.println(p1.toString());
        System.out.println(p2.toString());


        p1.moveHorizontally(10);
        p1.translate(5,20);
        p1.moveVertically(10);
        System.out.println(p1.toString());

        System.out.println("Distance of p1 from origin is " + p1.distanceFromOrigin());

    }
}//end class