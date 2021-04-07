import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJavaTest {

	public static void main(String[] args) {
		int[] myArr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
		PuzzleJava p = new PuzzleJava();
		
		p.printSumAndReturnArr(myArr);
		
		String names[] = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		ArrayList<String> nameArr = new ArrayList<String>(Arrays.asList(names));
		
		p.shufflePrintAndReturn(nameArr);
	
		ArrayList<Character> alpha = new ArrayList<Character>();
    for (char letter = 'A'; letter <= 'Z'; letter++) {
        alpha.add(letter);    
    }
    
    p.shuffleAndDisplay(alpha);
    
    p.genRandArr(10);
    
    p.genRandSorted(10);
    
    p.randStr();
    
    p.randStr10();
	}
}