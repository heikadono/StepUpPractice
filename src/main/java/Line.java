//6.3 Ломаная линия
public class Line {

    Point startPoint;
    Point endPoint;

    public Line (Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getLength(){
        return Math.sqrt((this.startPoint.coorX - this.endPoint.coorX) * (this.startPoint.coorX - this.endPoint.coorX)
                + (this.startPoint.coorY - this.endPoint.coorY) * (this.startPoint.coorY - this.endPoint.coorY));
    }

    @Override
    public String toString() {
        return "Линия от {X" +
                 startPoint.coorX + ";Y" + startPoint.coorY +
                "} до {X" + endPoint.coorX + ";Y" + endPoint.coorY + '}';

    }
}
