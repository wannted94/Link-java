package src;

public class Program {
    public static void main(String[] args) {
        Dog max = new Dog();
        max.size=10;
        max.bark(5);
        Person alex = new Person("Alexandru", 20 ,175,10);

        System.out.println(alex.getName()+ " are " +alex.getAge() + " ani");
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getStamina());
        System.out.println(alex.getName()+ " are energia " +alex.getStamina() );
        alex.sleep();
        System.out.println(alex.getName()+ " are energia " +alex.getStamina() );

        if (alex.isMajor()){
            System.out.println(alex.getName() + " drinks beer ");
        }
    }
}
