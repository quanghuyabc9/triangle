import org.apache.commons.math3.util.Precision;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt((this.x - p.getX())*(this.x - p.getX()) +
                (this.y - p.getY())*(this.y - p.getY()));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
