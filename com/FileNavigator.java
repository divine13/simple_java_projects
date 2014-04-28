import java.io.*;
class FileNavigator{
  public static void main(String[] args) {
  	String currentDir = ".";
  	File dir;
  	FileNavigator nav;
  	if (args.length >= 1)currentDir = args[0];
  	 dir = new File(currentDir);

  	if (!(dir.isDirectory())){
       System.out.println("make sure you are in a dir that has a sub dir(folders)");
       System.exit(0);
  	}
  		nav = new FileNavigator();
  		nav.navigate(dir);
  }


  public void navigate(File file){
  	System.out.println(" ");
  	System.out.println("starting dir is " + file + ":");

  	String[] fileFiles = file.list();
  	for (int i = 0; i < fileFiles.length; i++ ){
  		System.out.println(fileFiles[i]);
  		File childDir = new File(file, fileFiles[i]);
  		if (childDir.isDirectory())navigate(childDir);
  	}
  }
}