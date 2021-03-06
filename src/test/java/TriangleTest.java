import org.apache.commons.math3.util.Precision;
import org.junit.Test;
import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void TC2_getTypeOfTriangle_InputThreePoints_ReturnInvalidInput_1() {
        Point a = new Point(0, 0), b = new Point(0, 0), c = new Point(1, 0);
        Triangle triangle = new Triangle(a, b, c);
        String res = triangle.getTypeOfTriangle();
        assertEquals(Triangle.INVALID_INPUT, res);
    }

    @Test
    public void TC3_getTypeOfTriangle_InputThreePoints_ReturnInvalidInput_2() {
        Point a = new Point(0, 0), b = new Point(1, 0), c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.INVALID_INPUT, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC4_getTypeOfTriangle_InputThreePoints_ReturnInvalidInput_3() {
        Point a = new Point(1, 0), b = new Point(0, 0), c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.INVALID_INPUT, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC5_getTypeOfTriangle_InputThreePoints_ReturnNotATriangle_1() {
        Point a = new Point(0, 0), b = new Point(0, 4), c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.NOT_A_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC6_getTypeOfTriangle_InputThreePoints_ReturnNotATriangle_2() {
        Point a = new Point(0, 0), b = new Point(0, 2), c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.NOT_A_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC7_getTypeOfTriangle_InputThreePoints_ReturnNotATriangle_3() {
        Point a = new Point(0, 2), b = new Point(0, 0), c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.NOT_A_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC8_getTypeOfTriangle_InputThreePoints_ReturnEquilateralTriangle() {
        Point a = new Point(-1, 0), b = new Point(1,0), c = new Point(0, Math.sqrt(3));
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.EQUILATERAL_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC9_getTypeOfTriangle_InputThreePoints_ReturnRightAngledTriangle_1() {
        Point a = new Point(0, 0), b = new Point(2, 0), c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.RIGHT_ANGLED_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC10_getTypeOfTriangle_InputThreePoints_ReturnRightAngledTriangle_2() {
        Point a = new Point(2, 0), b = new Point(0, 0), c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.RIGHT_ANGLED_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC11_getTypeOfTriangle_InputThreePoints_ReturnRightAngledTriangle_3() {
        Point a = new Point(2, 0), b = new Point(0, 3), c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.RIGHT_ANGLED_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC12_getTypeOfTriangle_InputThreePoints_ReturnScaleneTriangle() {
        Point a = new Point(2, -2), b = new Point(0, 3), c = new Point(-2, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.SCALENE_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC13_getTypeOfTriangle_InputThreePoints_ReturnIsoscelesTriangle_1() {
        Point a = new Point(0, 0), b = new Point(-2, 3), c = new Point(2, 3);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.ISOSCELES_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC14_getTypeOfTriangle_InputThreePoints_ReturnIsoscelesTriangle_2() {
        Point a = new Point(-2, 3), b = new Point(0, 0), c = new Point(2, 3);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.ISOSCELES_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC15_getTypeOfTriangle_InputThreePoints_ReturnIsoscelesTriangle_3() {
        Point a = new Point(-2, 3), b = new Point(2, 3), c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(Triangle.ISOSCELES_TRIANGLE, triangle.getTypeOfTriangle());
    }

    @Test
    public void TC16_perimeter_InputThreePoints_ReturnZeroForInvalidInput() {
        Point a = new Point(0, 0), b = new Point(0, 0), c = new Point(1, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(0, triangle.perimeter(),0.001);
    }

    @Test
    public void TC17_perimeter_InputThreePoints_ReturnZeroForNotATriangle() {
        Point a = new Point(0, 0), b = new Point(0, 4), c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(0, triangle.perimeter(), 0.001);
    }


    @Test
    public void TC18_perimeter_InputThreePoints_ReturnPerimeter() {
        Point a = new Point(0, 0), b = new Point(0, 3), c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(10.243, Precision.round(triangle.perimeter(),3), 0.001);
    }
}
