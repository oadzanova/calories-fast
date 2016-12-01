package cs211;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		File data = new File("text2.txt");
		HashMap<String,Set<String>> wordList = new HashMap<String,Set<String>>();
		try(
		Scanner scan = new Scanner(data);
				){
			while (scan.hasNext()){
				String word = scan.next();
				word = word.toLowerCase().trim();
				char [] chars = word.toCharArray();
				Arrays.sort(chars);
				String key = new String(chars);
				Set<String> anaSet = wordList.get(key);
				if (anaSet == null){
					anaSet = new HashSet<String>();
					wordList.put(key, anaSet);
				}
				anaSet.add(word);

			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
//		String keyArr[] = wordList.keySet().toArray(new String[0]);
//		Arrays.sort(keyArr);
		for (String s: wordList.keySet()){
			Set<String> anagrams = wordList.get(s);
			for (String a:anagrams){
				System.out.print(a + " ");
			}
			System.out.println();

			
		}
	}

}
