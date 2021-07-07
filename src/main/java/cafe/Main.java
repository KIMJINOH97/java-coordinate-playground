package cafe;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage caffeine1 = new Coffee();
        CaffeineBeverage caffeine2 = new Tea();

        caffeine1.prepareRecipe();
        ((Coffee) caffeine1).eat(); // 타입을 바꿔줘야함 왜냐하면 CaffeineBeverage 에는 eat()이 없기 때문
        System.out.println();
        caffeine2.prepareRecipe();
    }
}
