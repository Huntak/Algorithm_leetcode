public class Reverse_Integer {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		/*System.out.println(reverse(-2147483648));
            System.out.println(reverse(1));
            System.out.println(reverse(-123));
            System.out.println(reverse(1534236469));
            System.out.println(reverse(-10));
            System.out.println(reverse(120));
            System.out.println(reverse(0));*/
	}
	
	public static int reverse(int x) {
		int result = 0;
		int num = x;
		String resultStr1 = "";
		String resultStr2 = "";
		int lastIndex = 0;
		
		String numStr = String.valueOf(num);
		int length = numStr.length();
		
		if(length == 1){
			result = x;
		}else{
			if(x < 0){
				num = (x + 1) * -1;
				lastIndex ++;
			}
			
			int halfLength = length / 2;
			
			for(int i = length; i > halfLength; i--){
				resultStr1 += numStr.substring(i-1, i);
			}
			for(int i = halfLength; i > lastIndex; i--){
				resultStr2 += numStr.substring(i-1, i);
			}
			
			int result2Pow = (int) Math.pow(10, resultStr2.length());
			result = Integer.parseInt(resultStr1) * result2Pow + (resultStr2=="" ? 0 : Integer.parseInt(resultStr2));
			
			if(x < 0){
				if(length != resultStr1.length() + resultStr2.length()){
					result = result * -1;
				}else{
					int result1Pow = (int) Math.pow(10, resultStr1.length());
					result = (result1Pow + result) * -1;
				}
			}
		}
		
		return result;
	}
}