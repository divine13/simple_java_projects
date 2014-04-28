import java.util.Scanner;

class ScannerTest{
	public static void main(String[] args) {
		if ((args.length) < 1 ){
		System.out.println("feed me some Strings please! otherwise i will craaash! like that");
		System.exit(0);
	}
		Scanner sc = new Scanner(args[0]);
		sc.useDelimiter(",");
		do{
			if (sc.hasNextInt()) System.out.println("the next int " + sc.nextInt());
			System.out.println(sc.next());

			//if(sc.hasNext == false) System.exit(0);
		}while (sc.hasNext() != false);

	}
}