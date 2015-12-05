
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
        int santaX = 0;
        int santaY = 0;
        int robotX = 0;
        int robotY = 0;
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
         
                String coordinatesSanta = ""+santaX+santaY;
                String coordinatesRobot = ""+robotX+robotY;
                /*System.out.print(coordinates+"/");*/
                coordinatesSet.add(coordinatesSanta);
                coordinatesSet.add(coordinatesRobot);
                
                if ( i%2 == 0)
                {    
                        if( signs[i] == north )
                        {
                            santaY++;
                        }
                        else if ( signs[i] == south )
                        {
                           santaY--; 
                        } 
                        else if ( signs[i] == east )
                        {
                            santaX++;
                        }
                        else if ( signs[i] == west)
                        {
                            santaX--;
                        }
                }
                else
                {
                        if( signs[i] == north )
                        {
                            robotY++;
                        }
                        else if ( signs[i] == south )
                        {
                           robotY--; 
                        } 
                        else if ( signs[i] == east )
                        {
                            robotX++;
                        }
                        else if ( signs[i] == west)
                        {
                            robotX--;
                        }  
                }
                }
        }  
         String coordinatesSanta = ""+santaX+santaY;
         String coordinatesRobot = ""+robotX+robotY;
         /*System.out.print(coordinates+"/");*/
         coordinatesSet.add(coordinatesSanta);
         coordinatesSet.add(coordinatesRobot);
        
        result = coordinatesSet.size();
        System.out.println(result);
   }
   
}
