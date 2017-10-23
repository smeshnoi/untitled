package Work15;

import java.util.HashMap;
import java.util.Random;

public class Assistant {
    private String name;
    private HashMap pickAssistMap = new HashMap<>();

    public Assistant(String name) {
        this.name = name;
    }

    public HashMap generateNightAssistant () {
        System.out.println("Ассистент идет на сбор деталей");
        Random random = new Random();
        String nameDetail = "";
        int countDetail = random.nextInt(4) + 1;
        for (int i = 0; i < countDetail; i++) {
            int detail = random.nextInt(9) + 1;
            switch (detail) {
                case 1:
                    nameDetail = "Head";
                    break;
                case 2:
                    nameDetail = "Body";
                    break;
                case 3:
                    nameDetail = "LeftArm";
                    break;
                case 4:
                    nameDetail = "RightArm";
                    break;
                case 5:
                    nameDetail = "LeftLeg";
                    break;
                case 6:
                    nameDetail = "RightLeg";
                    break;
                case 7:
                    nameDetail = "CPU";
                    break;
                case 8:
                    nameDetail = "RAM";
                    break;
                case 9:
                    nameDetail = "HDD";
                    break;
            }
            pickAssistMap = assistantToDump(getPickAssistMap(), nameDetail);
        }
        return pickAssistMap;
    }

    public HashMap assistantToDump (HashMap<String, Integer> pickAssistMapTemp, String detail) {
        pickAssistMap = Dump.takeDetail(pickAssistMapTemp, detail);
        return pickAssistMap;
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
