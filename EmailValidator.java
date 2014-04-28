import java.util.regex.*;
public class EmailValidator{
	public static void main(String[] args) {
		String email = "";
		if(args.length < 1){
		System.out.println("Please call with some intentions at least with one argument to the main");
		System.exit(0);
		}else {
			email = args[0];
		}
		Pattern p = Pattern.compile("^\\.+|^\\@+");
		Matcher m = p.matcher(email);

		if(m.find()){
			System.out.println("Invalid email starts with dot or @ sign");
			System.exit(0);
		}

	    p  = Pattern.compile("^www\\.");
	    m = p.matcher(email);

	    if(m.find()){
	 		System.out.println("Invalid email starts with www.");
	 		System.exit(0);
	    }

	    p = Pattern.compile("[^A-Za-z0-9\\@\\.\\_]");
	    m = p.matcher(email);

	    if(m.find()){
	    	System.out.println("Your email is invalid");
	    }else{
	    	System.out.println(email + " is valid");
	    	Pattern par = Pattern.compile("\\@");
	    	String[] pieces = par.split(email);
	    	for(int i = 0; i< pieces.length; i++){
	    		System.out.println(pieces[i]);
	    	}

	    }
	}
}