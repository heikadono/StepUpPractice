package study.stepup.online.main;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import study.stepup.online.calculations.Fraction;
import study.stepup.online.geometry.*;


import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Point point = new Point(3,4);
        Point point2 = new Point(1,4);
        Point point3 = new Point(2,5);
        Point point4 = new Point(6,8);
        Point point5 = new Point(4,3);
        List<Point> points = new ArrayList<>(Arrays.asList(point, point2, point3, point4, point5));
        PolyLine polyLine = new PolyLine(points);
        System.out.println(polyLine);
        PolyLine polyLine2 = polyLine.clone();
        System.out.println(polyLine2);
        System.out.println("Равенство замкнытых линий : " + polyLine.equals(polyLine2));
        Point point7 = new Point (1,2);
        /*System.out.println(point);
        System.out.println(point2);
        System.out.println("Равенство точек: " + point.equals(point2));
        Point point3 = point.clone();
        System.out.println(point3);
        System.out.println("Равенство точек: " + point.equals(point3)); */
        /*Line line = new Line(point, point2);
        System.out.println(line);
        Line line2 = line.clone();
        System.out.println(line2);
        System.out.println("Равенство линий: " + line.equals(line2));
        Point point4 = new Point (1,2);
        line.endPoint = point4;
        System.out.println("Равенство линий: " + line.equals(line2));*/





      /*  Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(49, 12);
        Fraction fraction3 = new Fraction(3, 2);
        Fraction fraction4 = new Fraction(1, 3);

        List<Double> numbers1 = new ArrayList<>(Arrays.asList((double) 2, fraction1.doubleValue(), 2.3));
        List<Double> numbers2 = new ArrayList<>(Arrays.asList(3.6, fraction2.doubleValue(), (double) 3, fraction3.doubleValue()));
        List<Double> numbers3 = new ArrayList<>(Arrays.asList(fraction4.doubleValue(), (double)1));

        System.out.println(sumAll(numbers1));
        System.out.println(sumAll(numbers2));
        System.out.println(sumAll(numbers3)); */
    }

   /* public static double sumAll (List<Double> numbers) {
        double sum =0;
        for (int i=0; i<numbers.size(); i++){
            System.out.println(sum);
            sum+=numbers.get(i);
        }
        return sum;
    }*/



}
