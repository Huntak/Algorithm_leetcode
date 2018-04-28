import java.util.ArrayList;
public class Unique_Morse_Code_Words {
	public static void main(String[] args) {
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
	
	public static int uniqueMorseRepresentations(String[] words) {
		int result = 0;
		
		String same = "";
		ArrayList<String> sameArray = new ArrayList<String>();
		String[] a = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int j = 0; j < words.length; j++){
			for(int k = 0; k < words[j].length(); k++){
				for(int i = 0; i < a.length; i++){
					if(words[j].charAt(k) == alphabet.charAt(i))
						same += a[i];
				}
			}
			//System.out.println(same);
			
			Boolean isSame = false;
			for(int q = 0; q < sameArray.size(); q++){
				if(sameArray.get(q).equals(same)){
					isSame = true;
					break;
				}
			}
			
			if(!isSame){
				sameArray.add(same);
				result++;
			}
			
			same = "";
		}
		
		return result;
	}
	
}