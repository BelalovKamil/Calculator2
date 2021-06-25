import java.io.IOException;

public class RomanToArabic {
    public static int romanToArabic(String Roman) throws IOException {
        String s1 = Roman.toUpperCase();
        int arab = 0;
        int i = 0;
        for (int c = s1.length() - 1; c >= 0; c--) {
            switch (s1.charAt(c)) {
                case 'I' -> {
                    arab = i > 1 ? arab - 1 : arab + 1;
                    i = 1;
                }
                case 'V' -> {
                    arab = i > 5 ? arab - 5 : arab + 5;
                    i = 5;
                }
                case 'X' -> {
                    arab = i > 10 ? arab - 10 : arab + 10;
                    i = 10;
                }
                case 'L' -> {
                    arab = i > 50 ? arab - 50 : arab + 50;
                    i = 50;
                }
                case 'C' -> {
                    arab = i > 100 ? arab - 100 : arab + 100;
                    i = 100;
                }
                default -> throw new IOException("Некорректные данные в выражении " + s1);
            }
        }
        return arab;
    }
}
