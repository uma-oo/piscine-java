import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private Weapon weapon;

    private static List<Character> allCharacters = new ArrayList<Character>();

    public String getName() {
        return this.name;
    }
    

    public Weapon getWeapon() {
        return this.weapon; 
    }


    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    protected void setCurrentHealth(int newCurrentHealth) {
        this.currentHealth = newCurrentHealth;
    }

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = this.maxHealth;
        this.weapon = weapon;
        allCharacters.add(this);
    }

    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s : KO", this.name);
        }
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);

    }

    public abstract void takeDamage(int damage);

    public abstract void attack(Character character);

    public static String printStatus() {
        String result = new String();
        result += "------------------------------------------\n";
        if (allCharacters.size() == 0) {
            result += "Nobody's fighting right now !\n";
        } else {
            result += "Characters currently fighting :\n";
            for (Character character : allCharacters) {
                result += " - ";
                result += character.toString();
                result += "\n";
            }
        }

        result += "------------------------------------------\n";

        return result;

    }

    public static Character fight(Character first, Character second) {

        Character currentAttacker = first;

        while (first.currentHealth != 0 || second.currentHealth != 0) {
            if (first.currentHealth == 0) {
                return second;
            }

            if (second.currentHealth == 0) {
                return first;
            }

            Character toAtack = currentAttacker == first ? second : first;
            currentAttacker.attack(toAtack);
            currentAttacker = toAtack;

        }
        return currentAttacker;
    }

}