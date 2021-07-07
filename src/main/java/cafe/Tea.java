package cafe;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("차 티백을 담급니다.");
    }

    @Override
    void addSomething(){
        System.out.println("레몬을 추가합니다.");
    }
}
