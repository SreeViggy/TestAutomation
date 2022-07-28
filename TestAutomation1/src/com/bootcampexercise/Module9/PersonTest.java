package src.com.bootcampexercise.Module9;

import junit.framework.TestCase;
import org.junit.Assert;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        person = new Person();
    }
    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters

    public void testGetWeight() {
        int weight=95;
        person.setWeight(weight);
        Assert.assertEquals(weight,person.getWeight());
        int weight1 = 30;
        person.setWeight (weight1);
        Assert.assertNotEquals(weight, person.getWeight());
    }
    public void testGetHeight(){
        float height=2;
        person.setHeight(height);
        Assert.assertEquals(height, person.getHeight(), 0.02);

        int height1 = 30;
        person.setHeight (height1);
        Assert.assertNotEquals(height, person.getHeight());
    }
    //TODO: create unit test for getBodyMassIndex method
    public void testCalculateBMI() {
        //Test with invalid weight and valid height
        int weight = 150;
        int height = 2;
        person.setWeight(weight);
        person.setHeight(height);
        String errorMessage = "Weight cannot be great 130 KG";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with valid weight and invalid height
        weight = 100;
        height = 4;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height cannot be great 2.5 meters";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = 0 and weight valid number within max range
        height = 0;
        weight = 90;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = 0 and weight number out of range
        height = 0;
        weight = 160;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with weight = 0 and height valid number within max range
        height = 1;
        weight = 0;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with weight = 0 and height number out of range
        height = 5;
        weight = 0;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = 0 and weight valid number within max range
        height = 0;
        weight = 90;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = 0 and weight = 0
        height = 0;
        weight = 0;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = 0 and weight = 0
        height = 0;
        weight = 90;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = negative and weight number out of range
        height = -5;
        weight = 160;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = negative and weight valid number within max range
        height = -120;
        weight = 90;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = negative and weight number out of range
        height = -120;
        weight = 190;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());

        //Test with height = negative and weight = negative
        height = -8;
        weight = -90;
        person.setWeight(weight);
        person.setHeight(height);
        errorMessage = "Height/Weight cannot be zero";
        Assert.assertEquals(errorMessage, person.calculateBodyMass());


    }


}
