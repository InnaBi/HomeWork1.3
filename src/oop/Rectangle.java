package oop;

public class Rectangle extends Figure {

    double calcRectangleArea(double rectangleSide1, double rectangleSide2, double areaOfRectangle) {
        return areaOfRectangle = rectangleSide1 * rectangleSide2;
    }
    double calcRectanglePerimetr(double rectangleSide1, double rectangleSide2, double perimetrOfRectangle) {
        return perimetrOfRectangle = 2 * (rectangleSide1 + rectangleSide2);
    }
}
