package study.stepup.online.geometry;

import study.stepup.online.geometry.interfaces.Measurable;

import java.util.List;

//6.3 Ломаная линия
public class Line implements Measurable {

    public Point startPoint;
    public Point endPoint;

    public Line (Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
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
