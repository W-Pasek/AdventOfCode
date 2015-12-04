
package adventofcode;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Weronika
 */
public class DayThree {

     public static void main(String[] args) throws IOException {
        String currentLine = new String(); 
        char north = '^';
        char south = 'v';
        char west = '<';
        char east = '>';
        int x = 0;
        int y = 0;
        int result = 0;
       
        
        FileReader fileReader = new FileReader("nawiasy.txt");
        Scanner fileScanner = new Scanner(fileReader); 
        Set coordinatesSet = new HashSet();

        while(fileScanner.hasNext())
        { 
            currentLine = fileScanner.next();
              
            char[] signs = currentLine.toCharArray();
            int lengthArray= signs.length;
        
                for(int i=0; i<lengthArray; i++)
                { /*System.out.print(signs[i]);*/
         
                String coordinates = ""+x+y;
                /*System.out.print(coordinates+"/");*/
                coordinatesSet.add(coordinates);
            
                        if( signs[i] == north )
                        {
                            y++;
                        }
                        else if ( signs[i] == south )
                        {
                           y--; 
                        } 
                        else if ( signs[i] == east )
                        {
                            x++;
                        }
                        else if ( signs[i] == west)
                        {
                            x--;
                        }
                }
        }  
        String coordinates = ""+x+y;
        /*System.out.print(coordinates+"/");*/
        coordinatesSet.add(coordinates);
        
        result = coordinatesSet.size();
        System.out.println(result);
   }
   
}
