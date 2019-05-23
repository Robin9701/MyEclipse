import java.util.Arrays;

//升序排列一组字符，并查找某个特定字符在数组中的位置

public class ArrayMethod {
	public static void main(String[] args) {
		char[] nums = {'a','y','u','f'};
		System.out.println("排序前");
		for(char num:nums){
			System.out.print(num+"\t");
		}
		Arrays.sort(nums);
		System.out.println("\n排序后");
		for(char num:nums){
			System.out.print(num+"\t");
		}
		
		int index = Arrays.binarySearch(nums, 'f');
		System.out.println("\n字符f在数组中的位置在："+index);
	}
}
