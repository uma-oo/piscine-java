
public class Monster extends Character {

   public Monster(String name, int maxHealth, Weapon weapon) {
      super(name, maxHealth, weapon);
   }

   @Override
   public String toString() {
      if (this.getCurrentHealth() == 0) {
         return String.format("%s is a monster and is dead. He has the weapon %s", this.getName(),
               this.getWeapon().toString());
      }
      return String.format("%s is a monster with %d HP. He has the weapon %s", this.getName(), this.getCurrentHealth(),
            this.getWeapon().toString());
   }

   @Override
   public void takeDamage(int damage) throws DeadCharacterException {
      if (this.getCurrentHealth() == 0) {
         throw new DeadCharacterException(this);
      }
      int count = 1;
      while (this.getCurrentHealth() > 0 && count <= Math.floor(damage * 0.8)) {
         this.setCurrentHealth(getCurrentHealth() - 1);
         count += 1;
      }
   }

   @Override
   public void attack(Character other) throws DeadCharacterException {
      if (this.getCurrentHealth() == 0) {
         throw new DeadCharacterException(this);
      }
      if (this.getWeapon().getDamage() == 0) {
         other.takeDamage(7);
      } else {
         other.takeDamage(this.getWeapon().getDamage());
      }
   }

}
