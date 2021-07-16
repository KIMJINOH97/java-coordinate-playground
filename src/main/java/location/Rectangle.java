package location;

import java.util.*;
import java.util.stream.Collectors;

public class Rectangle {

    private double garo;
    private double sero;

    public Rectangle(){
    }

    public Rectangle(List<Location> locations) {
        if (!validateRectangle(locations)) {
            throw new IllegalArgumentException("사각형이 아닙니다.");
        }
    }

    public boolean validateRectangle(List<Location> locations) {
        Set<Location> set = locations.stream().collect(Collectors.toSet());
        if (set.size() < 4){
            return false;
        }

        LineUtils lineUtils = new LineUtils(locations);
        List<Double> allLine = lineUtils.getAllLine();

        HashMap<Double, Integer> hashMap = new HashMap<>();
        for (Double line : allLine) {
            Integer value = hashMap.get(line);
            if (value == null){
                hashMap.put(line, 1);
                continue;
            }

            hashMap.put(line, value+1);
        }

        // 같은 쌍이 2개 미만 일 때
        for (Double key : hashMap.keySet()) {
            Integer count = hashMap.get(key);
//            System.out.println(count);
            if (count < 2){
//                System.out.println(count);
                return false;
            }
        }

        // 정사각형
        if (hashMap.size() == 2){
            Object[] objects = hashMap.keySet().toArray();
            Arrays.sort(objects);
            garo = (double)objects[0];
            sero = (double)objects[0];
            return true;
        }

        // 직 사각형
        if (hashMap.size() == 3){
            Object[] objects = hashMap.keySet().toArray();
            Arrays.sort(objects);
            garo = (double)objects[0];
            sero = (double)objects[1];
        }

        return true;
    }

    public double size(){
        return garo * sero;
    }

}
