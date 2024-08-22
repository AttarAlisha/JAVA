import java.util.Scanner;

public class exception
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int b,c;
        Scanner sc=new Scanner(System.in);

        for (int i=0; i<5; i++){
            System.out.println("Enter a divident");
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a divisor greater than 0");
        b=sc.nextInt();
        
       
        for(int j=0; j<5; j++){
        try {

            c=a[j]/b;
            System.out.println("result: "+c);
        }

        
        catch(Exception e){
            System.out.println("Cannot divided by 0");
            break;
        }

        }
    }

}
