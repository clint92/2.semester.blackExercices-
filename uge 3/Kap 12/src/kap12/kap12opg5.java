package kap12;
//import kap12.IllegalTriangleException;
/**
 * Created by clint on 19-09-2016.
 */
public class kap12opg5 {
    double side1;
    double side2;
    double side3;

    public kap12opg5(double side1, double side2, double side3) throws IllegalTriangleException {
// Implement it
        setSides(side1, side2, side3);
        System.out.println(this.side1 + " " + this.side2 + " " + this.side3);
    }

    public void setSides(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException("invalid eee");
        }
    }
}
