class EnumTester{
	public static void main(String[] args) {
       if((args.length) < 1){
          System.out.println("please give in one val e.g java EnumTester up" +
           "valid arguments are UP DOWN BEAUTY STRANGE TRUTH CHARM ");
          System.exit(0);
       }else {
       	Quark q = Enum.valueOf(Quark.class, args[0].toUpperCase());
        char symbol = q.getSymbol();
        double charge = q.getCharge();
        System.out.println("the electric charge for quark " + charge + " symbol is " + 
        	symbol);
        System.out.println("Quark name is " + q.name());
       }		
	}
}
enum Quark{
	UP('u', 2.0/3.0),
	DOWN('d', -1.0/3.0),
	CHARM('c', 2.0/3.0),
	STRANGE('s', -1.0/3.0),
	TRUTH('t', 2.0/3.0),
	BEAUTY('b', -1.0/3.0);

    private char symbol;
    private double charge;

	Quark(char symbol, double charge){
       this.symbol = symbol;
       this.charge = charge;
	}

	public double getCharge(){
		return charge;
	}
    public char getSymbol(){
    	return symbol;
    }
}