package datastruc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStructures {
	
	private List<String> strList;
	private Map<String,String> strMap;
	private Set <String> st;
	
	public void setST() {
		/*
		 * Similar to an ArrayList but does not accept 
		 * duplicate values.
		 */
		st = new HashSet<String>();
		st.add("Carlo");
		st.add("Paulo");
		st.add("Oroc");
		st.add("Tolentino");
		/*
		 * Adding a second "Carlo" will be ignored. No error
		 * but it will not be added.
		 */
		st.add("Carlo");
		
	}
	
	public void setStrList() {
		/*
		 * ArrayList is an index list. 
		 */
		strList = new ArrayList<String>();
		strList.add("Carlo");
		strList.add("Paulo");
		strList.add("Oroc");
		strList.add("Tolentino");
	}
	
	public void setStrMap() {
		
		/*
		 * HashMap uses a key value pair.
		 * Instead of an index you  uses a key to
		 * locate the value that you need. The key 
		 * is of Set type, meaning no same entry.
		 */
		strMap = new HashMap<String, String>();
		strMap.put("Carlo", "The");
		strMap.put("Paulo", "Best");
		strMap.put("Oroc", "Ever");
		strMap.put("Tolentino", "Always");
	}

	public static void main(String[] args) {
		DataStructures dS = new DataStructures();
		dS.setStrList();
		dS.setStrMap();
		dS.setST();
		System.out.println("ArrayList:"+dS.getStrList().toString());
		System.out.println("HashMap:"+dS.getStrMap().toString());
		/*
		 * Printing the Set will show only one "Carlo".
		 */
		System.out.println("HasSet:"+dS.getSt().toString());

	}

	public List<String> getStrList() {
		return strList;
	}

	public Map<String, String> getStrMap() {
		return strMap;
	}
	public Set<String> getSt() {
		return st;
	}

}
