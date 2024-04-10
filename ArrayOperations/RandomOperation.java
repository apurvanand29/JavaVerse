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
}
