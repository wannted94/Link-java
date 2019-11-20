package src;

public class student extends Person {
    public String classGroup;

    public student(String name, int age, int height, int stamina, String classGroup) {
        super(name, age, height, stamina);
        this.classGroup = classGroup;
    }

    @Override
    public String toString() {
        return "student{" +
                "classGroup='" + classGroup + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", stamina=" + stamina +
                '}';
    }

    public void grow(int size) {

    }

    public String getClassGroup() {
        return classGroup;
    }
}
