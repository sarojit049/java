import java.util.Scanner;

public class BinaryToDecimal {

    public static void binToDec(String binNum) {
        int decNum = 0;
        int i = 0;

        // Convert binary to decimal
        while (i < binNum.length()) {
            decNum = decNum * 2 + (binNum.charAt(i) - '0');
            i++;
        }

        System.out.println("Decimal number = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binNum = sc.nextLine();

        binToDec(binNum);

        sc.close();
    }
}
