package com.david;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> languages = new HashMap<>();
		
		if(languages.containsKey("Java")){
			System.out.println("Ýt's already in the map");
		}else{
			languages.put("Java", "a compiled high level, object-oriented, platform independent languge");
			System.out.println("Java added successfully");
		}
		
		languages.put("Python", "an interpreted, object-oriented, high level language");
		languages.put("Algol", "an algorithmic languge");
		System.out.println(languages.put("Basic", "Beginners all purposes symbolic instruction code"));
		System.out.println(languages.put("Lisp", "Therein lies madness"));
		
//		System.out.println(languages.put("Java", "This course is about Java"));
//		System.out.println(languages.get("Java"));
		
		if(languages.containsKey("Java")){
			System.out.println("Ýt's already in the map");
		}else{
			languages.put("Java", "This course is about Java");
		}
		
		System.out.println("*****************************************************");
		
//		languages.remove("Lisp");
		if(languages.remove("Algol", "a family of algorithmic languages")){
			System.out.println("Algol removed");
		}else{
			System.out.println("key/value pair not found");
		}
		
		if(languages.replace("Lisp","Therein lies madness", "a functional programming language with something")){
			System.out.println("Lisp replaced");
		}else{
			System.out.println("Lisp was not replaced");
		}
//		System.out.println(languages.replace("Scala", "This won't be added"));

		for(String key: languages.keySet())
			System.out.println(key + " : "+ languages.get(key));
	}

}
