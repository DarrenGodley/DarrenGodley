/**
 * Created by t00187846 on 12/10/2017.
 */
public class Bicycle {
    private String name;
    private double value;
    private String make;

    //accessor methods
    public String getName(){
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    //mutator method

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Bicycle(){
        this("Martin", 50, "Land Rover");
    }

    public Bicycle(String name, double value, String make){
        setName(name);
        setValue(value);
        setMake(make);
    }

    public String toString(){
        return String.format("Name: %-20s\n Value: %1.2f\n Make: %-20s\n",
                getName(), getValue(), getMake());
    }

    public void newValue(double newBikeValue){
        value += newBikeValue + 10;
    }
}