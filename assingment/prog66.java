import java.io.*;

class Shopping implements Serializable{
	private String itemName;
	private float price;
        private int qauntity;
	public Shopping () {

	}
	public Shopping(String itemName,float price,int qauntity ) {
		this.itemName = itemName;
		this.price = price;
                this.quantity=quantity;
	}
	
	public String toString() {
		return itemName + " " + price + " " + quantity;
	}
	
	
}

public class prog66 {

	public static void main(String[] args)throws IOException {
		FileOutputStream f = 
				new FileOutputStream("E:\\User\\Desktop\\shopping.dat");
		
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeObject(new Shopping("akshay",7777f,3));
				
		f.close();
		System.out.println("success");
	}

}