import java.util.*;
public class reverseArray1{
	public int[] reverse(int[] array){
		int n = array.length;
		int start = 0;
		int end = n - 1;
		while(start < end){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}
	public static void main(String[] args){
		reverseArray1 arrayUtil = new reverseArray1();
		int array[] = {1, 2, 3, 4, 5};
		arrayUtil.reverse(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			}
		}
	}
