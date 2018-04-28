public class Hamming_Distance {
	public static void main(String[] args) {
		System.out.println(hammingDistance(11, 4));
	}
	
	public static int hammingDistance(int x, int y) {
		int result = 0;
		String remainder_x = "", remainder_y = "";
		
		// x를 2진수로 변환
		while(x > 1){
			remainder_x = String.valueOf(x % 2) + remainder_x;
			x = x / 2;
		}
		remainder_x = x + remainder_x;
		
		// y를 2진수로 변환
		while(y > 1){
			remainder_y = String.valueOf(y % 2) + remainder_y;
			y = y / 2;
		}
		remainder_y = y + remainder_y;
		
		// 큰 수가 몇자리인지 구함
		int length_x = remainder_x.length();
		int length_y = remainder_y.length();
		int maxLength = 0, gap = 0;
		if(length_x < length_y){
			maxLength = length_y;
			gap = length_y - length_x;
			
			// 작은수에 큰 수의 자리수 만큼 0패딩
			for(int i = 0; i < gap; i++){
				remainder_x = "0" + remainder_x;
			}
		}else{
			maxLength = length_x;
			gap = length_x - length_y;
			
			// 작은수에 큰 수의 자리수 만큼 0패딩
			for(int i = 0; i < gap; i++){
				remainder_y = "0" + remainder_y;
			}
		}
		
		System.out.println(remainder_x);
		System.out.println(remainder_y);
		
		// 몇개의 숫자가 틀린지 구함
		for(int i = 0; i < maxLength; i++){
			if(remainder_x.charAt(i) != remainder_y.charAt(i))
				result++;
		}
		
		return result;
	}
	
}