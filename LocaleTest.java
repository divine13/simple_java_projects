import java.util.*;
import java.text.*;
public class LocaleTest{
	public static void main(String[] args) {
		Locale sa = new Locale("af", "ZA");

		Date today = new Date();

		NumberFormat nfSouthAfrica = NumberFormat.getCurrencyInstance(sa);
		DateFormat dfZAR = DateFormat.getDateInstance(DateFormat.DEFAULT, sa);

		String theRand = nfSouthAfrica.format(232323.23);

		System.out.println(theRand);
		System.out.println(dfZAR.format(today));
	}
}