package cafe;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("필터를 활용해 커피를 내립니다.");
    }

    @Override
    void addSomething(){
        System.out.println("설탕과 우유를 추가합니다.");
    }

    void eat(){
        System.out.println("커피 맛있네");
    }
}
