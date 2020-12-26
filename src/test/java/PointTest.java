import org.apache.commons.math3.util.Precision;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void TC1_distance_InputValueOfTwoPoint_ReturnResult() {
        Point a = new Point(2.0, 2.0), b = new Point(-3.0, -3.0);
        double expected = 7.071;
        double actual = Precision.round(a.distance(b), 3);
        assertEquals(expected, actual, 0.001);
    }
}
