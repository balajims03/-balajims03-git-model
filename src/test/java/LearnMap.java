


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LearnMap {	

	public static void main(String[] args) {
		String data= ("Amazon has 15Lack Employees");
		Map<Character,Integer>map= new HashMap<>();

		char[] allchar = data.toCharArray();{
			for (char c : allchar) {
				if(!map.containsKey(c))
				{map.put(c,1);

				}else {
					Integer valueofkey=map.get(c);
					map.put(c, valueofkey+1);
				}
			}
			System.out.println(map);
		}
	}
}
