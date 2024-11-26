package com.aon;

public class IndexFinder {

    public static int findStartingIndex(int[] arr, int[] sub) {
        int arrLength = arr.length;
        int subLength = sub.length;

        if (subLength == 0) {
            return 0;
        }

        int i = 0; // Pointer for main array arr
        int j = 0; // Pointer for sub-array sub

        while (i < arrLength) {
            if (arr[i] == sub[j]) {
                i++;
                j++;
                // If we have matched the entire sub-array
                if (j == subLength) {
                    return i - j; // Return the starting index of the match
                }
            } else {
                i = i - j + 1;
                j = 0;
            }
        }

        // If no match is found, return -1
        return -1;

    }
}



