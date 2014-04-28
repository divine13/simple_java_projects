class EnumsGames{
	WaistSize size;
  public static void main(String[] args) {
  
  EnumsGames e1 = new EnumsGames();
  EnumsGames e2 = new EnumsGames();

  e1.size = WaistSize.SMALL;
  e2.size = WaistSize.LARGE;

  System.out.println(e1.size +" "+ e2.size);
  System.out.println(e1.size.getSize());
  }
}
 enum WaistSize{
 	SMALL(10), MEDIUM(20), LARGE(30);

 	private int size;
 	// WaistSize(int size){
 	// 	this.size = size;
 	// } 
 	public int getSize(){
 		return size;
 	}
 }