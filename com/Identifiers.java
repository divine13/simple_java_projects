public class Identifiers{
	public static void main(String args[]){
	int x = 100, 
	y = 99, 
	z = 3, 
	bit= (y & z);

	boolean isTrue = true, 
	meTrue2= true,
     bool = true;

	char a = 'a';

	byte mybyteX = 5, 
	myByteY = 2;

	 double sss =  mybyteX / z;

	 bool = (meTrue2 == isTrue) ? meTrue2 : false;

	 int scores[] = {1,2,3,4,5};

     String obj, winner = (scores[2] == 2) ? "your val is equal to 2" : "you val is not equal to 2";

		System.out.println(winner);

		Student sam = new Student("sam", 20);
		Student john = sam;
		john.setName("john");

		obj = (sam == john) ? "sam and john are pointing to the same object" :
		 "they are not pointing to the same object"; 

		System.out.println(obj);

		System.out.println("sam.name = " + sam.name() + " john.name = " + john.name());


   }
}