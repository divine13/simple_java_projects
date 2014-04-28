class StaticNested{
	Printer printer = new Printer();
	String msg = "From outer class of Printer class";
	public void accesInnerClassMethod(){
	 printer.print(msg);
}

	static class Printer{
		public void print(String s){
			System.out.println(s);
		}
	}
}
