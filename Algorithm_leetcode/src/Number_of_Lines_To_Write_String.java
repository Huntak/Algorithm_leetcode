public class Number_of_Lines_To_Write_String {
	
	public static void main(String[] args) {
		Number_of_Lines_To_Write_String n = new Number_of_Lines_To_Write_String();
		int[] result = n.numberOfLines(new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "bbbcccdddaaa");
		for(int i : result){
			System.out.println(i);
		}
	}
	
	public int[] numberOfLines(int[] widths, String S) {
		int[] result = new int[2];
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int indexOfAlphabet = 0;
		int lines = 1;
		int sum = 0;
		
		for(int i = 0; i < S.length(); i++){
			// S문자열이 알파벳중 몇번째 순서인지 찾음
			for(int j = 0; j < alphabet.length(); j++){
				if(S.charAt(i) == alphabet.charAt(j)){
					indexOfAlphabet = j;
					break;
				}
			}
			
			// 구해둔 알파벳 인덱스를 widths의 인덱스로 넣어 해당하는 숫자를 sum에 계속 더해줌
			// 단, 100이 넘지 않도록 더함
			// 100이 넘으면 lines를 1씩 추가하고 sum을 초기화 시킨다음 다시 더함
			if(sum + widths[indexOfAlphabet] <= 100){
				sum += widths[indexOfAlphabet];
			}else{
				lines++;
				sum = widths[indexOfAlphabet];
			}
		}
		
		result[0] = lines;
		result[1] = sum;
		
		return result;
	}
}
