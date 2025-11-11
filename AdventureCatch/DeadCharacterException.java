
import java.io.IOException;

public class DeadCharacterException extends Exception {

    private Character character;

    public DeadCharacterException(Character character) {
        super();
        this.character = character;
    }

    public String getMessage() {
        String typeCharacter = "character";
        if (this.character instanceof Monster) {
            typeCharacter = "monster";
        } else if (this.character instanceof Sorcerer) {
            typeCharacter = "sorcerer";
        } else if (this.character instanceof Templar) {
            typeCharacter = "templar";
        }

        return String.format("The %s %s is dead.", typeCharacter, this.character.getName()); 
    }
}