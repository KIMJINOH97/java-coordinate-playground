package location;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = InputView.start();
        System.out.println(Math.round(calculator.calculate() * 10)/10.0);
//        String str = "(배)귤,바나나,딸기,수박";
//        String[] results = str.split("\\(");
//        System.out.println(results[1]);
    }

}
