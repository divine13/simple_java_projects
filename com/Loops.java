class Loops{
  public static void main(String[] args) {
  OuterLoop:	for (int i = 3; i > 0; i--) {
  		for(int j= 0; j < 4; j = j + 1){
  			System.out.println("value for i: " + i + " value for j is: " + j);
  			if (i == j) continue OuterLoop;
  		}
    }
    int i = 0, j = 0;

  		if((i++ == 0))System.out.println(i);
  }
}