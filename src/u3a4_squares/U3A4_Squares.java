/*
 * Nigel Howarth Shute
 * squares.Java 
 * 11/05/2018
 * This program prints out a list of numbers and their squares
 */

package u3a4_squares;
import java.util.*;

/**
 *
 * @author nihow4926
 */
public class U3A4_Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // array list that declares integers to be used   
        ArrayList <Integer> numbers  = new ArrayList();
        Collections.addAll(numbers,0,1,2,3,4,5,6,7,8,9);
       
       
        for(int i = 0; i<numbers.size();i++){
        System.out.println("Number: " + i + " Squared: " + i*i);
        }
        
       
       
        
    }
    
}
