/*
 * Created on 28 Jul, 2022
 * My First Unit Testing
 */

 package src.com.bootcampexercise.MyPack;
 import junit.framework.TestCase;
 import org.junit.Assert;
 import src.com.bootcampexercise.Module9.Person;

/**
 * @ Vignesh Krishnan
 */

public class AreaTest extends TestCase {
  private UnitTestforArea unit;

       //Create Setup
   protected void setUp() throws Exception {
   super.setUp();

       //Initialize variables to be used here
    unit = new UnitTestforArea();
    }

    // create teardown
   protected void tearDown() throws Exception {
   unit = null;
   super.tearDown();
 }
    //create unit tests for getters and setters

    public void testGetSide() {
    int side = 54;
    unit.setSide(side);
    Assert.assertEquals(side, unit.getSide());
 }

    //create unit test for Area of Square method
    public void testareaOfSquare() {


  //Test with invalid side
  int side = -8;
  unit.setSide(side);
  String errorMessage = "Side cannot be zero";
  Assert.assertEquals(errorMessage, unit.areaOfSquare());
 }
}
