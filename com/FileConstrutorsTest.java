import java.io.*;
class FileConstrutorsTest{
	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
	try{
		File f1 = new File("java/scjp/");
		File f2 = new File("java/scjp/", "myproject/pro.java");
		File f3 = new File(f1, "temp/src");
		 System.out.println(f1.getCanonicalPath());
		 System.out.println(f2.getCanonicalPath());
		 System.out.println(f3.getAbsolutePath());
	}catch (IOException ioe) {
	   ioe.printStackTrace();
	  }
	}

}