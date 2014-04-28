import java.io.*;
class FileBufferCopier{
  public static void main(String[] args) throws IOException{
  		File in = new File("scjp.txt");
	File out = new File("scjp_copy.txt");

	BufferedReader buffReader = new BufferedReader(in);
	BufferedWriter buffWriter = new BufferedWriter(new FileWriter(out));


	String line;
	while ((line = buffReader.readLine()) != null) {
			buffWriter.write(line);
			//buffWriter.newLine();
		}
		buffReader.close();
		buffWriter.close();
  }

}