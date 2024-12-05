import java.util.*;
public class Middlenumber 
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int middle;
        System.out.println("Enter the first number");
        System.out.println("Enter the second number");
        System.out.println ("Enter the third number");
        if(a>b)
    {
        if(b>c)
        System.out.println(b);
        else if(a>c)
        System.out.println(c);
        else
        System.out.println(a);
    }
    else
    {
        if(a>c)
        System.out.println(a);
        else if(b>c)
        System.out.println(c);
        else
        System.out.println(b);
    }
}
}
