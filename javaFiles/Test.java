package javaFiles;
import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		long startTime = System.nanoTime();
		ArrayList<String> array = new ArrayList<String>();
		returnPossibleOptions("????11?0??", array);
		long stopTime = System.nanoTime();
		System.out.print("Total time: ");
		System.out.println(stopTime - startTime);
	}

	public static void returnPossibleOptions(String str, ArrayList<String> array) {

		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == '?') {
				if (array.size() == 0) {
					array.add("0");
					array.add("1");
				} else {
					int size = array.size();
					for (int k = 0; k < size; k++) {
						String before = array.get(k);
						array.set(k, before + "0");
						array.add(before + "1");
					}
				}
			} else {// we know the char
				if (array.size() == 0) {
					array.add(String.valueOf((charArr[i])));
				} else {
					for (int j = 0; j < array.size(); j++) {
						array.set(j, array.get(j) + charArr[i]);
					}
				}
			}
		}
		// Don't print for time measurment purposes
		/*
		 * for(String s:array){ System.out.println(s); }
		 */
	}

}