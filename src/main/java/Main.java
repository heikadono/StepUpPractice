public class Main {
    public static void main(String[] args) {
        //6.1 Точка координат
        Point point1 = new Point(1,3);
        Point point2 = new Point(1,3);
        Point point3 = new Point(5,8);
        System.out.print(point1);
        System.out.print(point2);
        System.out.println(point3);
        System.out.println("Сравнение точек 1 и 2: " + (point1==point2));
        System.out.println("Сравнение точек 2 и 3: " + (point2==point3));
        System.out.println("Сравнение точек 3 и 1: " + (point3==point1));
    }
}
