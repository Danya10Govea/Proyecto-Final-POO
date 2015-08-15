/*...*/
package Auxiliar;

import java.util.Random;

/**... */
public class NewMain {

    /**..
     * @param args.*/
    public static void main(String[] args) {
        // TODO code application logic here
        int[]numbers = new int[12];
        int count=0;
        
        while(count<12){
            Random r = new Random();
            int na = r.nextInt(6)+ 1; 
            int nvr = 0;
            
            for (int i = 0; i < 12; i++) {
                if(numbers[i] == na){
                    nvr++;
                }
            }
            if(nvr <2){
                numbers[count] =na;
                 count++;
            }
    }
        for (int i = 0; i < 12; i++) {
            System.out.print(numbers[i]+ " ");
        }
        
}
}
