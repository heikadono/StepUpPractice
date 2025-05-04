import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //6.3 Ломаная линия
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8,9);
        List<Point> points = new ArrayList<>(Arrays.asList(point1, point2, point3, point4));
        List<Line> lines = new ArrayList<>();
        double linesArrayLenght = 0;

        PolyLine polyLine = new PolyLine(points);


        List<Line> lines = polyLine.getLines();

        System.out.println(polyLine);
        System.out.println(polyLine.getLength());
        System.out.println(polyLine.getLines());


        for (int i=0; i<lines.size(); i++) {
            linesArrayLenght+= lines.get(i).getLength();
        }

        System.out.println("Результат сравнения длины ломаной линии: " + polyLine.getLength()+" и длины массива линий: "
                +linesArrayLenght + " - " + (polyLine.getLength()==linesArrayLenght));

        point2.coorX = 12;
        System.out.println(point2);
        System.out.println(polyLine);
        System.out.println(polyLine.getLines());










    }
}
