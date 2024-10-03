package lotr;

// import lotr.lotr.Character;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            c.setHp(0);
            System.out.println("Elf killed the weaker character.");
        } else {
            c.power -= 1;
            System.out.println("Elf decreased opponent's power by 1.");
        }
    }
}