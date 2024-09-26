import java.util.*;

public class Operation{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      
       
        while(true){
            System.out.println("enter choice:");
            System.out.println("1. Arithmathic operation");
            System.out.println("2. statistical operation");
            System.out.println("3. trigonometric operations");
            System.out.println("4. EXITT");
        
        int n;
        n = sc.nextInt();

        switch(n)
        {
            case  1:
                int a,b;
                System.out.println("Enter Two numbers : ");
                a=sc.nextInt();
                b=sc.nextInt();
                int a1,a2,a3,a4;
                a1=a+b;
                a2=a-b;
                a3=a*b;
                a4=a/b;
                System.out.println("Result is :");
                System.out.println("Additon: "+a1);
                System.out.println("Subtarction : "+a2);
                System.out.println("Multiplication : "+a3);
                System.out.println("Division : "+a4);
                System.out.println("--------------");

            break;


            case 2:
                   System.out.println("Enter number of elements:");
                    int size = sc.nextInt();
                    int sum=0;
                  
                    for (int i = 0; i < size; i++) {
                        sum +=sc.nextInt();
                    }

                    System.out.println("Average :"+sum/size);
                     System.out.println("--------------");
                
                    break;


            case 3:
                System.out.println("Enter Degree of an angle:");
                double angle=sc.nextDouble();

                double radian= Math.toRadians(angle);

                System.out.println("Sine Value:"+Math.sin(radian));
                System.out.println("cos Value:"+Math.cos(radian));
                System.out.println("tan Value:"+Math.tan(radian));
                System.out.println("--------------");

                break;


            case 4:
                System.out.println("Exit from the program");
                System.out.println("--------------");
                sc.close();
                System.exit(0);
                break;


            default:
                System.out.println("INVALID CHOICE !!!!");
                System.out.println("--------------");
         }
        }
        
    }


}
