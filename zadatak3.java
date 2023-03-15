import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int user_input;
        int sum = 0;

        do{
            System.out.println("Enter a integer: ");

            if (!input.hasNextInt()){
                System.out.println("Invalid input, enter an integer!");
                input.next();
                continue;
            }
            user_input = input.nextInt();
            switch(user_input % 7){
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.printf("Saturday");
                    break;
                default:
                    if(user_input < 0){
                        System.out.println("The sum of even num is: " + sum);
                        System.exit(0);
                    }
                    break;
            }
            if(user_input % 2 == 0){
                sum = sum + user_input;
            }
        }while(true);
    }
}
