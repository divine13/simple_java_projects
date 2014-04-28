class PrintingMachine{
	public static void main(String[] args) {
		StaticNested outerClass = new StaticNested();
        outerClass.accesInnerClassMethod();

        StaticNested.Printer inner = new StaticNested.Printer();
        inner.print("Directly from the static machine");
	}
}
