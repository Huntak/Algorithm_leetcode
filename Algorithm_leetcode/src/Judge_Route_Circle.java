public class Judge_Route_Circle {
	public static void main(String[] args) {
		System.out.println(judgeCircle("RLUURDDDLU"));
	}
	
	public static boolean judgeCircle(String moves) {
		boolean result = false;
		int vertical = 0, horizontal = 0;
		
		for(int i = 0; i < moves.length(); i++){
			if(moves.charAt(i) == 'U')
				vertical++;
			else if(moves.charAt(i) == 'D')
				vertical--;
			else if(moves.charAt(i) == 'R')
				horizontal++;
			else if(moves.charAt(i) == 'L')
				horizontal--;
		}
		
		if(vertical == 0 && horizontal == 0)
			result = true;
		
		return result;
	}
	
}