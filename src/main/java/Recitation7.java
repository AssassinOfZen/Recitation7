public class Recitation7 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    public static boolean lastItemReachable(int[] hopList) {
        int i = 0;
        while (i < hopList.length - 1 && hopList[i] != 0) {
            i += hopList[i];
        }
        return i >= (hopList.length - 1); // replace this line with your code
    }


    public static int[] slidingWindowMin(int[] numberList, int windowSize) {
        int[] result = new int[numberList.length - windowSize + 1];
        int startOfWindow = 0;
        int endOfWindow = windowSize;
        int minElement = numberList[0];
        int index = 0;
        if (numberList.length > 0 && windowSize <= numberList.length) {
            for (int i = endOfWindow; i <= numberList.length; i++) {
                for (int j = startOfWindow; j <= i - 1; j++) {
                    if (numberList[j] <= minElement) {
                        minElement = numberList[j];
                    }
                }
                if (result[index] == 0) {
                    result[index] = minElement;
                    index++;
                    startOfWindow += 1;
                }
            }
        }
            return result; // replace this line with your code
        }
}
