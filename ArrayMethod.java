import java.util.Arrays;

//��������һ���ַ���������ĳ���ض��ַ��������е�λ��

public class ArrayMethod {
	public static void main(String[] args) {
		char[] nums = {'a','y','u','f'};
		System.out.println("����ǰ");
		for(char num:nums){
			System.out.print(num+"\t");
		}
		Arrays.sort(nums);
		System.out.println("\n�����");
		for(char num:nums){
			System.out.print(num+"\t");
		}
		
		int index = Arrays.binarySearch(nums, 'f');
		System.out.println("\n�ַ�f�������е�λ���ڣ�"+index);
	}
}
