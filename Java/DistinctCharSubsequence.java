// distinct characters subsequence
// contributor - malay999

import java.util.Scanner;

public class DistinctCharSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();

            int[] asciiArr = new int[26];
            for (int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                int index = ch-'a';
                asciiArr[index]++;
            }

            int res = 0;
            for (int i = 0; i < asciiArr.length; i++) {
                if (asciiArr[i] != 0) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }

}
