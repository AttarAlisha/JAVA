import java.io.*;

class Fileexp
{
	public static void main(String args[])
	{
		File f  = new File("D:\\Alisha\\exp.txt");

	try{
		if(f.createNewFile()){
		System.out.println("file is created");	
		}
		else{
		System.out.println("File is exist");
		}

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		 while ((line = br.readLine()) != null) {
			System.out.println(line);
		} 
		br.close();
		fr.close();

	}
		catch(IOException e){
			System.out.println("ERROR  "+e.getMessage());
		}	
	}

}

