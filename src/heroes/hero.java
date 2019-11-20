package heroes;

public abstract class hero {
    protected String name;
    protected int hp;
    protected int mana;

    public hero(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                '}';
    }

    public abstract void firePrimary();
    public abstract void fireSecondary();
    public abstract void recieveHit();


}
