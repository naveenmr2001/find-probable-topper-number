import java.util.Scanner;

public class FindProbableTopperNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Register Number: ");
        int registerNumber = scan.nextInt();

        String iteratorStringRegisterNumber = Integer.toString(registerNumber);

        int evenSum = 0,oddSum = 0;

        for(int iterator = 0;iterator<iteratorStringRegisterNumber.length();iterator++){

            if(iterator%2 == 0){

                evenSum+=(iteratorStringRegisterNumber.charAt(iterator)-'0');

            }else{

                oddSum+=(iteratorStringRegisterNumber.charAt(iterator)-'0');

            }

        }

        if(oddSum == evenSum){

            System.out.println("Yes");

        }else{

            System.out.println("No");

        }

    }
}