import java.util.List;

public abstract class AbstractFigure implements Figure{

    private final List<Point> points;

    public AbstractFigure(List<Point> points){

        if (points.size() != size()){
            throw new IllegalArgumentException("점의 개수를 맞춰주세요");
        }

        this.points = points;

    }

    public List<Point> getPoints() {
        return points;
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

}
