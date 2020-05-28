package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter {
	public List<Integer> adapter(Set<Integer> numbers){
		List<Integer> list= new ArrayList<Integer>();
		numbers.forEach((number)->{
			list.add(number);
		});
		return list;
	}
}
