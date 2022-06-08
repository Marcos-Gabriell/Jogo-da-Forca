package br.com.jogoforca.core;


public abstract class Dictionary {
	private static Dictionary instance;
	
	public static Dictionary getInstance() {
		if (instance == null) {
			instance = new FileDictionary();
		}
		return instance;
	}
	
	
	public abstract Word nextWord();
	
	public abstract String getName();
}