package src;

public class Dog {
    int size;
    public void bark(){
        if (size > 60){
            System.out.println("Woof Woof!!!");
        }
        else if (size > 14){
            System.out.println("RUff Ruff!!");
        }
        else{
            System.out.println("Yip Yip!!");
        }
    }
}
