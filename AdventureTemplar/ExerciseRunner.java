




public class ExerciseRunner {

    public static void main(String[] args) {
        Templar dumbledore = new Templar("Dumbledore", 30, 8, 4);
        Templar ronWeasley = new Templar("Ron Weasley", 10, 1, 2);

        ronWeasley.takeDamage(12); 

    

        System.out.println(dumbledore.toString());
    }
}