import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;



public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        super();
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject element) {
        this.celestialObjects.add(element);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> dictionnary = new HashMap<>();
        for (CelestialObject obj : this.celestialObjects) {
            if (obj instanceof Star) {
                dictionnary.put("Star", dictionnary.getOrDefault("Star", 0) + obj.getMass());
            } else if (obj instanceof Planet) {
                dictionnary.put("Planet", dictionnary.getOrDefault("Planet", 0) + obj.getMass());
            } else {
                dictionnary.put("Other", dictionnary.getOrDefault("Other", 0)+obj.getMass()); 
            }
        }
        return  dictionnary;
    }
}