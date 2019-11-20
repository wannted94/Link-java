package heroes;

public class goku extends hero{

    public goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana-=5;
    }

    @Override
    public void fireSecondary() {
        mana-=40;
    }

    @Override
    public void recieveHit() {
        hp -=1;
        mana +=3;
    }
}
