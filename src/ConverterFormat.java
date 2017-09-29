import java.util.Scanner;

public class ConverterFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);
        convertRomatToArabic(s);
        char[] arrayRoman = new char[] {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int[] arrayArabic = new int[] {1000, 500, 100, 50, 10, 5, 1};
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < arrayRoman.length; j++) {
                if (s.charAt(i) == arrayRoman[j] && s.charAt(i - 1) == arrayRoman[j - 1]) {
                    number -= arrayArabic[j];
                    return;
                }
                if (s.charAt(i) == arrayRoman[j]) {
                    System.out.println("Ok");
                    number += arrayArabic[j];
                    return;
                } else {

                }
            }
            System.out.println(number);
        }
    }

    private static void convertRomatToArabic(String s) {
        System.out.println("Конвертация");
    }
}
