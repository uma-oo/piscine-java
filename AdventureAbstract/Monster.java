


public class Monster extends Character {

   public Monster(String name , int maxHealth) {
      super(name, maxHealth); 
   }


   @Override
   public String  toString() {
     if (this.getCurrentHealth()==0 ){
        return String.format("%s is a monster and is dead", this.getName()); 
     } 
     return  String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth()); 
   }

   @Override 
     public void takeDamage(int damage) {
       int count = 1 ; 
        while (this.getCurrentHealth()>0 && count<=Math.floor(damage*0.8)){
          this.setCurrentHealth(getCurrentHealth()-1);
          count +=1; 
        }
    }  

    @Override 
   public void attack(Character  other) {
      other.takeDamage(7); 
   } 


} 

