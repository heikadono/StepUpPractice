public class Main {
    public static void main(String[] args) {
        //6.2 Линия
        Point point1 = new Point(1,3);
        Point point2 = new Point(5,8);
        Point point3 = new Point(10,11);
        Point point4 = new Point(15,19);


        Line line1 = new Line (point1, point2);
        Line line2 = new Line (point3, point4);
        Line line3 = new Line (line1.endPoint, line2.startPoint);
        //System.out.println(line1);
        //System.out.println(line2);
        System.out.println(line3);
        line3.startPoint.coorX = 3;
        line3.startPoint.coorY = 4;
        line3.endPoint.coorX = 7;
        line3.endPoint.coorY = 8;
        System.out.println(line3);
        //System.out.println(line1);
        //System.out.println(line2);
        System.out.println(line1.getLength() + line2.getLength() + line3.getLength());





    }
}
