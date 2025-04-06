import java.util.ArrayList;
import java.util.List;

//6.3 Ломаная линия
public class PolyLine {
    List<Point> points = new ArrayList<>();
    List<Line> lines = new ArrayList<>();

    public PolyLine ( Point point1, Point point2, Point point3, Point point4){
       points.add(point1);
       points.add(point2);
       points.add(point3);
       points.add(point4);
    }

    public PolyLine (){

    }

    public List<Line> getLines (){
        lines.clear();
        for (int i=0; i<points.size()-1; i++){
            Line line = new Line (points.get(i), points.get(i+1));
            lines.add(line);

        }
        return lines;
    }
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
