package Work15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Assistant {
    private String name;
    private HashMap pickAssistMap = new HashMap<>();
    private ArrayList<String> pickAssistArray = new ArrayList<>();

    public Assistant(String name) {
        this.name = name;
    }

    public ArrayList generateNightAssistant () {
        System.out.println("\nАссистент " + getName() + " идет на сбор деталей");
        Random random = new Random();
        int countDetail = random.nextInt(4) + 1;
        for (int i = 0; i < countDetail; i++) {
            int detail = random.nextInt(Dump.getDumpArray().size());
            pickAssistArray = assistantToDump(getPickAssistArray(), detail);
        }
        return pickAssistArray;
    }

    public ArrayList assistantToDump (ArrayList<String> pickAssistArray, int detail) {
        if (Dump.getDumpArray().size() > 0) {
            pickAssistArray = Dump.takeDetail(pickAssistArray, detail);
        } else {
            System.out.println("Деталей на свалке не найдено");
            return pickAssistArray;
        }
        this.pickAssistArray = pickAssistArray;
        return pickAssistArray;
    }

    public Assistant(String name, ArrayList<String> pickAssistArray) {
        this.name = name;
        this.pickAssistArray = pickAssistArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPickAssistArray() {
        return pickAssistArray;
    }

    public void setPickAssistMap(HashMap<String, Integer> pickAssistMap) {
        this.pickAssistMap = pickAssistMap;
    }
}
