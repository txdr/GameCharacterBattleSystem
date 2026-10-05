public class GameCharacter {

        private String name;
        // I implemented this on my own to make a more consistent graphic compared to other games.
        private int originalHealth;
        private int health;
        private int attackPower;

        public GameCharacter(String name, int health, int attackPower) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("The name for the GameCharacter cannot be blank.");
            }
            if (health <= 0) {
                throw new IllegalArgumentException("Health for the GameCharacter must be more than 0.");
            }
            if (attackPower <= 0) {
                throw new IllegalArgumentException("Attack power for the GameCharacter must be more than 0.");
            }

            this.name = name;
            this.health = health;
            this.originalHealth = health;
            this.attackPower = attackPower;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public int getAttackPower() {
            return attackPower;
        }

        public boolean isAlive() {
            return health > 0;
        }

        public void attack(GameCharacter target) {
            if (!isAlive()) {
                throw new IllegalArgumentException(name + " cannot attack because they are not alive.");
            }
            if (!target.isAlive()) {
                throw new IllegalArgumentException(target.getName() + " cannot be attacked because they are not alive.");
            }
            target.takeDamage(attackPower);
        }

        public void takeDamage(int damageAmount) {
            if (damageAmount < 0) {
                throw new IllegalArgumentException("The damage amount in takeDamage cannot be negative.");
            }
            health -= damageAmount;
            if (health < 0) {
                health = 0;
            }
            System.out.println(name + " takes " + damageAmount + " damage.");
            System.out.println(name + " now has " + health + "/" + originalHealth + " health.");
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Health: " + health + "/" + originalHealth);
            System.out.println("Attack Power: " + attackPower);
        }

}
