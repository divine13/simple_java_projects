import java.io.*;
class FileCopier{
   public static void main(String[] args) throws IOException {
   	  File inFile = new File("Answers");
	File outFile = new File("Answers_copy.txt");

	FileReader in = new FileReader("Answers");
	FileWriter out = new FileWriter(outFile);

	int i;
	while ((i = in.read()) != -1)out.write(i);
	in.close();
	out.flush();
	out.close();
   }

}