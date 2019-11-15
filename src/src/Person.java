package src;

public class Person {
    String name;
    int age;
    int height;
    int stamina;

    public void run() {
        stamina--;
    }

    public void sleep() {
        stamina += 12;
    }

    public boolean isMajor() {
        return age >= 18;
//        if (age >= 18) {
//            return true;
//        }
//            return false;
    }

    public String getName() {
        return name;
    }
}
