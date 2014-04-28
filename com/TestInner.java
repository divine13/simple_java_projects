public class TestInner{
 	public static void main(String[] args) {
 		TopLevel tpc =  new TopLevel();
 		 tpc.topLevelClassMethodToCallInner();
 		 TopLevel.MyInnerClass inner = tpc.new MyInnerClass();
 		 inner.myInnerMethod("From External class");
 	}
}