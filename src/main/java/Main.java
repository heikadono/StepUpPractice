import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //8.2 Замкнутая ломаная
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8,9);
        Point point5 = new Point(7,8);
        Point point6 = new Point(1,5);
        List<Point> closedPolyLinePoints = new ArrayList<>(Arrays.asList(point1, point2, point3, point4, point5, point6));
        List<Point> PolyLinePoints = new ArrayList<>(Arrays.asList(point1, point2, point3, point4, point5));

        PolyLine closedPolyLine = new PolyLine(closedPolyLinePoints);
        PolyLine PolyLine = new PolyLine(PolyLinePoints);


        System.out.println(closedPolyLine.getLength());
        System.out.println(PolyLine.getLength());



    }
}
