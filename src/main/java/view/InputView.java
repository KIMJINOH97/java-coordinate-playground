package view;

import model.Figure;
import model.FigureFactory;
import model.Point;
import model.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {

    private static final String INVAILD_ARGUMENT = "입력하신 것이 올바르지 않습니다.";
    
    public static Figure inputPoints(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        validateInput(input);
        List<Point> points = strToPoints(input);
        return FigureFactory.create(points);
    }

    private static List<Point> strToPoints(String input) {
        List<Point> points = new ArrayList<>();

        String trim = input.trim();
        String[] pointValues = trim.split("-");
        for (String pointValue : pointValues) {
            String[] point = removeBracketAndComma(pointValue);
            points.add(Point.of(Integer.parseInt(point[0]), Integer.parseInt(point[1])));
        }
        return points;
    }

    public static String[] removeBracketAndComma(String value) {
        return value.replaceAll("\\(|\\)", "").split(",");
    }

    private static void validateInput(String nextLine) {
        Pattern pattern = Pattern.compile("(\\(\\d+,\\d+\\))(-\\(\\d+,\\d+\\)){0,3}");
        Matcher matcher = pattern.matcher(nextLine);
        if (!matcher.matches()){
            throw new IllegalArgumentException(INVAILD_ARGUMENT);
        }
    }
}
