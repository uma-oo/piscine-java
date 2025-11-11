





public class Sorcerer extends Character implements Healer {

    private final int healCapacity; 


    public  Sorcerer(String name , int maxHealth , int healCapacity) {
       super(name , maxHealth); 
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
        return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.getHealCapacity()); 
     } 
     return  String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), this.getHealCapacity()); 
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
      other.takeDamage(10); 
   } 

}



