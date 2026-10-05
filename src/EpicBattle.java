public class EpicBattle {

    public static void main(String[] args) {
        System.out.println("Welcome to the battlefield... The game is about to start.");
        printDivider();

        try {
            Archer archer = new Archer("John", 100, 10);
            Mage mage = new Mage("Jane", 75, 12);
            Warrior warrior = new Warrior("Brian", 150, 5);

            System.out.println("Starting characters: ");
            printDivider();
            System.out.println("Archer's info: ");
            archer.displayInfo();
            printDivider();
            System.out.println("Mage's info: ");
            mage.displayInfo();
            printDivider();
            System.out.println("Warrior's info: ");
            warrior.displayInfo();
            printDivider();

            // Round one
            System.out.println("Let the battle begin!");
            archer.attack(mage);
            System.out.println();
            mage.attack(archer);
            System.out.println();
            warrior.attack(archer);
            System.out.println();
            archer.attack(warrior);
            System.out.println();

            System.out.println("Updated character information: ");

            System.out.println("The Archer: ");
            archer.displayInfo();
            printDivider();

            System.out.println("The Mage: ");
            mage.displayInfo();
            printDivider();

            System.out.println("The Warrior: ");
            warrior.displayInfo();
            printDivider();

            System.out.println(mage.getName() + " tries to cheat by healing himself.");
            mage.takeDamage(-20);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Invalid action error: " + e.getMessage());
        }

        printDivider();

        System.out.println("Testing invalid character creation:");
        try {
            Warrior noName = new Warrior("", 100, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data error: " + e.getMessage());
        }

        try {
            Mage noName2 = new Mage("Mage", 0, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data error: " + e.getMessage());
        }
    }

    public static void printDivider() {
        System.out.println("-------------------------------------------");
    }

}
