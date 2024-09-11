import java.io.*;

class writefile{

public static void main(String args[])

{
	String a="Hello wolrd!!!..";
	try{
	FileWriter f = new FileWriter ("D:\\Alisha\\world.txt");
		f.write(a);	
		f.close();
		System.out.println("Data is added");
	}

	catch(Exception e){
		System.out.println(e);
	}
}
}
