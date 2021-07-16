package location;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LineUtils {

    private List<Location> locations = new ArrayList<>();
    private List<Double> allLine = new ArrayList<>();
    private Stack<Location> combi = new Stack<>();
    int[] check;

    public LineUtils(List<Location> locations){
        this.locations = locations;
        this.check = new int[locations.size()];
        track(0);
    }

    public List<Double> getAllLine() {
        return allLine;
    }

    public void track(int start){
        if(combi.size() == 2){
            double length = combi.get(0).length(combi.get(1));
            allLine.add(length);
            return ;
        }

        for(int i=start; i<locations.size(); i++){
            if(check[i] == 0){
                Location loc = locations.get(i);
                check[i] = 1;
                combi.add(loc);
                track(i+1);
                combi.pop();
                check[i] = 0;
            }
        }
    }

}
