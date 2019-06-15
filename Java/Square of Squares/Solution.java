import java.lang.Math; 

public class Square {    
    public static boolean isSquare(int n) {  
    //Use the square root function to calculate the square root of the given value
        if(Math.sqrt(n) % 1 != 0)
        /*Use modulos 1 to see if the value of the square root has a remainder and therfor a rectange ! square.
        Ex: 
        -->int n = 25
        --> Math.sqrt(25) = 5
        --> 5 % 1 == 0 Meaning 25 is a GLORIOUS SQUARE!
        Ex2:
        -->int n = 25.5
        --> Math.sqrt(25.5) = 5.04975246918
        --> 5.04975246918 % 1 == 0.04975246918 (AKA != 0) ... it is an EVIL RECTANGLE!
        */
        {
        return false;
        }
        else
        {
        return true;
        }
    
    }
}


