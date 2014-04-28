public class Mem{
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt + " " + rt.freeMemory());
		rt.gc();
		System.out.println(rt + " " + rt.freeMemory());
        Mos mos = new Mos();
        int sos = Mos.hello(4);
        System.out.println(sos);
        mos.square(10);
        mos.defSquared();
        
	}
} 
class Mos{
	public static int hello(int number){
    	public int counter = 0;
    	 number *= number;  
    	 counter++;
       return number;
	}
	void square(int number){
      int squared = hello(number);
      System.out.println("squared number is" + squared);
	}
    
   static void defSquared(){
    	int twoSqured = hello(2);
    	System.out.println(twoSqured);
    }
    native void sss();
}
