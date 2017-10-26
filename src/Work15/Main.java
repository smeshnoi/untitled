package Work15;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static Assistant assistantSc;
    private static Scientist scientist;
    private static Scientist scientist2 = new Scientist("Fedot");

    public static void main(String[] args) {
        ArrayList<String> hm;
        HashMap<String, Integer> assistantMap = new HashMap<>();
        ArrayList<String> assistantArray = new ArrayList<>();
        hm = Dump.generateFirstNight(new ArrayList<>());
        Assistant assistant = new Assistant("Федор");
        Assistant assistant2 = new Assistant("Антон");
        System.out.println();
        for (String value: hm) {
            System.out.print(value + " ");
        }
        Scientist scientist1= new Scientist("Botan", assistantSc);

        //Thread thread2 = new Thread((Runnable) scientist2);
//        thread1.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //thread2.start();
        //assistant.generateNightAssistant();
        System.out.println();
        for (String value: hm) {
            System.out.print(value + " ");
        }
        int time = (int) System.currentTimeMillis();
        System.out.println(time);
        for (int i = 0; i < 20; i++) {
            hm = Dump.generateNightDumpAdd(hm);
            Night thread1 = new Night(scientist1, assistant);
            thread1.start();
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //assistantArray = assistant.generateNightAssistant();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        System.out.println();
//        for (String value: hm) {
//            System.out.print(value + " ");
//        }
//        hm = Dump.getDumpArray();
//        System.out.println();
//        for (String value: assistantArray) {
//            System.out.print("! " + value);
//        }
//        System.out.println();
//        for (String value: hm) {
//            System.out.print(value + " ");
//        }
//        //thread1scientist1.getDetail(assistantArray);
//        System.out.println();
//        //scientist.getRobotMap();
//        assistantArray = assistant2.generateNightAssistant();
//        scientist2.getDetail(assistantArray);
//        scientist2.createRobot();
//        System.out.println();
//        for (String value: hm) {
//            System.out.print(value + " ");
//        }
    }

    public static class Night extends Thread{

        public Night(Scientist botan, Assistant assistant) {
            scientist = botan;
            assistantSc = assistant;
        }

        @Override
        public void run() {
            scientist.getDetail(assistantSc.generateNightAssistant());
            scientist.createRobot();
            System.out.println(scientist.getCount());
        }
    }
}
