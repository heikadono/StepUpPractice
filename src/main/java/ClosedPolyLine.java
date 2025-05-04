public class ClosedPolyLine extends PolyLine{
    @Override
    public double getLength (){
        double totalLength =0;
        for (int i=0; i<points.size()-1; i++){
            Line line = new Line (points.get(i), points.get(i+1));
            totalLength+=line.getLength();
        }
        return totalLength;
    }
}
