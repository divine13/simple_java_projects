import java.util.Locale;
class StringTest{
	public static void main(String[] args) {
		String str = "Hello";
		String s = str.concat("World");
		s.toUpperCase();

		String[] langs = Locale.getISOCountries();

		int langsSize = langs.length;

		for (int i =0; i <  langsSize; i ++) {
			System.out.println(langs[i]);
		}

		System.out.println("Original String in pool: " + str + "  New String: " + s);
	}
}