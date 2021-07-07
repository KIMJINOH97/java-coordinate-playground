package cafe;

public abstract class CaffeineBeverage {
    void prepareRecipe(){
        boil();
        brew();
        pour();
        addSomething();
    }

    void boil(){
        System.out.println("물을 끓입니다.");
    }

    abstract void brew();

    void pour(){
        System.out.println("컵에 붓습니다.");
    }

    abstract void addSomething();
}
