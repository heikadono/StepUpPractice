//6.3 Ломаная линия
public class Point {
    int coorX;
    int coorY;

    public Point (){

    }
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
