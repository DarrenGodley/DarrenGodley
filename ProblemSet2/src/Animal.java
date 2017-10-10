public class Animal {
    private String type;
    private double weight;
    private int age;
    private String [] continents;


    //Accessor methods
    public String getType(){
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String[] getContinents() {
        return continents;
    }

    //Mutator methods
    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public Animal(){
        this("unknown", 0, 0.0f, null);
    }

    public Animal(String type, int age, double weight, String[] continents){
        setType(type);
        setAge(age);
        setWeight(weight);
        setContinents(continents);
    }

    public String toString() {

        String consAsString= "";
        if(continents != null)
        {
            for(int i = 0; i < continents.length; i++){
                consAsString+= continents[i] + "";
            }
        }


        return String.format("Type:  %-20s \nAge:  %2d \nWeight:  %1.2f kg \nContinents:  %-20s\n",
                getType(), getAge(), getWeight(), consAsString);
    }
}
