import java.util.Scanner;
public class CinemaWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Audience data input");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Select menu (1/2/3): ");

            int option = sc.nextInt();
            sc.nextLine();  // Clears the newline character

            switch (option) {
             case 1:
                System.out.print("Enter a name: ");
                name = sc.nextLine();
                
                boolean seatsAvailable = false;
                
                do {
                    System.out.print("Enter a row (1-4): ");
                    row = sc.nextInt();
                    System.out.print("Enter a column(1/2): ");
                    column = sc.nextInt();
                    sc.nextLine();

                    if (row>= 1 && row<= 4 && (column == 1 || column == 2)) {
                        if (audience[row - 1][column - 1] == null) {
                            audience[row - 1][column - 1] = name;
                            System.out.println("Audience data is successfully inputted");
                            seatsAvailable = true;
                        } else {
                            System.out.println("Seats are already occupied by other audiences. Please choose another seat");
                        }
                    } else {
                        System.out.println("Invalid row or column");
                    }
                } while (!seatsAvailable);
                break;

             case 2:
                System.out.println("Audience list: ");
                for (int i= 0; i<4; i++) {
                    for (int j = 0; j<2; j++) {
                        if (audience[i][j] != null) {
                            System.out.println("Row " + (i+1) +"column" + (j+1) + ": " + audience[i][j]);
                        } else {
                            System.out.println("Row " + (i+1) +"column" + ": ***");
                        }
                    }
                }
                break;
             case 3:
                System.out.println("Thank you, the program will come out");
                System.exit(0);   
                break;

             default:
                System.out.println("Invalid option, please select the appropriate menu");  
            }
        }
    }
}


