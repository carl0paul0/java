package datastruc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStructures {
	
	private List<String> strList;
	private Map<String,String> strMap;
	private Hashtable <String, Integer> ht;
	private Set <String> st;
	
	public void setHt() {
		/*
		 * Similar to HashMap but syncronized. Hashtable does not
		 * allow nulls.
		 */
		ht = new Hashtable<>();
		ht.put("Carlo", 77);
		/*
		 * Adding null will cause a null pointer exception
		 */
		//ht.put(null, 01);
	}
	
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
		st.add(null);
		
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
		strMap.put(null,"Test");
	}

	public static void main(String[] args) {
		DataStructures dS = new DataStructures();
		dS.setStrList();
		dS.setStrMap();
		dS.setST();
		dS.setHt();
		System.out.println("ArrayList:"+dS.getStrList().toString());
		System.out.println("HashMap:"+dS.getStrMap().toString());
		/*
		 * Printing the Set will show only one "Carlo".
		 */
		System.out.println("HasSet:"+dS.getSt().toString());
		/*
		 * Hashtable almost same as HashMap but syncronized and does not allow nulls.
		 */
		System.out.println("Hastable:"+dS.getHt().toString());

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

	public Hashtable <String, Integer> getHt() {
		return ht;
	}
}
