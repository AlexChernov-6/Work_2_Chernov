//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        long inputGold = 200L;
        byte inputSilver = 39;
        short inputWood = 2005;
        long inputHealth = 97L;
        boolean inputHasHelper = true;

        Resources resources = new Resources(inputGold, inputSilver, inputWood,
                inputHealth, inputHasHelper);

        int characterGold = (int) resources.gold;
        int characterSilver = resources.silver * 100;
        double characterWood = resources.wood;
        byte characterHealth = (byte) resources.health;
        byte characterHelpersNumber = !resources.hasHelper ? (byte) 0 : (byte) 1;

        Character character = new Character(characterGold, characterSilver, characterWood,
                characterHealth, characterHelpersNumber);

        System.out.println("Персонаж создан успешно!");
        System.out.println("Количество золота: " + character.gold);
        System.out.println("Количество серебра: " + character.silver);
        System.out.println("Количество дерева: " + character.wood);
        System.out.println("Здоровье: " + character.health);
        System.out.println("Количество помощников: " + character.helpersNumber);
        System.out.println("Навстречу приключениям!");
    }
}

class Resources {
    long gold;
    byte silver;
    short wood;
    long health;
    boolean hasHelper;

    public Resources(long inputGold, byte inputSilver, short inputWood,
                     long inputHealth, boolean inputHasHalper) {
        gold = inputGold;
        silver = inputSilver;
        wood = inputWood;
        health = inputHealth;
        hasHelper = inputHasHalper;
    }
}

class Character {
    int gold;
    int silver;
    double wood;
    byte health;
    byte helpersNumber;

    public Character(int characterGold, int characterSilver, double characterWood,
                     byte characterHealth, byte characterHelpersNumber) {
        gold = characterGold;
        silver = characterSilver;
        wood = characterWood;
        health = characterHealth;
        helpersNumber = characterHelpersNumber;
    }
}