// isolation centers
// contributors - malay999

import java.util.Scanner;

public class IsolationCenters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();
            int[] centerArr = new int[q];
            for (int i = 0; i < q; i++) {
                centerArr[i] = sc.nextInt();
            }
            solve1(n,s,centerArr);
        }
    }

    public static void solve1(int n , String s, int[] centerArr) {
        int[] asciiArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiInd =  ch - 'a';
            asciiArr[asciiInd]++;
        }

        for (int i = 0; i < centerArr.length; i++) {
            long total = 0;
            for (int j = 0; j < asciiArr.length; j++) {
                if (asciiArr[j] > centerArr[i]) {
                    total += asciiArr[j] - centerArr[i];
                }
            }
            System.out.println(total);
        }
    }
}
