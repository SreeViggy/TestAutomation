/*
* Created on 28 Jul, 2022
* My First Unit Testing
 */

package src.com.bootcampexercise.MyPack;

import org.junit.Assert;

/**
 * @ Vignesh Krishnan
 */

public class UnitTestforArea {

    private float side;

    public float getSide() {
        return this.side;

    }

    public void setSide(int side) {
        this.side = side;

    }

    public String areaOfSquare() {
        if (this.side <= 0) // To check if the side is zero or negative
             return "Side cannot be zero";
            return ""+(this.side * this.side);

    }

}




