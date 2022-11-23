import java.util.Scanner;

class InvalidPanException extends Exception{
     InvalidPanException(String msg) {
         super(msg);
     }

public class pan{
    public static void main(String args[]){
        System.out.println("Enter name of pan card holder");
        Scanner sc=new Scanner(System.in);
        String n= sc.next();
        System.out.println("Enter your pan card number");
        String p= sc.next();
        try {
            if(n.toLowerCase().charAt(0)==p.toLowerCase().charAt(4)){
                System.out.println("Valid Pan Card Number");
            }
            else {
                throw new InvalidPanException("Invalid Pan Card number");
            }
        }
        catch (InvalidPanException e){
            System.out.println(e.getMessage());
            System.out.println("Update your Pan card number");
        }

    }
}

}
