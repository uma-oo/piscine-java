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
        dictionnary.put("Star", 0); 
        dictionnary.put("Other", 0); 
        dictionnary.put("Planet", 0);
        for (CelestialObject obj : this.celestialObjects) {
            if (obj instanceof Star) {
                dictionnary.put("Star", dictionnary.get("Star") + obj.getMass());
            } else if (obj instanceof Planet) {
                dictionnary.put("Planet", dictionnary.get("Planet") + obj.getMass());
            } else {
                dictionnary.put("Other", dictionnary.get("Other")+obj.getMass()); 
            }
        }
        return  dictionnary;
    }
}