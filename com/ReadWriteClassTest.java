import java.io.*;
class ReadWriteClassTest{
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileInputStream("outputfile"));
		
		double[] priceList = {19.99, 29.99, 39.99};
		int[] copies = {100000, 50000, 70000};
		String[] titleCopies = {"SCJP Study Guide", "SCBCD study Guide", "SCSA Study Guide"}

		for (int i = 0; i < priceList.length; i++){
			out.writeDouble(priceList[i]);
		}
	}
}