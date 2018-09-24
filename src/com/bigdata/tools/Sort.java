package com.bigdata.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sort {

	public List<String> timesSort(List<String> s) {
		List<String> top = new ArrayList<>();
		HashMap<String, Integer> hashCache = new HashMap<String, Integer>();
		for (int i = 0; i < s.size(); i++) {
			String _c = s.get(i);
			if (hashCache.containsKey(_c)) {
				hashCache.put(_c, hashCache.get(_c) + 1);
			} else {
				hashCache.put(_c, 1);
			}
		}
		Set<String> keys = hashCache.keySet();
		Set<Entry<String, Integer>> ss = hashCache.entrySet();
		ArrayList<Entry<String, Integer>> mappingList = new ArrayList<Entry<String, Integer>>();
		mappingList.addAll(ss);
		Comparator cp = new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> mapping1, Map.Entry<String, Integer> mapping2) {
				return mapping2.getValue().compareTo(mapping1.getValue());
			}
		};
		Collections.sort(mappingList, cp);
		int i = 0;
		for (Entry<String, Integer> entry : mappingList) {
			top.add(entry.getKey());
			// System.out.println("字符串"+entry.getKey()+"出现的次数为"+entry.getValue());
//			System.out.println(top.get(i));
			i = i + 1;
		}
		return top;

	}

}
