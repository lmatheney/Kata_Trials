import java.util.Arrays;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {


        //Array for Edge Case
        int[] emptyArray = new int[0];

        //Edge Case: If said array is null or empty we will return an empty array.
        if(input == null || input.length == 0)
        {
            return emptyArray;
        }


        // initialize sum, total, i and return array
        int sum = 0;
        int total = 0;
        int i;
        int[] newArray = new int[2];
        // Sort the given array in ascending order {-15,-13.-9,-1,0,1,6,9,89}
        Arrays.sort(input);



        // To give the sum of all negative values a for loop utilizes our newly sorted array
        // Once the for loop hits a positive value it will exit, giving us only the negative values
        for (i = 0; i < input.length && input[i] < 0 ; i++) {
            sum += input[i];
        }

        // Set the sum of all negative numbers to the second value of the output array.
        newArray[1] = sum;

        // To get the total amount of all positive values the for loops through the array
        for (i = 0; i < input.length; i++) {
        // Only when the element's value is above 0, one will be added to the counter.
            if(input[i] > 0) {
                total++;
            }


        }
        // Set the total number of all positive values to the first value  in the output array
        newArray[0] = total;

        // Return the new array: [total,sum]
        return newArray; 
    }
}





