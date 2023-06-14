package Assignments;

public class UniqueNumbersFrequency {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 2, 1, 6, 6, 1, 5, 6, 5, 6};
        int n = arrNum.length;

        for (int i = 0; i < n; i++) {
            boolean visited = false;  // Flag to track if the element has been visited

            for (int j = 0; j < i; j++) {
                if (arrNum[i] == arrNum[j]) {
                    visited = true;
                    break;
                }
            }

            if (visited==true)
                continue;

            int frequency = 1;
            for (int j = i + 1; j < n; j++) {
                if (arrNum[i] == arrNum[j]) {
                    frequency++;
                }
            }

            System.out.println(arrNum[i] + ": " + frequency + " times");
        }
    }
}