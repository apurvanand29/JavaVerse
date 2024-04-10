/**
 * This program will help us get the sum of all numbers,
 * highest, lowest number, and average of numbers
 * in 1D array
 */
public class RandomOperation {

    /**
     * This method finds sum of all the
     * numbers present in array
     * 
     * @param arr1
     * @return
     */
    public int getTotal(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        return sum;
    }

    /**
     * This method calculates average of all
     * numbers present in array
     * 
     * @param arr1
     * @return
     */
    public double getAverage(int[] arr1) {
        double avg = 1.0, sum;
        sum = getTotal(arr1);
        avg = sum / (arr1.length);
        return avg;
    }

    /**
     * This method fetches the highest of all
     * numbers present in array
     * 
     * @param arr1
     * @return
     */
    public int getHighest(int[] arr1) {
        int highest = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > highest) {
                highest = arr1[i];
            }
        }
        return highest;
    }

}
