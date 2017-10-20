package Work15;

import java.util.HashMap;

public class Assistant {
    private String name;
    private HashMap<String, Integer> pickAssistMap = new HashMap<>();

    public Assistant(String name) {
        this.name = name;
    }

    public Assistant(String name, HashMap<String, Integer> pickAssistMap) {
        this.name = name;

        this.pickAssistMap = pickAssistMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getPickAssistMap() {
        return pickAssistMap;
    }

    public void setPickAssistMap(HashMap<String, Integer> pickAssistMap) {
        this.pickAssistMap = pickAssistMap;
    }
}
