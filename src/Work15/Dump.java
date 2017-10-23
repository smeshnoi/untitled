package Work15;

import java.util.HashMap;
import java.util.Random;

public class Dump {
    private static HashMap<String, Integer> dumpMap;

    public static HashMap<String, Integer> getDumpMap() {
        return dumpMap;
    }

    public void setDumpMap(HashMap<String, Integer> dumpMap) {
        this.dumpMap = dumpMap;
    }

    public static HashMap generateFirstNight(HashMap<String, Integer> dumpMap) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int generateDetail = random.nextInt(9) + 1;
            System.out.print(generateDetail + " ");
            dumpMap = addDetailToDump(dumpMap, generateDetail);
            Dump.dumpMap = dumpMap;
        }
        return dumpMap;
    }

    public static HashMap generateNightDumpAdd(HashMap<String, Integer> dumpMap) {
        Random random = new Random();
        int countDetail = random.nextInt(4) + 1;
        System.out.println("На свалку выброшено следующее кол-во деталей: " + countDetail);
        for (int i = 0; i < countDetail; i++) {
            int detail = random.nextInt(9) + 1;
            dumpMap = addDetailToDump(dumpMap, detail);
            Dump.dumpMap = dumpMap;
        }
        return dumpMap;
    }

    public static HashMap addDetailToDump(HashMap<String, Integer> dumpMap, int detail) {
        switch (detail) {
            case 1:
                if (dumpMap.get("Head") != null ) {
                    dumpMap.put("Head", dumpMap.get("Head") + 1);
                } else {
                    dumpMap.put("Head", 1);
                }
                break;
            case 2:
                if (dumpMap.get("Body") != null ) {
                    dumpMap.put("Body", dumpMap.get("Body") + 1);
                } else {
                    dumpMap.put("Body", 1);
                }
                break;
            case 3:
                if (dumpMap.get("LeftArm") != null ) {
                    dumpMap.put("LeftArm", dumpMap.get("LeftArm") + 1);
                } else {
                    dumpMap.put("LeftArm", 1);
                }
                break;
            case 4:
                if (dumpMap.get("RightArm") != null ) {
                    dumpMap.put("RightArm", dumpMap.get("RightArm") + 1);
                } else {
                    dumpMap.put("RightArm", 1);
                }
                break;
            case 5:
                if (dumpMap.get("LeftLeg") != null ) {
                    dumpMap.put("LeftLeg", dumpMap.get("LeftLeg") + 1);
                } else {
                    dumpMap.put("LeftLeg", 1);
                }
                break;
            case 6:
                if (dumpMap.get("RightLeg") != null ) {
                    dumpMap.put("RightLeg", dumpMap.get("RightLeg") + 1);
                } else {
                    dumpMap.put("RightLeg", 1);
                }
                break;
            case 7:
                if (dumpMap.get("CPU") != null ) {
                    dumpMap.put("CPU", dumpMap.get("CPU") + 1);
                } else {
                    dumpMap.put("CPU", 1);
                }
                break;
            case 8:
                if (dumpMap.get("RAM") != null ) {
                    dumpMap.put("RAM", dumpMap.get("RAM") + 1);
                } else {
                    dumpMap.put("RAM", 1);
                }
                break;
            case 9:
                if (dumpMap.get("HDD") != null ) {
                    dumpMap.put("HDD", dumpMap.get("HDD") + 1);
                } else {
                    dumpMap.put("HDD", 1);
                }
                break;
        }
        return dumpMap;
    }

    public static HashMap takeDetail (HashMap<String, Integer> assistantMap, String detail) {
        switch (detail) {
            case "Head":
                if (dumpMap.get("Head") > 1) {
                    dumpMap.put("Head", dumpMap.get("Head") - 1);
                } else {
                    dumpMap.remove("Head");
                }
                assistantMap = addDetailToDump(assistantMap, 1);
                break;
            case "Body":
                if (dumpMap.get("Body") > 1) {
                    dumpMap.put("Body", dumpMap.get("Body") - 1);
                } else {
                    dumpMap.remove("Body");
                }
                assistantMap = addDetailToDump(assistantMap, 2);
                break;
            case "LeftArm":
                if (dumpMap.get("LeftArm") > 1) {
                    dumpMap.put("LeftArm", dumpMap.get("LeftArm") - 1);
                } else {
                    dumpMap.remove("LeftArm");
                }
                assistantMap = addDetailToDump(assistantMap, 3);
                break;
            case "RightArm":
                if (dumpMap.get("RightArm") > 1) {
                    dumpMap.put("RightArm", dumpMap.get("RightArm") - 1);
                } else {
                    dumpMap.remove("RightArm");
                }
                assistantMap = addDetailToDump(assistantMap, 4);
                break;
            case "LeftLeg":
                if (dumpMap.get("LeftLeg") > 1) {
                    dumpMap.put("LeftLeg", dumpMap.get("LeftLeg") - 1);
                } else {
                    dumpMap.remove("LeftLeg");
                }
                assistantMap = addDetailToDump(assistantMap, 5);
                break;
            case "RightLeg":
                if (dumpMap.get("RightLeg") > 1) {
                    dumpMap.put("RightLeg", dumpMap.get("RightLeg") - 1);
                } else {
                    dumpMap.remove("RightLeg");
                }
                assistantMap = addDetailToDump(assistantMap, 6);
                break;
            case "CPU":
                if (dumpMap.get("CPU") > 1) {
                    dumpMap.put("CPU", dumpMap.get("CPU") - 1);
                } else {
                    dumpMap.remove("CPU");
                }
                assistantMap = addDetailToDump(assistantMap, 7);
                break;
            case "RAM":
                if (dumpMap.get("RAM") > 1) {
                    dumpMap.put("RAM", dumpMap.get("RAM") - 1);
                } else {
                    dumpMap.remove("RAM");
                }
                assistantMap = addDetailToDump(assistantMap, 8);
                break;
            case "HDD":
                if (dumpMap.get("HDD") > 1) {
                    dumpMap.put("HDD", dumpMap.get("HDD") - 1);
                } else {
                    dumpMap.remove("HDD");
                }
                assistantMap = addDetailToDump(assistantMap, 9);
                break;
        }
        return assistantMap;
    }

    public void main(String[] args) {
        this.dumpMap = generateFirstNight(new HashMap<>());
        System.out.println();
        for (String value: dumpMap.keySet()) {
            System.out.println(value + " - " + dumpMap.get(value));
        }
        System.out.println("------------------");
        this.dumpMap = generateNightDumpAdd(dumpMap);
        for (String value: dumpMap.keySet()) {
            System.out.println(value + " - " + dumpMap.get(value));
        }
    }
}
