package com.simpletest.simpletest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpletestApplication {

	public static String findLargestWord(String phrase) {
		String[] words = phrase.split(" ");
		List<String> listWords = Arrays.asList(words);
		List<String> onlyEven = listWords.stream().filter(e -> (e.length() % 2 == 0)).collect(Collectors.toList());
		
		if(!onlyEven.isEmpty()) {
			Optional<String> largestWord  = onlyEven.stream().max(Comparator.comparingInt(String::length));
			onlyEven.remove(largestWord.get());
			return getOtherLargest(onlyEven, largestWord.get());
		} else {
			return "00";
		}	
	}
	
	public static String getOtherLargest(List<String> onlyEven, String word) {
		if(onlyEven.isEmpty()) {
			return "00";
		} else  {
			List<String> newOnlyEven = new ArrayList<String>(onlyEven);
			Optional<String> newLargestWord = newOnlyEven.stream().max(Comparator.comparingInt(String::length));						
			if(word.length() >= newLargestWord.get().length()) {
				return word;
			} else {
				return getOtherLargest(newOnlyEven, newLargestWord.get());
			}
		}
	}
}
