package heroes;

public class mage extends hero{

    public mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -=15;
    }

    @Override
    public void fireSecondary() {
        mana -=40;
    }

    @Override
    public void recieveHit() {
        hp -=30;
    }
}
