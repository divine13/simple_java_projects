public public class SwitchTest{
 public static void main(String[] args) {
  if(args.length < 1){ System.out.println("please provide one argument when calling this class"); System.exit(0); }
 	 Signal sig = Enum.valueOf(Signal.class, args[0].toUpperCase());
  switch (sig) {
  	default: 
  		System.out.println("nothing here");
  		         break;
  	case RED:  sig.redSignal(); 
  	             break; 
  	case YELLOW:  sig.yellowSignal(); 
  	case GREEN:  sig.greenSignal(); 
  }
 }
}
enum Signal{ RED, YELLOW, GREEN; 
    public void redSignal(){
    	System.out.println("STOP");
    }
    public void yellowSignal(){
    	System.out.println("Check first if you can go");
    	System.out.println("otherwise");
    }
    public void greenSignal(){
    	System.out.println("Go");
    }
}