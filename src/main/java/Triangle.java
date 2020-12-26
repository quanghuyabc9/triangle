public class Triangle {
    private Point a, b, c;

    public static final String INVALID_INPUT = "InvalidInput";
    public static final String NOT_A_TRIANGLE = "Not a Triangle";
    public static final String EQUILATERAL_TRIANGLE = "Equilateral Triangle";
    public static final String RIGHT_ANGLED_TRIANGLE = "Right-angled Triangle";
    public static final String SCALENE_TRIANGLE = "Scalene Triangle";
    public static final String ISOSCELES_TRIANGLE = "Isosceles Triangle";

    public static final double epsilon = 0.001;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getTypeOfTriangle() {
        String res = null;
        //a = ab, b = ac, c = bc
        double ab = a.distance(b), ac = a.distance(c), bc = b.distance(c);

        if(ab<=0 || ac<=0 || bc<=0)
            res = INVALID_INPUT;
        else if(ab>=(ac+bc) || bc>=(ac+ab) || ac>=(ab+bc))
            res = NOT_A_TRIANGLE;
        else if(Math.abs(ab-ac) <= epsilon && Math.abs(ac - bc) <= epsilon)
            res = EQUILATERAL_TRIANGLE;
        else if(Math.abs(ab*ab+ac*ac-bc*bc) <= epsilon ||
                Math.abs(ab*ab+bc*bc-ac*ac) <= epsilon ||
                Math.abs(bc*bc+ac*ac-ab*ab) <= epsilon) {
            res = RIGHT_ANGLED_TRIANGLE;
        }
        else if(Math.abs(ab-ac) > epsilon &&
                Math.abs(ac-bc) > epsilon &&
                Math.abs(bc-ab) > epsilon)
            res = SCALENE_TRIANGLE;
        else if(Math.abs(ab-ac) <= epsilon ||
                Math.abs(bc-ab) <= epsilon ||
                Math.abs(bc-ac) <= epsilon)
            res = ISOSCELES_TRIANGLE;
        return res;
    }

    public double perimeter() {
        double ab = a.distance(b), ac = a.distance(c), bc = b.distance(c);
        String type = getTypeOfTriangle();
        if(type.equals(INVALID_INPUT) || type.equals(NOT_A_TRIANGLE))
            return 0;
        return ab + ac + bc;
    }
}
