import java.io.*;
public class prog67 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream f = 
				new FileInputStream("C:\\User\\Desktop\\shopping.dat");
		
		ObjectInputStream o = new ObjectInputStream(f);
		
		Shopping s = (Shopping)o.readObject();
		
		System.out.println(s); 
				
		f.close();
		System.out.println("success");
	}

}