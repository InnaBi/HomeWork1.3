package oop;

public class Diamond extends Square {

    double calcAreaOfDiamond(double diamondSide, double areaOfDiamond, double angleBetweenSides) {
        return areaOfDiamond = Math.pow(diamondSide, 2) * Math.sin(Math.PI * angleBetweenSides / 180);
    }
    double calcPerimetrOfDiamond(double diamondSide, double perimetrOfDiamond) {
        return perimetrOfDiamond = diamondSide * 4;
    }
}
