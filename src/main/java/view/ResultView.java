package view;

import model.Figure;

public class ResultView {
    public static void printArea(Figure figure) {
        System.out.println(figure.name() + "의 넓이는: " + figure.calculate());
    }
}
