package lotr;

public abstract class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
