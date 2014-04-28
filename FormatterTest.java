import java.util.*;
class FormatterTest{
	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		System.out.println(formatter.format("-%50b", " "));
		System.out.println(formatter.toString());
		String s = "sss";
		System.out.println(s.length());
	}
}