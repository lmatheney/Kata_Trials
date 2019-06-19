import java.util.*;


 public class Kata {
 public static double findUniq(double arr[]) {

  //Lets create a map to store our double (Keys) and the amount of times they occur in the array (Values)
        HashMap<Double, Integer> mp = new HashMap<>();

        Double value = null;
        
  //While we don't need to sort the array, it makes it easier to view the unique value being inputted.
        Arrays.sort(arr); 

  //Create a for loop to start entering our arry into our map. In java you don't need to explicitly state the size of the arry, just use [ARRAYNAME].length-1
        for (int k = 0; k < arr.length-1 + 1; k++) {
  //Our IF statement looks in our map to see if the current element in the array has been hashed as a key yet
            if (mp.containsKey(arr[k])) {
  //If it has, then we will add one count to the mapped Value, otherwise we will put the element into our map for the first time 
                mp.put(arr[k], mp.get(arr[k]) + 1);
            } else {
                mp.put(arr[k], 1);

            }
        }
   //To grab the unique value in the map, we need to grab all entries in the map
            for (Map.Entry entry : mp.entrySet()) {
   //If any of the mapped Values are equal to 1, then we want to cast that object as a double and return it.
                if (entry.getValue().equals(1)) {
                    value = (Double) entry.getKey();
                }

            }


        return value;

    }}
