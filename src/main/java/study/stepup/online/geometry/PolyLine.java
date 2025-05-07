package study.stepup.online.geometry;

import study.stepup.online.geometry.Line;
import study.stepup.online.geometry.Point;
import study.stepup.online.geometry.interfaces.Measurable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//6.3 Ломаная линия
public class PolyLine implements Measurable {
    public List<Point> points = new ArrayList<>();

    public PolyLine (List<Point> points){

        this.points = points;
    }
    public PolyLine (){

    }

    @Override
    public PolyLine clone()  {
        PolyLine polyLine = new PolyLine();
        for (Point p : points){
        polyLine.points.add(p.clone());
         }
        return polyLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Objects.equals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public double getLength (){
        double totalLength =0;
        for (int i=0; i<points.size()-1; i++){
            Line line = new Line (points.get(i), points.get(i+1));
            totalLength+=line.getLength();
        }
        return totalLength;
    }
    @Override
    public String toString() {
        return "Линия " + points;
    }
}
