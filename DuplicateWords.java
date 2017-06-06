package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DuplicateWords {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		String s1="can you can a cancan you can a cancan you can a cancan you can a cancan you can a cancan you can a cancan you can a cancan you can a cancan you can a can";
		List<String> list = Arrays.asList(s1.split(" "));//convert array to list
		HashSet<String> list1=new HashSet<>(list);
		for(String word:list1){
			int num =Collections.frequency(list,word);
			System.out.println("This word-"+" "+word+" "+"Is repeated-"+" "+num+" "+"times");
		}
		
	}

}
