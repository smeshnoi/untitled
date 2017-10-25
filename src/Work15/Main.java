package Work15;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hm;
        HashMap<String, Integer> assistantMap = new HashMap<>();
        ArrayList<String> assistantArray = new ArrayList<>();
        hm = Dump.generateFirstNight(new ArrayList<>());
        Assistant assistant = new Assistant("Федор");
        assistant.generateNightAssistant();
        System.out.println();
        for (String value: hm) {
            System.out.print(value + " ");
        }
        int time = (int) System.currentTimeMillis();
        System.out.println(time);
        for (int i = 0; i < 10; i++) {
            hm = Dump.generateNightDumpAdd(hm);
            assistantArray = assistant.generateNightAssistant();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (String value: hm) {
            System.out.print(value + " ");
        }
        hm = Dump.getDumpArray();
        System.out.println();
        for (String value: assistantArray) {
            System.out.print("! " + value);
        }
        System.out.println();
        for (String value: hm) {
            System.out.print(value + " ");
        }
    }
}
