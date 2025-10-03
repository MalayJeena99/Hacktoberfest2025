// make a permutation
// contributor - malay999

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeAPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] inputArr = new int[n];
            for (int i =0; i<n; i++) {
                inputArr[i] = sc.nextInt();
            }
            System.out.println(solve1(inputArr, n));
        }
    }

    public static int solve1(int[] inputArr, int n) {
        // map to store existence of element in an array
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!m.containsKey(inputArr[i])) {
                m.put(inputArr[i], 1);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            // comparing the sequence 1 -> n with the map
            if (!m.containsKey(i+1)){
                count++;
            }
        }
        return count;
    }
}
