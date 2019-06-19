import java.util.*;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
  //To use Collections.frequency to count the number of times n,s,e & w show up we need to initalize an arrylist
  ArrayList<Object> ln = new ArrayList<>();
  //The next step is to fill the arraylist with the given array
      for(int i =0; i<walk.length; i++) {
          ln.add(walk[i]);
      }


      int North, South, East, West;
// Use Collections.frequency to determine how many times said direction is in the list
        North = Collections.frequency(ln, 'n');
        South = Collections.frequency(ln, 's');
        East = Collections.frequency(ln, 'e');
        West = Collections.frequency(ln, 'w');


// If the frequency of north/south and east/west are equal and the list is 10 values long, we will return
        if(North == South && East == West &&  ln.size() == 10 ) {
            return true;
        }
//Otherwise we will no return to the same place within ten minutes
        else
            return false;


        }
  }
