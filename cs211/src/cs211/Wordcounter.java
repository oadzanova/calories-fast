package cs211;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Wordcounter {
	public static void main(String... x){
		File data = new File("text1.txt");
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		try(
		Scanner scan = new Scanner(data);
				){
			while (scan.hasNext()){
				String word = scan.next();
				word = word.toLowerCase().trim();
				
				Integer count  = wordCount.get(word);
				if (count == null){
					wordCount.put(word, 1);
				}else{
					wordCount.put(word, count+1);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
//		for (String key:wordCount.keySet()){
//			System.out.println(key + ":" + wordCount.get(key));
//		}
//		for (Entry <String,Integer> e:wordCount.entrySet()){
//			System.out.println(e.getKey() + ":" + e.getValue());
//		}
//		
		
		String keyArr[] = wordCount.keySet().toArray(new String[0]);
		Arrays.sort(keyArr);
		for (String s: keyArr){
			System.out.println(s + ":" + wordCount.get(s));
			
		}
	}
}
