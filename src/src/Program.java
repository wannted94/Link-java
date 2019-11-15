package src;

public class Program {
    public static void main(String[] args) {
        Dog max = new Dog();
        max.size=10;
        max.bark();
        Person alex = new Person();
        alex.name = "Alexandru";
        alex.age = 15;
        alex.height = 175;
        alex.age ++;
        alex.stamina = 10;
        System.out.println(alex.name+ " are " +alex.age + " ani");
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.stamina);
        System.out.println(alex.name+ " are energia " +alex.stamina );
        alex.sleep();
        System.out.println(alex.name+ " are energia " +alex.stamina );

        if (alex.isMajor()){
            System.out.println(alex.name + " drinks beer ");
        }
    }
}
