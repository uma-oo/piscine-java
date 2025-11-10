



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
}



//   @Test
//     void objectSorcerer_heal() {
//         try {
//             Method heal = Sorcerer.class.getDeclaredMethod("heal", Character.class);
//             Method takeDamage = Character.class.getDeclaredMethod("takeDamage", int.class);

//             Constructor<Sorcerer> constructor = Sorcerer.class.getConstructor(String.class, int.class, int.class);
//             Sorcerer dumbledore = constructor.newInstance("Dumbledore", 30, 8);
//             Sorcerer ronWeasley = constructor.newInstance("Ron Weasley", 20, 1);

//             Method getCurrentHealth = Character.class.getDeclaredMethod("getCurrentHealth");

//             takeDamage.invoke(ronWeasley, 12);

//             assertThat(getCurrentHealth.invoke(ronWeasley))
//                     .withFailMessage("The HP of Ron before healing should be 8")
//                     .isEqualTo(8);

//             heal.invoke(dumbledore, ronWeasley);

//             assertThat(getCurrentHealth.invoke(ronWeasley))
//                     .withFailMessage("The HP of Ron after first healing should be 16")
//                     .isEqualTo(16);

//             heal.invoke(dumbledore, ronWeasley);

//             assertThat(getCurrentHealth.invoke(ronWeasley))
//                     .withFailMessage("The HP of Ron after last healing should be 20")
//                     .isEqualTo(20);
//         } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//             fail("Sorcerer is not correctly defined", e);
//         }
//     }

// }