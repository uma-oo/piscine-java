import java.util.ArrayList;



public class Character {
   
    private final int maxHealth; 
    private int currentHealth; 
    private final String name; 

    private static ArrayList<Character> allCharacters = new ArrayList<Character>();


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
       allCharacters.add(this); 
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


   public static String printStatus() { 
    String result = new String(); 
    result += "------------------------------------------\n"; 
    if (allCharacters.size() == 0) {
        result += "Nobody's fighting right now !\n"; 
    } else {
        result += "Characters currently fighting :\n"; 
        for (Character character: allCharacters) {
          result +=  character.toString(); 
          result += "\n";
        }
    }

    result+= "------------------------------------------\n"; 

    return result;

   }


   public static  Character fight(Character first , Character second) {
     
     Character currentAttacker = first; 

     while (first.currentHealth != 0 || second.currentHealth!=0) {
        if (first.currentHealth == 0) {
            return second;
        }

        if (second.currentHealth ==0 ){
            return first;
        } 
         
        Character toAtack = currentAttacker == first ? second: first ; 
        currentAttacker.attack(toAtack); 
        currentAttacker = toAtack; 
        
     }
     return currentAttacker;
   }



}