public class Warlock extends Character {
    Warlock(String name){
        super(name);
    } 
    
    public void Doom(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Doom (Damage - 35)");
        int damagePoints = 35;
        damageTarget(enemyCharacter, damagePoints);
        
    }
    public void  Desire(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Desire (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void DoomGuy(Character warlockCharacter, int healthPoints, int manaPoints){
        System.out.println(super.characterName + " recover from the Damage");
        Add(warlockCharacter, healthPoints, manaPoints);
    }
    public void Add(Character warlockCharacter, int healthPoints,int manaPoints){
        warlockCharacter.healthPoints += healthPoints;
        warlockCharacter.manaPoints += manaPoints;
    }
    public void Status(int healthStatus, int manaStatus){
        System.out.println(super.characterName +" Hp = "+healthStatus+ " Mana = "+manaStatus);
    }
}  