package lotr;
// import java.util.Random;

// import lotr.lotr.Character;
public class Knight extends Kingandknight {
    // private static Random random = new Random();

    public Knight() {
        super(2 + random.nextInt(11), 2 + random.nextInt(11));
    }

    // @Override
    // public void kick(Character c) {
    //     int damage = random.nextInt(this.power);
    //     c.setHp(c.getHp() - damage);
    //     System.out.println("Knight dealt " + damage + " damage to the opponent.");
    // }
}