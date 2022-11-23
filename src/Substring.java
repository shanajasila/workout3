import java.util.Scanner;

class Substring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String st= sc.nextLine();
        System.out.println("Substrings of the given string is :");
        for (int i=0;i<=st.length();i++) {
            for (int j=i+1;j<=st.length();j++) {
                System.out.println(st.substring(i, j));
            }
        }
    }
}
