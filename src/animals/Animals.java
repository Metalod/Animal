package animals;

public class Animals {
    public static void main(String[] args) {
        Dog dog1 = new Dog ("male", 4);
        Dog dog2 = new Dog ("female", 2);
        Bear bear1 = new Bear ("Female", 6);
        Cat cat1 = new Cat ("Female", 3);
        Cat cat2 = new Cat ("Female", 8);
        
        
        dog1.printInfo();
        dog2.printInfo();
        bear1.printInfo();
        cat1.printInfo();
        cat2.printInfo();
    }
    
}
