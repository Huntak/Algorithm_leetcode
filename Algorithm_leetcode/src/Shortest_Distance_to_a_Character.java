public class Shortest_Distance_to_a_Character {
	public static void main(String[] args) {
		Shortest_Distance_to_a_Character s = new Shortest_Distance_to_a_Character();
		int[] result = s.shortestToChar("loveleetcode", 'e');
		for(int i : result){
			System.out.println(i);
		}
	}
	
	public int[] shortestToChar(String S, char C) {
		int[] result = new int[S.length()];
		int count = 0;
		int left, right;
		
		for(int i = 0; i < S.length(); i++){
			right = 0;
			left = 0;
			
			try{
				while(S.charAt(i + right) != C){
					right++;
				}
			}catch(Exception e){
				right = -1;
			}
			
			try{
				while(S.charAt(i - left) != C){
					left++;
				}
			}catch(Exception e){
				left = -1;
			}
			
			if(left == -1 || (right != -1 && right < left)){
				count = right;
			}else{
				count = left;
			}
			
			result[i] = count;
		}
		
		return result;
	}
}