import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.lang.StringBuilder;


public class PuzzleJava {
	
	public ArrayList<Integer> printSumAndReturnArr(int[] arr) 	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (arr[i] > 10) {
				temp.add(arr[i]);
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println(temp);
		return temp;
	}
	
	public ArrayList<String> shufflePrintAndReturn(ArrayList<String> arr) {
		Collections.shuffle(arr);
		System.out.println(arr);
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).length() > 5){
				temp.add(arr.get(i));
			}
		}
		System.out.println(temp);
		return temp; 
	}
	
	public void shuffleAndDisplay(ArrayList<Character> arr) {
		Collections.shuffle(arr);
		System.out.println(arr.get(25));
		System.out.println(arr.get(0));
		
		Character vowels[] = {'A','E','I','O','U'};
		ArrayList<Character> vowelArr = new 	ArrayList<Character>(Arrays.asList(vowels));
		for (int i = 0; i < vowelArr.size(); i++) {
			if (arr.get(0) == vowelArr.get(i)) {
				System.out.println("Started with a vowel");
			}
		}
	}
	
	public ArrayList<Integer> genRandArr(int a){
		Random r = new Random();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i <= a; i++) {
		temp.add(r.nextInt(46)+ 55);
		}
		System.out.println(temp);
		return temp;
	}
	
	public ArrayList<Integer> genRandSorted(int a){
		Random r = new Random();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i <= a; i++) {
		temp.add(r.nextInt(46)+ 55);
		}

		System.out.println(temp);
		Collections.sort(temp);
		System.out.println(temp);
		System.out.println("Min: " + temp.get(0) + ", Max: " + temp.get(9));
		return temp;
	}
	
	public String randStr() {
		Random r = new Random();
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		String newStr = new String();
	    for (int i = 0; i < 5; i++) {
	       int rIndex=r.nextInt(chars.length()); 
	       newStr += (chars.charAt(rIndex));            
	    }
	    System.out.println(newStr);
	    return newStr.toString();
	}
	
	public ArrayList<String> randStr10() {
		ArrayList<String> temp = new ArrayList<String>();
		Random r = new Random();
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		for (int i = 0; i < 9; i++) {
			String newStr = new String();
		    for (int j = 0; j < 5; j++) {
		       int rIndex=r.nextInt(chars.length()); 
		       newStr += chars.charAt(rIndex);            
		    }
		    temp.add(newStr);
		}
		System.out.println(temp);
		return temp;
	}
	
}
