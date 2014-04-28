import java.io.*;
class FileByteCopy  {
    public static void main(String[] args) throws IOException {
    	File inputFile = new File("scjp.txt");
    	
    	File outputFile = new File("scjp_copy.txt");

    	FileInputStream in = new FileInputStream(inputFile);
    	FileOutputStream out = new FileOutputStream(outputFile);

    	int c;
    	int i = 0;
    	while ((c = in.read()) != -1){ 
    		out.write(c);
             
    		i= c; 
    		i = i/1000;
    		System.out.print("*");
    		if (i == 0){
    			continue;
    		}
    	}
    	System.out.print("\n */-/finished copying now closing connections/-/*");
    	in.close();
    	out.close();
    	System.out.println("\n");
    }
}