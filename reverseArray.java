import java.util.*;
public class reverseArray{
	public int[] reverse(int[] array){
		int[] newArray = new int[array.length];
		for(int  i = 0; i < array.length; i++){
			newArray[i] = array[array.length - i - 1];
			}
		return newArray;
		}
	public static void main(String[] args){
		reverseArray arrayUtil = new reverseArray();
		int[] array = {1, 2, 3, 4, 5};
		int[] newArray = arrayUtil.reverse(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(newArray[i]);
		}
	}
}
