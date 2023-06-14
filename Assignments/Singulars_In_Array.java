package Assignments;

public class Singulars_In_Array {
    public static void main(String[] args) {
        int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20,30,30,40};

        int count = countSingularSocks(arrNum);
        System.out.println("Count of singular socks = " + count);
    }

    public static int countSingularSocks(int[] arrNum) {
        int count = 0;

        for (int i = 0; i < arrNum.length; i++) {
            int sockId = arrNum[i];
            if (sockId == -1) {
                continue;  // Skip already counted pairs
            }

            int pairCount = 0;

            for (int j = i + 1; j < arrNum.length; j++) {
                if (arrNum[j] == sockId) {
                    pairCount++;
                    arrNum[j] = -1;  // Mark the pair as counted
                    break;  // Exit the inner loop after finding a pair
                }
            }

            if (pairCount == 0) {
                count++;  // Increment count for singular sock
            }
        }

        return count;
    }
}
