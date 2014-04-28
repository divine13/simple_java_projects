class Hello{
	public static void main(String[] args) {
		MyPrinter greet = new MyPrinter();
		greet.printStuff("Hello", 1,2,3,4,32,23,3,2,1);
		greet.printStuff("Hello mellow");
	}
}
class MyPrinter{
	public void printStuff(String greet, int... values){
       for (int v : values) {
       	 System.out.println(greet + " : " + v);
       }
	}
}