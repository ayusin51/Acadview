import java.util.TreeMap;

public class changeDate {

	public static TreeMap<Integer, String> dd = new TreeMap<Integer, String>();
	public static TreeMap<Integer, String> mm = new TreeMap<Integer, String>();
	public static TreeMap<Integer, String> yearCent = new TreeMap<Integer, String>();
	public static TreeMap<Integer, String> yearDec = new TreeMap<Integer, String>();
	public static TreeMap<Integer, String> yearLast = new TreeMap<Integer, String>();

	public static void englishConverter() {
		
		mm.put(1, "January");
		mm.put(2, "February");
		mm.put(3, "March");
		mm.put(4, "April");
		mm.put(5, "May");
		mm.put(6, "June");
		mm.put(7, "July");
		mm.put(8, "August");
		mm.put(9, "September");
		mm.put(10, "October");
		mm.put(11, "November");
		mm.put(12, "December");
		
		
		dd.put(1, "First");
		dd.put(2, "Second");
		dd.put(3, "Third");
		dd.put(4, "Fourth");
		dd.put(5, "Fifth");
		dd.put(6, "Sixth");
		dd.put(7, "Seventh");
		dd.put(8, "Eighth");
		dd.put(9, "Nineth");
		dd.put(10, "Tenth");
		dd.put(11, "Eleventh");
		dd.put(12, "Tweleveth");
		dd.put(13, "Thirteenth");
		dd.put(14, "Fourteenth");
		dd.put(15, "Fifteenth");
		dd.put(16, "Sixteenth");
		dd.put(07, "Seventeenth");
		dd.put(18, "Eighteenth");
		dd.put(19, "Nineteenth");
		dd.put(20, "Twenty");
		dd.put(21, "Twenty First");
		dd.put(22, "Twenty Second");
		dd.put(23, "Twenty Third");
		dd.put(24, "Twenty Fourth");
		dd.put(25, "Twent Fifth");
		dd.put(26, "Twenty Sixth");
		dd.put(27, "Twenty Seventh");
		dd.put(28, "Twenty Eighth");
		dd.put(29, "Twenty Nineth");
		dd.put(30, "Thirty");
		dd.put(31, "Thirty First");

		yearCent.put(18,  "Eighteen");
		yearCent.put(19, "Nineteen");
		yearCent.put(20, "Twenty");

		yearDec.put(0, "Hundred");
		yearDec.put(1, "Ten");
		yearDec.put(2, "Twenty");
		yearDec.put(3, "Thirty");
		yearDec.put(4, "Forty");
		yearDec.put(5, "Fifty");
		yearDec.put(6, "Sixty");
		yearDec.put(7, "Seventy");
		yearDec.put(8, "Eighty");
		yearDec.put(9, "Ninety");
		
		yearLast.put(0, "");
		yearLast.put(1, "One");
		yearLast.put(2, "Two");
		yearLast.put(3, "Three");
		yearLast.put(4, "Four");
		yearLast.put(5, "Five");
		yearLast.put(6, "Six");
		yearLast.put(7, "Seven");
		yearLast.put(8, "Eight");
		yearLast.put(9, "Nine");
		
	}

	public static void change(String d) {
		String date = d.substring(0, 2);
		String month = d.substring(3, 5);
		String dec = d.substring(6, 8);
		String cent = d.substring(8, 9);
		String last = d.substring(9, 10);
		System.out.println(dd.get(Integer.parseInt(date)) + " " + mm.get(Integer.parseInt(month)) + ", " + yearCent.get(Integer.parseInt(dec)) + " " + yearDec.get(Integer.parseInt(cent)) + " " + yearLast.get(Integer.parseInt(last))); 
	}

	public static void main(String [] args) {

		englishConverter();
		System.out.println("18/04/1999");
		change("18/04/1999");
		System.out.println("04/10/1998");
		change("04/10/1998");
		System.out.println("21/05/1998");
		change("21/05/1998");

	}
}