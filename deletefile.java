import java.io.*;

class deletefile{
public static void main(String args[])

{
	File f = new File("D:\\Alisha\\abc.txt");
	try{
		if(f.delete())
		{
			System.out.println("File is deleted");
		}
	else{
		System.out.println("unable to delete file");
		}
	}

	catch(Exception e){
		System.out.println(e);
	}

}

}
