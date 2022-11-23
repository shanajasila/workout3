import java.util.Scanner;
public class line {

static  class ExceptionLineTooShort extends Exception
{
    ExceptionLineTooShort(String s)
    {
        super(s);
    }
}

static class ExceptionLineTooLong extends Exception
{
    ExceptionLineTooLong(String s)
    {
        super(s);
    }
}
public static int length(String input)
    {
        int l=0,i;

        for(char ch:input.toCharArray())
        {
            l++;
        }
        return l;
    }


    public static void main(String args[])
    {
        System.out.println("Enter something");
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();




        try
        {

            if (length(c)<5)
                {
                    throw new ExceptionLineTooShort("The input is too short");

                }
                else if (length(c)>10)
                {
                    throw new ExceptionLineTooLong("The input is too long");

                }

                else
                {
                    System.out.println("The input is neither too long nor too short");
                }

            }

        catch (ExceptionLineTooShort e)
        {
            System.out.println(e.getMessage());
        }
        catch(ExceptionLineTooLong e)
        {
            System.out.println(e.getMessage());
        }

    }
}
