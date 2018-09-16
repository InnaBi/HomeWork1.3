package oop;

public class Quadrangle extends Figure {

    double calcQuadrangleArea(double quadrangleSide1, double quadrangleSide2, double quadrangleDiagonal1, double quadrangleDiagonal2, double angleBetweenDiagonals, double areaOfQuadrangle) {
        quadrangleDiagonal1 = Math.sqrt(quadrangleSide1 * + quadrangleSide2 * - 2 * quadrangleSide1 * quadrangleSide2 * Math.cos(Math.PI * angleBetweenDiagonals / 180));
        quadrangleDiagonal2 = Math.sqrt(quadrangleSide1 * quadrangleSide1 + quadrangleSide2 * quadrangleSide2 + 2 * quadrangleSide1 * quadrangleSide2 * Math.cos(Math.PI * angleBetweenDiagonals / 180));
        return areaOfQuadrangle = ((quadrangleDiagonal1 * quadrangleDiagonal2) / 2) * Math.sin(Math.PI * angleBetweenDiagonals / 180);
    }
    double perimetrQ(double quadrangleSide1, double quadrangleSide2, double quadrangleSide3, double quadrangleSide4, double perimetrOfQuadrangle) {
        return perimetrOfQuadrangle = quadrangleSide1 + quadrangleSide2 + quadrangleSide3 + quadrangleSide4;

    }

}
