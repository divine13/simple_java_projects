class TopLevel{
  String top = "From TopLevel class";
  public MyInnerClass minn = new MyInnerClass();
   public void topLevelClassMethodToCallInner(){
    minn.myInnerMethod(top);
   }
	class MyInnerClass{
       public void myInnerMethod(String msg){
       	 System.out.println(msg);
       }
	 }
}