package Work15;

import java.sql.Time;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hm;
        HashMap<String, Integer> assistantMap = new HashMap<>();
        hm = Dump.generateFirstNight(new HashMap<>());
        Assistant assistant = new Assistant("Assistant1");
        //assistantMap = Dump.takeDetail(new HashMap<>(), "Head");
        System.out.println();
        for (String value: hm.keySet()) {
            System.out.println(value + " - " + hm.get(value));
        }
        int time = (int) System.currentTimeMillis();
        System.out.println(time);
        for (int i = 0; i < 10; i++) {
            hm = Dump.generateNightDumpAdd(hm);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //assistantMap = assistant.generateNightAssistant();
        System.out.println();
        for (String value: hm.keySet()) {
            System.out.println(value + " - " + hm.get(value));
        }
        //assistantMap = Dump.takeDetail(assistantMap, "Head");
        hm = Dump.getDumpMap();
        System.out.println();
        for (String value: hm.keySet()) {
            System.out.println(value + " - " + hm.get(value));
        }
    }
}
