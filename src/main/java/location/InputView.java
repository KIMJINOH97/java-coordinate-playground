package location;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static Calculator start() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputStr = input.split("-");

        List<Location> locations = getLocations(inputStr);


        return CalculatorFactory.create(locations);
    }

    public static List<Location> getLocations(String[] inputStr) {
        List<Location> locations = new ArrayList<>();
        for(int i = 0; i< inputStr.length; i++){
            String[] coords = inputStr[i].split("\\(|,|\\)");
            System.out.println(coords[0]);
            locations.add(Location.of(Integer.parseInt(coords[1]), Integer.parseInt(coords[2])));
        }
        return locations;
    }
}
