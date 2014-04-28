class MultipleExceptions{
	public static void main(String[] args) {
		int[] x = {0,1,2,3,4};

		try{
			MultipleExceptions me =  new MultipleExceptions();
			divide(10, 0);
			System.out.println("x[6]: " + x[6]);
			System.out.println("x[3]: " + x[3]);
		}catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception! " + ae);
		}catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("array out of bounds! " + ai);
		}catch (Exception e) {
			System.out.println("just fishing here");
		}finally{
			System.out.println("finally its my turn and it will always stay like that");
		}
		System.out.println("x[0]: " + x[0]);
	}
	private double divide(int x,  int y){
		if(y == 0.0 ){
			throw new 
			ArithmeticException("You cant divide by zero! please get that int your thick skull! You people make me vomit errors! aahhgg!");
		}else {
			return x/y; 
		}
	}
