package src;

public class vetprogram {
    public static void main(String[] args) {
        bear winnie= new bear();
        Lion simba= new Lion();
        chicken kfc = new chicken();
        vet marcel =new vet();

        marcel.makeShot(simba);
        marcel.makeShot(kfc);
        marcel.makeShot(winnie);
    }
}
