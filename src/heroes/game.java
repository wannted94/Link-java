package heroes;

public class game {
    public static void main(String[] args) {
        goku hero1 = new goku("Kakarot",400,200);
        mage hero2 = new mage("Merlin", 200,800);
        superman hero3 = new superman("Clark", 500,300);

        hero1.firePrimary();
        hero2.recieveHit();
        hero3.recieveHit();

        hero2.fireSecondary();
        hero1.recieveHit();
        hero3.recieveHit();
        hero3.recieveHit();

        hero3.firePrimary();
        hero2.recieveHit();
        hero1.recieveHit();

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
    }
}
