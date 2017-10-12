public class MyPoint {//start class
    private double xVal;
    private double yVal;

    //accessor methods
    public double getxVal() {
        return xVal;
    }

    public double getyVal() {
        return yVal;
    }

    //mutator methods
    public void setxVal(double xVal) {
        this.xVal = xVal;
    }

    public void setyVal(double yVal) {
        this.yVal = yVal;
    }
    //end mutator methods

    public MyPoint(){
        this(0,0);
    }

    public MyPoint(double xVal, double yVal){
        setxVal(xVal);
        setyVal(yVal);
    }

    public String toString() {
        return String.format("xVal: %1.2f\n yVal: %1.2f\n",
                getxVal(), getyVal());
    }


    public void  moveHorizontally(double steps){
        xVal += steps;
    }

    public void moveVertically(double steps){
        yVal += steps;
    }

    public void translate(double xMove, double yMove){
        xVal += xMove;
        yVal += yMove;
    }

    public double distanceFromOrigin(){
        return Math.sqrt(xVal*xVal + yVal*yVal);
    }
}//end class