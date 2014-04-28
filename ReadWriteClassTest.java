import java.io.*;
class ReadWriteClassTest{
	public static void main(String[] args) throws IOException {
		String datafile = "outputfile";
		DataOutputStream out = new DataOutputStream(new FileOutputStream(datafile));
		
		double[] priceList = {19.99, 29.99, 39.99};
		int[] copies = {100000, 50000, 70000};
		String[] titleCopies = {"SCJP Study Guide", 
		"SCBCD study Guide", "SCSA Study Guide"};

		for (int i = 0; i < priceList.length; i++){
			out.writeDouble(priceList[i]);
			out.writeChar('\t');
			out.writeInt(copies[i]);
			out.writeChar('\t');
			out.writeChars(titleCopies[i]);
			out.writeChar('\n');
		}
		out.close();

		DataInputStream in = new DataInputStream(new FileInputStream(datafile));

		double price;
		int copy;
		StringBuffer title;
		double grandTotal = 0.0;

		try{
			while (true) {
			price = in.readDouble();
			in.readChar();
			copy = in.readInt();
			in.readChar();
			char ch;
			title = new StringBuffer(5);
			char linSep = System.getProperty("line.separator").charAt(0);
			while ((ch = in.readChar()) != linSep )title.append(ch);
			System.out.println("Your order " + copy + " copies of: " + title + " at $" + price);
			grandTotal = grandTotal + copy * price;
		    }
		}catch(EOFException eofe){
			System.out.println("END OF FILE!");
		}
		System.out.println("grand total is " + grandTotal);
		in.close();
	}
}