import java.io.*;

class Newfile{
public static void main(String args[])

{
	File f = new File("D:\\Alisha\\world.txt");
	try{
		if(f.createNewFile())
		{
			System.out.println("File is created");
		}
	else{
		System.out.println("File is already exist");
		}
	}
	catch(Exception e){
		System.out.println(e);
	}

}

}
