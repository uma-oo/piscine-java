





public class Sorcerer extends Character implements Healer {

    private final int healCapacity; 


    public  Sorcerer(String name , int maxHealth , int healCapacity , Weapon  weapon) {
       super(name , maxHealth, weapon); 
       this.healCapacity= healCapacity; 
    }


    @Override 
    public int getHealCapacity() {
        return this.healCapacity; 
    }

    @Override 
    public void heal(Character character) {
        int count = 1; 
        while (character.getCurrentHealth() < character.getMaxHealth() && count <= this.healCapacity) {
            character.setCurrentHealth(character.getCurrentHealth()+1); 
            count +=1; 
        }
    }


    @Override 
    public String toString() {
        if (this.getCurrentHealth()==0 ){
        return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s", this.getName(), this.getHealCapacity(), this.getWeapon().toString()); 
     } 
     return  String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s", this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getWeapon().toString()); 
    }




   @Override 
     public void takeDamage(int damage) {
       int count = 1 ; 
        while (this.getCurrentHealth()>0 && count<=damage){
          this.setCurrentHealth(getCurrentHealth()-1);
          count +=1; 
        }
    }  

    @Override 
   public void attack(Character  other) {
      this.heal(this);
      if (this.getWeapon().getDamage() == 0) {
          other.takeDamage(10); 
      } else {
        other.takeDamage(this.getWeapon().getDamage());
      }
   } 

}



