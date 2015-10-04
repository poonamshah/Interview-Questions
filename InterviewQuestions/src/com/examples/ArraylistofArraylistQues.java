import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
/*
 * Given a list of strings, return a List of Lists, with each sublist containing words of
similar length.
 
e.g. for list of strings {"Cat", "dog", "array", "help", "find"}
 
There should be a list returned that has 3 lists inside it.
first one will have 2 words "dog" and "Cat" and the other will have "help" and "find"
The next will have "array".
 
public ArrayList<ArrayList<String>> getListOfWordsGrouped(ArrayList<String> originalList)
Test it out with junit input methods for different combinations of input string list.
 
 */
public class ArraylistofArraylistQues {
	public ArrayList<ArrayList<String>> getListOfWordsGrouped(ArrayList<String> originalList) {
		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		
		
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		String value = "";
		int len = 0;
		
		for (int i = 0; i < originalList.size(); i++) {
			len = originalList.get(i).length();
			value = originalList.get(i);
			
			if (!(map.containsKey(len))) {
				ArrayList<String> a = new ArrayList<String>();
				a.add(value);
				map.put(len, a);
			} else {
				ArrayList<String> temp = new ArrayList<String>();
				temp = map.get(len);
				temp.add(value);
				map.put(len, temp);
			}
		}
		System.out.println(map);
		for (Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
			output.add(entry.getValue());
		}
		return output;

	}

	public static void main(String[] args) {
		ArraylistofArraylistQues test = new ArraylistofArraylistQues();
		ArrayList<String> originalList = new ArrayList<String>();
		originalList.add("Cat");
		originalList.add("dog");
		originalList.add("array");
		originalList.add("help");
		originalList.add("find");
		System.out.println(test.getListOfWordsGrouped(originalList));

	}

}
