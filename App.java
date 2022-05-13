public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
       
        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         * 
         * 
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         * 
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         * 
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         * 
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        /**
         * Example Sequence
         * Wizard Merlin = new Wizard("Merlin");
         * Warlock Saruman = new Warlock("Saruman");
         * 
         * Merlin.firestorm(Saruman); // Saruman HP Deducted
         * Warlock.recover() // Saruman HP and MP increases
         */

        Wizard Sam = new Wizard("Sam");
        Warlock Sammy = new Warlock("Sammy");
        Character ch = new Character();
        
        System.out.println("Wizard");
        ch.displayCharName("Sam");

        System.out.println("\nWarlock");
        ch.displayCharName("Sammy");
        
        System.out.println("\n");
        Sam.Execute(Sammy);
        Sammy.Status(60, 200);
        Sam.Status(100, 160);

        Sammy.Doom(Sam);
        Sammy.Status(60, 165);
        Sam.Status(60, 110);
        Sammy.DoomGuy(Sammy, 10, 60);
        Sammy.Status(90, 195);
        Sam.Status(70, 190);

        Sam.Icon(Sammy);
        Sammy.Status(95, 180);
        Sam.Status(55, 140);
        Sammy.Desire(Sam);
        Sammy.Status(30, 90);
        Sam.Status(5, 80);
        Sam.Execute(Sammy);
        Sammy.Status(10, 145);
        Sam.Status(0, 80);

        System.out.println("The winner is Wizard Sam");
        System.out.println("Wizard Sam will level up!!");
        System.out.println("Level 1 to Level =  "+ch.levelUp(1));


    }
}