package javaFiles;
import java.util.ArrayList;

public class StringComb {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		String str = "????11?0??";
		ArrayList<String> resultSet = new ArrayList<String>();
		for (Character ch : str.toCharArray()) {
			resultSet = addString(resultSet, ch);
		}
		//System.out.println(resultSet);
		long stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
	}


	private static ArrayList<String> addString(ArrayList<String> resultSet, char ch) {
		ArrayList<String> result = new ArrayList<String>();
		if (resultSet.size() <= 0) {
			if (ch == '?') {
				result.add("0");
				result.add("1");
			} else {
				result.add(ch + "");
			} 
		} else {
				for (int i = 0; i < resultSet.size(); i++) {
					if (ch == '?') {
						result.add(resultSet.get(i) + "0");
						result.add(resultSet.get(i) + "1");
					} else {
						result.add(resultSet.get(i) + ch);
					}
				}
		}
		return result;
	}
}
