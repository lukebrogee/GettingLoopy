import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;
        boolean done = false;


        do {
            System.out.print("Enter the Celsius Temperature: ");
            if (in.hasNextDouble()){
                celsius = in.nextDouble();
                in.nextLine();
                if (celsius == (float) celsius){
                    done = true;
                }
                fahrenheit = celsius * 9 / 5 + 32;

                System.out.println("Fahrenheit value is: " + fahrenheit);

                break;
            }else {
                System.out.println("Invalid Anwser, rerun the program and try again");
                in.nextLine();
            }


        }while(!done);

    }
}
