import java.util.Scanner;
public class Cinema22{
    public static void main(String[] args) {
        String[][] audience = new String[4][2];
       
        System.out.println(audience.length);
      
        for (int i = 0;i < audience.length; i++) {
            System.out.println("Length of row" + (i+1) + ":" + audience[i].length);
        }
       

        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);
        
        
    }
}