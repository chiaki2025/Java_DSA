import java.util.*;
public class moveZeros{
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	public static int[] move(int[] arr){
		int n = arr.length;
		int j = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] != 0 && arr[j] == 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else if(arr[j] != 0){
				j++;
			}
		}
		return arr;
	}
	public static void printElements(int[] arr){
		for(int i = 0;  i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args){
		int[] arr = {0,0,1,2,0,3,4};
		int[] newArray = move(arr);
		printElements(newArray);
	}
}
