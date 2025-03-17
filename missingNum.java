import java.util.*;
public class missingNum{
	public static int num(int[] array){
		int n = array.length;
		int sum = n * (n + 1) / 2;
		int total = 0;
		for(int i = 0; i < n - 1; i++){
			total += array[i];
		}
		return sum - total;
	}
	public static void main(String[] args){
		int array[] = {1, 2, 3, 4, 5, 7};
		System.out.println(num(array));
	}
}
