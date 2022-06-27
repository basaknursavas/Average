import java.util.Scanner ;
public class Avarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int enteredNumber, total = 0, totalNumbers = 0 ;
        double average ;
        System.out.print("Please enter the limit number : ");
        enteredNumber = input.nextInt();


        for (int i = 0; i < enteredNumber; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("The number is : " + i);
                total += i;
                totalNumbers++ ;
            }
        }
        average = (total / (totalNumbers - 1 ));
        System.out.println("The average is : " + average);
    }
}
