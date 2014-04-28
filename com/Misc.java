public class Misc {
  public static void main(String[] args) {
		RunMiscs mis = new RunMiscs();
		RunMiscs.argsv = "mellow";
		RunMiscs sis  = new RunMiscs();
	}   
}
 class RunMiscs{
	public static String argsv = "hello";
       RunMiscs(){
       	  System.out.println("salute: " + argsv.toString());
       }
}