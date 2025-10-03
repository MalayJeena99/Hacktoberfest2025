// chef and digits of a number
// contributor - malay999

import java.util.Scanner;

public class ChefAndADigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();

            // count the no. of ones and zeros
            int zs = 0;
            int os = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0'){
                    zs++;
                }else {
                    os++;
                }
            }

            if (zs == 1 || os == 1) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
