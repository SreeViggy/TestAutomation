package src.com.bootcampexercise.Module9;

public class Person {

    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
    // TODO: Please add some checks for max weight and height (kg and meter are their units)
    //TODO: Also add some checks that value shouldn't be negative and 0
    public String calculateBodyMass()
    {
        if(this.height <= 0 || this.weight <= 0) // To check if height or weight is negative or zero
            return "Height/Weight cannot be zero";
        if(this.height >2.5) // max height check
            return "Height cannot be great 2.5 meters";
        if(this.weight > 130)
            return "Weight cannot be great 130 KG";
        return ""+this.weight/(this.height*this.height); //This calculates the BMI and returns it

    }


//    Note: All TODOs should be implemented in single method

}
