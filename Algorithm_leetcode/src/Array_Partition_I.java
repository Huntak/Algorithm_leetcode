public class Array_Partition_I {
	
	public static void main(String[] args) {
		Array_Partition_I ap1 = new Array_Partition_I();
		System.out.println(ap1.arrayPairSum(new int[] { -2169, -3040, 4313, -5803, -3390, -1292, -5065, -5202, -1598, 5324, -5092, -663, -479, 8387, 2793, 1313, 496, -9458, 2257, 349, 4449 }));
	}
	
	/*public int arrayPairSum(int[] nums) {
            int result = 0, temp = 0;
            for (int i = 0; i < nums.length; i++) {
                  for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] > nums[j]) {
                              temp = nums[i];
                              nums[i] = nums[j];
                              nums[j] = temp;
                        }
                  }
                  if (i % 2 == 0)
                        result += nums[i];
            }
            return result;
      }*/
	
	
	
	public int arrayPairSum(int[] data) {
		int result = 0;
		
		sort(data, 0, data.length - 1);
		
		/*for (int i = 0; i < data.length; i++) {
                  System.out.println("data[" + i + "] : " + data[i]);
            }*/
		
		for (int i = 0; i < data.length; i += 2) {
			result += data[i];
		}
		
		return result;
	}
	
	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];
		
		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
		
		if (l < right)
			sort(data, l, right);
		if (r > left)
			sort(data, left, r);
	}
	
}