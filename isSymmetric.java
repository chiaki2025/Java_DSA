import java.util.*;
public class isSymmetric{
	public static boolean symmetric(int[] array){
		int n = array.length;
		int start = 0, end = n - 1;
		while(start < end){
			if(array[start] != array[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0; i < 5; i++){
			array[i] = scanner.nextInt();
		}
		System.out.println(symmetric(array));
	}
}
