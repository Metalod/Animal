package animals;

public class Dog implements Animal {

    String anim="Dog";
    String gen;
    int ag;
    
    
    Dog (String gender, int age) {
        
        gen = gender;
        ag = age;
    }
    
    @Override
    public String animal() {
        return anim;
    }

    @Override
    public String gender() {
        String gend = gen;
        return gend;
    }

    @Override
    public int age() {
        int a = ag;
        return a;
    }
    
    void printInfo() {
        System.out.println("Animal:" + anim + " Gender:" + gen + " Age:" + ag);
    }
}
