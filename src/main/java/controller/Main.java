package controller;

import model.Figure;
import view.InputView;
import view.ResultView;

public class Main {
    public static void main(String[] args) {
        Figure figure = InputView.inputPoints();
        ResultView.printArea(figure);
    }
}
