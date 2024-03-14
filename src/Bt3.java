import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên không âm có tối đa 3 chữ số:");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ!");
            return;
        }

        String result = "";

        if (number == 0) {
            result = "zero";
        } else {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;

            if (hundreds > 0) {
                result += convertToWord(hundreds) + " hundred";
                if (tens > 0 || ones > 0) {
                    result += " and ";
                }
            }

            if (tens == 1) {
                result += convertTeen(10 + ones);
            } else {
                if (tens > 1) {
                    result += convertToWord(tens * 10);
                }
                if (tens > 0 && ones > 0) {
                    result += " ";
                }
                if (ones > 0) {
                    result += convertToWord(ones);
                }
            }
        }

        System.out.println("Số " + number + " được đọc là: " + result);
    }

    private static String convertToWord(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 20:
                return "twenty";
            case 30:
                return "thirty";
            case 40:
                return "forty";
            case 50:
                return "fifty";
            case 60:
                return "sixty";
            case 70:
                return "seventy";
            case 80:
                return "eighty";
            case 90:
                return "ninety";
            default:
                return "";
        }
    }

    private static String convertTeen(int number) {
        switch (number) {
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }
}
