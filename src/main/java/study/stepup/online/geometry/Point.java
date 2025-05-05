package study.stepup.online.geometry;

import java.util.Objects;

//6.3 Ломаная линия
public class Point implements Cloneable {
    public int coorX;
    public int coorY;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return coorX == point.coorX && coorY == point.coorY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coorX, coorY);
    }

    @Override
    public Point clone() {
        Point point = new Point();
        point.coorX = this.coorX;
        point.coorY = this.coorY;
        return point;
    }
}
