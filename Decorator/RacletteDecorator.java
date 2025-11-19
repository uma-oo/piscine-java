
// class RacletteDecorator {
//     <<abstract>>
//     -Raclette raclette
//     +RacletteDecorator(Raclette raclette)
//     +getCalories() int
//     +getIngredients() String
// }

public abstract class RacletteDecorator implements Raclette {

    private Raclette raclette;

    public  RacletteDecorator(Raclette raclette) {
        this.raclette = raclette;
    }



    @Override
    public int getCalories() {
        return this.raclette.getCalories();
    }

    @Override
    public String getIngredients() {
        return this.raclette.getIngredients();
    }

}