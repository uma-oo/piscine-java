



public class Character {
   
    private final int maxHealth; 
    private int currentHealth; 
    private final String name; 


    public String  getName() {
        return this.name; 
    }
    
    public int getMaxHealth() {
        return this.maxHealth; 
    }
    
    public  int getCurrentHealth() {
        return this.currentHealth; 
    }


    public Character(String name, int maxHealth ) {
       this.name = name; 
       this.maxHealth = maxHealth; 
       this.currentHealth = this.maxHealth; 
    }




    @Override 
    public String toString() {
        if (this.currentHealth == 0 ){
            return  String.format("%s : KO", this.name); 
        }
        return  String.format("%s : %d/%d", this.name, this.currentHealth , this.maxHealth); 
        
    }

    public void takeDamage(int damage) {
       int count = 1 ; 
        while (this.currentHealth>0 && count<=damage ){
          this.currentHealth -=1;
          count +=1; 
        }
    }


   public void attack(Character  other) {
      other.takeDamage(9); 
   }



}