package oop;

public class Square extends Figure {


    double calcSquareArea(double squareSide, double areaOfSquare) {
        return areaOfSquare = Math.pow(squareSide, 2);


    }
    double calcPerimetrOfSquare(double squareSide, double perimetrOfSquare) {
        return perimetrOfSquare = squareSide * 4;
    }
}
