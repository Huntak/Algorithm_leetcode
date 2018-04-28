import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] results = twoSum(new int[]{-3,4,5,90},9);
		
		for(int i = 0; i< results.length; i++){
			System.out.println(results[i]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] results = new int[2];
		int sum = target;
		int max = nums[0];
		
		// 음수인지 양수인지 체크
		if(target >= 0){
			// sum보다 작은 수 중에서 가장 큰 수를 구함
			for(int i = 0; i < nums.length; i++){
				// 가장 큰 수를 max값에 넣고 그 int의 인덱스를 results에 저장
				if(nums[i] >= max && nums[i] <= sum){
					max = nums[i];
					results[0] = i;
				}
			}
			
			// nums중 가장 큰수를 빼준다 (sum을 0으로 만들어 주면 2개 수를 모두 구한것)
			sum -= max;
			
			// 작아진 sum보다 작은 수 중에서 가장 큰 수를 구함
			max = 0;
			for(int i = 0; i < nums.length; i++){
				// 가장 큰 수를 max값에 넣고 그 int의 인덱스를 results에 저장
				if(nums[i] >= max && nums[i] <= sum && nums[i] != max){
					max = nums[i];
					results[1] = i;
				}
			}
		}
		else{
			// sum보다 큰 수 중에서 가장 작은 수를 구함
			for(int i = 0; i < nums.length; i++){
				// 가장 작은 수를 max값에 넣고 그 int의 인덱스를 results에 저장
				if(nums[i] <= max && nums[i] >= sum){
					max = nums[i];
					results[0] = i;
				}
			}
			
			// nums중 가장 큰수를 빼준다 (sum을 0으로 만들어 주면 2개 수를 모두 구한것)
			sum -= max;
			
			// 작아진 sum보다 큰 수 중에서 가장 작은 수를 구함
			max = 0;
			for(int i = 0; i < nums.length; i++){
				// 가장 큰 수를 max값에 넣고 그 int의 인덱스를 results에 저장
				if(nums[i] <= max && nums[i] >= sum && nums[i] != max){
					max = nums[i];
					results[1] = i;
				}
			}
		}
		
		Arrays.sort(results);
		
		return results;
	}
}