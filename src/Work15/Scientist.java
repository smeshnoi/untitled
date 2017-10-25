package Work15;

import java.util.ArrayList;
import java.util.HashMap;

public class Scientist {
    private String name;
    private HashMap<String, Integer> robotMap = new HashMap<>();

    public Scientist(String name) {
        this.name = name;
    }

    public Scientist(String name, HashMap<String, Integer> robotMap, Assistant assistant) {
        this.name = name;
        this.robotMap = robotMap;
    }

    public void getDetail (ArrayList<String> pickAssistArray) {
        for (int i = 0; i < pickAssistArray.size() - 1; i++) {
            robotMap.put(pickAssistArray.get(i), 1);
            pickAssistArray.remove(i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getRobotMap() {
        return robotMap;
    }

    public void setRobotMap(HashMap<String, Integer> robotMap) {
        this.robotMap = robotMap;
    }

    public void createRobot(HashMap<String, Integer> robotMap) {

    }
}
