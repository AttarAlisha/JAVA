
import java.util.*;

class Test{
    private double side1;
    private double side2;
    private double side3;

    public Test(){

    }

    public void setside1( double side1){
        this.side1=side1;
    }

    public void setside2(double side2){
        this.side2=side2;
    }

    public void setside3(double side3){
        this.side3=side3;
    }

    public double getside1(){
        return side1;
    }

    public double getside2(){
        return side2;
    }

    public double getside3(){
        return side3;
    }

    public void accept(){

        Scanner sc = new Scanner(System.in);
        System.out.println("length of side1 : ");
        side1=sc.nextDouble();
        System.out.println("length of side2 : ");
        side2=sc.nextDouble();
        System.out.println("length of side3 : ");
        side3=sc.nextDouble();
    }

    public void display(){

        System.out.println("Side 1 : "+side1 + "Side 2 : "+side2 +" Side 3: "+side3);
    } 

    public double calcPeri(){
        return side1+side2+side3;
    }

    public void isvalid(){
        if (side1+ side2 >= side3 || side2+side3>=side1 || side1+side3 >= side2 ){
            System.out.println("Trinagle is valid");
        }
    }

}

public class Triangle{
    public static void main(String[] args)
    {
        Test[] arr = new Test[4];
        for(int i=0; i<arr.length; i++)
         {
            arr[i] = new Test();
            arr[i].accept();
            arr[i].display();
            System.out.println("Perimeter : "+arr[i].calcPeri());
            arr[i].isvalid();
        }
    }
}
