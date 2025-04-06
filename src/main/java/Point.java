//6.2 Линия
public class Point {
    int coorX;
    int coorY;

    public Point (int coorX, int coorY){
        this.coorX = coorX;
        this.coorY = coorY;
    }

    @Override
    public String toString() {
        return "{" +
                coorX +
                ";" + coorY +
                '}';
    }
}
