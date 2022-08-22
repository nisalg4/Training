import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

    int x = 0;
    do {

        Scanner reader = new Scanner(System.in);
        System.out.print("Select a shape \n 1:Square \n 2:Rectangle \n 3:Circle \n");
        try {
            int shape=Integer.parseInt(reader.nextLine());

        if (shape < 4 && shape > 0 ) {

            if (shape == 1) {
                 new Square();
            } else if (shape == 2) {
                new Rectangle();
            } else if (shape == 3) {
                new Circle();
            }

            System.out.print("Exit?(1:yes,2:no) \n");
            int exit = reader.nextInt();
            if (exit == 1) {
                x = 1;
                System.out.println("Exited\n");
            }
        } else {
            System.out.println("Wrong shape\n try again\n");
        }
        }catch (Exception e){}
    } while (x == 0);

    }
}