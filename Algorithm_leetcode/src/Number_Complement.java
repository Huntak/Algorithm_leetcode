public class Number_Complement {
	
	public static void main(String[] args) {
		Number_Complement n = new Number_Complement();
		System.out.println(n.findComplement(5));
		
	}
	
	public int findComplement(int num) {
		int result = 0;
		String remainder = "";
		
		// 2진수로 변환하면서 보수를 취해줌
		// 101 -> 010
		// 1 - num = 보수
		while(num > 1){
			remainder = String.valueOf(1 - num % 2) + remainder;
			num = num / 2;
		}
		remainder = (1 - num) + remainder;
		
		// 다시 10진수로 변환
		for(int i = 0; i < remainder.length(); i++){
			if(remainder.charAt(remainder.length() - 1 - i) == '1'){
				result += Math.pow(2, i);
			}
		}
		
		return result;
	}
}
