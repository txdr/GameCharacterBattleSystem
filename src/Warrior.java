public class Warrior extends GameCharacter {

    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(GameCharacter target) {
        if (!isAlive()) {
            throw new IllegalStateException(getName() + " cannot attack because they are dead.");
        }
        if (!target.isAlive()) {
            throw new IllegalStateException(target.getName() + " is already defeated.");
        }
        System.out.println(getName() + " hits " + target.getName() + " with an axe!");
        target.takeDamage(getAttackPower());
    }
}
