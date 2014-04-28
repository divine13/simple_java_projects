class Con extends Converter{
  public static void main(String[] args) {
  	 todayTemp();
  }
 static private void todayTemp(){
  	double temp = convert(23, 'C');
  	System.out.println("today`s temp is: " + temp);
  }
  public void convCel(int c){
    convert(c, 'C');
  }
  public void convF(int f){
  	convert(f, 'F');
  }
}