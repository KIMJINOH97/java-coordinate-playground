package location;

import java.util.*;

public class Triangle implements Calculator{

    List<Location> locations = new ArrayList<>();

    static final int TRIANGLE_SIZE = 3;

    public Triangle(){
    }

    public Triangle(List<Location> locations) {
        if (!validateTriangle(locations)){
            throw new IllegalArgumentException("");
        }
        this.locations = locations;
    }

    public static boolean validateTriangle(List<Location> locations) {
        Set<Double> slopes = new HashSet<>();
        for (int i=0; i<TRIANGLE_SIZE-1; i++) {
            Location location = locations.get(i);
            slopes.add(location.slope(locations.get(i+1)));
        }
        slopes.add(locations.get(0).slope(locations.get(2)));

        if (slopes.size() == TRIANGLE_SIZE){
            return true;
        }

        return false;
    }

    @Override
    public double calculate() {
        LineUtils lineUtils = new LineUtils(locations);
        List<Double> allLine = lineUtils.getAllLine();
        double sumOfLine = allLine.stream().mapToDouble(Double::new).sum();

        sumOfLine /= 2;

        double multipleOfEachLineDiffer = 1;

        for (Double lineLength : allLine) {
            multipleOfEachLineDiffer *= (sumOfLine - lineLength);
        }

        return Math.sqrt(sumOfLine * multipleOfEachLineDiffer);
    }
}
