import java.util.*;
public class findMinimum{
	public int minimum(int[] array){
		int min = array[0];
		for(int i = 0; i < array.length; i++){
			if(min > array[i]){
				min = array[i];
				}
			}
		return min;
	}
	public static void main(String[] args){
		findMinimum arrayUtil = new findMinimum();
		int[] array = {2, 3, 0, 4, 9, -10};
		System.out.print(arrayUtil.minimum(array));
		}
}
