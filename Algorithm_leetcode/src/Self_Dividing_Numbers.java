import java.util.ArrayList;
import java.util.List;
public class Self_Dividing_Numbers {
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 22));
		//[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = left; i <= right; i++){
			boolean isSelfDividingNumber = true;
			String iStr = String.valueOf(i);
			
			for(int j = 0; j < iStr.length(); j++){
				int num = Integer.parseInt(iStr.substring(j, j+1));
				if(num == 0 || i % num != 0)
					isSelfDividingNumber = false;
			}
			if(isSelfDividingNumber)
				result.add(i);
		}
		
		return result;
	}
}