package lotr;
// import java.util.Random;

// import lotr.lotr.Character;
public class King extends Kingandknight {
    // private static Random random = new Random();

    public King() {
        super(5 + random.nextInt(11), 5 + random.nextInt(11));
        // this.power = 5 + random.nextInt(11);
        // this.hp = 5 + random.nextInt(11);
    }

    // @Override
    // public void kick(Character c) {
    //     int damage = random.nextInt(this.power);
    //     c.setHp(c.getHp() - damage);
    //     System.out.println("King dealt " + damage + " damage to the opponent.");
    // }
}