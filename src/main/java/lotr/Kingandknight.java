package lotr;
import java.util.Random;

public abstract class Kingandknight extends Character {
    // protected int power;
    // protected int hp;

    protected static Random random = new Random(); // Ensure Random is available to subclasses

    public Kingandknight(int power, int hp) {
        super(power, hp);
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.power);
        c.setHp(c.getHp() - damage);
        System.out.println("Knight dealt " + damage + " damage to the opponent.");
    }
}
