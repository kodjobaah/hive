package com.kodjo;

/**
 * Created by kodjobaah on 10/09/2015.
 */
public class FindStartOfArray {

    /**
     *  Searches the first array for an occurence of the second the array
     *
     * @param first The array to check
     * @param second The array we are looking for
     * @return -1 if second does not exist in first or the location of the start of second wthin first
     */
    public int findStart(int[]first, int second[]) {

        int valueBeginOfSecond = second[0];

        int loc = locInArray(0,valueBeginOfSecond,first);

            int numberElementsToCheck = first.length - loc;

            boolean sizeComparison = numberElementsToCheck >= second.length;
            while ((loc > 0) && sizeComparison && (!checkIfContiguous(loc, first, second))) {

                loc = locInArray(loc + 1, valueBeginOfSecond, first);
                numberElementsToCheck = first.length - loc;
                sizeComparison = numberElementsToCheck >= second.length;
            }

        if (!sizeComparison) {
            loc = -1;
        }

        return loc;
    }

    private int locInArray(int start, int value, int[] elementsToSearch ) {

        int loc = -1;
        for(int i=start; i < elementsToSearch.length; i++) {
            if (elementsToSearch[i] == value ) {
                loc = i;
                break;
            }
        }
        return loc;
    }

    private boolean checkIfContiguous(int start, int[] first, int[] second) {

        boolean result = true;
        int firstLoc = start;
        for(int i = 0; i < second.length;  i++) {
            int firstVal = first[firstLoc];
            int secondVal = second[i];
            if (firstVal != secondVal) {
                result = false;
                break;
            }
            firstLoc++;

        }
        return result;
    }
}
