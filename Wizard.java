public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }

    public void Icon(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Icon (Damage - 50)");
        int damagePoints = 100;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void Execute(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Execute (Damage - 40)");
        int damagePoints = 70;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void Revive(Character wizardCharacter, int manaPoints, int healthPoints){
        System.out.println(super.characterName + " recover from the damage");
        add(wizardCharacter, healthPoints, manaPoints);
    }
    public void Add(Character wizardCharacter, int healthPoints,int manaPoints){
        wizardCharacter.healthPoints += healthPoints;
        wizardCharacter.manaPoints += manaPoints;
    }
    public void Status(int healthStatus, int manaStatus){
        System.out.println(super.characterName +" Hp = "+healthStatus+ " Mana = "+manaStatus);
    }
}