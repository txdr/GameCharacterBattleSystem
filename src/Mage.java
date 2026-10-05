public class Mage extends GameCharacter {

    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(GameCharacter target) {
        if (!isAlive()) {
            throw new IllegalStateException(getName() + " cannot attack because they are dead.");
        }
        if (!target.isAlive()) {
            throw new IllegalStateException(target.getName() + " cannot be attacked because they are dead.");
        }
        target.takeDamage(getAttackPower());
        System.out.println(getName() + " threw a fireball at " + target.getName() + "!");
    }

}
