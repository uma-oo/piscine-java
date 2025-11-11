
public class Templar extends Character implements Healer, Tank {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException{
        if (this.getCurrentHealth() ==0 )  {
            throw new DeadCharacterException(this);
        }

        int count = 1;

        while (character.getCurrentHealth() < character.getMaxHealth() && count <= this.healCapacity) {
            character.setCurrentHealth(character.getCurrentHealth() + 1);
            count += 1;
        }
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP. He has the weapon %s",
                    this.getName(), this.getShield(), this.getHealCapacity(), this.getWeapon().toString());
        }

        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. He has the weapon %s",
                this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield(), this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (this.getCurrentHealth() ==0) {
            throw new DeadCharacterException(this); 
        }
        int count = 1;
        while (this.getCurrentHealth() > 0 && count <= (damage - this.shield)) {
            this.setCurrentHealth(getCurrentHealth() - 1);
            count += 1;
        }
    }

    @Override
    public void attack(Character other) throws DeadCharacterException {
         if (this.getCurrentHealth() ==0) {
            throw new DeadCharacterException(this); 
        }
        this.heal(this);
        if (this.getWeapon().getDamage() == 0) {
            other.takeDamage(6);
        } else {
            other.takeDamage(this.getWeapon().getDamage());
        }
    }

}