package Work15;

import java.sql.Time;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hm;
        hm = Dump.generateFirstNight(new HashMap<>());
        System.out.println();
        for (String value: hm.keySet()) {
            System.out.println(value + " - " + hm.get(value));
        }
        int time = (int) System.currentTimeMillis();
        System.out.println(time);
        for (int i = 0; i < 99; i++) {
            hm = Dump.generateNightDumpAdd(hm);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        for (String value: hm.keySet()) {
            System.out.println(value + " - " + hm.get(value));
        }
    }
}
