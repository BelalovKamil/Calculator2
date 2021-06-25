import java.io.IOException;

public class ArabicToRoman {
    public static String arabicToRomanNubs(int number) {
        String r1 = "";
        switch (number) {
            case 0:
                r1 = "0";
                break;
            case 1:
                r1 = "I";
                break;
            case 2:
                r1 = "II";
                break;
            case 3:
                r1 = "III";
                break;
            case 4:
                r1 = "IV";
                break;
            case 5:
                r1 = "V";
                break;
            case 6:
                r1 = "VI";
                break;
            case 7:
                r1 = "VII";
                break;
            case 8:
                r1 = "VIII";
                break;
            case 9:
                r1 = "IX";
                break;
            case 10:
                r1 = "X";
                break;
            case 20:
                r1 = "XX";
                break;
            case 30:
                r1 = "XXX";
                break;
            case 40:
                r1 = "XL";
                break;
            case 50:
                r1 = "L";
                break;
            case 60:
                r1 = "LX";
                break;
            case 70:
                r1 = "LXX";
                break;
            case 80:
                r1 = "LXXX";
                break;
            case 90:
                r1 = "XC";
                break;
            case 100:
                r1 = "C";
                break;
        }
        return r1;
    }

    public static String arabicToRoman(int number) throws IOException {
        String result="";
        if (number < 0) {
            throw new IOException("Ответ - отрицательное римское число");
        } else if (number <= 10 | (number % 10) == 0) {
            result = arabicToRomanNubs(number);
        } else if (number < 20) {
            result = "X" + arabicToRomanNubs(number - 10);
        } else if (number < 30) {
            result = "XX" + arabicToRomanNubs(number - 20);
        } else if (number < 40) {
            result = "XXX" + arabicToRomanNubs(number - 30);
        } else if (number < 50) {
            result = "XL" + arabicToRomanNubs(number - 40);
        } else if (number < 60) {
            result = "L" + arabicToRomanNubs(number - 50);
        } else if (number < 70) {
            result = "LX" + arabicToRomanNubs(number - 60);
        } else if (number < 80) {
            result = "LXX" + arabicToRomanNubs(number - 70);
        } else if (number < 90) {
            result = "LXXX" + arabicToRomanNubs(number - 80);
        }
        else if (number < 100) {
            result = "XC" + arabicToRomanNubs(number - 90);
        }
        return result;
    }
}
